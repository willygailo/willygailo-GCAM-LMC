package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class phu extends FutureTask implements pht {
    private final pgu a;

    public phu(Callable callable) {
        super(callable);
        this.a = new pgu();
    }

    public static phu a(Callable callable) {
        return new phu(callable);
    }

    @Override // defpackage.pht
    public final void d(Runnable runnable, Executor executor) {
        pgu pguVar = this.a;
        runnable.getClass();
        executor.getClass();
        synchronized (pguVar) {
            if (pguVar.b) {
                pgu.a(runnable, executor);
            } else {
                pguVar.a = new pgt(runnable, executor, pguVar.a);
            }
        }
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        pgu pguVar = this.a;
        synchronized (pguVar) {
            if (pguVar.b) {
                return;
            }
            pguVar.b = true;
            pgt pgtVar = pguVar.a;
            pgt pgtVar2 = null;
            pguVar.a = null;
            while (pgtVar != null) {
                pgt pgtVar3 = pgtVar.c;
                pgtVar.c = pgtVar2;
                pgtVar2 = pgtVar;
                pgtVar = pgtVar3;
            }
            while (pgtVar2 != null) {
                pgu.a(pgtVar2.a, pgtVar2.b);
                pgtVar2 = pgtVar2.c;
            }
        }
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        return nanos <= 2147483647999999999L ? super.get(j, timeUnit) : super.get(Math.min(nanos, 2147483647999999999L), TimeUnit.NANOSECONDS);
    }
}
