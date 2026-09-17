package defpackage;

import android.view.SurfaceHolder;

/* JADX INFO: loaded from: classes2.dex */
final class jnb implements SurfaceHolder.Callback2 {
    private final dha a;

    public jnb(dha dhaVar) {
        this.a = dhaVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        dha dhaVar = this.a;
        surfaceHolder.getSurface();
        dhaVar.f();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        dha dhaVar = this.a;
        surfaceHolder.getSurface();
        dhaVar.f();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.a.c();
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }
}
