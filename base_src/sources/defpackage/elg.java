package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class elg {
    public final float[] a;
    private final float[] b;
    private FloatBuffer c;
    private final float[] d;
    private FloatBuffer e;
    private final float[] f = new float[16];
    private nlc g;
    private nle h;
    private nle i;
    private nle j;
    private nle k;

    public elg() {
        float[] fArr = {-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f};
        this.b = fArr;
        this.c = mzi.g(fArr);
        float[] fArr2 = {0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.5f};
        this.d = fArr2;
        this.e = mzi.g(fArr2);
        float[] fArr3 = new float[16];
        this.a = fArr3;
        Matrix.setIdentityM(fArr3, 0);
    }

    public final void a() {
        nlc nlcVar = this.g;
        if (nlcVar != null) {
            nlcVar.c();
            this.g = null;
        }
    }

    public final void b() {
        if (this.g == null) {
            nlc nlcVar = new nlc("attribute vec2 vertexAttrib;attribute vec4 vertexColorAttrib;varying vec4 vertexColor;uniform mat4 projectionMatrix;uniform mat4 vertexTransform;void main() {  vertexColor = vertexColorAttrib;  gl_Position = projectionMatrix * vertexTransform * vec4(vertexAttrib, 0., 1.);}", "precision mediump float;varying vec4 vertexColor;void main() {  gl_FragColor = vertexColor;}");
            this.g = nlcVar;
            this.h = nlcVar.a("vertexTransform");
            this.i = this.g.a("projectionMatrix");
            this.j = this.g.e("vertexAttrib");
            this.k = this.g.e("vertexColorAttrib");
        }
        nlc nlcVar2 = this.g;
        nlcVar2.getClass();
        nlcVar2.b();
        this.j.e();
        this.j.f(this.c, 2);
        this.k.e();
        this.k.f(this.e, 4);
        this.h.a(this.a);
        this.i.a(this.f);
        GLES20.glDrawArrays(5, 0, this.c.capacity() / 2);
        this.k.d();
        this.j.d();
        nlcVar2.d();
    }

    public final void c(float f, float f2) {
        float f3 = f / f2;
        Matrix.orthoM(this.f, 0, -f3, f3, -1.0f, 1.0f, -1.0f, 1.0f);
    }

    public final void d(float f, float f2, float f3, float f4) {
        float[] fArr = this.b;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f;
        fArr[3] = f4;
        fArr[4] = f3;
        fArr[5] = f2;
        fArr[6] = f3;
        fArr[7] = f4;
        this.c = mzi.g(fArr);
    }

    public final void e(float[] fArr) {
        this.e = mzi.g(fArr);
    }
}
