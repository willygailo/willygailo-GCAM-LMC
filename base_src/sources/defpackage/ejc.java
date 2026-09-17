package defpackage;

import android.graphics.SurfaceTexture;

/* JADX INFO: loaded from: classes.dex */
final class ejc implements SurfaceTexture.OnFrameAvailableListener {
    final /* synthetic */ ejd a;

    public ejc(ejd ejdVar) {
        this.a = ejdVar;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.a.h.getAndSet(true)) {
            ((oug) ((oug) ejd.a.c()).G((char) 1198)).o("Skipped a camera frame");
        }
    }
}
