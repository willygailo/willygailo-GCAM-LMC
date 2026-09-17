package defpackage;

import android.opengl.GLES30;
import android.opengl.GLSurfaceView;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes2.dex */
public final class irf implements GLSurfaceView.Renderer {
    public ByteBuffer a;
    public float[] b;
    public ird c;
    private final mip d;

    public irf(mip mipVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.d = mipVar;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        System.currentTimeMillis();
        ird irdVar = this.c;
        ByteBuffer byteBuffer = this.a;
        float[] fArr = this.b;
        GLES30.glTexImage2D(3553, 0, 6407, irdVar.c, irdVar.b, 0, 6407, 5121, byteBuffer);
        irdVar.a.put(fArr);
        GLES30.glVertexAttribPointer(irdVar.d, 4, 5126, false, 16, (Buffer) irdVar.a);
        GLES30.glEnableVertexAttribArray(irdVar.d);
        GLES30.glDrawElements(4, irdVar.e.capacity(), 5123, irdVar.e);
        System.currentTimeMillis();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.c = new ird(this.d, i, i2, null, null, null, null, null, null);
        gl10.glViewport(0, 0, i, i2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
    }
}
