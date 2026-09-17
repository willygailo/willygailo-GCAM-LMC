package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class beb implements ThreadFactory {
    final boolean a;
    private final ThreadFactory b;
    private final String c;
    private final AtomicInteger d = new AtomicInteger();

    public beb(ThreadFactory threadFactory, String str, boolean z) {
        this.b = threadFactory;
        this.c = str;
        this.a = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.b.newThread(new bea(this, runnable));
        String str = this.c;
        int andIncrement = this.d.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25);
        sb.append("glide-");
        sb.append(str);
        sb.append("-thread-");
        sb.append(andIncrement);
        threadNewThread.setName(sb.toString());
        return threadNewThread;
    }
}
