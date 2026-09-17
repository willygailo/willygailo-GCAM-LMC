package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mrg implements mmc {
    public static final float[] a = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    public final mpi b;
    public mrd c = null;
    public mrd d = null;

    private mrg(mpi mpiVar) {
        this.b = mpiVar;
    }

    public static mrg a(mpi mpiVar) {
        return new mrg(mpiVar);
    }

    private final mrd f(mrd mrdVar, mrd mrdVar2) {
        mqm mqmVarI = mrd.i(this.b);
        mqmVarI.a(mwp.g(mrdVar));
        mqmVarI.a(mwp.g(mrdVar2));
        return mqmVarI.b();
    }

    public final void b(mpi mpiVar) {
        if (mpiVar == this.b) {
            return;
        }
        String strValueOf = String.valueOf(mpiVar);
        String strValueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 111 + String.valueOf(strValueOf2).length());
        sb.append("Input to GLTextureCopier must be on the copier's GL context. Found input on context ");
        sb.append(strValueOf);
        sb.append(" but expect input to be on ");
        sb.append(strValueOf2);
        throw new IllegalArgumentException(sb.toString());
    }

    public final mrd c(mrh mrhVar, boolean z) {
        mrd mrdVarH;
        mrd mrdVarB;
        if (z) {
            if (this.d == null) {
                this.d = f(mrd.h(this.b, "attribute vec2 aPosition;\nattribute vec2 aTexCoord;\nuniform mat4 uTransform;\nvarying vec2 texCoord;\nvoid main() {\n  texCoord = (uTransform * vec4(aTexCoord, 0.0, 1.0)).xy;\n  gl_Position = vec4(aPosition.xy, 0.0, 1.0);\n}"), mrd.b(this.b, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES uImgTex;\nvarying vec2 texCoord;\nvoid main() {\n  gl_FragColor = texture2D(uImgTex, texCoord);\n}"));
            }
            return this.d;
        }
        if (this.c == null) {
            if (mrhVar.b >= 3) {
                mrdVarH = mrd.h(this.b, "#version 300 es\nin vec2 aPosition;\nin vec2 aTexCoord;\nuniform mat4 uTransform;\nout vec2 texCoord;\nvoid main() {\n  texCoord = (uTransform * vec4(aTexCoord, 0.0, 1.0)).xy;\n  gl_Position = vec4(aPosition.xy, 0.0, 1.0);\n}");
                mrdVarB = mrd.b(this.b, "#version 300 es\nprecision mediump float;\nuniform sampler2D uImgTex;\nin vec2 texCoord;\nout vec4 outColor;\nvoid main() {\n    outColor = texture(uImgTex, texCoord);\n}");
            } else {
                mrdVarH = mrd.h(this.b, "attribute vec2 aPosition;\nattribute vec2 aTexCoord;\nuniform mat4 uTransform;\nvarying vec2 texCoord;\nvoid main() {\n  texCoord = (uTransform * vec4(aTexCoord, 0.0, 1.0)).xy;\n  gl_Position = vec4(aPosition.xy, 0.0, 1.0);\n}");
                mrdVarB = mrd.b(this.b, "precision mediump float;\nuniform sampler2D uImgTex;\nvarying vec2 texCoord;\nvoid main() {\n    gl_FragColor = texture2D(uImgTex, texCoord);\n}");
            }
            this.c = f(mrdVarH, mrdVarB);
        }
        return this.c;
    }

    @Override // defpackage.mmc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        mrd mrdVar = this.c;
        if (mrdVar != null) {
            mrdVar.close();
            this.c = null;
        }
        mrd mrdVar2 = this.d;
        if (mrdVar2 != null) {
            mrdVar2.close();
            this.d = null;
        }
    }

    public final void d(mqg mqgVar, mrd mrdVar) {
        e(mqgVar, mrdVar, a);
    }

    public final void e(mqg mqgVar, mrd mrdVar, float[] fArr) {
        b(mqgVar.b);
        b(mrdVar.b);
        mqb mqbVarA = mqb.a(mqo.a(mrdVar.b)).a(c(this.b.d(), true));
        mqbVarA.d(mqgVar);
        mqbVarA.i(fArr);
        mqbVarA.c("aPosition", 0);
        mqbVarA.c("aTexCoord", 1);
        mqbVarA.j(mrdVar);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 17);
        sb.append("GLTextureCopier[");
        sb.append(strValueOf);
        sb.append("]");
        return sb.toString();
    }
}
