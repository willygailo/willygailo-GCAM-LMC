package defpackage;

import android.opengl.GLES20;
import com.google.android.libraries.vision.opengl.Texture;

/* JADX INFO: loaded from: classes.dex */
public final class ejk implements eii {
    public final eli a;
    private final eij b;
    private final elg c;
    private final elf d;
    private final float[] e = {0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.5f};
    private final float[] f = new float[8];

    public ejk(Texture texture, eij eijVar) {
        this.b = eijVar;
        eli eliVar = new eli();
        this.a = eliVar;
        eliVar.b = texture;
        eliVar.c = 33069;
        this.c = new elg();
        this.d = new elf();
    }

    @Override // defpackage.eii
    public final void a() {
        this.a.a();
        this.c.a();
        this.d.a();
    }

    @Override // defpackage.eii
    public final void b() {
        eij eijVar = this.b;
        GLES20.glViewport(0, 0, eijVar.j, eijVar.k);
        GLES20.glClear(16384);
        this.a.b();
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        this.c.e(this.e);
        elg elgVar = this.c;
        float f = this.b.a;
        elgVar.d(-f, 1.0f, f, -1.0f);
        this.c.b();
        GLES20.glDisable(3042);
        eij eijVar2 = this.b;
        if (!eijVar2.n) {
            int i = eijVar2.j;
            int i2 = eijVar2.k;
            GLES20.glViewport(i / 4, i2 / 4, i / 2, i2 / 2);
            eij eijVar3 = this.b;
            if (eijVar3.h) {
                int i3 = eijVar3.j;
                eijVar3.getClass();
                int i4 = eijVar3.k;
                eijVar3.getClass();
                GLES20.glScissor((int) ((i3 / 4) * 1.1f), i4 / 4, (int) ((i3 / 2) * 0.9f), i4 / 2);
            } else {
                int i5 = eijVar3.j;
                int i6 = eijVar3.k;
                eijVar3.getClass();
                eijVar3.getClass();
                GLES20.glScissor(i5 / 4, (int) ((i6 / 4) * 1.1f), i5 / 2, (int) ((i6 / 2) * 0.9f));
            }
            GLES20.glEnable(3089);
            this.a.b();
            GLES20.glDisable(3089);
        }
        eij eijVar4 = this.b;
        GLES20.glViewport(0, 0, eijVar4.j, eijVar4.k);
        eij eijVar5 = this.b;
        if (eijVar5.h) {
            float f2 = eijVar5.d / 2.0f;
            float[] fArr = this.f;
            float f3 = -f2;
            fArr[0] = f3;
            fArr[1] = 1.0f;
            fArr[2] = f3;
            fArr[3] = -1.0f;
            fArr[4] = f2;
            fArr[5] = 1.0f;
            fArr[6] = f2;
            fArr[7] = -1.0f;
        } else {
            float f4 = eijVar5.e / 2.0f;
            float[] fArr2 = this.f;
            float f5 = eijVar5.a;
            float f6 = -f5;
            fArr2[0] = f6;
            fArr2[1] = f4;
            fArr2[2] = f5;
            fArr2[3] = f4;
            fArr2[4] = f6;
            float f7 = -f4;
            fArr2[5] = f7;
            fArr2[6] = f5;
            fArr2[7] = f7;
        }
        this.d.c(this.f, 2.0f);
        this.d.b();
    }

    @Override // defpackage.eii
    public final void c(int i, int i2) {
        float f = i;
        float f2 = i2;
        this.c.c(f, f2);
        this.d.d(f, f2);
    }
}
