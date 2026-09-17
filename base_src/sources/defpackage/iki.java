package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class iki {
    private final File a;

    public iki(File file) {
        this.a = file;
    }

    public final File a() {
        boolean z = true;
        if (!this.a.mkdirs() && !this.a.isDirectory()) {
            z = false;
        }
        String strValueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 44);
        sb.append("Folder doesn't exist and cannot be created: ");
        sb.append(strValueOf);
        obr.aR(z, sb.toString());
        return this.a;
    }

    public final String b() {
        return this.a.getAbsolutePath();
    }

    public final String toString() {
        return this.a.toString();
    }
}
