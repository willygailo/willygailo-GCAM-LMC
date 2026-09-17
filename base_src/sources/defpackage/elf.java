package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class elf {
    private static final ouj b = ouj.h("com/google/android/apps/camera/imax/rendering/shaders/LineShader");
    private final float[] d;
    private nlc f;
    private nle g;
    private nle h;
    private nle i;
    private nle k;
    private FloatBuffer c = null;
    private final float[] e = new float[16];
    public final float[] a = {1.0f, 1.0f, 1.0f, 1.0f};
    private float j = 1.0f;

    public elf() {
        float[] fArr = new float[16];
        this.d = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public final void a() {
        nlc nlcVar = this.f;
        if (nlcVar != null) {
            nlcVar.c();
            this.f = null;
        }
    }

    public final void b() {
        if (this.f == null) {
            nlc nlcVar = new nlc("attribute vec2 vertexAttrib;uniform mat4 projectionMatrix;uniform mat4 vertexTransform;void main() {  gl_Position = projectionMatrix * vertexTransform * vec4(vertexAttrib, 0., 1.);}", "precision mediump float;uniform vec4 fillColor;void main() {  gl_FragColor = fillColor;}");
            this.f = nlcVar;
            this.g = nlcVar.a("vertexTransform");
            this.h = this.f.a("projectionMatrix");
            this.i = this.f.a("fillColor");
            this.k = this.f.e("vertexAttrib");
        }
        if (this.c == null) {
            return;
        }
        nlc nlcVar2 = this.f;
        nlcVar2.getClass();
        nlcVar2.b();
        this.k.e();
        this.k.f(this.c, 2);
        this.g.a(this.d);
        this.h.a(this.e);
        this.i.b(this.a);
        GLES20.glLineWidth(this.j);
        GLES20.glDrawArrays(1, 0, this.c.capacity() / 2);
        this.k.d();
        nlcVar2.d();
    }

    public final void c(float[] fArr, float f) {
        if (fArr == null || (fArr.length & 3) != 0) {
            ((oug) ((oug) b.b()).G(1262)).p("Tried to draw a set of lines with %d floats", fArr.length);
            this.c = null;
        } else {
            this.j = f;
            this.c = mzi.g(fArr);
        }
    }

    public final void d(float f, float f2) {
        float f3 = f / f2;
        Matrix.orthoM(this.e, 0, -f3, f3, -1.0f, 1.0f, -1.0f, 1.0f);
    }
}
