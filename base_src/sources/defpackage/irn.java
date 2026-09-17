package defpackage;

import java.util.TimerTask;

/* JADX INFO: loaded from: classes2.dex */
public final class irn extends TimerTask {
    final /* synthetic */ iro a;

    public irn(iro iroVar) {
        this.a = iroVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        long jCurrentTimeMillis = this.a.c.get() > 0 ? System.currentTimeMillis() - this.a.c.get() : 0L;
        this.a.b(((System.currentTimeMillis() - this.a.e.get()) - this.a.d.get()) - jCurrentTimeMillis);
    }
}
