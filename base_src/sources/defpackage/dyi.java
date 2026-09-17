package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes.dex */
public final class dyi {
    public static final int[] a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344};
    public EGLConfig b;
    public EGLDisplay c;
    public EGLContext d;
    public EGLSurface e;
    public EGL10 f;
    public GL10 g;
    public final Handler i;
    public final dyh j;
    public volatile boolean h = false;
    public final Object k = new Object();
    public final Runnable l = new dye(this, 1);

    public dyi(SurfaceTexture surfaceTexture, Handler handler, dyh dyhVar) {
        this.i = handler;
        this.j = dyhVar;
        handler.post(new dyf(this, surfaceTexture));
        Object obj = new Object();
        synchronized (obj) {
            handler.post(new dyg(obj));
            try {
                obj.wait();
            } catch (InterruptedException e) {
            }
        }
    }
}
