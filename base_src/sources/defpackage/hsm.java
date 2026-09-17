package defpackage;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class hsm {
    private final String a;
    private final String b;
    private File c = null;
    private final hrz d;

    public hsm(hrz hrzVar, String str, String str2) {
        this.d = hrzVar;
        this.a = str;
        this.b = str2;
    }

    public final synchronized File a() {
        return this.c;
    }

    public final synchronized boolean b() {
        return a() != null;
    }

    public final synchronized boolean c() {
        if (this.c != null) {
            return true;
        }
        try {
            hrz hrzVar = this.d;
            String str = this.a;
            String str2 = this.b;
            File file = new File(new File(hrzVar.a(str), str2), String.valueOf(str2).concat(".jpg"));
            oxh.v(file);
            if ((!file.createNewFile() || !file.canWrite()) && !file.canWrite()) {
                throw new IOException("Temporary output file is not writeable.");
            }
            this.c = file;
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
