package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
abstract class qca extends AtomicReference implements qbz {
    private static final long serialVersionUID = 6537757548749041217L;

    public qca(Object obj) {
        super(obj);
    }

    protected abstract void b(Object obj);

    @Override // defpackage.qbz
    public final void gT() {
        Object andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        b(andSet);
    }

    @Override // defpackage.qbz
    public final boolean gV() {
        return get() == null;
    }
}
