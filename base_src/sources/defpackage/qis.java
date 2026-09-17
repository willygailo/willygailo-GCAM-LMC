package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class qis extends qbt {
    static final qiw a;
    static final qiw b;
    static final qir c;
    static final qip d;
    final ThreadFactory e;
    final AtomicReference f;
    private static final TimeUnit h = TimeUnit.SECONDS;
    private static final long g = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    static {
        qir qirVar = new qir(new qiw("RxCachedThreadSchedulerShutdown"));
        c = qirVar;
        qirVar.gT();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        qiw qiwVar = new qiw("RxCachedThreadScheduler", iMax);
        a = qiwVar;
        b = new qiw("RxCachedWorkerPoolEvictor", iMax);
        qip qipVar = new qip(0L, null, qiwVar);
        d = qipVar;
        qipVar.a();
    }

    public qis() {
        qiw qiwVar = a;
        this.e = qiwVar;
        qip qipVar = d;
        AtomicReference atomicReference = new AtomicReference(qipVar);
        this.f = atomicReference;
        qip qipVar2 = new qip(g, h, qiwVar);
        if (atomicReference.compareAndSet(qipVar, qipVar2)) {
            return;
        }
        qipVar2.a();
    }

    @Override // defpackage.qbt
    public final qbs a() {
        return new qiq((qip) this.f.get());
    }
}
