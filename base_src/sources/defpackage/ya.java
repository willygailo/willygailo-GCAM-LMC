package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ya {
    xy[] e;
    public final xz j;
    private final xy r;
    private xy s;
    public static boolean a = false;
    private static int k = 1000;
    public static long b = 0;
    public boolean c = false;
    int d = 0;
    private int l = 32;
    private int m = 32;
    public boolean f = false;
    public boolean g = false;
    private boolean[] n = new boolean[32];
    int h = 1;
    int i = 0;
    private int o = 32;
    private yf[] p = new yf[k];
    private int q = 0;

    public ya() {
        this.e = null;
        this.e = new xy[32];
        t();
        xz xzVar = new xz();
        this.j = xzVar;
        this.r = new ye(xzVar);
        this.s = new xy(xzVar);
    }

    public static final int o(Object obj) {
        yf yfVar = ((yj) obj).h;
        if (yfVar != null) {
            return (int) (yfVar.f + 0.5f);
        }
        return 0;
    }

    private final void q(xy xyVar) {
        int i;
        if (xyVar.d) {
            xyVar.a.d(this, xyVar.b);
        } else {
            xy[] xyVarArr = this.e;
            int i2 = this.i;
            xyVarArr[i2] = xyVar;
            yf yfVar = xyVar.a;
            yfVar.d = i2;
            this.i = i2 + 1;
            yfVar.e(this, xyVar);
        }
        if (this.c) {
            int i3 = 0;
            while (i3 < this.i) {
                if (this.e[i3] == null) {
                    System.out.println("WTF");
                }
                xy xyVar2 = this.e[i3];
                if (xyVar2 != null && xyVar2.d) {
                    xyVar2.a.d(this, xyVar2.b);
                    this.j.b.b(xyVar2);
                    this.e[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.i;
                        if (i4 >= i) {
                            break;
                        }
                        xy[] xyVarArr2 = this.e;
                        int i6 = i4 - 1;
                        xy xyVar3 = xyVarArr2[i4];
                        xyVarArr2[i6] = xyVar3;
                        yf yfVar2 = xyVar3.a;
                        if (yfVar2.d == i4) {
                            yfVar2.d = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.e[i5] = null;
                    }
                    this.i = i - 1;
                    i3--;
                }
                i3++;
            }
            this.c = false;
        }
    }

    private final void r() {
        for (int i = 0; i < this.i; i++) {
            xy xyVar = this.e[i];
            xyVar.a.f = xyVar.b;
        }
    }

    private final void s() {
        int i = this.l;
        int i2 = i + i;
        this.l = i2;
        this.e = (xy[]) Arrays.copyOf(this.e, i2);
        xz xzVar = this.j;
        xzVar.a = (yf[]) Arrays.copyOf(xzVar.a, this.l);
        int i3 = this.l;
        this.n = new boolean[i3];
        this.m = i3;
        this.o = i3;
    }

    private final void t() {
        for (int i = 0; i < this.i; i++) {
            xy xyVar = this.e[i];
            if (xyVar != null) {
                this.j.b.b(xyVar);
            }
            this.e[i] = null;
        }
    }

    private final void u(xy xyVar) {
        xx xxVar;
        int i;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.n[i2] = false;
        }
        boolean z = false;
        int i3 = 0;
        while (!z) {
            i3++;
            int i4 = this.h;
            if (i3 >= i4 + i4) {
                return;
            }
            yf yfVar = xyVar.a;
            if (yfVar != null) {
                this.n[yfVar.c] = true;
            }
            yf yfVarK = xyVar.k(this.n);
            if (yfVarK != null) {
                boolean[] zArr = this.n;
                int i5 = yfVarK.c;
                if (zArr[i5]) {
                    return;
                } else {
                    zArr[i5] = true;
                }
            }
            if (yfVarK != null) {
                float f = Float.MAX_VALUE;
                int i6 = -1;
                for (int i7 = 0; i7 < this.i; i7++) {
                    xy xyVar2 = this.e[i7];
                    if (xyVar2.a.n != 1 && !xyVar2.d && (i = (xxVar = xyVar2.e).f) != -1) {
                        for (int i8 = 0; i != -1 && i8 < xxVar.a; i8++) {
                            if (xxVar.c[i] == yfVarK.c) {
                                float fA = xyVar2.e.a(yfVarK);
                                if (fA >= 0.0f) {
                                    break;
                                }
                                float f2 = (-xyVar2.b) / fA;
                                if (f2 >= f) {
                                    break;
                                }
                                i6 = i7;
                                f = f2;
                                break;
                            }
                            i = xxVar.d[i];
                        }
                    }
                }
                if (i6 >= 0) {
                    xy xyVar3 = this.e[i6];
                    xyVar3.a.d = -1;
                    xyVar3.b(yfVarK);
                    yf yfVar2 = xyVar3.a;
                    yfVar2.d = i6;
                    yfVar2.e(this, xyVar3);
                }
            } else {
                z = true;
            }
        }
    }

    private final yf v(int i) {
        yf yfVar = (yf) this.j.c.a();
        if (yfVar == null) {
            yfVar = new yf(i);
            yfVar.n = i;
        } else {
            yfVar.c();
            yfVar.n = i;
        }
        int i2 = this.q;
        int i3 = k;
        if (i2 >= i3) {
            int i4 = i3 + i3;
            k = i4;
            this.p = (yf[]) Arrays.copyOf(this.p, i4);
        }
        yf[] yfVarArr = this.p;
        int i5 = this.q;
        this.q = i5 + 1;
        yfVarArr[i5] = yfVar;
        return yfVar;
    }

    public final xy a() {
        xy xyVar = (xy) this.j.b.a();
        if (xyVar == null) {
            xyVar = new xy(this.j);
            b++;
        } else {
            xyVar.a = null;
            xyVar.e.f();
            xyVar.b = 0.0f;
            xyVar.d = false;
        }
        yf.a++;
        return xyVar;
    }

    public final yf b(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.h + 1 >= this.m) {
            s();
        }
        yj yjVar = (yj) obj;
        yf yfVar = yjVar.h;
        if (yfVar == null) {
            yjVar.i();
            yfVar = yjVar.h;
        }
        int i = yfVar.c;
        if (i == -1) {
            int i2 = this.d + 1;
            this.d = i2;
            this.h++;
            yfVar.c = i2;
            yfVar.n = 1;
            this.j.a[i2] = yfVar;
        } else if (i > this.d || this.j.a[i] == null) {
            if (i != -1) {
                yfVar.c();
            }
            int i3 = this.d + 1;
            this.d = i3;
            this.h++;
            yfVar.c = i3;
            yfVar.n = 1;
            this.j.a[i3] = yfVar;
        }
        return yfVar;
    }

    public final yf c() {
        if (this.h + 1 >= this.m) {
            s();
        }
        yf yfVarV = v(3);
        int i = this.d + 1;
        this.d = i;
        this.h++;
        yfVarV.c = i;
        this.j.a[i] = yfVarV;
        return yfVarV;
    }

    public final void d(yf yfVar, yf yfVar2, int i, float f, yf yfVar3, yf yfVar4, int i2, int i3) {
        xy xyVarA = a();
        if (yfVar2 == yfVar3) {
            xyVarA.e.g(yfVar, 1.0f);
            xyVarA.e.g(yfVar4, 1.0f);
            xyVarA.e.g(yfVar2, -2.0f);
        } else if (f == 0.5f) {
            xyVarA.e.g(yfVar, 1.0f);
            xyVarA.e.g(yfVar2, -1.0f);
            xyVarA.e.g(yfVar3, -1.0f);
            xyVarA.e.g(yfVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                xyVarA.b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            xyVarA.e.g(yfVar, -1.0f);
            xyVarA.e.g(yfVar2, 1.0f);
            xyVarA.b = i;
        } else if (f >= 1.0f) {
            xyVarA.e.g(yfVar4, -1.0f);
            xyVarA.e.g(yfVar3, 1.0f);
            xyVarA.b = -i2;
        } else {
            float f2 = 1.0f - f;
            xyVarA.e.g(yfVar, f2);
            xyVarA.e.g(yfVar2, -f2);
            xyVarA.e.g(yfVar3, -f);
            xyVarA.e.g(yfVar4, f);
            if (i > 0 || i2 > 0) {
                xyVarA.b = ((-i) * f2) + (i2 * f);
            }
        }
        if (i3 != 8) {
            xyVarA.f(this, i3);
        }
        e(xyVarA);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01ab  */
    public final void e(xy xyVar) {
        boolean z;
        boolean z2;
        yf yfVarA;
        if (this.i + 1 >= this.o || this.h + 1 >= this.m) {
            s();
        }
        if (!xyVar.d) {
            if (this.e.length != 0) {
                boolean z3 = false;
                while (!z3) {
                    int i = xyVar.e.a;
                    for (int i2 = 0; i2 < i; i2++) {
                        yf yfVarD = xyVar.e.d(i2);
                        if (yfVarD.d != -1 || yfVarD.g) {
                            xyVar.c.add(yfVarD);
                        } else {
                            boolean z4 = yfVarD.m;
                        }
                    }
                    int size = xyVar.c.size();
                    if (size > 0) {
                        for (int i3 = 0; i3 < size; i3++) {
                            yf yfVar = (yf) xyVar.c.get(i3);
                            if (yfVar.g) {
                                xyVar.c(this, yfVar, true);
                            } else {
                                boolean z5 = yfVar.m;
                                xyVar.d(this, this.e[yfVar.d], true);
                            }
                        }
                        xyVar.c.clear();
                    } else {
                        z3 = true;
                    }
                }
                if (xyVar.a != null && xyVar.e.a == 0) {
                    xyVar.d = true;
                    this.c = true;
                }
            }
            if (xyVar.e()) {
                return;
            }
            float f = xyVar.b;
            if (f < 0.0f) {
                xyVar.b = -f;
                xx xxVar = xyVar.e;
                int i4 = xxVar.f;
                for (int i5 = 0; i4 != -1 && i5 < xxVar.a; i5++) {
                    float[] fArr = xxVar.e;
                    fArr[i4] = -fArr[i4];
                    i4 = xxVar.d[i4];
                }
            }
            int i6 = xyVar.e.a;
            yf yfVar2 = null;
            yf yfVar3 = null;
            float f2 = 0.0f;
            float f3 = 0.0f;
            boolean zL = false;
            boolean zL2 = false;
            for (int i7 = 0; i7 < i6; i7++) {
                float fB = xyVar.e.b(i7);
                yf yfVarD2 = xyVar.e.d(i7);
                if (yfVarD2.n == 1) {
                    if (yfVar2 == null) {
                        zL2 = xy.l(yfVarD2);
                        yfVar2 = yfVarD2;
                        f2 = fB;
                    } else if (f2 > fB) {
                        zL2 = xy.l(yfVarD2);
                        yfVar2 = yfVarD2;
                        f2 = fB;
                    } else if (!zL2 && xy.l(yfVarD2)) {
                        yfVar2 = yfVarD2;
                        f2 = fB;
                        zL2 = true;
                    }
                } else if (yfVar2 == null && fB < 0.0f) {
                    if (yfVar3 == null) {
                        zL = xy.l(yfVarD2);
                        yfVar3 = yfVarD2;
                        f3 = fB;
                    } else if (f3 > fB) {
                        zL = xy.l(yfVarD2);
                        yfVar3 = yfVarD2;
                        f3 = fB;
                    } else if (!zL && xy.l(yfVarD2)) {
                        yfVar3 = yfVarD2;
                        f3 = fB;
                        zL = true;
                    }
                }
            }
            if (yfVar2 == null) {
                yfVar2 = yfVar3;
            }
            if (yfVar2 == null) {
                z = true;
            } else {
                xyVar.b(yfVar2);
                z = false;
            }
            if (xyVar.e.a == 0) {
                xyVar.d = true;
            }
            if (z) {
                if (this.h + 1 >= this.m) {
                    s();
                }
                yf yfVarV = v(3);
                int i8 = this.d + 1;
                this.d = i8;
                this.h++;
                yfVarV.c = i8;
                this.j.a[i8] = yfVarV;
                xyVar.a = yfVarV;
                int i9 = this.i;
                q(xyVar);
                if (this.i == i9 + 1) {
                    xy xyVar2 = this.s;
                    xyVar2.a = null;
                    xyVar2.e.f();
                    int i10 = 0;
                    while (true) {
                        xx xxVar2 = xyVar.e;
                        if (i10 >= xxVar2.a) {
                            break;
                        }
                        xyVar2.e.e(xxVar2.d(i10), xyVar.e.b(i10), true);
                        i10++;
                    }
                    u(this.s);
                    if (yfVarV.d == -1) {
                        if (xyVar.a == yfVarV && (yfVarA = xyVar.a(null, yfVarV)) != null) {
                            xyVar.b(yfVarA);
                        }
                        if (!xyVar.d) {
                            xyVar.a.e(this, xyVar);
                        }
                        this.j.b.b(xyVar);
                        this.i--;
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            yf yfVar4 = xyVar.a;
            if (yfVar4 == null) {
                return;
            }
            if ((yfVar4.n != 1 && xyVar.b < 0.0f) || z2) {
                return;
            }
        }
        q(xyVar);
    }

    public final void f(yf yfVar, int i) {
        int i2 = yfVar.d;
        if (i2 == -1) {
            yfVar.d(this, i);
            for (int i3 = 0; i3 < this.d + 1; i3++) {
                yf yfVar2 = this.j.a[i3];
            }
            return;
        }
        if (i2 == -1) {
            xy xyVarA = a();
            xyVarA.a = yfVar;
            float f = i;
            yfVar.f = f;
            xyVarA.b = f;
            xyVarA.d = true;
            e(xyVarA);
            return;
        }
        xy xyVar = this.e[i2];
        if (xyVar.d) {
            xyVar.b = i;
            return;
        }
        if (xyVar.e.a == 0) {
            xyVar.d = true;
            xyVar.b = i;
            return;
        }
        xy xyVarA2 = a();
        if (i < 0) {
            xyVarA2.b = -i;
            xyVarA2.e.g(yfVar, 1.0f);
        } else {
            xyVarA2.b = i;
            xyVarA2.e.g(yfVar, -1.0f);
        }
        e(xyVarA2);
    }

    public final void g(yf yfVar, yf yfVar2, int i, int i2) {
        xy xyVarA = a();
        yf yfVarC = c();
        yfVarC.e = 0;
        xyVarA.h(yfVar, yfVar2, yfVarC, i);
        if (i2 != 8) {
            i(xyVarA, (int) (-xyVarA.e.a(yfVarC)), i2);
        }
        e(xyVarA);
    }

    public final void h(yf yfVar, yf yfVar2, int i, int i2) {
        xy xyVarA = a();
        yf yfVarC = c();
        yfVarC.e = 0;
        xyVarA.i(yfVar, yfVar2, yfVarC, i);
        if (i2 != 8) {
            i(xyVarA, (int) (-xyVarA.e.a(yfVarC)), i2);
        }
        e(xyVarA);
    }

    final void i(xy xyVar, int i, int i2) {
        xyVar.e.g(p(i2), i);
    }

    public final void j() {
        if (this.r.e()) {
            r();
            return;
        }
        if (!this.g) {
            l(this.r);
            return;
        }
        for (int i = 0; i < this.i; i++) {
            if (!this.e[i].d) {
                l(this.r);
                return;
            }
        }
        r();
    }

    public final void k() {
        xz xzVar;
        int i = 0;
        while (true) {
            xzVar = this.j;
            yf[] yfVarArr = xzVar.a;
            if (i >= yfVarArr.length) {
                break;
            }
            yf yfVar = yfVarArr[i];
            if (yfVar != null) {
                yfVar.c();
            }
            i++;
        }
        yb ybVar = xzVar.c;
        yf[] yfVarArr2 = this.p;
        int i2 = this.q;
        int length = yfVarArr2.length;
        if (i2 > length) {
            i2 = length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            yf yfVar2 = yfVarArr2[i3];
            int i4 = ybVar.b;
            if (i4 < 256) {
                ybVar.a[i4] = yfVar2;
                ybVar.b = i4 + 1;
            }
        }
        this.q = 0;
        Arrays.fill(this.j.a, (Object) null);
        this.d = 0;
        ye yeVar = (ye) this.r;
        yeVar.f = 0;
        yeVar.b = 0.0f;
        this.h = 1;
        for (int i5 = 0; i5 < this.i; i5++) {
            xy xyVar = this.e[i5];
        }
        t();
        this.i = 0;
        this.s = new xy(this.j);
    }

    final void l(xy xyVar) {
        boolean z;
        for (int i = 0; i < this.i; i++) {
            xy xyVar2 = this.e[i];
            if (xyVar2.a.n != 1) {
                float f = 0.0f;
                if (xyVar2.b < 0.0f) {
                    boolean z2 = false;
                    int i2 = 0;
                    while (!z2) {
                        i2++;
                        float f2 = Float.MAX_VALUE;
                        int i3 = 0;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        while (i3 < this.i) {
                            xy xyVar3 = this.e[i3];
                            if (xyVar3.a.n != 1 && !xyVar3.d && xyVar3.b < f) {
                                int i7 = xyVar3.e.a;
                                int i8 = 0;
                                while (i8 < i7) {
                                    yf yfVarD = xyVar3.e.d(i8);
                                    float fA = xyVar3.e.a(yfVarD);
                                    if (fA > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = yfVarD.h[i9] / fA;
                                            if ((f3 < f2 && i9 == i6) || i9 > i6) {
                                                i5 = yfVarD.c;
                                                i6 = i9;
                                                f2 = f3;
                                                i4 = i3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i3++;
                            f = 0.0f;
                        }
                        if (i4 != -1) {
                            xy xyVar4 = this.e[i4];
                            xyVar4.a.d = -1;
                            xyVar4.b(this.j.a[i5]);
                            yf yfVar = xyVar4.a;
                            yfVar.d = i4;
                            yfVar.e(this, xyVar4);
                            z = false;
                        } else {
                            z = true;
                        }
                        z2 = (!(i2 <= this.h / 2)) | z;
                        f = 0.0f;
                    }
                    break;
                }
            }
        }
        u(xyVar);
        r();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    public final void m(yf yfVar, yf yfVar2, int i, int i2) {
        boolean z;
        if (i2 == 8) {
            if (yfVar2.g && yfVar.d == -1) {
                yfVar.d(this, yfVar2.f + i);
                return;
            }
            i2 = 8;
        }
        xy xyVarA = a();
        if (i == 0) {
            xyVarA.e.g(yfVar, -1.0f);
            xyVarA.e.g(yfVar2, 1.0f);
        } else {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            xyVarA.b = i;
            if (z) {
                xyVarA.e.g(yfVar, 1.0f);
                xyVarA.e.g(yfVar2, -1.0f);
            } else {
                xyVarA.e.g(yfVar, -1.0f);
                xyVarA.e.g(yfVar2, 1.0f);
            }
        }
        if (i2 != 8) {
            xyVarA.f(this, i2);
        }
        e(xyVarA);
    }

    public final void n(yf yfVar, yf yfVar2, yf yfVar3, yf yfVar4, float f) {
        xy xyVarA = a();
        xyVarA.g(yfVar, yfVar2, yfVar3, yfVar4, f);
        e(xyVarA);
    }

    public final yf p(int i) {
        if (this.h + 1 >= this.m) {
            s();
        }
        yf yfVarV = v(4);
        int i2 = this.d + 1;
        this.d = i2;
        this.h++;
        yfVarV.c = i2;
        yfVarV.e = i;
        this.j.a[i2] = yfVarV;
        ye yeVar = (ye) this.r;
        yd ydVar = yeVar.g;
        ydVar.a = yfVarV;
        Arrays.fill(ydVar.a.i, 0.0f);
        yfVarV.i[yfVarV.e] = 1.0f;
        yeVar.m(yfVarV);
        return yfVarV;
    }
}
