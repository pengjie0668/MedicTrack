/*
 * Copyright (C) 2023 Baidu, Inc. All Rights Reserved.
 */
package com.nova.ocr.meditrack;

import java.io.File;

import android.content.Context;

public class FileUtil {
    public static File getSaveFile(Context context) {
        File file = new File(context.getFilesDir(), "pic.jpg");
        return file;
    }
}
