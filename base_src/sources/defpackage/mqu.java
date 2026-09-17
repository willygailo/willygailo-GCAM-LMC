package defpackage;

import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* JADX INFO: loaded from: classes2.dex */
final class mqu extends mqh {
    final /* synthetic */ mqq e;
    final /* synthetic */ int f;
    final /* synthetic */ mtu g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mqu(mrh mrhVar, EGLDisplay eGLDisplay, EGLSurface eGLSurface, EGLContext eGLContext, EGLConfig eGLConfig, int i, moq moqVar, mqq mqqVar, int i2, mtu mtuVar) {
        super(mrhVar, eGLDisplay, eGLSurface, eGLContext, eGLConfig, i, moqVar);
        this.e = mqqVar;
        this.f = i2;
        this.g = mtuVar;
    }

    @Override // defpackage.mmb
    public final mne b() {
        try {
            this.e.i();
            mqv.e(0);
            mqv.d(this.f);
            return this.g.a();
        } catch (Throwable th) {
            return mne.i(this.g.a().a(pgr.INSTANCE, mip.ah(th)));
        }
    }
}
