package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.google.android.libraries.vision.opengl.Texture;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class eli {
    public FloatBuffer a;
    public Texture b = null;
    public int c = 33071;
    public boolean d = false;
    public final float[] e = {1.0f, 1.0f, 1.0f, 1.0f};
    private final float[] f;
    private FloatBuffer g;
    private final float[] h;
    private final float[] i;
    private final float[] j;
    private final float[] k;
    private nlc l;
    private nle m;
    private nle n;
    private nle o;
    private nle p;
    private nle q;
    private nle r;
    private nle s;
    private nle t;

    public eli() {
        float[] fArr = {-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f};
        this.f = fArr;
        this.g = mzi.g(fArr);
        float[] fArr2 = {0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f};
        this.h = fArr2;
        this.a = mzi.g(fArr2);
        float[] fArr3 = new float[16];
        this.i = fArr3;
        float[] fArr4 = new float[16];
        this.j = fArr4;
        float[] fArr5 = new float[16];
        this.k = fArr5;
        Matrix.setIdentityM(fArr3, 0);
        Matrix.setIdentityM(fArr4, 0);
        Matrix.setIdentityM(fArr5, 0);
    }

    public final void a() {
        nlc nlcVar = this.l;
        if (nlcVar != null) {
            nlcVar.c();
            this.l = null;
        }
    }

    public final void b() {
        Texture texture = this.b;
        if (texture == null) {
            return;
        }
        if (this.l == null) {
            nlc nlcVar = new nlc("attribute vec2 vertexAttrib;attribute vec2 texCoordAttrib;varying vec2 texCoord;uniform mat4 projectionMatrix;uniform mat4 vertexTransform;uniform mat4 textureTransform;void main() {  texCoord = (textureTransform * vec4(texCoordAttrib, 0., 1.)).xy;  gl_Position = projectionMatrix * vertexTransform * vec4(vertexAttrib, 0., 1.);}", texture.getType() == 36197 ? "#extension GL_OES_EGL_image_external : require \nprecision mediump float;uniform samplerExternalOES texture;uniform bool overrideColorActive;uniform vec4 overrideColor;varying vec2 texCoord;void main() {  vec4 texColor = texture2D(texture, texCoord);  gl_FragColor = (overrideColorActive && texColor.a > 0.01) ? overrideColor : texColor;}" : "precision mediump float;uniform sampler2D texture;uniform bool overrideColorActive;uniform vec4 overrideColor;varying vec2 texCoord;void main() {  vec4 texColor = texture2D(texture, texCoord);  gl_FragColor = (overrideColorActive && texColor.a > 0.01) ? overrideColor : texColor;}");
            this.l = nlcVar;
            this.o = nlcVar.a("texture");
            this.m = this.l.a("vertexTransform");
            this.n = this.l.a("textureTransform");
            this.p = this.l.a("projectionMatrix");
            this.q = this.l.a("overrideColor");
            this.r = this.l.a("overrideColorActive");
            this.s = this.l.e("vertexAttrib");
            this.t = this.l.e("texCoordAttrib");
        }
        nlc nlcVar2 = this.l;
        nlcVar2.getClass();
        nlcVar2.b();
        this.s.e();
        this.s.f(this.g, 2);
        this.t.e();
        this.t.f(this.a, 2);
        nle nleVar = this.o;
        Texture texture2 = this.b;
        texture2.getClass();
        nleVar.c(texture2);
        this.m.a(this.i);
        this.p.a(this.k);
        this.n.a(this.j);
        GLES20.glUniform1i(this.r.a, this.d ? 1 : 0);
        this.q.b(this.e);
        GLES20.glTexParameteri(3553, 10242, this.c);
        GLES20.glTexParameteri(3553, 10243, this.c);
        GLES20.glDrawArrays(5, 0, this.g.capacity() / 2);
        this.t.d();
        this.s.d();
        nlcVar2.d();
    }

    public final void c(float f, float f2) {
        float f3 = f / f2;
        Matrix.orthoM(this.k, 0, -f3, f3, -1.0f, 1.0f, -1.0f, 1.0f);
    }

    public final void d(float f, float f2) {
        float f3 = f / 2.0f;
        float f4 = f2 / 2.0f;
        float[] fArr = this.f;
        float f5 = -f3;
        fArr[0] = f5;
        fArr[1] = f4;
        fArr[2] = f5;
        float f6 = -f4;
        fArr[3] = f6;
        fArr[4] = f3;
        fArr[5] = f4;
        fArr[6] = f3;
        fArr[7] = f6;
        this.g = mzi.g(fArr);
    }

    public final void e(float[] fArr) {
        System.arraycopy(fArr, 0, this.j, 0, 16);
    }

    public final void f(float[] fArr) {
        System.arraycopy(fArr, 0, this.i, 0, 16);
    }
}
