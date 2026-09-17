package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class cux {
    public final AtomicInteger a = new AtomicInteger(0);
    public final AtomicInteger b = new AtomicInteger(0);
    public final AtomicInteger c = new AtomicInteger(0);

    public final int a() {
        return this.a.get();
    }

    public final int b() {
        return this.b.get();
    }

    public final int c() {
        return this.c.incrementAndGet();
    }
}
