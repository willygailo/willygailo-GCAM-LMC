package defpackage;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class hrz {
    private static final ouj a = ouj.h("com/google/android/apps/camera/session/SessionStorageManagerImpl");
    private final ojc b;
    private final ojc c;
    private final ika d;

    public hrz(File file, File file2, ika ikaVar) {
        this.b = ojc.h(file);
        this.c = ojc.h(file2);
        this.d = ikaVar;
    }

    private final void b(File file) {
        File[] fileArrListFiles = file.listFiles(new hry());
        if (fileArrListFiles == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (File file2 : fileArrListFiles) {
            file2.getAbsolutePath();
            if (file2.lastModified() < (-86400000) + jCurrentTimeMillis) {
                try {
                    this.d.a(file2);
                } catch (IOException e) {
                    ((oug) ((oug) a.c()).G((char) 2642)).r("Could not clean up %s", file2.getAbsolutePath());
                }
            }
        }
    }

    public final File a(String str) throws IOException {
        boolean z;
        if (!this.b.g()) {
            throw new IOException("Could retrieve baseDirectory.");
        }
        File file = new File((File) this.b.c(), str);
        synchronized (ika.a) {
            z = true;
            if (!file.isDirectory() && !file.mkdirs()) {
                z = false;
            }
        }
        if (!z) {
            String strValueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 36);
            sb.append("Could not create session directory: ");
            sb.append(strValueOf);
            throw new IOException(sb.toString());
        }
        if (file.isDirectory()) {
            b(file);
            b(new File((File) this.c.c(), str));
            return file;
        }
        String strValueOf2 = String.valueOf(file);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 38);
        sb2.append("Session directory is not a directory: ");
        sb2.append(strValueOf2);
        throw new IOException(sb2.toString());
    }
}
