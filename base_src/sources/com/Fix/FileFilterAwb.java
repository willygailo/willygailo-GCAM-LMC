package com.Fix;

import java.io.File;
import java.io.FileFilter;

/* JADX INFO: loaded from: classes2.dex */
public final class FileFilterAwb implements FileFilter {
    @Override // java.io.FileFilter
    public boolean accept(File file) {
        String upperCase = file.getName().toUpperCase();
        boolean zEndsWith = upperCase.endsWith(".TXT");
        if (zEndsWith || !(zEndsWith = upperCase.endsWith(".GAWB"))) {
        }
        return zEndsWith;
    }
}
