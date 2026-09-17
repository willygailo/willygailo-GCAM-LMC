package defpackage;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes2.dex */
public final class mqp extends mqx {
    public final int a;

    public mqp(int i, int i2) {
        super(i);
        this.a = i2;
    }

    public final void b() {
        GLES20.glBindBuffer(this.a, this.b);
    }

    @Override // defpackage.mqx
    protected final void c() {
        GLES20.glDeleteBuffers(1, new int[]{this.b}, 0);
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.a;
        StringBuilder sb = new StringBuilder(51);
        sb.append("GLRawBuffer{handle=");
        sb.append(i);
        sb.append(", target=");
        sb.append(i2);
        sb.append('}');
        return sb.toString();
    }
}
