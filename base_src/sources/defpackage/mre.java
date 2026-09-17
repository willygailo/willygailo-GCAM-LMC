package defpackage;

import android.opengl.GLES20;
import android.opengl.GLES30;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class mre implements Callable {
    final /* synthetic */ mpi a;
    final /* synthetic */ moq b;

    public mre(mpi mpiVar, moq moqVar) {
        this.a = mpiVar;
        this.b = moqVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() throws Exception {
        mrb mrbVar = new mrb(this.a.d(), mrb.b(), 3553, this.b);
        try {
            mrbVar.d();
            if (mrbVar.a.b(mrh.a)) {
                obr.aQ(!mrbVar.e);
                GLES30.glTexStorage2D(mrbVar.c, mrbVar.d, 32856, mrbVar.f.a.b(), mrbVar.f.a.a());
                mrbVar.e = true;
            } else {
                obr.aQ(!mrbVar.e);
                GLES20.glTexImage2D(mrbVar.c, 0, 32856, mrbVar.f.a.b(), mrbVar.f.a.a(), 0, 6408, 5121, null);
                mrbVar.e = true;
            }
            if (mqi.a()) {
                GLES30.glTexParameteri(3553, 10240, 9729);
                GLES30.glTexParameteri(3553, 10241, 9729);
            } else {
                GLES30.glTexParameteri(3553, 10240, 9728);
                GLES30.glTexParameteri(3553, 10241, 9728);
            }
            GLES30.glTexParameteri(3553, 10242, 33071);
            GLES30.glTexParameteri(3553, 10243, 33071);
            mrbVar.e = true;
            return mrbVar;
        } catch (Exception e) {
            mrbVar.close();
            throw e;
        }
    }

    public final String toString() {
        return "createTexture(RGBA8888)";
    }
}
