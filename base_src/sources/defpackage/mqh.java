package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES30;
import java.nio.Buffer;

/* JADX INFO: loaded from: classes2.dex */
abstract class mqh extends mmb implements mqq {
    public final mrh a;
    public final EGLDisplay b;
    public final EGLSurface c;
    public final EGLContext d;
    private final EGLConfig e;
    private final int f;
    private final moq g;

    public mqh(mrh mrhVar, EGLDisplay eGLDisplay, EGLSurface eGLSurface, EGLContext eGLContext, EGLConfig eGLConfig, int i, moq moqVar) {
        this.a = mrhVar;
        this.b = eGLDisplay;
        this.c = eGLSurface;
        this.d = eGLContext;
        this.e = eGLConfig;
        this.f = i;
        this.g = moqVar;
    }

    @Override // defpackage.mqq
    public final EGLConfig d() {
        return this.e;
    }

    @Override // defpackage.mqq
    public final EGLContext e() {
        return this.d;
    }

    @Override // defpackage.mqq
    public final EGLDisplay f() {
        return this.b;
    }

    @Override // defpackage.mqq
    public final EGLSurface g() {
        return this.c;
    }

    @Override // defpackage.mmb
    public final void gy() {
        mip.ac(b());
    }

    @Override // defpackage.mqq
    public final mrh h() {
        return this.a;
    }

    @Override // defpackage.mqq
    public final void i() {
        EGLDisplay eGLDisplay = this.b;
        EGLSurface eGLSurface = this.c;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d)) {
            GLES30.glBindFramebuffer(36160, this.f);
            GLES30.glViewport(0, 0, this.g.a.b(), this.g.a.a());
        }
    }

    @Override // defpackage.mqq
    public final void j(Buffer buffer) {
        mqi.b();
        if (this.a.b(mrh.a)) {
            GLES30.glReadBuffer(36064);
        }
        mme mmeVar = this.g.a;
        GLES30.glReadPixels(0, 0, mmeVar.b(), mmeVar.a(), 6408, 5121, buffer);
    }

    @Override // defpackage.mqq
    public final void k() {
        if (this.f == 0) {
            EGL14.eglSwapBuffers(this.b, this.c);
        }
    }

    @Override // defpackage.mqq
    public final moq l() {
        return this.g;
    }
}
