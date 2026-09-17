package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class cpb implements lie {
    public final lfj a;
    private final AtomicLong c = new AtomicLong(0);
    public cpa b = cpa.FPS_30;

    public cpb(lfj lfjVar) {
        this.a = lfjVar;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        this.c.set(0L);
        this.b = cpa.FPS_30;
    }
}
