package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class csy {
    ScheduledFuture a = null;
    private final qkg b;
    private final ScheduledExecutorService c;
    private final ddf d;

    public csy(qkg qkgVar, ScheduledExecutorService scheduledExecutorService, ddf ddfVar) {
        this.b = qkgVar;
        this.c = scheduledExecutorService;
        this.d = ddfVar;
    }

    public final synchronized void a() {
        if (this.d.k(dcu.aa)) {
            ScheduledFuture scheduledFuture = this.a;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.a = null;
            }
        }
    }

    public final synchronized void b() {
        if (this.d.k(dcu.aa)) {
            if (this.a != null) {
                throw new IllegalStateException("Scheduler running already.");
            }
            ScheduledExecutorService scheduledExecutorService = this.c;
            final ctd ctdVar = (ctd) this.b.get();
            ctdVar.getClass();
            this.a = scheduledExecutorService.scheduleAtFixedRate(new Runnable() { // from class: csx
                @Override // java.lang.Runnable
                public final void run() {
                    ctdVar.b();
                }
            }, 0L, 1000L, TimeUnit.MILLISECONDS);
            ((ctd) this.b.get()).a();
        }
    }
}
