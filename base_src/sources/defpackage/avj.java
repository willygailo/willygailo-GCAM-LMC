package defpackage;

import android.hardware.Camera;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
final class avj implements Camera.PictureCallback {
    private final Handler a;

    private avj(Handler handler) {
        this.a = handler;
    }

    public static avj a(Handler handler, awc awcVar) {
        if (handler == null || awcVar == null) {
            return null;
        }
        return new avj(handler);
    }

    @Override // android.hardware.Camera.PictureCallback
    public final void onPictureTaken(byte[] bArr, Camera camera) {
        this.a.post(new bvf(1));
    }
}
