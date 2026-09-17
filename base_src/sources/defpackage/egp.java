package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class egp {
    double a = Double.NaN;
    double b = Double.NaN;
    boolean c = false;

    public final double a(double d) {
        if (!this.c) {
            this.b = d;
            this.a = d;
            this.c = true;
            return d;
        }
        double d2 = d - this.b;
        this.b = d;
        if (d2 > 180.0d) {
            d2 -= 360.0d;
        }
        if (d2 < -180.0d) {
            d2 += 360.0d;
        }
        double d3 = this.a + d2;
        this.a = d3;
        return d3;
    }
}
