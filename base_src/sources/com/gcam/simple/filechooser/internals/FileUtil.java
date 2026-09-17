package com.gcam.simple.filechooser.internals;

import java.io.File;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes2.dex */
public class FileUtil {
    public static String getExtension(File file) {
        if (file == null) {
            return null;
        }
        int iLastIndexOf = file.getName().lastIndexOf(".");
        return iLastIndexOf >= 0 ? file.getName().substring(iLastIndexOf) : "";
    }

    public static String getReadableFileSize(long j) {
        float f;
        DecimalFormat decimalFormat = new DecimalFormat("###.#");
        String str = " KB";
        if (j > 1024) {
            f = j / 1024;
            if (f > 1024.0f) {
                f /= 1024.0f;
                if (f > 1024.0f) {
                    f /= 1024.0f;
                    str = " GB";
                } else {
                    str = " MB";
                }
            }
        } else {
            f = 0.0f;
        }
        return String.valueOf(decimalFormat.format(f) + str);
    }
}
