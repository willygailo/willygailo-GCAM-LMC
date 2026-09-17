package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jua {
    public double a;
    public double b;
    public double c;
    public double d;

    public final void a(jua juaVar) {
        this.a = juaVar.a;
        this.b = juaVar.b;
        this.c = juaVar.c;
        this.d = juaVar.d;
    }

    public final void b(float[] fArr) {
        float f = (float) this.a;
        float f2 = (float) this.b;
        float f3 = (float) this.c;
        float f4 = (float) this.d;
        float f5 = f + f;
        float f6 = f2 + f2;
        float f7 = f3 + f3;
        float f8 = f5 * f4;
        float f9 = f6 * f4;
        float f10 = f4 * f7;
        float f11 = f5 * f;
        float f12 = f6 * f;
        float f13 = f * f7;
        float f14 = f6 * f2;
        float f15 = f2 * f7;
        float f16 = f7 * f3;
        fArr[0] = 1.0f - (f14 + f16);
        fArr[1] = f12 + f10;
        fArr[2] = f13 - f9;
        fArr[3] = 0.0f;
        fArr[4] = f12 - f10;
        fArr[5] = 1.0f - (f16 + f11);
        fArr[6] = f15 + f8;
        fArr[7] = 0.0f;
        fArr[8] = f13 + f9;
        fArr[9] = f15 - f8;
        fArr[10] = 1.0f - (f11 + f14);
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }
}
