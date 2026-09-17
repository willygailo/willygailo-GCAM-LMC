package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class ppn {
    public static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;
    public static final ByteBuffer c;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        c = ByteBuffer.wrap(bArr);
        poh.I(bArr);
    }

    public static int a(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        int iD = d(length, bArr, 0, length);
        if (iD == 0) {
            return 1;
        }
        return iD;
    }

    public static int c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    static int d(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    static Object e(Object obj, Object obj2) {
        return ((pqm) obj).gz().c((pqm) obj2).k();
    }

    public static String f(byte[] bArr) {
        return new String(bArr, a);
    }

    public static boolean g(byte[] bArr) {
        plk plkVar = prx.a;
        return plk.au(bArr, 0, bArr.length);
    }

    static void h(Object obj) {
        if (obj == null) {
            throw null;
        }
    }

    static void i(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    static void j(pqm pqmVar) {
        if (pqmVar instanceof pnn) {
            throw null;
        }
    }
}
