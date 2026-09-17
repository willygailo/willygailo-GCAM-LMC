package defpackage;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes2.dex */
public final class mqy extends mqx {
    public mqy(int i) {
        super(i);
    }

    public final int b(String str) {
        return GLES20.glGetUniformLocation(this.b, str);
    }

    @Override // defpackage.mqx
    protected final void c() {
        GLES20.glDeleteProgram(this.b);
    }
}
