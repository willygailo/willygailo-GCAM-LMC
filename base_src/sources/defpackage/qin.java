package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class qin extends qbs implements Runnable {
    final Executor a;
    volatile boolean c;
    final AtomicInteger d = new AtomicInteger();
    final qby e = new qby();
    final qib b = new qib();

    public qin(Executor executor) {
        this.a = executor;
    }

    @Override // defpackage.qbs
    public final qbz b(Runnable runnable) {
        if (this.c) {
            return qcs.INSTANCE;
        }
        qmd.S(runnable);
        qil qilVar = new qil(runnable);
        this.b.gU(qilVar);
        if (this.d.getAndIncrement() == 0) {
            try {
                this.a.execute(this);
            } catch (RejectedExecutionException e) {
                this.c = true;
                this.b.c();
                qmd.R(e);
                return qcs.INSTANCE;
            }
        }
        return qilVar;
    }

    @Override // defpackage.qbs
    public final void c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (j <= 0) {
            b(runnable);
            return;
        }
        if (this.c) {
            qcs qcsVar = qcs.INSTANCE;
            return;
        }
        qcu qcuVar = new qcu();
        qcu qcuVar2 = new qcu(qcuVar);
        qmd.S(runnable);
        qiy qiyVar = new qiy(new qim(this, qcuVar2, runnable), this.e);
        this.e.b(qiyVar);
        Executor executor = this.a;
        if (executor instanceof ScheduledExecutorService) {
            try {
                qiyVar.b(((ScheduledExecutorService) executor).schedule((Callable) qiyVar, j, timeUnit));
            } catch (RejectedExecutionException e) {
                this.c = true;
                qmd.R(e);
                qcs qcsVar2 = qcs.INSTANCE;
                return;
            }
        } else {
            qiyVar.b(new qii(qio.a.c(qiyVar, j, timeUnit)));
        }
        qcr.h(qcuVar, qiyVar);
    }

    @Override // defpackage.qbz
    public final void gT() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.e.gT();
        if (this.d.getAndIncrement() == 0) {
            this.b.c();
        }
    }

    @Override // defpackage.qbz
    public final boolean gV() {
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qib qibVar = this.b;
        int iAddAndGet = 1;
        while (!this.c) {
            while (true) {
                Runnable runnable = (Runnable) qibVar.gS();
                if (runnable == null) {
                    break;
                }
                runnable.run();
                if (this.c) {
                    qibVar.c();
                    return;
                }
            }
            if (this.c) {
                qibVar.c();
                return;
            } else {
                iAddAndGet = this.d.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
        qibVar.c();
    }
}
