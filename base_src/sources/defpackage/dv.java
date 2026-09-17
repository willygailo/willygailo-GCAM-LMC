package defpackage;

import android.graphics.Color;

/* JADX INFO: loaded from: classes.dex */
final class dv {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public dv(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    static dv b(int i) {
        float f;
        ej ejVar = ej.a;
        float fA = dw.a(Color.red(i));
        float fA2 = dw.a(Color.green(i));
        float fA3 = dw.a(Color.blue(i));
        float[][] fArr = dw.d;
        float[] fArr2 = fArr[0];
        float f2 = fArr2[0];
        float f3 = fArr2[1];
        float f4 = fArr2[2];
        float[] fArr3 = fArr[1];
        float f5 = fArr3[0];
        float f6 = fArr3[1];
        float f7 = fArr3[2];
        float[] fArr4 = fArr[2];
        float[] fArr5 = {(f2 * fA) + (f3 * fA2) + (f4 * fA3), (f5 * fA) + (f6 * fA2) + (f7 * fA3), (fA * fArr4[0]) + (fA2 * fArr4[1]) + (fA3 * fArr4[2])};
        float[][] fArr6 = dw.a;
        float f8 = fArr5[0];
        float[] fArr7 = fArr6[0];
        float f9 = fArr7[0];
        float f10 = fArr5[1];
        float f11 = fArr7[1];
        float f12 = fArr5[2];
        float f13 = (f9 * f8) + (f11 * f10) + (fArr7[2] * f12);
        float[] fArr8 = fArr6[1];
        float f14 = (fArr8[0] * f8) + (fArr8[1] * f10);
        float f15 = fArr8[2];
        float[] fArr9 = fArr6[2];
        float f16 = fArr9[0];
        float f17 = fArr9[1];
        float f18 = fArr9[2];
        float[] fArr10 = ejVar.g;
        float f19 = fArr10[0] * f13;
        float f20 = fArr10[1] * (f14 + (f15 * f12));
        float f21 = fArr10[2] * ((f8 * f16) + (f10 * f17) + (f12 * f18));
        double dAbs = ejVar.h * Math.abs(f19);
        Double.isNaN(dAbs);
        float fPow = (float) Math.pow(dAbs / 100.0d, 0.42d);
        double dAbs2 = ejVar.h * Math.abs(f20);
        Double.isNaN(dAbs2);
        float fPow2 = (float) Math.pow(dAbs2 / 100.0d, 0.42d);
        double dAbs3 = ejVar.h * Math.abs(f21);
        Double.isNaN(dAbs3);
        float fPow3 = (float) Math.pow(dAbs3 / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f19) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f20) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f21) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        double d2 = fSignum;
        Double.isNaN(d2);
        double d3 = fSignum2;
        Double.isNaN(d3);
        Double.isNaN(d);
        float f22 = ((float) (((d2 * 11.0d) + (d3 * (-12.0d))) + d)) / 11.0f;
        double d4 = fSignum + fSignum2;
        Double.isNaN(d);
        Double.isNaN(d);
        Double.isNaN(d4);
        float f23 = ((float) (d4 - (d + d))) / 9.0f;
        float f24 = fSignum2 * 20.0f;
        float f25 = (((fSignum * 20.0f) + f24) + (21.0f * fSignum3)) / 20.0f;
        float f26 = (((fSignum * 40.0f) + f24) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f23, f22)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            f = fAtan2 + 360.0f;
        } else {
            if (fAtan2 >= 360.0f) {
                fAtan2 -= 360.0f;
            }
            f = fAtan2;
        }
        float f27 = (3.1415927f * f) / 180.0f;
        float f28 = ejVar.c;
        float f29 = ejVar.b;
        float f30 = ejVar.e;
        float fPow4 = ((float) Math.pow((f26 * f28) / f29, ejVar.j * 0.69f)) * 100.0f;
        float f31 = ejVar.e;
        Math.sqrt(fPow4 / 100.0f);
        float f32 = ejVar.b;
        float f33 = ejVar.i;
        double d5 = ((double) f) < 20.14d ? 360.0f + f : f;
        Double.isNaN(d5);
        float f34 = f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, ejVar.f), 0.73d)) * ((float) Math.pow(((((((float) (Math.cos(((d5 * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * ejVar.d) * ((float) Math.sqrt((f22 * f22) + (f23 * f23)))) / (f25 + 0.305f), 0.9d));
        double d6 = fPow4;
        Double.isNaN(d6);
        float fSqrt = fPow5 * ((float) Math.sqrt(d6 / 100.0d));
        float f35 = ejVar.i;
        float f36 = ejVar.e;
        Math.sqrt((fPow5 * 0.69f) / (ejVar.b + 4.0f));
        float fLog = ((float) Math.log((f35 * fSqrt * 0.0228f) + 1.0f)) * 43.85965f;
        double d7 = f27;
        return new dv(f34, fSqrt, fPow4, (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f), fLog * ((float) Math.cos(d7)), fLog * ((float) Math.sin(d7)));
    }

    public static dv c(float f, float f2, float f3) {
        ej ejVar = ej.a;
        float f4 = ejVar.e;
        double d = f;
        Double.isNaN(d);
        double d2 = d / 100.0d;
        Math.sqrt(d2);
        float f5 = ejVar.b;
        float f6 = ejVar.i;
        double dSqrt = Math.sqrt(d2);
        float f7 = ejVar.e;
        Math.sqrt(((f2 / ((float) dSqrt)) * 0.69f) / (ejVar.b + 4.0f));
        double d3 = f6 * f2;
        Double.isNaN(d3);
        float fLog = ((float) Math.log((d3 * 0.0228d) + 1.0d)) * 43.85965f;
        double d4 = (3.1415927f * f3) / 180.0f;
        return new dv(f3, f2, f, (1.7f * f) / ((0.007f * f) + 1.0f), fLog * ((float) Math.cos(d4)), fLog * ((float) Math.sin(d4)));
    }

    final int a(ej ejVar) {
        float f = this.b;
        float fSqrt = 0.0f;
        if (f != 0.0d) {
            double d = this.c;
            if (d != 0.0d) {
                Double.isNaN(d);
                fSqrt = f / ((float) Math.sqrt(d / 100.0d));
            }
        }
        double d2 = fSqrt;
        double dPow = Math.pow(1.64d - Math.pow(0.29d, ejVar.f), 0.73d);
        Double.isNaN(d2);
        float fPow = (float) Math.pow(d2 / dPow, 1.1111111111111112d);
        double d3 = (this.a * 3.1415927f) / 180.0f;
        Double.isNaN(d3);
        double dCos = Math.cos(2.0d + d3);
        float f2 = ejVar.b;
        float f3 = this.c;
        float f4 = ejVar.e;
        float f5 = ejVar.j;
        double d4 = f3;
        Double.isNaN(d4);
        double d5 = f5;
        Double.isNaN(d5);
        double dPow2 = Math.pow(d4 / 100.0d, 1.4492753673265821d / d5);
        float f6 = ejVar.d;
        float f7 = (f2 * ((float) dPow2)) / ejVar.c;
        float fSin = (float) Math.sin(d3);
        float fCos = (float) Math.cos(d3);
        float f8 = (((0.305f + f7) * 23.0f) * fPow) / ((((((((float) (dCos + 3.8d)) * 0.25f) * 3846.1538f) * f6) * 23.0f) + ((11.0f * fPow) * fCos)) + ((fPow * 108.0f) * fSin));
        float f9 = fCos * f8;
        float f10 = f8 * fSin;
        float f11 = f7 * 460.0f;
        float f12 = (((451.0f * f9) + f11) + (288.0f * f10)) / 1403.0f;
        float f13 = ((f11 - (891.0f * f9)) - (261.0f * f10)) / 1403.0f;
        float f14 = ((f11 - (f9 * 220.0f)) - (f10 * 6300.0f)) / 1403.0f;
        float fAbs = Math.abs(f12);
        float fAbs2 = Math.abs(f12);
        double d6 = fAbs;
        Double.isNaN(d6);
        double d7 = fAbs2;
        Double.isNaN(d7);
        float fSignum = Math.signum(f12) * (100.0f / ejVar.h) * ((float) Math.pow((float) Math.max(0.0d, (d6 * 27.13d) / (400.0d - d7)), 2.380952380952381d));
        float fAbs3 = Math.abs(f13);
        float fAbs4 = Math.abs(f13);
        double d8 = fAbs3;
        Double.isNaN(d8);
        double d9 = fAbs4;
        Double.isNaN(d9);
        float fSignum2 = Math.signum(f13) * (100.0f / ejVar.h) * ((float) Math.pow((float) Math.max(0.0d, (d8 * 27.13d) / (400.0d - d9)), 2.380952380952381d));
        float fAbs5 = Math.abs(f14);
        float fAbs6 = Math.abs(f14);
        double d10 = fAbs5;
        Double.isNaN(d10);
        double d11 = fAbs6;
        Double.isNaN(d11);
        double dMax = Math.max(0.0d, (d10 * 27.13d) / (400.0d - d11));
        float fSignum3 = Math.signum(f14);
        float f15 = ejVar.h;
        double dPow3 = Math.pow((float) dMax, 2.380952380952381d);
        float[] fArr = ejVar.g;
        float f16 = fSignum / fArr[0];
        float f17 = fSignum2 / fArr[1];
        float f18 = ((fSignum3 * (100.0f / f15)) * ((float) dPow3)) / fArr[2];
        float[][] fArr2 = dw.b;
        float[] fArr3 = fArr2[0];
        float f19 = fArr3[0];
        float f20 = fArr3[1];
        float f21 = fArr3[2];
        float[] fArr4 = fArr2[1];
        float f22 = fArr4[0];
        float f23 = fArr4[1];
        float f24 = fArr4[2];
        float[] fArr5 = fArr2[2];
        return ek.a((f19 * f16) + (f20 * f17) + (f21 * f18), (f22 * f16) + (f23 * f17) + (f24 * f18), (f16 * fArr5[0]) + (f17 * fArr5[1]) + (f18 * fArr5[2]));
    }
}
