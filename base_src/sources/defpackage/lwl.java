package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class lwl extends maa {
    private final AtomicBoolean a;

    public lwl(mad madVar) {
        super(madVar);
        this.a = new AtomicBoolean(false);
    }

    @Override // defpackage.maa, defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        if (this.a.getAndSet(true)) {
            return;
        }
        super.close();
    }
}
