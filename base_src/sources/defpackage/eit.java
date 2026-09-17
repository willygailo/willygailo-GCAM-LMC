package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;

/* JADX INFO: loaded from: classes.dex */
public final class eit implements eii {
    private final float[] a = new float[16];
    private final float[] b = {1.0f, 1.0f, 1.0f, 1.0f};
    private elh c = new elh();
    private final eij d;

    public eit(eij eijVar) {
        this.d = eijVar;
    }

    @Override // defpackage.eii
    public final void a() {
        elh elhVar = this.c;
        if (elhVar != null) {
            nlc nlcVar = elhVar.f;
            if (nlcVar != null) {
                nlcVar.c();
                elhVar.f = null;
            }
            this.c = null;
        }
    }

    @Override // defpackage.eii
    public final void b() {
        if (this.c == null || !this.d.n) {
            return;
        }
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        float[] fArr = this.d.i;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float[] fArr2 = this.b;
        fArr2[0] = f;
        fArr2[1] = f2;
        fArr2[2] = f3;
        Matrix.setIdentityM(this.a, 0);
        float[] fArr3 = this.a;
        eij eijVar = this.d;
        Matrix.translateM(fArr3, 0, eijVar.b, eijVar.c, 0.0f);
        float[] fArr4 = this.a;
        Matrix.multiplyMM(fArr4, 0, fArr4, 0, this.d.f, 0);
        elh elhVar = this.c;
        elhVar.getClass();
        eij eijVar2 = this.d;
        float f4 = eijVar2.d;
        float f5 = (-f4) / 2.0f;
        float f6 = eijVar2.e;
        float f7 = f6 / 2.0f;
        float f8 = f4 / 2.0f;
        float f9 = (-f6) / 2.0f;
        float f10 = f5 + 0.01f;
        float f11 = f7 - 0.01f;
        float f12 = (-0.01f) + f8;
        float f13 = 0.01f + f9;
        elh.a[0] = f5;
        elh.a[1] = f7;
        elh.a[2] = f5;
        elh.a[3] = f11;
        elh.a[4] = f8;
        elh.a[5] = f11;
        elh.a[6] = f5;
        elh.a[7] = f7;
        elh.a[8] = f8;
        elh.a[9] = f11;
        elh.a[10] = f8;
        elh.a[11] = f7;
        elh.a[12] = f5;
        elh.a[13] = f11;
        elh.a[14] = f5;
        elh.a[15] = f13;
        elh.a[16] = f10;
        elh.a[17] = f11;
        elh.a[18] = f10;
        elh.a[19] = f11;
        elh.a[20] = f5;
        elh.a[21] = f13;
        elh.a[22] = f10;
        elh.a[23] = f13;
        elh.a[24] = f12;
        elh.a[25] = f11;
        elh.a[26] = f12;
        elh.a[27] = f13;
        elh.a[28] = f8;
        elh.a[29] = f11;
        elh.a[30] = f8;
        elh.a[31] = f11;
        elh.a[32] = f12;
        elh.a[33] = f13;
        elh.a[34] = f8;
        elh.a[35] = f13;
        elh.a[36] = f5;
        elh.a[37] = f13;
        elh.a[38] = f5;
        elh.a[39] = f9;
        elh.a[40] = f8;
        elh.a[41] = f9;
        elh.a[42] = f5;
        elh.a[43] = f13;
        elh.a[44] = f8;
        elh.a[45] = f9;
        elh.a[46] = f8;
        elh.a[47] = f13;
        elhVar.b = mzi.g(elh.a);
        elh elhVar2 = this.c;
        elhVar2.getClass();
        System.arraycopy(this.a, 0, elhVar2.c, 0, 16);
        elh elhVar3 = this.c;
        elhVar3.getClass();
        System.arraycopy(this.b, 0, elhVar3.e, 0, 4);
        elh elhVar4 = this.c;
        elhVar4.getClass();
        if (elhVar4.f == null) {
            elhVar4.f = new nlc("attribute vec2 vertexAttrib;uniform mat4 projectionMatrix;uniform mat4 vertexTransform;void main() {  gl_Position = projectionMatrix * vertexTransform * vec4(vertexAttrib, 0., 1.);}", "precision mediump float;uniform vec4 fillColor;void main() {  gl_FragColor = fillColor;}");
            elhVar4.g = elhVar4.f.a("vertexTransform");
            elhVar4.h = elhVar4.f.a("projectionMatrix");
            elhVar4.i = elhVar4.f.a("fillColor");
            elhVar4.j = elhVar4.f.e("vertexAttrib");
        }
        nlc nlcVar = elhVar4.f;
        nlcVar.getClass();
        nlcVar.b();
        elhVar4.j.e();
        elhVar4.j.f(elhVar4.b, 2);
        elhVar4.g.a(elhVar4.c);
        elhVar4.h.a(elhVar4.d);
        elhVar4.i.b(elhVar4.e);
        GLES20.glDrawArrays(4, 0, elhVar4.b.capacity() / 2);
        elhVar4.j.d();
        nlcVar.d();
    }

    @Override // defpackage.eii
    public final void c(int i, int i2) {
        elh elhVar = this.c;
        if (elhVar != null) {
            float f = i / i2;
            Matrix.orthoM(elhVar.d, 0, -f, f, -1.0f, 1.0f, -1.0f, 1.0f);
        }
    }
}
