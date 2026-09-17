package defpackage;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class moz implements Callable {
    final /* synthetic */ mpi a;
    final /* synthetic */ int b;
    final /* synthetic */ ByteBuffer c;

    public moz(mpi mpiVar, int i, ByteBuffer byteBuffer) {
        this.a = mpiVar;
        this.b = i;
        this.c = byteBuffer;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        this.a.d();
        int i = this.b;
        int[] iArr = new int[1];
        GLES20.glGenBuffers(1, iArr, 0);
        mqp mqpVar = new mqp(iArr[0], i);
        ByteBuffer byteBuffer = this.c;
        mqpVar.b();
        GLES20.glBufferData(mqpVar.a, byteBuffer.limit(), byteBuffer, 35044);
        return mqpVar;
    }

    public final String toString() {
        int i = this.b;
        int iRemaining = this.c.remaining();
        StringBuilder sb = new StringBuilder(51);
        sb.append("createBufferWithStaticData(");
        sb.append(i);
        sb.append(",");
        sb.append(iRemaining);
        sb.append(")");
        return sb.toString();
    }
}
