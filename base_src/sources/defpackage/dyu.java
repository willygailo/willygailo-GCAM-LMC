package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dyu {
    private long s;
    private long t;
    private float u;
    private int w;
    private final double[] a = new double[16];
    private final jtz b = new jtz();
    private final jtz c = new jtz();
    private final jtz d = new jtz();
    private final jtz e = new jtz();
    private final jtz f = new jtz();
    private final jtz g = new jtz();
    private final jtz h = new jtz();
    private final jtz i = new jtz();
    private final jtz j = new jtz();
    private final juc k = new juc();
    private final juc l = new juc();
    private final juc m = new juc();
    private final juc n = new juc();
    private final juc o = new juc();
    private final juc p = new juc();
    private final juc q = new juc();
    private final dyv r = new dyv();
    private boolean v = false;
    private boolean x = true;
    private final jtz y = new jtz();
    private final jtz z = new jtz();
    private final jtz A = new jtz();
    private final jtz B = new jtz();
    private final jtz C = new jtz();
    private final jtz D = new jtz();
    private final jtz E = new jtz();
    private final jtz F = new jtz();
    private final juc G = new juc();
    private final juc H = new juc();
    private final juc I = new juc();
    private final jtz J = new jtz();
    private final jtz K = new jtz();
    private final jtz L = new jtz();

    private dyu() {
    }

    public static dyu b() {
        dyu dyuVar = new dyu();
        dyuVar.e();
        return dyuVar;
    }

    private final void i(jtz jtzVar, juc jucVar) {
        jtz.c(jtzVar, this.p, this.m);
        this.r.a(this.m, this.l, this.L);
        dyv dyvVar = this.r;
        jtz jtzVar2 = this.L;
        double dA = (((jtzVar2.a(0, 0) + jtzVar2.a(1, 1)) + jtzVar2.a(2, 2)) - 1.0d) * 0.5d;
        jucVar.g((jtzVar2.a(2, 1) - jtzVar2.a(1, 2)) / 2.0d, (jtzVar2.a(0, 2) - jtzVar2.a(2, 0)) / 2.0d, (jtzVar2.a(1, 0) - jtzVar2.a(0, 1)) / 2.0d);
        double dB = jucVar.b();
        if (dA > 0.7071067811865476d) {
            if (dB > 0.0d) {
                jucVar.e(Math.asin(dB) / dB);
                return;
            }
            return;
        }
        if (dA > -0.7071067811865476d) {
            jucVar.e(Math.acos(dA) / dB);
            return;
        }
        double dAsin = 3.141592653589793d - Math.asin(dB);
        double dA2 = jtzVar2.a(0, 0) - dA;
        double dA3 = jtzVar2.a(1, 1) - dA;
        double dA4 = jtzVar2.a(2, 2) - dA;
        juc jucVar2 = dyvVar.a;
        double d = dA2 * dA2;
        double d2 = dA3 * dA3;
        if (d > d2 && d > dA4 * dA4) {
            jucVar2.g(dA2, (jtzVar2.a(1, 0) + jtzVar2.a(0, 1)) / 2.0d, (jtzVar2.a(0, 2) + jtzVar2.a(2, 0)) / 2.0d);
        } else if (d2 > dA4 * dA4) {
            jucVar2.g((jtzVar2.a(1, 0) + jtzVar2.a(0, 1)) / 2.0d, dA3, (jtzVar2.a(2, 1) + jtzVar2.a(1, 2)) / 2.0d);
        } else {
            jucVar2.g((jtzVar2.a(0, 2) + jtzVar2.a(2, 0)) / 2.0d, (jtzVar2.a(2, 1) + jtzVar2.a(1, 2)) / 2.0d, dA4);
        }
        if (juc.a(jucVar2, jucVar) < 0.0d) {
            jucVar2.e(-1.0d);
        }
        jucVar2.d();
        jucVar2.e(dAsin);
        jucVar.f(jucVar2);
    }

    private final void j() {
        this.c.k(this.J);
        jtz.b(this.d, this.J, this.K);
        jtz.b(this.c, this.K, this.d);
        this.c.h();
    }

    public final double a() {
        double dA = this.b.a(2, 0);
        double dA2 = this.b.a(2, 1);
        if (Math.sqrt((dA * dA) + (dA2 * dA2)) < 0.1d) {
            return 0.0d;
        }
        double dAtan2 = (-90.0d) - ((Math.atan2(dA2, dA) / 3.141592653589793d) * 180.0d);
        if (dAtan2 < 0.0d) {
            dAtan2 += 360.0d;
        }
        return dAtan2 >= 360.0d ? dAtan2 - 360.0d : dAtan2;
    }

    public final synchronized void c(float[] fArr, long j) {
        this.l.g(fArr[0], fArr[1], fArr[2]);
        if (this.t != 0) {
            i(this.b, this.k);
            for (int i = 0; i < 3; i++) {
                juc jucVar = this.I;
                jucVar.h();
                if (i == 0) {
                    jucVar.a = 1.0E-7d;
                } else if (i == 1) {
                    jucVar.b = 1.0E-7d;
                } else {
                    jucVar.c = 1.0E-7d;
                }
                dyv.b(jucVar, this.B);
                jtz.b(this.B, this.b, this.C);
                i(this.C, this.G);
                juc jucVar2 = this.G;
                juc jucVar3 = this.k;
                this.H.g(jucVar3.a - jucVar2.a, jucVar3.b - jucVar2.b, jucVar3.c - jucVar2.c);
                this.H.e(1.0E7d);
                this.i.g(i, this.H);
            }
            this.i.k(this.D);
            jtz.b(this.d, this.D, this.E);
            jtz.b(this.i, this.E, this.F);
            jtz jtzVar = this.F;
            jtz jtzVar2 = this.g;
            jtz jtzVar3 = this.h;
            double[] dArr = jtzVar3.a;
            double[] dArr2 = jtzVar.a;
            double d = dArr2[0];
            double[] dArr3 = jtzVar2.a;
            dArr[0] = d + dArr3[0];
            dArr[1] = dArr2[1] + dArr3[1];
            dArr[2] = dArr2[2] + dArr3[2];
            dArr[3] = dArr2[3] + dArr3[3];
            dArr[4] = dArr2[4] + dArr3[4];
            dArr[5] = dArr2[5] + dArr3[5];
            dArr[6] = dArr2[6] + dArr3[6];
            dArr[7] = dArr2[7] + dArr3[7];
            dArr[8] = dArr2[8] + dArr3[8];
            jtzVar3.l(this.D);
            this.i.k(this.E);
            jtz.b(this.E, this.D, this.F);
            jtz.b(this.d, this.F, this.j);
            jtz.c(this.j, this.k, this.o);
            jtz.b(this.j, this.i, this.D);
            this.E.h();
            jtz jtzVar4 = this.E;
            jtz jtzVar5 = this.D;
            double[] dArr4 = jtzVar4.a;
            double d2 = dArr4[0];
            double[] dArr5 = jtzVar5.a;
            dArr4[0] = d2 - dArr5[0];
            dArr4[1] = dArr4[1] - dArr5[1];
            dArr4[2] = dArr4[2] - dArr5[2];
            dArr4[3] = dArr4[3] - dArr5[3];
            dArr4[4] = dArr4[4] - dArr5[4];
            dArr4[5] = dArr4[5] - dArr5[5];
            dArr4[6] = dArr4[6] - dArr5[6];
            dArr4[7] = dArr4[7] - dArr5[7];
            dArr4[8] = dArr4[8] - dArr5[8];
            jtz.b(jtzVar4, this.d, jtzVar5);
            this.d.d(this.D);
            dyv.b(this.o, this.c);
            jtz jtzVar6 = this.c;
            jtz jtzVar7 = this.b;
            jtz.b(jtzVar6, jtzVar7, jtzVar7);
            j();
        } else {
            this.r.a(this.p, this.l, this.b);
        }
        this.t = j;
    }

    public final synchronized void d(float[] fArr, long j) {
        long j2 = this.s;
        if (j2 != 0) {
            float f = (j - j2) * 1.0E-9f;
            if (f > 0.04f) {
                f = this.x ? this.u : 0.01f;
            } else if (this.v) {
                this.u = (this.u * 0.95f) + (0.050000012f * f);
                int i = this.w + 1;
                this.w = i;
                if (i > 10.0f) {
                    this.x = true;
                }
            } else {
                this.u = f;
                this.w = 1;
                this.v = true;
            }
            float f2 = -f;
            this.n.g(fArr[0] * f2, fArr[1] * f2, fArr[2] * f2);
            dyv.b(this.n, this.c);
            this.z.d(this.b);
            jtz.b(this.c, this.b, this.z);
            this.b.d(this.z);
            j();
            this.A.d(this.e);
            double d = f * f;
            double[] dArr = this.A.a;
            double d2 = dArr[0];
            Double.isNaN(d);
            dArr[0] = d2 * d;
            double d3 = dArr[1];
            Double.isNaN(d);
            dArr[1] = d3 * d;
            double d4 = dArr[2];
            Double.isNaN(d);
            dArr[2] = d4 * d;
            double d5 = dArr[3];
            Double.isNaN(d);
            dArr[3] = d5 * d;
            double d6 = dArr[4];
            Double.isNaN(d);
            dArr[4] = d6 * d;
            double d7 = dArr[5];
            Double.isNaN(d);
            dArr[5] = d7 * d;
            double d8 = dArr[6];
            Double.isNaN(d);
            dArr[6] = d8 * d;
            double d9 = dArr[7];
            Double.isNaN(d);
            dArr[7] = d9 * d;
            double d10 = dArr[8];
            Double.isNaN(d);
            dArr[8] = d10 * d;
            double[] dArr2 = this.d.a;
            dArr2[0] = dArr2[0] + dArr[0];
            dArr2[1] = dArr2[1] + dArr[1];
            dArr2[2] = dArr2[2] + dArr[2];
            dArr2[3] = dArr2[3] + dArr[3];
            dArr2[4] = dArr2[4] + dArr[4];
            dArr2[5] = dArr2[5] + dArr[5];
            dArr2[6] = dArr2[6] + dArr[6];
            dArr2[7] = dArr2[7] + dArr[7];
            dArr2[8] = dArr2[8] + dArr[8];
        }
        this.s = j;
    }

    public final void e() {
        this.s = 0L;
        this.t = 0L;
        this.b.h();
        this.c.h();
        this.d.j();
        this.d.i(25.0d);
        this.e.j();
        this.e.i(1.0d);
        this.f.j();
        this.f.i(0.0625d);
        this.g.j();
        this.g.i(0.5625d);
        this.h.j();
        this.i.j();
        this.j.j();
        this.k.h();
        this.l.h();
        this.m.h();
        this.n.h();
        this.o.h();
        this.p.g(0.0d, 0.0d, 9.81d);
        this.q.g(0.0d, 1.0d, 0.0d);
    }

    public final synchronized void f(double d) {
        double dA = ((d - a()) / 180.0d) * 3.141592653589793d;
        double dSin = Math.sin(dA);
        double dCos = Math.cos(dA);
        double[][] dArr = {new double[]{dCos, -dSin, 0.0d}, new double[]{dSin, dCos, 0.0d}, new double[]{0.0d, 0.0d, 1.0d}};
        jtz jtzVar = this.y;
        double[] dArr2 = dArr[0];
        double d2 = dArr2[0];
        double d3 = dArr2[1];
        double d4 = dArr2[2];
        double[] dArr3 = dArr[1];
        double d5 = dArr3[0];
        double d6 = dArr3[1];
        double d7 = dArr3[2];
        double[] dArr4 = dArr[2];
        jtzVar.f(d2, d3, d4, d5, d6, d7, dArr4[0], dArr4[1], dArr4[2]);
        jtz jtzVar2 = this.b;
        jtz.b(jtzVar2, this.y, jtzVar2);
    }

    public final boolean g() {
        return this.t != 0;
    }

    public final double[] h() {
        for (int i = 0; i < 3; i++) {
            for (int i2 = 0; i2 < 3; i2++) {
                this.a[(i2 * 4) + i] = this.b.a(i, i2);
            }
        }
        double[] dArr = this.a;
        dArr[11] = 0.0d;
        dArr[7] = 0.0d;
        dArr[3] = 0.0d;
        dArr[14] = 0.0d;
        dArr[13] = 0.0d;
        dArr[12] = 0.0d;
        dArr[15] = 1.0d;
        return dArr;
    }
}
