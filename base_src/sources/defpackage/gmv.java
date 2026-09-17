package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class gmv extends maa {
    private final AtomicBoolean a;

    public gmv(mad madVar) {
        super(madVar);
        this.a = new AtomicBoolean(false);
    }

    @Override // defpackage.maa, defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        super.close();
        this.a.getAndSet(true);
    }
}
