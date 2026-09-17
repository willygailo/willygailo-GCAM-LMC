package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
final class aue implements Runnable {
    final /* synthetic */ avu a;
    final /* synthetic */ Handler b;
    final /* synthetic */ aui c;

    public aue(aui auiVar, avu avuVar, Handler handler) {
        this.c = auiVar;
        this.a = avuVar;
        this.b = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aud audVar = this.a != null ? new aud(this) : null;
        this.c.c.c.e(48);
        this.c.c.b.obtainMessage(301, audVar).sendToTarget();
    }
}
