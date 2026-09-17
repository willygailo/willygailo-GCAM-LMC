package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class mcs implements mce {
    private final File a;
    private final mcn b;
    private final lis c;

    public mcs(File file, mcn mcnVar, lis lisVar) {
        this.a = file;
        this.b = mcnVar;
        this.c = lisVar.a("SimpleFileObject");
    }

    public static mcs l(mcn mcnVar, mcc mccVar, lis lisVar) {
        return new mcs(mcnVar.b(mccVar), mcnVar, lisVar);
    }

    private final void m() throws IOException {
        File parentFile = this.a.getParentFile();
        parentFile.getClass();
        if (!parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Unable to create or find media storage directory");
        }
    }

    @Override // defpackage.mcd
    public final long a() {
        if (this.a.exists()) {
            return this.a.length();
        }
        return -1L;
    }

    @Override // defpackage.mcd
    public final FileInputStream b() {
        return new FileInputStream(this.a);
    }

    @Override // defpackage.mcd
    public final FileOutputStream c() {
        throw null;
    }

    @Override // defpackage.mcd
    public final void d() throws IOException {
        m();
        try {
            if (this.a.exists()) {
                return;
            }
            this.a.createNewFile();
        } catch (Throwable th) {
            String strValueOf = String.valueOf(this.a);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 18);
            sb.append("Unable to create ");
            sb.append(strValueOf);
            sb.append("!");
            throw new IOException(sb.toString(), th);
        }
    }

    @Override // defpackage.mcd
    public final boolean e() {
        return this.a.canRead();
    }

    @Override // defpackage.mcd
    public final boolean f() {
        if (this.a.exists()) {
            return this.a.canWrite();
        }
        File parentFile = this.a.getParentFile();
        while (parentFile != null && !parentFile.exists()) {
            parentFile = parentFile.getParentFile();
        }
        boolean z = parentFile != null && parentFile.canExecute() && parentFile.canWrite();
        if (!z) {
            this.c.f(String.format(Locale.ROOT, "Cannot write to %s, with earliestExistingParentFolder=%s()", this.a.getAbsoluteFile(), parentFile));
        }
        return z;
    }

    @Override // defpackage.mcd
    public final FileOutputStream g() throws IOException {
        m();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.a, "rw");
            return new mcr(randomAccessFile.getFD(), randomAccessFile);
        } catch (Throwable th) {
            String strValueOf = String.valueOf(this.a);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 18);
            sb.append("Unable to create ");
            sb.append(strValueOf);
            sb.append("!");
            throw new IOException(sb.toString(), th);
        }
    }

    @Override // defpackage.mce
    public final Uri h() {
        return Uri.EMPTY;
    }

    @Override // defpackage.mce
    public final mcn i() {
        return this.b;
    }

    @Override // defpackage.mce
    public final void j() {
    }

    @Override // defpackage.mce
    public final boolean k() {
        return this.a.canWrite();
    }

    public final String toString() {
        String string = this.b.toString();
        String absolutePath = this.a.getAbsolutePath();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2 + String.valueOf(absolutePath).length());
        sb.append(string);
        sb.append(": ");
        sb.append(absolutePath);
        return sb.toString();
    }
}
