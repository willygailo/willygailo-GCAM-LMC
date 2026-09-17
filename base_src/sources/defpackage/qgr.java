package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class qgr extends AtomicInteger implements Runnable, qdg {
    private static final long serialVersionUID = 3880992722410194083L;
    final qbq a;
    final Object b;

    public qgr(qbq qbqVar, Object obj) {
        this.a = qbqVar;
        this.b = obj;
    }

    @Override // defpackage.qdl
    public final void c() {
        lazySet(3);
    }

    @Override // defpackage.qdl
    public final Object gS() {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.b;
    }

    @Override // defpackage.qbz
    public final void gT() {
        set(3);
    }

    @Override // defpackage.qdl
    public final boolean gU(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.qbz
    public final boolean gV() {
        throw null;
    }

    @Override // defpackage.qdl
    public final boolean i() {
        return get() != 1;
    }

    @Override // defpackage.qdh
    public final int k() {
        lazySet(1);
        return 1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            this.a.e(this.b);
            if (get() == 2) {
                lazySet(3);
                this.a.gQ();
            }
        }
    }
}
