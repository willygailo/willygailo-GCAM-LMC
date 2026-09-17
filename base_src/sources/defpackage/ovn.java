package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ovn {
    public static final ovn a;
    private static final long e;
    public final int b;
    public final int c;
    public final int d;

    static {
        long jCharAt = 0;
        for (int i = 0; i < 7; i++) {
            jCharAt |= (((long) i) + 1) << ((int) (((long) (" #(+,-0".charAt(i) - ' ')) * 3));
        }
        e = jCharAt;
        a = new ovn(0, -1, -1);
    }

    public ovn(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    static int a(String str, boolean z) {
        int i = true != z ? 0 : 128;
        for (int i2 = 0; i2 < str.length(); i2++) {
            int iG = g(str.charAt(i2));
            if (iG < 0) {
                throw new IllegalArgumentException(str.length() != 0 ? "invalid flags: ".concat(str) : new String("invalid flags: "));
            }
            i |= 1 << iG;
        }
        return i;
    }

    public static ovn b(String str, int i, int i2, boolean z) {
        if (i == i2 && !z) {
            return a;
        }
        int i3 = true != z ? 0 : 128;
        while (i != i2) {
            int i4 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt < ' ' || cCharAt > '0') {
                int i5 = i4 - 1;
                if (cCharAt > '9') {
                    throw oxz.a("invalid flag", str, i5);
                }
                int i6 = cCharAt - '0';
                while (i4 != i2) {
                    int i7 = i4 + 1;
                    char cCharAt2 = str.charAt(i4);
                    if (cCharAt2 == '.') {
                        return new ovn(i3, i6, h(str, i7, i2));
                    }
                    char c = (char) (cCharAt2 - '0');
                    if (c >= '\n') {
                        throw oxz.a("invalid width character", str, i7 - 1);
                    }
                    i6 = (i6 * 10) + c;
                    if (i6 > 999999) {
                        throw oxz.b("width too large", str, i5, i2);
                    }
                    i4 = i7;
                }
                return new ovn(i3, i6, -1);
            }
            int iG = g(cCharAt);
            if (iG < 0) {
                if (cCharAt == '.') {
                    return new ovn(i3, -1, h(str, i4, i2));
                }
                throw oxz.a("invalid flag", str, i4 - 1);
            }
            int i8 = 1 << iG;
            if ((i3 & i8) != 0) {
                throw oxz.a("repeated flag", str, i4 - 1);
            }
            i3 |= i8;
            i = i4;
        }
        return new ovn(i3, -1, -1);
    }

    private static int g(char c) {
        return ((int) ((e >>> ((c - ' ') * 3)) & 7)) - 1;
    }

    private static int h(String str, int i, int i2) {
        if (i == i2) {
            throw oxz.a("missing precision", str, i - 1);
        }
        int i3 = 0;
        for (int i4 = i; i4 < i2; i4++) {
            char cCharAt = (char) (str.charAt(i4) - '0');
            if (cCharAt >= '\n') {
                throw oxz.a("invalid precision character", str, i4);
            }
            i3 = (i3 * 10) + cCharAt;
            if (i3 > 999999) {
                throw oxz.b("precision too large", str, i, i2);
            }
        }
        if (i3 != 0) {
            return i3;
        }
        if (i2 == i + 1) {
            return 0;
        }
        throw oxz.b("invalid precision", str, i, i2);
    }

    public final boolean c() {
        return this == a;
    }

    public final boolean d() {
        return (this.b & 128) != 0;
    }

    public final boolean e(int i, boolean z) {
        int i2;
        if (c()) {
            return true;
        }
        int i3 = this.b;
        if (((i ^ (-1)) & i3) != 0) {
            return false;
        }
        if (!z && this.d != -1) {
            return false;
        }
        int i4 = this.c;
        if ((i3 & 9) == 9 || (i2 = i3 & 96) == 96) {
            return false;
        }
        return i2 == 0 || i4 != -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ovn) {
            ovn ovnVar = (ovn) obj;
            if (ovnVar.b == this.b && ovnVar.c == this.c && ovnVar.d == this.d) {
                return true;
            }
        }
        return false;
    }

    public final void f(StringBuilder sb) {
        if (c()) {
            return;
        }
        int i = this.b & (-129);
        int i2 = 0;
        while (true) {
            int i3 = 1 << i2;
            if (i3 > i) {
                break;
            }
            if ((i3 & i) != 0) {
                sb.append(" #(+,-0".charAt(i2));
            }
            i2++;
        }
        int i4 = this.c;
        if (i4 != -1) {
            sb.append(i4);
        }
        if (this.d != -1) {
            sb.append('.');
            sb.append(this.d);
        }
    }

    public final int hashCode() {
        return (((this.b * 31) + this.c) * 31) + this.d;
    }
}
