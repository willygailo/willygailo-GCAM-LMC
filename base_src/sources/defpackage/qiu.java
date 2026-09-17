package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class qiu extends qbs implements qbz {
    public final ScheduledExecutorService b;
    public volatile boolean c;

    public qiu(ThreadFactory threadFactory) {
        this.b = qja.a(threadFactory);
    }

    @Override // defpackage.qbs
    public final void c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.c) {
            qcs qcsVar = qcs.INSTANCE;
        } else {
            f(runnable, j, timeUnit, null);
        }
    }

    public final qbz e(Runnable runnable, long j, TimeUnit timeUnit) {
        qmd.S(runnable);
        qix qixVar = new qix(runnable);
        try {
            qixVar.b(j <= 0 ? this.b.submit(qixVar) : this.b.schedule(qixVar, j, timeUnit));
            return qixVar;
        } catch (RejectedExecutionException e) {
            qmd.R(e);
            return qcs.INSTANCE;
        }
    }

    public final void f(Runnable runnable, long j, TimeUnit timeUnit, qcq qcqVar) {
        qmd.S(runnable);
        qiy qiyVar = new qiy(runnable, qcqVar);
        if (qcqVar == null || qcqVar.b(qiyVar)) {
            try {
                qiyVar.b(j <= 0 ? this.b.submit((Callable) qiyVar) : this.b.schedule((Callable) qiyVar, j, timeUnit));
            } catch (RejectedExecutionException e) {
                if (qcqVar != null) {
                    qcqVar.e(qiyVar);
                }
                qmd.R(e);
            }
        }
    }

    @Override // defpackage.qbz
    public final void gT() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.shutdownNow();
    }

    @Override // defpackage.qbz
    public final boolean gV() {
        throw null;
    }
}
