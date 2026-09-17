package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class bwj implements lie {
    public final lap a;
    private final bwh b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public bwj(bwh bwhVar, lap lapVar) {
        this.b = bwhVar;
        this.a = lapVar;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        if (this.c.getAndSet(true)) {
            return;
        }
        this.b.execute(new bwi(this));
        this.b.close();
    }
}
