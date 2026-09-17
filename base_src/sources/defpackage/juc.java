package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class juc {
    public double a;
    public double b;
    public double c;

    public static double a(juc jucVar, juc jucVar2) {
        return (jucVar.a * jucVar2.a) + (jucVar.b * jucVar2.b) + (jucVar.c * jucVar2.c);
    }

    public static void c(juc jucVar, juc jucVar2, juc jucVar3) {
        double d = jucVar.b;
        double d2 = jucVar2.c;
        double d3 = jucVar.c;
        double d4 = jucVar2.b;
        double d5 = jucVar2.a;
        double d6 = jucVar.a;
        jucVar3.g((d * d2) - (d3 * d4), (d3 * d5) - (d2 * d6), (d6 * d4) - (d * d5));
    }

    public final double b() {
        double d = this.a;
        double d2 = this.b;
        double d3 = this.c;
        return Math.sqrt((d * d) + (d2 * d2) + (d3 * d3));
    }

    public final void d() {
        double dB = b();
        if (dB != 0.0d) {
            e(1.0d / dB);
        }
    }

    public final void e(double d) {
        this.a *= d;
        this.b *= d;
        this.c *= d;
    }

    public final void f(juc jucVar) {
        this.a = jucVar.a;
        this.b = jucVar.b;
        this.c = jucVar.c;
    }

    public final void g(double d, double d2, double d3) {
        this.a = d;
        this.b = d2;
        this.c = d3;
    }

    public final void h() {
        this.c = 0.0d;
        this.b = 0.0d;
        this.a = 0.0d;
    }
}
