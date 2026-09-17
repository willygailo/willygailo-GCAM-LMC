package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class ej {
    static final ej a;
    public final float b;
    public final float c;
    public final float d;
    public final float e = 0.69f;
    public final float f;
    public final float[] g;
    public final float h;
    public final float i;
    public final float j;

    static {
        float[] fArr = dw.c;
        double dC = dw.c();
        Double.isNaN(dC);
        float f = (float) ((dC * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = dw.a;
        float f2 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f3 = fArr3[0];
        float f4 = fArr[1];
        float f5 = fArr3[1];
        float f6 = fArr[2];
        float f7 = (f3 * f2) + (f5 * f4) + (fArr3[2] * f6);
        float[] fArr4 = fArr2[1];
        float f8 = (fArr4[0] * f2) + (fArr4[1] * f4) + (fArr4[2] * f6);
        float[] fArr5 = fArr2[2];
        float f9 = (f2 * fArr5[0]) + (f4 * fArr5[1]) + (f6 * fArr5[2]);
        float fExp = 1.0f - (((float) Math.exp(((-f) - 42.0f) / 92.0f)) * 0.2777778f);
        double d = fExp;
        if (d > 1.0d) {
            fExp = 1.0f;
        } else if (d < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f7) * fExp) + 1.0f) - fExp, (((100.0f / f8) * fExp) + 1.0f) - fExp, (((100.0f / f9) * fExp) + 1.0f) - fExp};
        float f10 = 1.0f / ((5.0f * f) + 1.0f);
        float f11 = f10 * f10 * f10 * f10;
        float f12 = 1.0f - f11;
        double d2 = f;
        Double.isNaN(d2);
        float fCbrt = (f11 * f) + (0.1f * f12 * f12 * ((float) Math.cbrt(d2 * 5.0d)));
        float fC = dw.c() / fArr[1];
        double d3 = fC;
        double dSqrt = Math.sqrt(d3);
        float fPow = 0.725f / ((float) Math.pow(d3, 0.2d));
        double d4 = fArr6[0] * fCbrt * f7;
        Double.isNaN(d4);
        double d5 = fArr6[1] * fCbrt * f8;
        Double.isNaN(d5);
        double d6 = fArr6[2] * fCbrt * f9;
        Double.isNaN(d6);
        float fPow2 = (float) Math.pow(d6 / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(d4 / 100.0d, 0.42d), (float) Math.pow(d5 / 100.0d, 0.42d), fPow2};
        float f13 = fArr7[0];
        float f14 = fArr7[1];
        float f15 = (400.0f * fPow2) / (fPow2 + 27.13f);
        float[] fArr8 = {(f13 * 400.0f) / (f13 + 27.13f), (f14 * 400.0f) / (f14 + 27.13f), f15};
        float f16 = fArr8[0];
        a = new ej(fC, (f16 + f16 + fArr8[1] + (f15 * 0.05f)) * fPow, fPow, fPow, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), ((float) dSqrt) + 1.48f);
    }

    private ej(float f, float f2, float f3, float f4, float[] fArr, float f5, float f6, float f7) {
        this.f = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.g = fArr;
        this.h = f5;
        this.i = f6;
        this.j = f7;
    }
}
