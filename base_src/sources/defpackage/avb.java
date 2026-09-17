package defpackage;

import android.hardware.Camera;

/* JADX INFO: loaded from: classes.dex */
final class avb implements Runnable {
    final /* synthetic */ Camera.AutoFocusCallback a;
    final /* synthetic */ avf b;

    public avb(avf avfVar, Camera.AutoFocusCallback autoFocusCallback) {
        this.b = avfVar;
        this.a = autoFocusCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.g().d()) {
            return;
        }
        this.b.a.e.e(2);
        this.b.a.d.obtainMessage(301, this.a).sendToTarget();
    }
}
