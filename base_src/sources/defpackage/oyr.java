package defpackage;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class oyr {
    public final String a;
    public final char[] b;
    final int c;
    final int d;
    final int e;
    final int f;
    public final boolean[] g;
    private final byte[] h;

    public oyr(String str, char[] cArr) {
        str.getClass();
        this.a = str;
        cArr.getClass();
        this.b = cArr;
        try {
            int length = cArr.length;
            int iS = oxh.S(length, RoundingMode.UNNECESSARY);
            this.d = iS;
            int iMin = Math.min(8, Integer.lowestOneBit(iS));
            try {
                this.e = 8 / iMin;
                this.f = iS / iMin;
                this.c = length - 1;
                byte[] bArr = new byte[128];
                Arrays.fill(bArr, (byte) -1);
                int i = 0;
                while (true) {
                    boolean z = true;
                    if (i >= cArr.length) {
                        break;
                    }
                    char c = cArr[i];
                    obr.aH(c < 128, "Non-ASCII character: %s", c);
                    if (bArr[c] != -1) {
                        z = false;
                    }
                    obr.aH(z, "Duplicate character: %s", c);
                    bArr[c] = (byte) i;
                    i++;
                }
                this.h = bArr;
                boolean[] zArr = new boolean[this.e];
                for (int i2 = 0; i2 < this.f; i2++) {
                    zArr[oxh.R(i2 * 8, this.d, RoundingMode.CEILING)] = true;
                }
                this.g = zArr;
            } catch (ArithmeticException e) {
                String str2 = new String(cArr);
                throw new IllegalArgumentException(str2.length() != 0 ? "Illegal alphabet ".concat(str2) : new String("Illegal alphabet "), e);
            }
        } catch (ArithmeticException e2) {
            int length2 = cArr.length;
            StringBuilder sb = new StringBuilder(35);
            sb.append("Illegal alphabet length ");
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString(), e2);
        }
    }

    final char a(int i) {
        return this.b[i];
    }

    final int b(char c) throws oyt {
        if (c > 127) {
            String strValueOf = String.valueOf(Integer.toHexString(c));
            throw new oyt(strValueOf.length() != 0 ? "Unrecognized character: 0x".concat(strValueOf) : new String("Unrecognized character: 0x"));
        }
        byte b = this.h[c];
        if (b != -1) {
            return b;
        }
        if (c <= ' ' || c == 127) {
            String strValueOf2 = String.valueOf(Integer.toHexString(c));
            throw new oyt(strValueOf2.length() != 0 ? "Unrecognized character: 0x".concat(strValueOf2) : new String("Unrecognized character: 0x"));
        }
        StringBuilder sb = new StringBuilder(25);
        sb.append("Unrecognized character: ");
        sb.append(c);
        throw new oyt(sb.toString());
    }

    public final boolean c(char c) {
        return c < 128 && this.h[c] != -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oyr) {
            return Arrays.equals(this.b, ((oyr) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }

    public final String toString() {
        return this.a;
    }
}
