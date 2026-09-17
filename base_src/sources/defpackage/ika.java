package defpackage;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ika {
    public static final Object a = new Object();

    public final void a(File file) throws IOException {
        File[] fileArrListFiles;
        if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    a(file2);
                }
                if (!file2.delete()) {
                    String strValueOf = String.valueOf(file2.getAbsolutePath());
                    throw new IOException(strValueOf.length() != 0 ? "Failed to delete file: ".concat(strValueOf) : new String("Failed to delete file: "));
                }
            }
            file.delete();
        }
    }
}
