/*
 * Copyright (C) 2023 Baidu, Inc. All Rights Reserved.
 */
package com.nova.ocr.ui.util;

import android.content.res.Resources;

public class DimensionUtil {

    public static int dpToPx(int dp) {
        return (int) (dp * Resources.getSystem().getDisplayMetrics().density);
    }

}
