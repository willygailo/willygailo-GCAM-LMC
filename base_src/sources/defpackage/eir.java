package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;

/* JADX INFO: loaded from: classes.dex */
public final class eir implements eii {
    public eli a;
    public final eij b;
    private final float[] c = new float[16];

    public eir(eij eijVar) {
        this.b = eijVar;
    }

    @Override // defpackage.eii
    public final void a() {
        eli eliVar = this.a;
        if (eliVar != null) {
            eliVar.a();
            this.a = null;
        }
    }

    @Override // defpackage.eii
    public final void b() {
        float fMax;
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        if (this.b.n) {
            Matrix.setIdentityM(this.c, 0);
            eij eijVar = this.b;
            eijVar.getClass();
            float fMax2 = 0.9f;
            if (eijVar.h) {
                Matrix.rotateM(this.c, 0, 90.0f, 0.0f, 0.0f, 1.0f);
                Matrix.translateM(this.c, 0, 0.05f, 0.0f, 0.0f);
                eij eijVar2 = this.b;
                if (!eijVar2.m) {
                    Matrix.translateM(this.c, 0, 0.0f, eijVar2.g, 0.0f);
                }
                eij eijVar3 = this.b;
                float f = eijVar3.g;
                float f2 = eijVar3.q;
                fMax = f + (f2 * Math.max(1.0f, 2.0f - (f / f2)));
            } else {
                Matrix.translateM(this.c, 0, 0.0f, 0.05f, 0.0f);
                eij eijVar4 = this.b;
                if (!eijVar4.m) {
                    Matrix.translateM(this.c, 0, -eijVar4.g, 0.0f, 0.0f);
                }
                eij eijVar5 = this.b;
                float f3 = eijVar5.g;
                float f4 = eijVar5.p;
                fMax2 = f3 + (f4 * Math.max(1.0f, 2.0f - (f3 / f4)));
                fMax = 0.9f;
            }
            Matrix.scaleM(this.c, 0, fMax2, fMax, 1.0f);
            eij eijVar6 = this.b;
            if (eijVar6.h) {
                Matrix.translateM(this.c, 0, 0.0f, (-0.75f) - (Math.min(1.0f, eijVar6.g / eijVar6.q) * 0.25f), 0.0f);
            } else {
                Matrix.translateM(this.c, 0, (Math.min(1.0f, eijVar6.g / eijVar6.p) * 0.25f) - 0.25f, 0.0f, 0.0f);
            }
            eli eliVar = this.a;
            eliVar.getClass();
            eliVar.e(this.c);
            eij eijVar7 = this.b;
            if (eijVar7.h) {
                eli eliVar2 = this.a;
                eliVar2.getClass();
                eliVar2.d(eijVar7.d, 2.0f);
            } else {
                eli eliVar3 = this.a;
                eliVar3.getClass();
                float f5 = eijVar7.a;
                eliVar3.d(f5 + f5, eijVar7.e);
            }
            eli eliVar4 = this.a;
            obr.ao(eliVar4);
            eliVar4.b();
            this.b.o.unbind();
        }
    }

    @Override // defpackage.eii
    public final void c(int i, int i2) {
    }
}
