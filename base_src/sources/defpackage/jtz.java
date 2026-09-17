package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jtz {
    public final double[] a = new double[9];

    public static void b(jtz jtzVar, jtz jtzVar2, jtz jtzVar3) {
        double[] dArr = jtzVar.a;
        double d = dArr[0];
        double[] dArr2 = jtzVar2.a;
        double d2 = dArr2[0];
        double d3 = dArr[1];
        double d4 = dArr2[3];
        double d5 = dArr[2];
        double d6 = dArr2[6];
        double d7 = dArr2[1];
        double d8 = dArr2[4];
        double d9 = dArr2[7];
        double d10 = dArr2[2];
        double d11 = dArr2[5];
        double d12 = dArr2[8];
        double d13 = dArr[3];
        double d14 = dArr[4];
        double d15 = dArr[5];
        double d16 = dArr[6];
        double d17 = dArr[7];
        double d18 = dArr[8];
        jtzVar3.f((d * d2) + (d3 * d4) + (d5 * d6), (d * d7) + (d3 * d8) + (d5 * d9), (d * d10) + (d3 * d11) + (d5 * d12), (d13 * d2) + (d14 * d4) + (d15 * d6), (d13 * d7) + (d14 * d8) + (d15 * d9), (d13 * d10) + (d14 * d11) + (d15 * d12), (d2 * d16) + (d4 * d17) + (d6 * d18), (d7 * d16) + (d8 * d17) + (d9 * d18), (d16 * d10) + (d17 * d11) + (d18 * d12));
    }

    public static void c(jtz jtzVar, juc jucVar, juc jucVar2) {
        double[] dArr = jtzVar.a;
        double d = dArr[0];
        double d2 = jucVar.a;
        double d3 = dArr[1];
        double d4 = jucVar.b;
        double d5 = dArr[2];
        double d6 = jucVar.c;
        double d7 = dArr[3];
        double d8 = dArr[4];
        double d9 = dArr[5];
        double d10 = dArr[6];
        double d11 = dArr[7];
        double d12 = dArr[8];
        jucVar2.a = (d * d2) + (d3 * d4) + (d5 * d6);
        jucVar2.b = (d7 * d2) + (d8 * d4) + (d9 * d6);
        jucVar2.c = (d10 * d2) + (d11 * d4) + (d12 * d6);
    }

    public final double a(int i, int i2) {
        return this.a[(i * 3) + i2];
    }

    public final void d(jtz jtzVar) {
        double[] dArr = this.a;
        double[] dArr2 = jtzVar.a;
        dArr[0] = dArr2[0];
        dArr[1] = dArr2[1];
        dArr[2] = dArr2[2];
        dArr[3] = dArr2[3];
        dArr[4] = dArr2[4];
        dArr[5] = dArr2[5];
        dArr[6] = dArr2[6];
        dArr[7] = dArr2[7];
        dArr[8] = dArr2[8];
    }

    public final void e(int i, int i2, double d) {
        this.a[(i * 3) + i2] = d;
    }

    public final void f(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        double[] dArr = this.a;
        dArr[0] = d;
        dArr[1] = d2;
        dArr[2] = d3;
        dArr[3] = d4;
        dArr[4] = d5;
        dArr[5] = d6;
        dArr[6] = d7;
        dArr[7] = d8;
        dArr[8] = d9;
    }

    public final void g(int i, juc jucVar) {
        double[] dArr = this.a;
        dArr[i] = jucVar.a;
        dArr[i + 3] = jucVar.b;
        dArr[i + 6] = jucVar.c;
    }

    public final void h() {
        double[] dArr = this.a;
        dArr[7] = 0.0d;
        dArr[6] = 0.0d;
        dArr[5] = 0.0d;
        dArr[3] = 0.0d;
        dArr[2] = 0.0d;
        dArr[1] = 0.0d;
        dArr[8] = 1.0d;
        dArr[4] = 1.0d;
        dArr[0] = 1.0d;
    }

    public final void i(double d) {
        double[] dArr = this.a;
        dArr[8] = d;
        dArr[4] = d;
        dArr[0] = d;
    }

    public final void j() {
        double[] dArr = this.a;
        dArr[8] = 0.0d;
        dArr[7] = 0.0d;
        dArr[6] = 0.0d;
        dArr[5] = 0.0d;
        dArr[4] = 0.0d;
        dArr[3] = 0.0d;
        dArr[2] = 0.0d;
        dArr[1] = 0.0d;
        dArr[0] = 0.0d;
    }

    public final void k(jtz jtzVar) {
        double[] dArr = this.a;
        double d = dArr[1];
        double d2 = dArr[2];
        double d3 = dArr[5];
        double[] dArr2 = jtzVar.a;
        dArr2[0] = dArr[0];
        dArr2[1] = dArr[3];
        dArr2[2] = dArr[6];
        dArr2[3] = d;
        dArr2[4] = dArr[4];
        dArr2[5] = dArr[7];
        dArr2[6] = d2;
        dArr2[7] = d3;
        dArr2[8] = dArr[8];
    }

    public final void l(jtz jtzVar) {
        double dA = ((a(0, 0) * ((a(1, 1) * a(2, 2)) - (a(2, 1) * a(1, 2)))) - (a(0, 1) * ((a(1, 0) * a(2, 2)) - (a(1, 2) * a(2, 0))))) + (a(0, 2) * ((a(1, 0) * a(2, 1)) - (a(1, 1) * a(2, 0))));
        if (dA == 0.0d) {
            return;
        }
        double d = 1.0d / dA;
        double[] dArr = this.a;
        double d2 = dArr[4];
        double d3 = dArr[8];
        double d4 = dArr[7];
        double d5 = dArr[5];
        double d6 = dArr[1];
        double d7 = dArr[2];
        double d8 = dArr[3];
        double d9 = dArr[6];
        double d10 = dArr[0];
        jtzVar.f(((d2 * d3) - (d4 * d5)) * d, (-((d6 * d3) - (d7 * d4))) * d, ((d6 * d5) - (d7 * d2)) * d, (-((d8 * d3) - (d5 * d9))) * d, ((d3 * d10) - (d7 * d9)) * d, (-((d5 * d10) - (d7 * d8))) * d, ((d8 * d4) - (d9 * d2)) * d, (-((d10 * d4) - (d9 * d6))) * d, ((d10 * d2) - (d8 * d6)) * d);
    }
}
