package defpackage;

import android.opengl.Matrix;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class fec implements fea {
    private boolean a;
    private final ArrayList b = new ArrayList();
    private final float[] c;

    public fec(boolean z) {
        this.a = true;
        float[] fArr = new float[16];
        this.c = fArr;
        this.a = z;
        Matrix.setIdentityM(fArr, 0);
    }

    @Override // defpackage.fea
    public final void a(float f, fdv fdvVar, float[] fArr, int i, int i2) {
        ArrayList arrayList = this.b;
        arrayList.clear();
        float f2 = 20.0f * f;
        boolean z = this.a;
        float f3 = true != z ? 0.0f : 1.0f;
        float f4 = true != z ? 1.0f : 0.0f;
        int i3 = -2;
        int i4 = 0;
        int i5 = 0;
        while (i3 <= 2) {
            if (i3 != 0) {
                float[] fArr2 = new float[16];
                Matrix.setIdentityM(fArr2, i4);
                int i6 = i5;
                Matrix.rotateM(fArr2, 0, f2 * i3, f4, f3, 0.0f);
                i5 = i6 + 1;
                arrayList.add(i6, fArr2);
            }
            i3++;
            i4 = 0;
        }
        float[] fArr3 = this.c;
        ArrayList arrayList2 = this.b;
        fei feiVar = fdvVar.g;
        if (feiVar == null || fdvVar.e == null) {
            return;
        }
        feiVar.c();
        fdvVar.g.j(1.0f);
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            try {
                float[] fArr4 = (float[]) arrayList2.get(i7);
                fct fctVar = fdvVar.e;
                Matrix.multiplyMM(fdvVar.k, 0, fArr3, 0, fArr4, 0);
                Matrix.multiplyMV(fdvVar.j, 0, fdvVar.k, 0, fdvVar.i, 0);
                fdv.c(fdvVar.j);
                float[] fArr5 = fdvVar.j;
                float f5 = fArr5[0];
                float f6 = fdvVar.m;
                float f7 = (f5 * f6) + f6;
                float f8 = fArr5[1];
                float f9 = fdvVar.n;
                float f10 = (f8 * f9) + f9;
                if (fctVar != null) {
                    fctVar.f(fArr, f7, f10, 0.4f);
                }
            } catch (fcq e) {
                e.printStackTrace();
                return;
            }
        }
    }
}
