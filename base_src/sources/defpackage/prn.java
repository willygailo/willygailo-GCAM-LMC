package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class prn {
    public static final prn a = new prn(0, new int[0], new Object[0], false);
    public int b;
    public int[] c;
    public Object[] d;
    public int e;
    private boolean f;

    private prn() {
        this(0, new int[8], new Object[8], true);
    }

    public prn(int i, int[] iArr, Object[] objArr, boolean z) {
        this.e = -1;
        this.b = i;
        this.c = iArr;
        this.d = objArr;
        this.f = z;
    }

    public static prn b() {
        return new prn(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iAe;
        int i = this.e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            int i4 = this.c[i3];
            int iA = psa.a(i4);
            switch (psa.b(i4)) {
                case 0:
                    iAe = pom.ae(iA, ((Long) this.d[i3]).longValue());
                    break;
                case 1:
                    ((Long) this.d[i3]).longValue();
                    iAe = pom.ay(iA);
                    break;
                case 2:
                    iAe = pom.H(iA, (poc) this.d[i3]);
                    break;
                case 3:
                    int iAb = pom.ab(iA);
                    iAe = iAb + iAb + ((prn) this.d[i3]).a();
                    break;
                case 4:
                default:
                    throw new IllegalStateException(ppp.a());
                case 5:
                    ((Integer) this.d[i3]).intValue();
                    iAe = pom.ax(iA);
                    break;
            }
            i2 += iAe;
        }
        this.e = i2;
        return i2;
    }

    public final void c() {
        this.f = false;
    }

    public final void d(int i, Object obj) {
        if (!this.f) {
            throw new UnsupportedOperationException();
        }
        int i2 = this.b;
        int[] iArr = this.c;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.c = Arrays.copyOf(iArr, i3);
            this.d = Arrays.copyOf(this.d, i3);
        }
        int[] iArr2 = this.c;
        int i4 = this.b;
        iArr2[i4] = i;
        this.d[i4] = obj;
        this.b = i4 + 1;
    }

    public final void e(pon ponVar) {
        if (this.b != 0) {
            for (int i = 0; i < this.b; i++) {
                int i2 = this.c[i];
                Object obj = this.d[i];
                int iA = psa.a(i2);
                switch (psa.b(i2)) {
                    case 0:
                        ponVar.j(iA, ((Long) obj).longValue());
                        break;
                    case 1:
                        ponVar.f(iA, ((Long) obj).longValue());
                        break;
                    case 2:
                        ponVar.b(iA, (poc) obj);
                        break;
                    case 3:
                        ponVar.a.A(iA, 3);
                        ((prn) obj).e(ponVar);
                        ponVar.a.A(iA, 4);
                        break;
                    case 4:
                    default:
                        throw new RuntimeException(ppp.a());
                    case 5:
                        ponVar.e(iA, ((Integer) obj).intValue());
                        break;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof prn)) {
            return false;
        }
        prn prnVar = (prn) obj;
        int i = this.b;
        if (i == prnVar.b) {
            int[] iArr = this.c;
            int[] iArr2 = prnVar.c;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.d;
            Object[] objArr2 = prnVar.d;
            int i3 = this.b;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = (i + 527) * 31;
        int[] iArr = this.c;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.d;
        int i6 = this.b;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
