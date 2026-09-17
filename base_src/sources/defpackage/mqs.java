package defpackage;

import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* JADX INFO: loaded from: classes2.dex */
final class mqs extends mqh {
    final /* synthetic */ mqq e;
    final /* synthetic */ mtu f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mqs(mrh mrhVar, EGLDisplay eGLDisplay, EGLSurface eGLSurface, EGLContext eGLContext, EGLConfig eGLConfig, moq moqVar, mqq mqqVar, mtu mtuVar) {
        super(mrhVar, eGLDisplay, eGLSurface, eGLContext, eGLConfig, 0, moqVar);
        this.e = mqqVar;
        this.f = mtuVar;
    }

    @Override // defpackage.mmb
    public final mne b() {
        try {
            this.e.i();
            return this.f.a();
        } catch (Throwable th) {
            return mne.i(this.f.a().a(pgr.INSTANCE, mip.ah(th)));
        }
    }
}
