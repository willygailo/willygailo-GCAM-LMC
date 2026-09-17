package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ji {
    public static ji a;
    public long b;
    public long c;
    public int d;

    public final void a(long j, double d, double d2) {
        float f = ((-946728000000L) + j) / 8.64E7f;
        float f2 = (0.01720197f * f) + 6.24006f;
        double d3 = f2;
        double dSin = Math.sin(d3) * 0.03341960161924362d;
        Double.isNaN(d3);
        double dSin2 = dSin + d3 + (Math.sin(f2 + f2) * 3.4906598739326E-4d) + (Math.sin(f2 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double d4 = (-d2) / 360.0d;
        double d5 = f - 9.0E-4f;
        Double.isNaN(d5);
        double dRound = Math.round(d5 - d4) + 9.0E-4f;
        Double.isNaN(dRound);
        double dSin3 = dRound + d4 + (Math.sin(d3) * 0.0053d) + (Math.sin(dSin2 + dSin2) * (-0.0069d));
        double dAsin = Math.asin(Math.sin(dSin2) * Math.sin(0.4092797040939331d));
        double d6 = 0.01745329238474369d * d;
        double dSin4 = (Math.sin(-0.10471975803375244d) - (Math.sin(d6) * Math.sin(dAsin))) / (Math.cos(d6) * Math.cos(dAsin));
        if (dSin4 >= 1.0d) {
            this.d = 1;
        } else {
            if (dSin4 > -1.0d) {
                double dAcos = (float) (Math.acos(dSin4) / 6.283185307179586d);
                Double.isNaN(dAcos);
                this.b = Math.round((dSin3 + dAcos) * 8.64E7d) + 946728000000L;
                Double.isNaN(dAcos);
                long jRound = Math.round((dSin3 - dAcos) * 8.64E7d) + 946728000000L;
                this.c = jRound;
                if (jRound >= j || this.b <= j) {
                    this.d = 1;
                    return;
                } else {
                    this.d = 0;
                    return;
                }
            }
            this.d = 0;
        }
        this.b = -1L;
        this.c = -1L;
    }
}
