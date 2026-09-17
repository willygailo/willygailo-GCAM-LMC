package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
final class qha extends AtomicBoolean implements qbq, qbz {
    private static final long serialVersionUID = 1015244841293359600L;
    final qbq a;
    final qbt b;
    qbz c;

    public qha(qbq qbqVar, qbt qbtVar) {
        this.a = qbqVar;
        this.b = qbtVar;
    }

    @Override // defpackage.qbq
    public final void b(Throwable th) {
        if (get()) {
            qmd.R(th);
        } else {
            this.a.b(th);
        }
    }

    @Override // defpackage.qbq
    public final void e(Object obj) {
        if (get()) {
            return;
        }
        this.a.e(obj);
    }

    @Override // defpackage.qbq
    public final void gQ() {
        if (get()) {
            return;
        }
        this.a.gQ();
    }

    @Override // defpackage.qbq
    public final void gR(qbz qbzVar) {
        if (qcr.f(this.c, qbzVar)) {
            this.c = qbzVar;
            this.a.gR(this);
        }
    }

    @Override // defpackage.qbz
    public final void gT() {
        if (compareAndSet(false, true)) {
            this.b.b(new qgz(this));
        }
    }

    @Override // defpackage.qbz
    public final boolean gV() {
        throw null;
    }
}
