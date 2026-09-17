package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
final class fxx implements awm {
    final /* synthetic */ fyr a;

    public fxx(fyr fyrVar) {
        this.a = fyrVar;
    }

    @Override // defpackage.awm
    public final void a() {
        fyr fyrVar = this.a;
        fdj fdjVar = fyrVar.r;
        if (fdjVar == null) {
            return;
        }
        fyrVar.k = true;
        fdjVar.s = true;
        fdjVar.b.D = false;
        Thread.State state = fyrVar.h.getState();
        if (state == Thread.State.NEW) {
            this.a.h.start();
        } else {
            ((oug) ((oug) fyr.b.c()).G((char) 1976)).r("aligner has already been started! State=%s", state);
        }
        fyr fyrVar2 = this.a;
        fyrVar2.u();
        fyrVar2.n.i();
        try {
            fyr fyrVar3 = this.a;
            fyrVar3.G = fyrVar3.r.b() <= 0.0f;
            fyr fyrVar4 = this.a;
            Handler handler = fyrVar4.H;
            if (handler != null) {
                handler.obtainMessage(1).sendToTarget();
                fyrVar4.H.obtainMessage(2, fyrVar4.w, fyrVar4.x).sendToTarget();
                fyr fyrVar5 = this.a;
                fyrVar5.r.t = fyrVar5.I;
            }
            this.a.D(true);
            this.a.f.setSideButtonsClickable(true);
        } catch (IllegalStateException e) {
        }
    }
}
