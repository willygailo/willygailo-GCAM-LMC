package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class org {
    transient Object[] a;
    transient int[] b;
    transient int c;
    transient int d;
    public transient int[] e;
    transient long[] f;
    private transient float g;
    private transient int h;

    org() {
        j();
    }

    public org(byte[] bArr) {
        j();
    }

    private static int k(long j) {
        return (int) (j >>> 32);
    }

    private final int l() {
        return this.e.length - 1;
    }

    private static long m(long j, int i) {
        return (j & (-4294967296L)) | (((long) i) & 4294967295L);
    }

    private static int[] n(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    final int a() {
        return this.c == 0 ? -1 : 0;
    }

    final int b(int i) {
        obr.aX(i, this.c);
        return this.b[i];
    }

    final int c(Object obj) {
        int iD = ohh.D(obj);
        int i = this.e[l() & iD];
        while (i != -1) {
            long j = this.f[i];
            if (k(j) == iD && obr.bc(obj, this.a[i])) {
                return i;
            }
            i = (int) j;
        }
        return -1;
    }

    final int d(int i) {
        int i2 = i + 1;
        if (i2 < this.c) {
            return i2;
        }
        return -1;
    }

    public final int e(Object obj, int i) {
        if (i <= 0) {
            StringBuilder sb = new StringBuilder(43);
            sb.append("count must be positive but was: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        long[] jArr = this.f;
        Object[] objArr = this.a;
        int[] iArr = this.b;
        int iD = ohh.D(obj);
        int iL = l() & iD;
        int i2 = this.c;
        int[] iArr2 = this.e;
        int i3 = iArr2[iL];
        if (i3 == -1) {
            iArr2[iL] = i2;
        } else {
            while (true) {
                long j = jArr[i3];
                if (k(j) == iD && obr.bc(obj, objArr[i3])) {
                    int i4 = iArr[i3];
                    iArr[i3] = i;
                    return i4;
                }
                int i5 = (int) j;
                if (i5 == -1) {
                    jArr[i3] = m(j, i2);
                    break;
                }
                i3 = i5;
            }
        }
        if (i2 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i6 = i2 + 1;
        int length = this.f.length;
        if (i6 > length) {
            int iMax = Math.max(1, length >>> 1) + length;
            if (iMax < 0) {
                iMax = Integer.MAX_VALUE;
            }
            if (iMax != length) {
                this.a = Arrays.copyOf(this.a, iMax);
                this.b = Arrays.copyOf(this.b, iMax);
                long[] jArr2 = this.f;
                int length2 = jArr2.length;
                long[] jArrCopyOf = Arrays.copyOf(jArr2, iMax);
                if (iMax > length2) {
                    Arrays.fill(jArrCopyOf, length2, iMax, -1L);
                }
                this.f = jArrCopyOf;
            }
        }
        this.f[i2] = (((long) iD) << 32) | 4294967295L;
        this.a[i2] = obj;
        this.b[i2] = i;
        this.c = i6;
        if (i2 >= this.h) {
            int length3 = this.e.length;
            int i7 = length3 + length3;
            if (length3 >= 1073741824) {
                this.h = Integer.MAX_VALUE;
            } else {
                int i8 = ((int) (i7 * this.g)) + 1;
                int[] iArrN = n(i7);
                long[] jArr3 = this.f;
                int length4 = iArrN.length - 1;
                for (int i9 = 0; i9 < this.c; i9++) {
                    int iK = k(jArr3[i9]);
                    int i10 = iK & length4;
                    int i11 = iArrN[i10];
                    iArrN[i10] = i9;
                    jArr3[i9] = (((long) iK) << 32) | (((long) i11) & 4294967295L);
                }
                this.h = i8;
                this.e = iArrN;
            }
        }
        this.d++;
        return 0;
    }

    public final int f(Object obj, int i) {
        long[] jArr;
        long j;
        int iL = l() & i;
        int i2 = this.e[iL];
        if (i2 != -1) {
            int i3 = -1;
            while (true) {
                if (k(this.f[i2]) == i && obr.bc(obj, this.a[i2])) {
                    int i4 = this.b[i2];
                    if (i3 == -1) {
                        this.e[iL] = (int) this.f[i2];
                    } else {
                        long[] jArr2 = this.f;
                        jArr2[i3] = m(jArr2[i3], (int) jArr2[i2]);
                    }
                    int i5 = this.c - 1;
                    if (i2 < i5) {
                        Object[] objArr = this.a;
                        objArr[i2] = objArr[i5];
                        int[] iArr = this.b;
                        iArr[i2] = iArr[i5];
                        objArr[i5] = null;
                        iArr[i5] = 0;
                        long[] jArr3 = this.f;
                        long j2 = jArr3[i5];
                        jArr3[i2] = j2;
                        jArr3[i5] = -1;
                        int iK = k(j2) & l();
                        int[] iArr2 = this.e;
                        int i6 = iArr2[iK];
                        if (i6 == i5) {
                            iArr2[iK] = i2;
                        } else {
                            while (true) {
                                jArr = this.f;
                                j = jArr[i6];
                                int i7 = (int) j;
                                if (i7 == i5) {
                                    break;
                                }
                                i6 = i7;
                            }
                            jArr[i6] = m(j, i2);
                        }
                    } else {
                        this.a[i2] = null;
                        this.b[i2] = 0;
                        this.f[i2] = -1;
                    }
                    this.c--;
                    this.d++;
                    return i4;
                }
                int i8 = (int) this.f[i2];
                if (i8 != -1) {
                    i3 = i2;
                    i2 = i8;
                }
            }
        }
        return 0;
    }

    final int g(int i) {
        return f(this.a[i], k(this.f[i]));
    }

    final Object h(int i) {
        obr.aX(i, this.c);
        return this.a[i];
    }

    final void i(int i, int i2) {
        obr.aX(i, this.c);
        this.b[i] = i2;
    }

    final void j() {
        obr.aG(true, "Initial capacity must be non-negative");
        obr.aG(true, "Illegal load factor");
        int iE = ohh.E(3);
        this.e = n(iE);
        this.g = 1.0f;
        this.a = new Object[3];
        this.b = new int[3];
        long[] jArr = new long[3];
        Arrays.fill(jArr, -1L);
        this.f = jArr;
        this.h = Math.max(1, iE);
    }
}
