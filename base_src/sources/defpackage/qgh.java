package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class qgh extends AtomicReference implements qbz {
    private static final long serialVersionUID = -1100270633763673112L;
    final qbq a;

    public qgh(qbq qbqVar) {
        this.a = qbqVar;
    }

    @Override // defpackage.qbz
    public final void gT() {
        Object andSet = getAndSet(this);
        if (andSet == null || andSet == this) {
            return;
        }
        ((qgi) andSet).f(this);
    }

    @Override // defpackage.qbz
    public final boolean gV() {
        throw null;
    }
}
