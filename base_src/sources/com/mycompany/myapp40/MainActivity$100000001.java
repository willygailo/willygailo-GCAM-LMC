package com.mycompany.myapp40;

import java.io.File;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class MainActivity$100000001 implements Comparator {
    public int compare(File file, File file2) {
        long jLastModified = file.lastModified();
        long jLastModified2 = file2.lastModified();
        if (jLastModified2 < jLastModified) {
            return -1;
        }
        return jLastModified > jLastModified2 ? 1 : 0;
    }

    @Override // java.util.Comparator
    public /* bridge */ int compare(Object obj, Object obj2) {
        return compare((File) obj, (File) obj2);
    }
}
