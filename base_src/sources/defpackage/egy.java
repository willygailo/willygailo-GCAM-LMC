package defpackage;

import android.opengl.GLSurfaceView;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class egy {
    private static final ouj a = ouj.h("com/google/android/apps/camera/imax/GlTaskQueueImpl");
    private final GLSurfaceView b;

    public egy(GLSurfaceView gLSurfaceView) {
        this.b = gLSurfaceView;
    }

    public final void a(Runnable runnable) {
        this.b.queueEvent(runnable);
    }

    public final void b(Runnable runnable) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        a(new egx(runnable, atomicBoolean));
        synchronized (atomicBoolean) {
            while (!atomicBoolean.get()) {
                try {
                    atomicBoolean.wait();
                } catch (InterruptedException e) {
                    ((oug) ((oug) ((oug) a.c()).h(e)).G(1153)).o("Interrupted during wait");
                }
            }
        }
    }
}
