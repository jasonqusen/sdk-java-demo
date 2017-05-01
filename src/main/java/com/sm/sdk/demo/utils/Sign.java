package com.sm.sdk.demo.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.stream.Collectors;

import javax.xml.bind.DatatypeConverter;

public class Sign {

	public static String encodeURIComponent(String str) {
		try {
			return URLEncoder.encode(str, "UTF-8")
					.replaceAll("\\%28", "(")
					.replaceAll("\\%29", ")")
					.replaceAll("\\+", "%20")
					.replaceAll("\\%27", "'")
					.replaceAll("\\%21", "!")
					.replaceAll("\\%7E", "~");
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static String digestHex(String str) {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-512");
			byte[] data = md.digest(str.getBytes());
			return DatatypeConverter.printHexBinary(data);
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}

	public static SignResult sign(Map<String, String> data, String secret) {
		String nonce = String.valueOf(Math.random());
		String timestamp = String.valueOf(System.currentTimeMillis() / 1000);
		data.put("nonce", nonce);
		data.put("timestamp", timestamp);

		String signature = data.keySet()
		.stream()
		.filter(key -> !key.startsWith("_"))
		.sorted()
		.map(key -> encodeURIComponent(data.get(key)))
		.collect(Collectors.joining(":"))
		.concat(":")
		.concat(secret);
		
		signature = digestHex(signature);
		
		return new SignResult(nonce, timestamp, signature);
	}

	public static class SignResult {
		String nonce;
		String timestamp;
		String signature;

		public SignResult(String nonce, String timestamp, String signature) {
			super();
			this.nonce = nonce;
			this.timestamp = timestamp;
			this.signature = signature;
		}
	}
}


