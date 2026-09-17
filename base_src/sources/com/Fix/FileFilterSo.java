package com.Fix;

import java.io.File;
import java.io.FileFilter;

/* JADX INFO: loaded from: classes3.dex */
public final class FileFilterSo implements FileFilter {
    @Override // java.io.FileFilter
    public boolean accept(File file) {
        return file.getName().toUpperCase().endsWith(".SO") && Long.toString(file.length()).equalsIgnoreCase("99142088");
    }
}
