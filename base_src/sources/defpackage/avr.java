package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class avr implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ Handler b;
    final /* synthetic */ avw c;
    final /* synthetic */ awr d;

    public avr(awr awrVar, int i, Handler handler, avw avwVar) {
        this.d = awrVar;
        this.a = i;
        this.b = handler;
        this.c = avwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a().obtainMessage(1, this.a, 0, awb.e(this.b, this.c)).sendToTarget();
    }
}
