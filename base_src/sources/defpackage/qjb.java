package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class qjb extends qbs {
    final ScheduledExecutorService a;
    final qby b = new qby();
    volatile boolean c;

    public qjb(ScheduledExecutorService scheduledExecutorService) {
        this.a = scheduledExecutorService;
    }

    @Override // defpackage.qbs
    public final void c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.c) {
            qcs qcsVar = qcs.INSTANCE;
            return;
        }
        qmd.S(runnable);
        qiy qiyVar = new qiy(runnable, this.b);
        this.b.b(qiyVar);
        try {
            qiyVar.b(j <= 0 ? this.a.submit((Callable) qiyVar) : this.a.schedule((Callable) qiyVar, j, timeUnit));
        } catch (RejectedExecutionException e) {
            gT();
            qmd.R(e);
            qcs qcsVar2 = qcs.INSTANCE;
        }
    }

    @Override // defpackage.qbz
    public final void gT() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.gT();
    }

    @Override // defpackage.qbz
    public final boolean gV() {
        throw null;
    }
}
