package defpackage;

import android.opengl.EGL15;
import android.opengl.EGLDisplay;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class mpp implements Callable {
    final /* synthetic */ EGLDisplay a;

    public mpp(EGLDisplay eGLDisplay) {
        this.a = eGLDisplay;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return EGL15.eglCreateSync(this.a, 12537, new long[]{12344}, 0);
    }

    public final String toString() {
        return "eglWait";
    }
}
