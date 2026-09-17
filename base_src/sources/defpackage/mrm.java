package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* JADX INFO: loaded from: classes2.dex */
public final class mrm extends mtt {
    private final EGLDisplay a;

    public mrm(EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        super(eGLSurface);
        this.a = eGLDisplay;
    }

    @Override // defpackage.mtt
    protected final /* bridge */ /* synthetic */ void b(Object obj) {
        EGL14.eglDestroySurface(this.a, (EGLSurface) obj);
    }
}
