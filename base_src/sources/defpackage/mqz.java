package defpackage;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes2.dex */
public final class mqz extends mqx {
    public mqz(int i, String str) {
        super(i);
        GLES20.glShaderSource(this.b, str);
    }

    @Override // defpackage.mqx
    protected final void c() {
        GLES20.glDeleteShader(this.b);
    }
}
