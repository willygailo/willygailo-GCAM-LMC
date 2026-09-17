package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
final class pii implements ThreadFactory {
    final /* synthetic */ ThreadFactory a;
    final /* synthetic */ String b;
    final /* synthetic */ AtomicLong c;

    public pii(ThreadFactory threadFactory, String str, AtomicLong atomicLong) {
        this.a = threadFactory;
        this.b = str;
        this.c = atomicLong;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.a.newThread(runnable);
        String str = this.b;
        if (str != null) {
            AtomicLong atomicLong = this.c;
            atomicLong.getClass();
            threadNewThread.setName(pij.a(str, Long.valueOf(atomicLong.getAndIncrement())));
        }
        return threadNewThread;
    }
}
