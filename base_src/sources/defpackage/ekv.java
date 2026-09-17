package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.google.android.libraries.vision.opengl.Texture;

/* JADX INFO: loaded from: classes.dex */
public final class ekv {
    private final ekn a;

    public ekv(Texture texture, int i) {
        ekn eknVar = new ekn();
        this.a = eknVar;
        eknVar.c = texture;
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        Matrix.rotateM(fArr, 0, i, 0.0f, 0.0f, 1.0f);
        System.arraycopy(fArr, 0, eknVar.d, 0, 16);
    }

    public final void a(float[] fArr) {
        System.arraycopy(fArr, 0, this.a.e, 0, 16);
        GLES20.glClear(16384);
        ekn eknVar = this.a;
        Texture texture = eknVar.c;
        if (texture == null) {
            return;
        }
        if (eknVar.f == null) {
            eknVar.f = new nlc("attribute vec2 vertexAttrib;attribute vec2 texCoordAttrib;varying vec2 texCoord;uniform mat4 vertexTransform;uniform mat4 textureTransform;void main() {  texCoord = (textureTransform * vec4(texCoordAttrib, 0., 1.)).xy;  gl_Position = vertexTransform * vec4(vertexAttrib, 0., 1.);}", texture.getType() == 36197 ? "#extension GL_OES_EGL_image_external : require \nprecision mediump float;uniform samplerExternalOES texture;varying vec2 texCoord;void main() {  gl_FragColor = texture2D(texture, texCoord);}" : "precision mediump float;uniform sampler2D texture;varying vec2 texCoord;void main() {  gl_FragColor = texture2D(texture, texCoord);}");
            eknVar.g = eknVar.f.a("texture");
            eknVar.h = eknVar.f.a("vertexTransform");
            eknVar.i = eknVar.f.a("textureTransform");
            eknVar.j = eknVar.f.e("vertexAttrib");
            eknVar.k = eknVar.f.e("texCoordAttrib");
        }
        eknVar.f.b();
        eknVar.j.e();
        eknVar.j.f(ekn.a, 2);
        eknVar.k.e();
        eknVar.k.f(ekn.b, 2);
        eknVar.g.c(eknVar.c);
        eknVar.h.a(eknVar.d);
        eknVar.i.a(eknVar.e);
        GLES20.glDrawArrays(5, 0, ekn.a.capacity() / 2);
        eknVar.k.d();
        eknVar.j.d();
        eknVar.f.d();
        eknVar.c.unbind();
    }
}
