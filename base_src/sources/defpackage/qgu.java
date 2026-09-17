package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class qgu extends AtomicReference implements qbq, qbz {
    private static final long serialVersionUID = 8094547886072529208L;
    final qbq a;
    final AtomicReference b = new AtomicReference();

    public qgu(qbq qbqVar) {
        this.a = qbqVar;
    }

    @Override // defpackage.qbq
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.qbq
    public final void e(Object obj) {
        this.a.e(obj);
    }

    @Override // defpackage.qbq
    public final void gQ() {
        this.a.gQ();
    }

    @Override // defpackage.qbq
    public final void gR(qbz qbzVar) {
        qcr.e(this.b, qbzVar);
    }

    @Override // defpackage.qbz
    public final void gT() {
        qcr.g(this.b);
        qcr.g(this);
    }

    @Override // defpackage.qbz
    public final boolean gV() {
        throw null;
    }
}
