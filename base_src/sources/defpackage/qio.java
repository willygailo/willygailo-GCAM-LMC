package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class qio extends qbt {
    static final qbt a;
    final Executor b;

    static {
        qbt qbtVar = qka.a;
        qco qcoVar = qmd.h;
        a = qbtVar;
    }

    public qio(Executor executor) {
        this.b = executor;
    }

    @Override // defpackage.qbt
    public final qbs a() {
        return new qin(this.b);
    }

    @Override // defpackage.qbt
    public final qbz b(Runnable runnable) {
        qmd.S(runnable);
        try {
            if (this.b instanceof ExecutorService) {
                qix qixVar = new qix(runnable);
                qixVar.b(((ExecutorService) this.b).submit(qixVar));
                return qixVar;
            }
            qil qilVar = new qil(runnable);
            this.b.execute(qilVar);
            return qilVar;
        } catch (RejectedExecutionException e) {
            qmd.R(e);
            return qcs.INSTANCE;
        }
    }

    @Override // defpackage.qbt
    public final qbz c(Runnable runnable, long j, TimeUnit timeUnit) {
        qmd.S(runnable);
        if (!(this.b instanceof ScheduledExecutorService)) {
            qik qikVar = new qik(runnable);
            qcr.h(qikVar.a, a.c(new qij(this, qikVar), j, timeUnit));
            return qikVar;
        }
        try {
            qix qixVar = new qix(runnable);
            qixVar.b(((ScheduledExecutorService) this.b).schedule(qixVar, j, timeUnit));
            return qixVar;
        } catch (RejectedExecutionException e) {
            qmd.R(e);
            return qcs.INSTANCE;
        }
    }
}
