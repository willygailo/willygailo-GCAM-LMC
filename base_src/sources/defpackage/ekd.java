package defpackage;

import com.google.android.apps.camera.imax.cyclops.processing.NativeCaptureImpl;
import com.google.android.libraries.vision.opengl.Texture;

/* JADX INFO: loaded from: classes.dex */
public final class ekd implements Runnable {
    final /* synthetic */ eke a;
    private final /* synthetic */ int b;

    public ekd(eke ekeVar, int i) {
        this.b = i;
        this.a = ekeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                eke ekeVar = this.a;
                ejo ejoVar = ekeVar.d;
                Texture texture = ekeVar.i;
                ejx ejxVar = ekeVar.h;
                NativeCaptureImpl nativeCaptureImpl = (NativeCaptureImpl) ejoVar;
                nativeCaptureImpl.initialize(texture.getName(), texture.getWidth(), texture.getHeight(), (int) Math.max(Math.round(Math.log((ejxVar.a * ejxVar.b) / 32400) / Math.log(4.0d)), 0.0d), nativeCaptureImpl.a, nativeCaptureImpl.b);
                break;
            default:
                this.a.d.release();
                break;
        }
    }
}
