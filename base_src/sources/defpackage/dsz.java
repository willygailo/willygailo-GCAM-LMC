package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dsz implements dqx {
    public final dqw b;
    private final float[] d;
    private final long[] e;
    private final int f;
    private final int g;
    private final int h;
    private final dsy i;
    private final dsx j;
    private final int l;
    private final dta m;
    public final Object a = new Object();
    public int c = 0;
    private boolean k = false;

    public dsz(dqw dqwVar, int i, int i2, int i3, int i4, dsy dsyVar, dta dtaVar, dsx dsxVar) {
        this.b = dqwVar;
        this.m = dtaVar;
        this.j = dsxVar;
        this.f = i3;
        int i5 = i2 * i;
        this.d = new float[i5];
        this.e = new long[i];
        this.g = i;
        this.h = i5;
        this.l = i4;
        this.i = dsyVar;
    }

    private final boolean i() {
        if (!this.k) {
            return false;
        }
        this.k = false;
        return this.i.a(this);
    }

    private static final int j(int i) {
        return i >= 0 ? i : -(i + 1);
    }

    private static final int k(int i) {
        return i >= 0 ? i : -(i + 2);
    }

    @Override // defpackage.dqx
    public final float a(long j) {
        obr.aR(this.f == 1, "valueAt() only applicable to 1D features!");
        synchronized (this.a) {
            int i = this.c;
            float f = Float.NaN;
            if (i == 0) {
                return Float.NaN;
            }
            int iBinarySearch = Arrays.binarySearch(this.e, 0, i, j);
            int i2 = this.l;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            switch (i3) {
                case 0:
                case 1:
                    int iMax = Math.max(0, k(iBinarySearch));
                    int iMin = Math.min(this.c - 1, j(iBinarySearch));
                    long[] jArr = this.e;
                    long j2 = jArr[iMax];
                    long j3 = jArr[iMin];
                    float[] fArr = this.d;
                    if (j - j2 >= j3 - j) {
                        iMax = iMin;
                    }
                    return fArr[iMax];
                case 2:
                    return iBinarySearch >= 0 ? this.d[iBinarySearch] : Float.NaN;
                case 3:
                    if (iBinarySearch != -1) {
                        f = this.d[k(iBinarySearch)];
                    }
                    return f;
                case 4:
                    int iMax2 = Math.max(0, k(iBinarySearch));
                    int iMin2 = Math.min(this.c - 1, j(iBinarySearch));
                    if (iMax2 == iMin2) {
                        return this.d[iMax2];
                    }
                    long[] jArr2 = this.e;
                    long j4 = jArr2[iMax2];
                    double d = j - j4;
                    double d2 = jArr2[iMin2] - j4;
                    Double.isNaN(d);
                    Double.isNaN(d2);
                    double d3 = d / d2;
                    double d4 = 1.0d - d3;
                    float[] fArr2 = this.d;
                    double d5 = fArr2[iMax2];
                    Double.isNaN(d5);
                    double d6 = d4 * d5;
                    double d7 = fArr2[iMin2];
                    Double.isNaN(d7);
                    return (float) (d6 + (d3 * d7));
                default:
                    return Float.NaN;
            }
        }
    }

    @Override // defpackage.dqx
    public final long b() {
        long j;
        synchronized (this.a) {
            int i = this.c;
            j = i > 0 ? this.e[i - 1] : 0L;
        }
        return j;
    }

    @Override // defpackage.dqx
    public final dqu c(long j) throws Throwable {
        dqu dquVarD;
        int i = this.l;
        synchronized (this.a) {
            try {
                int i2 = this.c;
                if (i2 != 0) {
                    int i3 = 0;
                    int iBinarySearch = Arrays.binarySearch(this.e, 0, i2, j);
                    int i4 = i - 1;
                    if (i == 0) {
                        throw null;
                    }
                    switch (i4) {
                        case 0:
                            int iMax = Math.max(0, k(iBinarySearch));
                            int iMin = Math.min(this.c - 1, j(iBinarySearch));
                            long[] jArr = this.e;
                            dquVarD = j - jArr[iMax] < jArr[iMin] - j ? dqu.d(this.b, j, this.d, this.j.a(iMax), this.m.a) : dqu.d(this.b, j, this.d, this.j.a(iMin), this.m.a);
                            break;
                        case 1:
                            int iMax2 = Math.max(0, k(iBinarySearch));
                            int iMin2 = Math.min(this.c - 1, j(iBinarySearch));
                            long[] jArr2 = this.e;
                            long j2 = jArr2[iMax2];
                            long j3 = jArr2[iMin2];
                            dquVarD = j - j2 < j3 - j ? dqu.d(this.b, j2, this.d, this.j.a(iMax2), this.m.a) : dqu.d(this.b, j3, this.d, this.j.a(iMin2), this.m.a);
                            break;
                        case 2:
                            dquVarD = iBinarySearch >= 0 ? dqu.d(this.b, j, this.d, this.j.a(iBinarySearch), this.m.a) : dqu.c(this.b, j);
                            break;
                        case 3:
                            dquVarD = iBinarySearch != -1 ? dqu.d(this.b, j, this.d, this.j.a(k(iBinarySearch)), this.m.a) : dqu.c(this.b, j);
                            break;
                        case 4:
                            try {
                                obr.aQ(true);
                                int iMax3 = Math.max(0, k(iBinarySearch));
                                int iMin3 = Math.min(this.c - 1, j(iBinarySearch));
                                if (iMax3 != iMin3) {
                                    long[] jArr3 = this.e;
                                    long j4 = jArr3[iMax3];
                                    double d = j - j4;
                                    double d2 = jArr3[iMin3] - j4;
                                    Double.isNaN(d);
                                    Double.isNaN(d2);
                                    double d3 = d / d2;
                                    dqw dqwVar = this.b;
                                    float[] fArr = this.d;
                                    int iA = this.j.a(iMax3);
                                    int iA2 = this.j.a(iMin3);
                                    int i5 = this.m.a;
                                    float[] fArr2 = new float[i5];
                                    while (i3 < i5) {
                                        double d4 = 1.0d - d3;
                                        dqw dqwVar2 = dqwVar;
                                        double d5 = fArr[iA + i3];
                                        Double.isNaN(d5);
                                        double d6 = d4 * d5;
                                        double d7 = fArr[iA2 + i3];
                                        Double.isNaN(d7);
                                        fArr2[i3] = (float) (d6 + (d7 * d3));
                                        i3++;
                                        dqwVar = dqwVar2;
                                    }
                                    dquVarD = new dqu(dqwVar, j, fArr2);
                                } else {
                                    dquVarD = dqu.d(this.b, j, this.d, this.j.a(iMax3), this.m.a);
                                }
                            } catch (Throwable th) {
                                th = th;
                            }
                            break;
                        default:
                            dquVarD = dqu.c(this.b, j);
                            break;
                    }
                    throw th;
                }
                dquVarD = dqu.c(this.b, j);
                return dquVarD;
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // defpackage.dqx
    public final dqu d() {
        dqu dquVarC;
        synchronized (this.a) {
            int i = this.c;
            if (i > 0) {
                int i2 = i - 1;
                dquVarC = dqu.d(this.b, this.e[i2], this.d, this.j.a(i2), this.m.a);
            } else {
                dquVarC = dqu.c(this.b, 0L);
            }
        }
        return dquVarC;
    }

    @Override // defpackage.dqx
    public final boolean e() {
        boolean z;
        synchronized (this.a) {
            z = this.c == 0;
        }
        return z;
    }

    @Override // defpackage.dqx
    public final List f(long j, int i) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.a) {
            try {
                if (j > 0) {
                    int iK = k(Arrays.binarySearch(this.e, 0, this.c, j));
                    if (iK < 0) {
                        return arrayList;
                    }
                    for (int i2 = iK; i2 >= 0 && i2 > iK - i; i2--) {
                        long j2 = this.e[i2];
                        if (j2 < 0) {
                            break;
                        }
                        arrayList.add(dqu.d(this.b, j2, this.d, this.j.a(i2), this.m.a));
                    }
                } else {
                    int iJ = j(Arrays.binarySearch(this.e, 0, this.c, j));
                    for (int i3 = iJ; i3 < this.c && i3 < iJ + i; i3++) {
                        long j3 = this.e[i3];
                        if (j3 > 0) {
                            break;
                        }
                        arrayList.add(dqu.d(this.b, j3, this.d, this.j.a(i3), this.m.a));
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(long j, float f) {
        int iB;
        synchronized (this.a) {
            int i = this.c;
            if (i >= this.g || (iB = this.j.b(i)) >= this.h) {
                if (i()) {
                    g(j, f);
                }
                return;
            }
            this.d[iB] = f;
            this.e[this.c] = j;
            this.m.a(1);
            this.c++;
            this.k = true;
        }
    }

    public final void h(long j, float... fArr) {
        synchronized (this.a) {
            int i = this.c;
            if (i >= this.g) {
                if (i()) {
                    h(j, fArr);
                }
                return;
            }
            dsx dsxVar = this.j;
            int length = fArr.length;
            int iB = dsxVar.b(i);
            if (iB + length <= this.h) {
                System.arraycopy(fArr, 0, this.d, iB, this.m.a(length));
                long[] jArr = this.e;
                int i2 = this.c;
                jArr[i2] = j;
                this.c = i2 + 1;
                this.k = true;
            }
        }
    }
}
