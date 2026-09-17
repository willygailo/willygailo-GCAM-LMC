package defpackage;

import android.opengl.GLES20;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class kus {
    private static kus b;
    public int a;

    public kus() {
    }

    public kus(int i) {
        this.a = i;
    }

    public kus(byte[] bArr) {
        this.a = 1;
    }

    public kus(byte[] bArr, byte[] bArr2) {
        this.a = -1;
        this.a = d();
    }

    public kus(char[] cArr) {
        this.a = -1;
    }

    public static int c() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10241, 9728.0f);
        GLES20.glTexParameterf(3553, 10240, 9728.0f);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        return iArr[0];
    }

    public static int d() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10241, 9728.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        return iArr[0];
    }

    public static String g(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public static final void i(String str, String str2, Throwable... thArr) {
        if (thArr.length > 0) {
            Log.e(str, str2, thArr[0]);
        } else {
            Log.e(str, str2);
        }
    }

    public static final void j(Throwable... thArr) {
        if (thArr.length > 0) {
            Throwable th = thArr[0];
        }
    }

    public static final void k(String str, String str2, Throwable... thArr) {
        if (thArr.length > 0) {
            Log.w(str, str2, thArr[0]);
        } else {
            Log.w(str, str2);
        }
    }

    public static synchronized kus l() {
        if (b == null) {
            b = new kus(3);
        }
        return b;
    }

    public static synchronized void m(kus kusVar) {
        b = kusVar;
    }

    public final void a(boolean z) {
        this.a = (this.a * 31) + (z ? 1 : 0);
    }

    public final void b(Object obj) {
        this.a = (this.a * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public final void e() {
        GLES20.glDeleteTextures(1, new int[]{this.a}, 0);
        this.a = -1;
    }

    public final void f() throws fcq {
        int i = this.a;
        if (i < 0) {
            throw new fcq("Trying to bind without a loaded texture");
        }
        GLES20.glBindTexture(3553, i);
        fcq.a("glBindTexture");
    }

    public final void h(Throwable... thArr) {
        if (this.a > 3 || thArr.length <= 0) {
            return;
        }
        Throwable th = thArr[0];
    }
}
