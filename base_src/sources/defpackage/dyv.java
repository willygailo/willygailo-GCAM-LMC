package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dyv {
    private final juc b = new juc();
    private final juc c = new juc();
    private final juc d = new juc();
    private final juc e = new juc();
    private final jtz f = new jtz();
    private final jtz g = new jtz();
    public final juc a = new juc();

    public static final void b(juc jucVar, jtz jtzVar) {
        double d;
        double dA = juc.a(jucVar, jucVar);
        double dSqrt = Math.sqrt(dA);
        double d2 = 0.5d;
        if (dA < 1.0E-8d) {
            d = 1.0d - (dA * 0.1666666716337204d);
        } else if (dA < 1.0E-6d) {
            d2 = 0.5d - (0.0416666679084301d * dA);
            double d3 = dA * 0.1666666716337204d;
            d = 1.0d - (d3 * (1.0d - d3));
        } else {
            double d4 = 1.0d / dSqrt;
            double dSin = Math.sin(dSqrt) * d4;
            double dCos = d4 * d4 * (1.0d - Math.cos(dSqrt));
            d = dSin;
            d2 = dCos;
        }
        double d5 = jucVar.a;
        double d6 = d5 * d5;
        double d7 = jucVar.b;
        double d8 = d7 * d7;
        double d9 = jucVar.c;
        double d10 = d9 * d9;
        jtzVar.e(0, 0, 1.0d - ((d8 + d10) * d2));
        jtzVar.e(1, 1, 1.0d - ((d10 + d6) * d2));
        jtzVar.e(2, 2, 1.0d - ((d6 + d8) * d2));
        double d11 = jucVar.c * d;
        double d12 = jucVar.a * jucVar.b * d2;
        jtzVar.e(0, 1, d12 - d11);
        jtzVar.e(1, 0, d12 + d11);
        double d13 = jucVar.b * d;
        double d14 = jucVar.a * jucVar.c * d2;
        jtzVar.e(0, 2, d14 + d13);
        jtzVar.e(2, 0, d14 - d13);
        double d15 = d * jucVar.a;
        double d16 = d2 * jucVar.b * jucVar.c;
        jtzVar.e(1, 2, d16 - d15);
        jtzVar.e(2, 1, d16 + d15);
    }

    public final void a(juc jucVar, juc jucVar2, jtz jtzVar) {
        jtzVar.h();
        juc.c(jucVar, jucVar2, this.c);
        if (this.c.b() == 0.0d) {
            return;
        }
        this.d.f(jucVar);
        this.e.f(jucVar2);
        this.c.d();
        this.d.d();
        this.e.d();
        jtz jtzVar2 = this.f;
        jtzVar2.g(0, this.d);
        jtzVar2.g(1, this.c);
        juc.c(this.c, this.d, this.b);
        jtzVar2.g(2, this.b);
        jtz jtzVar3 = this.g;
        jtzVar3.g(0, this.e);
        jtzVar3.g(1, this.c);
        juc.c(this.c, this.e, this.b);
        jtzVar3.g(2, this.b);
        double[] dArr = jtzVar2.a;
        double d = dArr[1];
        dArr[1] = dArr[3];
        dArr[3] = d;
        double d2 = dArr[2];
        dArr[2] = dArr[6];
        dArr[6] = d2;
        double d3 = dArr[5];
        dArr[5] = dArr[7];
        dArr[7] = d3;
        jtz.b(jtzVar3, jtzVar2, jtzVar);
    }
}
