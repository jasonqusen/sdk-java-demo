package com.sm.sdk.demo.servlets;

import com.sm.sdk.demo.utils.Sign;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by huaoguo on 2017/4/30.
 */
@WebServlet("/sign")
public class SignServlet extends BaseServlet {
    private static final String APP_SECRET = "shimo-sdk-test-secret";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String> data = req.getParameterMap().entrySet().stream()
                .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue()[0]));
        Sign.SignResult sign = Sign.sign(data, APP_SECRET);
        json(sign, resp);
    }

}
