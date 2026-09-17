package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class acy {
    double a;
    double b;
    public double c;
    public double d;
    private boolean e;
    private double f;
    private double g;
    private double h;
    private double i;
    private final acq j;

    public acy() {
        this.a = Math.sqrt(1500.0d);
        this.b = 0.5d;
        this.e = false;
        this.i = Double.MAX_VALUE;
        this.j = new acq();
    }

    public acy(float f) {
        this.a = Math.sqrt(1500.0d);
        this.b = 0.5d;
        this.e = false;
        this.i = Double.MAX_VALUE;
        this.j = new acq();
        this.i = f;
    }

    public final float a() {
        return (float) this.i;
    }

    final acq b(double d, double d2, long j) {
        double dCos;
        double dPow;
        if (!this.e) {
            if (this.i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d3 = this.b;
            if (d3 > 1.0d) {
                double d4 = this.a;
                this.f = ((-d3) * d4) + (d4 * Math.sqrt((d3 * d3) - 1.0d));
                double d5 = this.b;
                double d6 = this.a;
                this.g = ((-d5) * d6) - (d6 * Math.sqrt((d5 * d5) - 1.0d));
            } else if (d3 >= 0.0d && d3 < 1.0d) {
                this.h = this.a * Math.sqrt(1.0d - (d3 * d3));
            }
            this.e = true;
        }
        double d7 = j;
        Double.isNaN(d7);
        double d8 = d7 / 1000.0d;
        double d9 = d - this.i;
        double d10 = this.b;
        if (d10 > 1.0d) {
            double d11 = this.g;
            double d12 = ((d11 * d9) - d2) / (d11 - this.f);
            double d13 = d9 - d12;
            dPow = (Math.pow(2.718281828459045d, d11 * d8) * d13) + (Math.pow(2.718281828459045d, this.f * d8) * d12);
            double d14 = this.g;
            double dPow2 = Math.pow(2.718281828459045d, d14 * d8);
            double d15 = this.f;
            dCos = (d13 * d14 * dPow2) + (d12 * d15 * Math.pow(2.718281828459045d, d15 * d8));
        } else if (d10 == 1.0d) {
            double d16 = this.a;
            double d17 = d2 + (d16 * d9);
            double d18 = d9 + (d17 * d8);
            dPow = Math.pow(2.718281828459045d, (-d16) * d8) * d18;
            double dPow3 = Math.pow(2.718281828459045d, (-this.a) * d8);
            double d19 = -this.a;
            dCos = (d18 * dPow3 * d19) + (d17 * Math.pow(2.718281828459045d, d19 * d8));
        } else {
            double d20 = this.h;
            double d21 = this.a;
            double d22 = (1.0d / d20) * ((d10 * d21 * d9) + d2);
            double dPow4 = Math.pow(2.718281828459045d, (-d10) * d21 * d8) * ((Math.cos(this.h * d8) * d9) + (Math.sin(this.h * d8) * d22));
            double d23 = this.a;
            double d24 = this.b;
            double dPow5 = Math.pow(2.718281828459045d, (-d24) * d23 * d8);
            double d25 = this.h;
            double dSin = Math.sin(d25 * d8);
            double d26 = this.h;
            dCos = ((-d23) * dPow4 * d24) + (dPow5 * (((-d25) * d9 * dSin) + (d22 * d26 * Math.cos(d26 * d8))));
            dPow = dPow4;
        }
        acq acqVar = this.j;
        acqVar.a = (float) (dPow + this.i);
        acqVar.b = (float) dCos;
        return acqVar;
    }

    public final void c(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.b = f;
        this.e = false;
    }

    public final void d(float f) {
        this.i = f;
    }

    public final void e(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.a = Math.sqrt(f);
        this.e = false;
    }
}
