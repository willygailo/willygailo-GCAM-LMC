package defpackage;

import android.hardware.Camera;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
final class ava implements Camera.AutoFocusCallback {
    final /* synthetic */ Handler a;
    final /* synthetic */ avu b;
    final /* synthetic */ avf c;

    public ava(avf avfVar, Handler handler, avu avuVar) {
        this.c = avfVar;
        this.a = handler;
        this.b = avuVar;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z, Camera camera) {
        if (this.c.a.e.a() != 16) {
            axp.c(avo.a, "onAutoFocus callback returning when not focusing");
        } else {
            this.c.a.e.c(2);
        }
        this.a.post(new auz(this, z));
    }
}
