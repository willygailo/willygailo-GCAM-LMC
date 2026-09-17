package defpackage;

import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* JADX INFO: loaded from: classes2.dex */
final class mqt extends mqh {
    final /* synthetic */ mqq e;
    final /* synthetic */ int f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mqt(mrh mrhVar, EGLDisplay eGLDisplay, EGLSurface eGLSurface, EGLContext eGLContext, EGLConfig eGLConfig, int i, mor morVar, mqq mqqVar, int i2, int i3) {
        super(mrhVar, eGLDisplay, eGLSurface, eGLContext, eGLConfig, i, morVar);
        this.e = mqqVar;
        this.f = i2;
        this.g = i3;
    }

    @Override // defpackage.mmb
    public final mne b() {
        this.e.i();
        mqv.e(this.f);
        mqv.d(this.g);
        return mnd.a;
    }
}
