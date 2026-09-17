package defpackage;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes2.dex */
public final class irg {
    public static final ouj a = ouj.h("com/google/android/apps/camera/timelapse/stabilization/warp/PixelBuffer");
    public final int b;
    public final int c;
    public final String d = Thread.currentThread().getName();
    public EGLDisplay e;
    public EGLConfig f;
    public EGLConfig[] g;
    public EGLContext h;
    public EGLSurface i;
    public EGL10 j;
    public GL10 k;
    public irf l;

    public irg(int i, int i2) {
        this.c = i;
        this.b = i2;
    }
}
