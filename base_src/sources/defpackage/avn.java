package defpackage;

import android.hardware.Camera;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
final class avn implements Camera.ShutterCallback {
    public static final /* synthetic */ int b = 0;
    public final fde a;
    private final Handler c;

    public avn(Handler handler, fde fdeVar) {
        this.c = handler;
        this.a = fdeVar;
    }

    @Override // android.hardware.Camera.ShutterCallback
    public final void onShutter() {
        this.c.post(new avm(this));
    }
}
