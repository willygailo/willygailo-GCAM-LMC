package defpackage;

import android.opengl.EGL14;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes.dex */
public final class dye implements Runnable {
    final /* synthetic */ dyi a;
    private final /* synthetic */ int b;

    public dye(dyi dyiVar, int i) {
        this.b = i;
        this.a = dyiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                dyi dyiVar = this.a;
                dyiVar.f.eglDestroySurface(dyiVar.c, dyiVar.e);
                dyi dyiVar2 = this.a;
                dyiVar2.f.eglDestroyContext(dyiVar2.c, dyiVar2.d);
                dyi dyiVar3 = this.a;
                dyiVar3.f.eglMakeCurrent(dyiVar3.c, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
                dyi dyiVar4 = this.a;
                dyiVar4.e = null;
                dyiVar4.d = null;
                dyiVar4.c = null;
                EGL14.eglReleaseThread();
                return;
            default:
                synchronized (this.a.k) {
                    dyi dyiVar5 = this.a;
                    if (dyiVar5.c != null && dyiVar5.e != null) {
                        dyh dyhVar = dyiVar5.j;
                        GL10 gl10 = dyiVar5.g;
                        fdm fdmVar = ((fyr) dyhVar).q;
                        if (fdmVar != null) {
                            fdmVar.onDrawFrame(gl10);
                        }
                        dyi dyiVar6 = this.a;
                        dyiVar6.f.eglSwapBuffers(dyiVar6.c, dyiVar6.e);
                        this.a.h = false;
                    }
                    this.a.k.notifyAll();
                    break;
                }
                return;
        }
    }
}
