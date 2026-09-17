package defpackage;

import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class lmg {
    private static final Charset h = Charset.forName("US-ASCII");
    private static final int[] i = {0, 1, 1, 2, 4, 8, 0, 1, 0, 4, 8};
    public final short a;
    public final short b;
    public boolean c;
    public int d;
    public int e;
    public Object f = null;
    public int g;

    static {
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
    }

    public lmg(short s, short s2, int i2, int i3, boolean z) {
        this.a = s;
        this.b = s2;
        this.d = i2;
        this.c = z;
        this.e = i3;
    }

    public static String c(short s) {
        switch (s) {
            case 1:
                return "UNSIGNED_BYTE";
            case 2:
                return "ASCII";
            case 3:
                return "UNSIGNED_SHORT";
            case 4:
                return "UNSIGNED_LONG";
            case 5:
                return "UNSIGNED_RATIONAL";
            case 6:
            case 8:
            default:
                return "";
            case 7:
                return "UNDEFINED";
            case 9:
                return "LONG";
            case 10:
                return "RATIONAL";
        }
    }

    public static boolean f(int i2) {
        return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
    }

    public static boolean g(short s) {
        return s == 1 || s == 2 || s == 3 || s == 4 || s == 5 || s == 7 || s == 9 || s == 10;
    }

    private final boolean p(int i2) {
        return this.c && this.d != i2;
    }

    public final int a() {
        return this.d * i[this.b];
    }

    public final long b(int i2) {
        Object obj = this.f;
        if (obj instanceof long[]) {
            return ((long[]) obj)[i2];
        }
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i2];
        }
        String strC = c(this.b);
        throw new IllegalArgumentException(strC.length() != 0 ? "Cannot get integer value from ".concat(strC) : new String("Cannot get integer value from "));
    }

    public final String d() {
        Object obj = this.f;
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof byte[]) {
            byte[] bArrCopyOf = (byte[]) obj;
            int length = bArrCopyOf.length - 1;
            if (bArrCopyOf[length] == 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, length);
            }
            return new String(bArrCopyOf, h);
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            return iArr.length == 1 ? String.valueOf(iArr[0]) : Arrays.toString(iArr);
        }
        if (!(obj instanceof long[])) {
            return null;
        }
        long[] jArr = (long[]) obj;
        return jArr.length == 1 ? String.valueOf(jArr[0]) : Arrays.toString(jArr);
    }

    public final boolean e() {
        return this.f != null;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof lmg)) {
            return false;
        }
        lmg lmgVar = (lmg) obj;
        if (lmgVar.a != this.a || lmgVar.d != this.d || lmgVar.b != this.b) {
            return false;
        }
        Object obj2 = this.f;
        if (obj2 == null) {
            return lmgVar.f == null;
        }
        Object obj3 = lmgVar.f;
        if (obj3 == null) {
            return false;
        }
        if (obj2 instanceof long[]) {
            if (obj3 instanceof long[]) {
                return Arrays.equals((long[]) obj2, (long[]) obj3);
            }
            return false;
        }
        if (obj2 instanceof lid[]) {
            if (obj3 instanceof lid[]) {
                return Arrays.equals((lid[]) obj2, (lid[]) obj3);
            }
            return false;
        }
        if (!(obj2 instanceof byte[])) {
            return obj2.equals(obj3);
        }
        if (obj3 instanceof byte[]) {
            return Arrays.equals((byte[]) obj2, (byte[]) obj3);
        }
        return false;
    }

    public final boolean h(int i2) {
        return k(new int[]{i2});
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Short.valueOf(this.a), Short.valueOf(this.b), Boolean.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), this.f, Integer.valueOf(this.g)});
    }

    public final boolean i(String str) {
        short s = this.b;
        if (s != 2 && s != 7) {
            return false;
        }
        byte[] bytes = str.getBytes(h);
        int length = bytes.length;
        if (length > 0) {
            if (bytes[length - 1] != 0 && this.b != 7) {
                bytes = Arrays.copyOf(bytes, length + 1);
            }
        } else if (this.b == 2 && this.d == 1) {
            bytes = new byte[]{0};
        }
        int length2 = bytes.length;
        if (p(length2)) {
            return false;
        }
        this.d = length2;
        this.f = bytes;
        return true;
    }

    public final boolean j(byte[] bArr) {
        short s;
        int length = bArr.length;
        if (p(length) || ((s = this.b) != 1 && s != 7)) {
            return false;
        }
        byte[] bArr2 = new byte[length];
        this.f = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, length);
        this.d = length;
        return true;
    }

    public final boolean k(int[] iArr) {
        int i2 = 0;
        if (p(iArr.length)) {
            return false;
        }
        short s = this.b;
        if (s == 3) {
            for (int i3 : iArr) {
                if (i3 > 65535 || i3 < 0) {
                    return false;
                }
            }
        } else if (s != 9 && s != 4) {
            return false;
        }
        if (this.b == 4) {
            for (int i4 : iArr) {
                if (i4 < 0) {
                    return false;
                }
            }
        }
        long[] jArr = new long[iArr.length];
        while (true) {
            int length = iArr.length;
            if (i2 >= length) {
                this.f = jArr;
                this.d = length;
                return true;
            }
            jArr[i2] = iArr[i2];
            i2++;
        }
    }

    public final boolean l(long[] jArr) {
        if (p(jArr.length) || this.b != 4) {
            return false;
        }
        for (long j : jArr) {
            if (j < 0 || j > 4294967295L) {
                return false;
            }
        }
        this.f = jArr;
        this.d = jArr.length;
        return true;
    }

    public final boolean m(lid[] lidVarArr) {
        if (p(lidVarArr.length)) {
            return false;
        }
        short s = this.b;
        if (s == 5) {
            for (lid lidVar : lidVarArr) {
                long j = lidVar.a;
                if (j >= 0) {
                    long j2 = lidVar.b;
                    if (j2 >= 0 && j <= 4294967295L && j2 <= 4294967295L) {
                    }
                }
                return false;
            }
        }
        if (s != 10) {
            return false;
        }
        if (this.b == 10) {
            for (lid lidVar2 : lidVarArr) {
                long j3 = lidVar2.a;
                if (j3 >= -2147483648L) {
                    long j4 = lidVar2.b;
                    if (j4 >= -2147483648L && j3 <= 2147483647L && j4 <= 2147483647L) {
                    }
                }
                return false;
            }
        }
        this.f = lidVarArr;
        this.d = lidVarArr.length;
        return true;
    }

    public final int[] n() {
        Object obj = this.f;
        int[] iArr = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            iArr = new int[jArr.length];
            for (int i2 = 0; i2 < jArr.length; i2++) {
                iArr[i2] = (int) jArr[i2];
            }
        }
        return iArr;
    }

    public final long o() {
        Object obj = this.f;
        long[] jArr = obj instanceof long[] ? (long[]) obj : null;
        if (jArr == null || jArr.length <= 0) {
            return 0L;
        }
        return jArr[0];
    }

    public final String toString() {
        String str = String.format("tag id: %04X\n", Short.valueOf(this.a));
        int i2 = this.e;
        String strC = c(this.b);
        int i3 = this.d;
        int i4 = this.g;
        Object obj = this.f;
        String string = "";
        if (obj != null) {
            if (obj instanceof byte[]) {
                string = this.b == 2 ? new String((byte[]) obj, h) : Arrays.toString((byte[]) obj);
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                string = jArr.length == 1 ? String.valueOf(jArr[0]) : Arrays.toString(jArr);
            } else if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length == 1) {
                    Object obj2 = objArr[0];
                    if (obj2 != null) {
                        string = obj2.toString();
                    }
                } else {
                    string = Arrays.toString(objArr);
                }
            } else {
                string = obj.toString();
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 74 + strC.length() + String.valueOf(string).length());
        sb.append(str);
        sb.append("ifd id: ");
        sb.append(i2);
        sb.append("\ntype: ");
        sb.append(strC);
        sb.append("\ncount: ");
        sb.append(i3);
        sb.append("\noffset: ");
        sb.append(i4);
        sb.append("\nvalue: ");
        sb.append(string);
        sb.append("\n");
        return sb.toString();
    }
}
