package defpackage;

import android.graphics.SurfaceTexture;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes.dex */
final class dyf implements Runnable {
    final /* synthetic */ SurfaceTexture a;
    final /* synthetic */ dyi b;

    public dyf(dyi dyiVar, SurfaceTexture surfaceTexture) {
        this.b = dyiVar;
        this.a = surfaceTexture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f = (EGL10) EGLContext.getEGL();
        dyi dyiVar = this.b;
        dyiVar.c = dyiVar.f.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (this.b.c == EGL10.EGL_NO_DISPLAY) {
            throw new RuntimeException("eglGetDisplay failed");
        }
        dyi dyiVar2 = this.b;
        if (!dyiVar2.f.eglInitialize(dyiVar2.c, new int[2])) {
            throw new RuntimeException("eglInitialize failed");
        }
        int[] iArr = {12440, 2, 12344};
        dyi dyiVar3 = this.b;
        EGL10 egl10 = dyiVar3.f;
        EGLDisplay eGLDisplay = dyiVar3.c;
        int[] iArr2 = new int[1];
        if (!egl10.eglChooseConfig(eGLDisplay, dyi.a, null, 0, iArr2)) {
            throw new IllegalArgumentException("eglChooseConfig failed");
        }
        int i = iArr2[0];
        if (i <= 0) {
            throw new IllegalArgumentException("No configs match configSpec");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[i];
        if (!egl10.eglChooseConfig(eGLDisplay, dyi.a, eGLConfigArr, i, iArr2)) {
            throw new IllegalArgumentException("eglChooseConfig#2 failed");
        }
        dyiVar3.b = eGLConfigArr[0];
        dyi dyiVar4 = this.b;
        dyiVar4.d = dyiVar4.f.eglCreateContext(dyiVar4.c, dyiVar4.b, EGL10.EGL_NO_CONTEXT, iArr);
        EGLContext eGLContext = this.b.d;
        if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
            throw new RuntimeException("failed to createContext");
        }
        dyi dyiVar5 = this.b;
        dyiVar5.e = dyiVar5.f.eglCreateWindowSurface(dyiVar5.c, dyiVar5.b, this.a, null);
        EGLSurface eGLSurface = this.b.e;
        if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
            throw new RuntimeException("failed to createWindowSurface");
        }
        dyi dyiVar6 = this.b;
        EGL10 egl11 = dyiVar6.f;
        EGLDisplay eGLDisplay2 = dyiVar6.c;
        EGLSurface eGLSurface2 = dyiVar6.e;
        if (!egl11.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, dyiVar6.d)) {
            throw new RuntimeException("failed to eglMakeCurrent");
        }
        dyi dyiVar7 = this.b;
        dyiVar7.g = (GL10) dyiVar7.d.getGL();
    }
}
