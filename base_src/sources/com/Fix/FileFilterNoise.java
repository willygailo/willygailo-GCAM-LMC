package com.Fix;

import java.io.File;
import java.io.FileFilter;

/* JADX INFO: loaded from: classes2.dex */
public final class FileFilterNoise implements FileFilter {
    @Override // java.io.FileFilter
    public boolean accept(File file) {
        return file.getName().toUpperCase().endsWith(".C");
    }
}
