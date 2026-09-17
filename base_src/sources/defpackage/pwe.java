package defpackage;

import android.graphics.SurfaceTexture;

/* JADX INFO: loaded from: classes2.dex */
final class pwe implements SurfaceTexture.OnFrameAvailableListener {
    final /* synthetic */ pwf a;

    public pwe(pwf pwfVar) {
        this.a = pwfVar;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        pwg pwgVar;
        this.a.d.getAndIncrement();
        synchronized (this.a.k) {
            if (!this.a.j && (pwgVar = this.a.b) != null) {
                pwgVar.b();
            }
        }
    }
}
