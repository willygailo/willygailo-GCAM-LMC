package defpackage;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes2.dex */
final class mpx implements mmc {
    private final int a;

    public mpx(int i) {
        this.a = i;
        GLES20.glEnableVertexAttribArray(i);
    }

    @Override // defpackage.mmc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        GLES20.glDisableVertexAttribArray(this.a);
    }
}
