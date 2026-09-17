package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
final class ayx {
    static final Charset a = Charset.forName("US-ASCII");

    static {
        Charset.forName("UTF-8");
    }

    static void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
        }
    }

    static void b(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            String strValueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 26);
            sb.append("not a readable directory: ");
            sb.append(strValueOf);
            throw new IOException(sb.toString());
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                b(file2);
            }
            if (!file2.delete()) {
                String strValueOf2 = String.valueOf(file2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 23);
                sb2.append("failed to delete file: ");
                sb2.append(strValueOf2);
                throw new IOException(sb2.toString());
            }
        }
    }
}
