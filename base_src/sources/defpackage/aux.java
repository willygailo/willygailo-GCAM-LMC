package defpackage;

import android.hardware.Camera;

/* JADX INFO: loaded from: classes.dex */
final class aux implements Runnable {
    final /* synthetic */ Camera.Parameters[] a;
    final /* synthetic */ awq b;
    final /* synthetic */ avf c;

    public aux(avf avfVar, Camera.Parameters[] parametersArr, awq awqVar) {
        this.c = avfVar;
        this.a = parametersArr;
        this.b = awqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a.d.obtainMessage(202, this.a).sendToTarget();
        this.c.a.d.post(this.b.a);
    }
}
