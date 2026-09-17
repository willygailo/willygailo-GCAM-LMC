package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oyj {
    private static final char[] a = "0123456789abcdef".toCharArray();

    public static oyj e(byte[] bArr) {
        return new oyi(bArr);
    }

    public static oyj f(String str) {
        obr.aK(str.length() >= 2, "input string (%s) must have at least 2 characters", str);
        obr.aK(str.length() % 2 == 0, "input string (%s) must have an even number of characters", str);
        byte[] bArr = new byte[str.length() / 2];
        for (int i = 0; i < str.length(); i += 2) {
            bArr[i / 2] = (byte) ((g(str.charAt(i)) << 4) + g(str.charAt(i + 1)));
        }
        return e(bArr);
    }

    private static int g(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("Illegal hexadecimal character: ");
        sb.append(c);
        throw new IllegalArgumentException(sb.toString());
    }

    public abstract int a();

    public abstract int b();

    public abstract boolean c(oyj oyjVar);

    public byte[] d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oyj) {
            oyj oyjVar = (oyj) obj;
            if (b() == oyjVar.b() && c(oyjVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (b() >= 32) {
            return a();
        }
        byte[] bArrD = d();
        int i = bArrD[0] & 255;
        for (int i2 = 1; i2 < bArrD.length; i2++) {
            i |= (bArrD[i2] & 255) << (i2 * 8);
        }
        return i;
    }

    public final String toString() {
        byte[] bArrD = d();
        int length = bArrD.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : bArrD) {
            char[] cArr = a;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
