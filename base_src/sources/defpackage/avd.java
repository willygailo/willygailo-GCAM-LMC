package defpackage;

import android.hardware.Camera;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
final class avd implements Camera.PictureCallback {
    final /* synthetic */ Handler a;
    final /* synthetic */ awc b;
    final /* synthetic */ avf c;

    public avd(avf avfVar, Handler handler, awc awcVar) {
        this.c = avfVar;
        this.a = handler;
        this.b = awcVar;
    }

    @Override // android.hardware.Camera.PictureCallback
    public final void onPictureTaken(byte[] bArr, Camera camera) {
        if (this.c.a.e.a() != 8) {
            axp.c(avo.a, "picture callback returning when not capturing");
        } else {
            this.c.a.e.c(2);
        }
        this.a.post(new avc(this, bArr));
    }
}
