package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class ldv {
    public final lfj a;
    public final Executor b;
    public lff f;
    public final Object d = new Object();
    public final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    public ldu e = ldu.READY;

    public ldv(lfj lfjVar, Executor executor, ojc ojcVar) {
        this.f = new ldp(this);
        this.a = lfjVar;
        this.b = executor;
        if (ojcVar.g()) {
            this.f = (lff) ojcVar.c();
        }
    }

    public final void a() {
        synchronized (this.d) {
            obr.aU(this.e == ldu.STARTED, "%s is expected but we get %s", ldu.STARTED, this.e);
            this.e = ldu.PAUSED;
            plk.af(this.a.g(), new ldr(this, 1), this.b);
        }
    }

    public final void b() {
        synchronized (this.d) {
            boolean z = true;
            if (this.e != ldu.STARTED && this.e != ldu.PAUSED) {
                z = false;
            }
            obr.aV(z, "%s or %s is expected but we get %s", ldu.STARTED, ldu.PAUSED, this.e);
            this.e = ldu.STOPPED;
            plk.af(this.a.k(), new ldq(this, 0), this.b);
        }
    }
}
