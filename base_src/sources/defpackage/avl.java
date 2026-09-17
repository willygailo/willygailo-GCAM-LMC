package defpackage;

import android.hardware.Camera;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
final class avl implements Camera.PreviewCallback {
    public final fde a;
    private final Handler b;

    private avl(Handler handler, fde fdeVar, byte[] bArr) {
        this.b = handler;
        this.a = fdeVar;
    }

    public static avl a(Handler handler, fde fdeVar) {
        if (handler == null || fdeVar == null) {
            return null;
        }
        return new avl(handler, fdeVar, null);
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        this.b.post(new avk(this, bArr));
    }
}
