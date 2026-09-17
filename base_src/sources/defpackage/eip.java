package defpackage;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes.dex */
public final class eip implements eii {
    private final float[] a;
    private elf b;
    private int d;
    private float[] e;
    private final ehj f;
    private final eij g;
    private final huf h;
    private final float[] c = new float[3];
    private jbp i = jbp.OFF;

    public eip(eij eijVar, ehj ehjVar, huf hufVar) {
        float[] fArr = {1.0f, 1.0f, 1.0f, 1.0f};
        this.a = fArr;
        this.f = ehjVar;
        this.g = eijVar;
        this.h = hufVar;
        elf elfVar = new elf();
        this.b = elfVar;
        System.arraycopy(fArr, 0, elfVar.a, 0, 4);
    }

    @Override // defpackage.eii
    public final void a() {
        elf elfVar = this.b;
        if (elfVar != null) {
            elfVar.a();
            this.b = null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.eii
    public final void b() {
        jbp jbpVarA = jbp.a(((Integer) this.h.c(htu.c)).intValue());
        int i = 0;
        if (this.i != jbpVarA) {
            this.i = jbpVarA;
            switch (jbpVarA) {
                case OFF:
                    this.d = 0;
                    break;
                case THREE_BY_THREE:
                    this.d = 2;
                    float[] fArr = this.c;
                    fArr[0] = 0.33333334f;
                    fArr[1] = 0.6666667f;
                    this.e = new float[this.d * 8];
                    break;
                case FOUR_BY_FOUR:
                    this.d = 3;
                    float[] fArr2 = this.c;
                    fArr2[0] = 0.25f;
                    fArr2[1] = 0.5f;
                    fArr2[2] = 0.75f;
                    this.e = new float[this.d * 8];
                    break;
                case GOLDEN_RATIO:
                    this.d = 2;
                    float[] fArr3 = this.c;
                    fArr3[0] = 0.38196602f;
                    fArr3[1] = 0.618034f;
                    this.e = new float[this.d * 8];
                    break;
                default:
                    this.e = new float[this.d * 8];
                    break;
            }
        }
        if (this.b == null || this.d == 0 || !this.f.b()) {
            return;
        }
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        eij eijVar = this.g;
        if (eijVar.h) {
            int i2 = 0;
            while (i < this.d) {
                float f = this.g.d;
                float f2 = f / 2.0f;
                float[] fArr4 = this.c;
                float f3 = f2 - (fArr4[i] * f);
                float[] fArr5 = this.e;
                int i3 = i2 + 1;
                fArr5[i2] = f3;
                int i4 = i3 + 1;
                fArr5[i3] = 1.0f;
                int i5 = i4 + 1;
                fArr5[i4] = f3;
                int i6 = i5 + 1;
                fArr5[i5] = -1.0f;
                float f4 = fArr4[i];
                float f5 = (f4 + f4) - 1.0f;
                int i7 = i6 + 1;
                fArr5[i6] = (-f) / 2.0f;
                int i8 = i7 + 1;
                fArr5[i7] = f5;
                int i9 = i8 + 1;
                fArr5[i8] = f2;
                i2 = i9 + 1;
                fArr5[i9] = f5;
                i++;
            }
        } else {
            float f6 = eijVar.a;
            float f7 = -f6;
            float f8 = f6 - f7;
            int i10 = 0;
            while (i < this.d) {
                float[] fArr6 = this.c;
                float f9 = (fArr6[i] * f8) + f7;
                float[] fArr7 = this.e;
                int i11 = i10 + 1;
                fArr7[i10] = f9;
                int i12 = i11 + 1;
                float f10 = this.g.e;
                float f11 = f10 / 2.0f;
                fArr7[i11] = f11;
                int i13 = i12 + 1;
                fArr7[i12] = f9;
                int i14 = i13 + 1;
                fArr7[i13] = (-f10) / 2.0f;
                float f12 = f11 - (f10 * fArr6[i]);
                int i15 = i14 + 1;
                fArr7[i14] = f7;
                int i16 = i15 + 1;
                fArr7[i15] = f12;
                int i17 = i16 + 1;
                fArr7[i16] = f6;
                i10 = i17 + 1;
                fArr7[i17] = f12;
                i++;
            }
        }
        elf elfVar = this.b;
        elfVar.getClass();
        elfVar.c(this.e, 1.0f);
        elf elfVar2 = this.b;
        elfVar2.getClass();
        elfVar2.b();
    }

    @Override // defpackage.eii
    public final void c(int i, int i2) {
        elf elfVar = this.b;
        if (elfVar != null) {
            elfVar.d(i, i2);
        }
    }
}
