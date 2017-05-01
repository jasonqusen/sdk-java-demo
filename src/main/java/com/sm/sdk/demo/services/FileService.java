package com.sm.sdk.demo.services;

import com.sm.sdk.demo.models.File;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huaoguo on 2017/5/1.
 */
public class FileService {

    private static List<File> files = new ArrayList<>();

    public static void addFile(File file) {
        files.add(file);
    }

}
