package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class fuk implements lie {
    public final AtomicReference a;

    public fuk(fum fumVar) {
        AtomicReference atomicReference = new AtomicReference();
        this.a = atomicReference;
        atomicReference.set(fumVar);
    }

    public final void a() {
        this.a.set(null);
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        fum fumVar = (fum) this.a.getAndSet(null);
        if (fumVar != null) {
            fumVar.b();
        }
    }
}
