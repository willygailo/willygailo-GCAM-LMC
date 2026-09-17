package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class awh implements Runnable {
    final /* synthetic */ Handler a;
    final /* synthetic */ avw b;
    final /* synthetic */ awl c;

    public awh(awl awlVar, Handler handler, avw avwVar) {
        this.c = awlVar;
        this.a = handler;
        this.b = avwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.c().obtainMessage(3, this.c.a(), 0, awb.e(this.a, this.b)).sendToTarget();
    }
}
