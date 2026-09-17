package defpackage;

import android.hardware.Camera;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
final class ave implements Runnable {
    final /* synthetic */ Handler a;
    final /* synthetic */ awc b;
    final /* synthetic */ Camera.PictureCallback c;
    final /* synthetic */ avf d;
    final /* synthetic */ fde e;

    public ave(avf avfVar, Handler handler, fde fdeVar, awc awcVar, Camera.PictureCallback pictureCallback) {
        this.d = avfVar;
        this.a = handler;
        this.e = fdeVar;
        this.b = awcVar;
        this.c = pictureCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d.g().d()) {
            return;
        }
        this.d.a.e.e(6);
        avh avhVar = this.d.a.d;
        Handler handler = this.a;
        fde fdeVar = this.e;
        int i = avn.b;
        avn avnVar = (handler == null || fdeVar == null) ? null : new avn(handler, fdeVar);
        avhVar.obtainMessage(601, new avg(avnVar, avj.a(this.a, this.b), avj.a(this.a, null), this.c)).sendToTarget();
    }
}
