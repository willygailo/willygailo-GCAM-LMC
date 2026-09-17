package defpackage;

import android.opengl.GLES30;
import com.google.android.libraries.oliveoil.gl.EGLImage;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class mph implements Callable {
    final /* synthetic */ mpi a;
    final /* synthetic */ EGLImage b;

    public mph(mpi mpiVar, EGLImage eGLImage) {
        this.a = mpiVar;
        this.b = eGLImage;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        mpi mpiVar = this.a;
        EGLImage eGLImage = this.b;
        int iA = mqv.a();
        int[] iArr = new int[1];
        GLES30.glGenRenderbuffers(1, iArr, 0);
        int i = iArr[0];
        GLES30.glBindRenderbuffer(36161, i);
        EGLImage.attachToRbo(eGLImage.a);
        GLES30.glBindFramebuffer(36160, iA);
        GLES30.glFramebufferRenderbuffer(36160, 36064, 36161, i);
        mqq mqqVar = (mqq) mpiVar.h().c();
        return new mqt(mqqVar.h(), mqqVar.f(), mqqVar.g(), mqqVar.e(), mqqVar.d(), iA, new mor(eGLImage.b()), mqqVar, i, iA);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b.b());
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 22);
        sb.append("createCanvasForImage(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}
