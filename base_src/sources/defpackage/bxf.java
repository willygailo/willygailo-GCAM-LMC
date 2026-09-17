package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class bxf implements lie {
    public final pih a;
    public final pih b;
    public final pht c;
    public final pht d;

    public bxf(ScheduledExecutorService scheduledExecutorService, pih pihVar, bqg bqgVar) {
        pih pihVarF = pih.f();
        this.a = pihVarF;
        pih pihVarF2 = pih.f();
        this.b = pihVarF2;
        pht phtVarH = pgb.h(plk.P(pihVarF2, pihVarF).a(ngd.b, pgr.INSTANCE), bxe.a, pgr.INSTANCE);
        this.c = phtVarH;
        this.d = pfj.h(plk.ac(phtVarH, 4000L, TimeUnit.MILLISECONDS, scheduledExecutorService), Throwable.class, bxe.d, pgr.INSTANCE);
        if (!pihVar.isDone()) {
            pihVar.e(pfj.h(pgb.h(phtVarH, bxe.c, pgr.INSTANCE), Throwable.class, bxe.e, pgr.INSTANCE));
        }
        bqgVar.i().c(this);
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        if (this.c.isDone()) {
            return;
        }
        this.c.cancel(true);
    }
}
