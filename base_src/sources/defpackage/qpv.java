package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
final class qpv implements ThreadFactory {
    final /* synthetic */ AtomicInteger a;

    public qpv(AtomicInteger atomicInteger) {
        this.a = atomicInteger;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, qno.a("CommonPool-worker-", Integer.valueOf(this.a.incrementAndGet())));
        thread.setDaemon(true);
        return thread;
    }
}
