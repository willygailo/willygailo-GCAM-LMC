package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* JADX INFO: loaded from: classes2.dex */
final class mqr extends mqh {
    final /* synthetic */ EGLDisplay e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mqr(mrh mrhVar, EGLDisplay eGLDisplay, EGLSurface eGLSurface, EGLContext eGLContext, EGLConfig eGLConfig, moq moqVar, EGLDisplay eGLDisplay2) {
        super(mrhVar, eGLDisplay, eGLSurface, eGLContext, eGLConfig, 0, moqVar);
        this.e = eGLDisplay2;
    }

    @Override // defpackage.mmb
    public final mne b() {
        EGL14.eglMakeCurrent(this.e, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroyContext(((mqh) this).b, this.d);
        EGL14.eglDestroySurface(((mqh) this).b, this.c);
        return mnd.a;
    }
}
