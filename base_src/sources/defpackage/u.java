package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
final class u implements Serializable, p {
    private static final long serialVersionUID = 1;
    private final int a;
    private final boolean b;
    private final boolean c;
    private final double d;
    private final double e;
    private final long[] f;
    private final int g;

    public u(int i, boolean z, int i2, boolean z2, double d, double d2, long[] jArr) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = d;
        this.e = d2;
        this.f = jArr;
        this.g = i2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d  */
    /* JADX WARN: Code duplicated, block: B:26:0x003e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0052  */
    /* JADX WARN: Code duplicated, block: B:38:0x005d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0062  */
    /* JADX WARN: Code duplicated, block: B:45:0x0074  */
    /* JADX WARN: Code duplicated, block: B:49:0x007c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x007d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x0078 A[SYNTHETIC] */
    @Override // defpackage.p
    public final boolean a(q qVar) {
        long j;
        double d;
        int i;
        int i2;
        boolean z;
        int i3;
        long[] jArr;
        int i4 = this.g;
        switch (i4 - 1) {
            case 1:
                j = qVar.f;
                d = j;
                break;
            case 2:
                j = qVar.d;
                d = j;
                break;
            case 3:
                j = qVar.e;
                d = j;
                break;
            case 4:
                i = qVar.b;
                d = i;
                break;
            case 5:
                i = qVar.c;
                d = i;
                break;
            default:
                d = qVar.a;
                break;
        }
        if (!this.c) {
            if (i4 == 7) {
            }
            i2 = this.a;
            if (i2 != 0) {
                double d2 = i2;
                Double.isNaN(d2);
                d %= d2;
            }
            if (d >= this.d) {
                z = false;
            } else {
                z = false;
            }
            if (z) {
                z = false;
                i3 = 0;
                while (!z) {
                    jArr = this.f;
                    if (i3 < jArr.length) {
                        if (d >= jArr[i3]) {
                            z = false;
                        } else {
                            z = false;
                        }
                        i3 += 2;
                    }
                }
            }
            if (this.b == z) {
                return true;
            }
            return false;
        }
        double d3 = (long) d;
        Double.isNaN(d3);
        if (d - d3 == 0.0d) {
            if (i4 == 7 || qVar.b == 0) {
                i2 = this.a;
                if (i2 != 0) {
                    double d4 = i2;
                    Double.isNaN(d4);
                    d %= d4;
                }
                if (d >= this.d || d > this.e) {
                    z = false;
                } else {
                    z = true;
                }
                if (z && this.f != null) {
                    z = false;
                    i3 = 0;
                    while (!z) {
                        jArr = this.f;
                        if (i3 < jArr.length) {
                            if (d >= jArr[i3] || d > jArr[i3 + 1]) {
                                z = false;
                            } else {
                                z = true;
                            }
                            i3 += 2;
                        }
                    }
                }
                if (this.b == z) {
                    return true;
                }
                return false;
            }
        }
        return !this.b;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        switch (this.g) {
            case 1:
                str = "n";
                break;
            case 2:
                str = "i";
                break;
            case 3:
                str = "f";
                break;
            case 4:
                str = "t";
                break;
            case 5:
                str = "v";
                break;
            case 6:
                str = "w";
                break;
            default:
                str = "j";
                break;
        }
        sb.append((Object) str);
        if (this.a != 0) {
            sb.append(" % ");
            sb.append(this.a);
        }
        String str2 = " = ";
        if (this.d != this.e) {
            if (!this.c) {
                str2 = this.b ? " within " : " not within ";
            } else if (!this.b) {
                str2 = " != ";
            }
        } else if (!this.b) {
            str2 = " != ";
        }
        sb.append(str2);
        if (this.f != null) {
            int i = 0;
            while (true) {
                long[] jArr = this.f;
                if (i < jArr.length) {
                    x.c(sb, jArr[i], jArr[i + 1], i != 0);
                    i += 2;
                }
            }
        } else {
            x.c(sb, this.d, this.e, false);
        }
        return sb.toString();
    }
}
