package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class qds implements qbe {
    final AtomicReference a;
    final qbe b;

    public qds(AtomicReference atomicReference, qbe qbeVar) {
        this.a = atomicReference;
        this.b = qbeVar;
    }

    @Override // defpackage.qbe
    public final void b(Throwable th) {
        this.b.b(th);
    }

    @Override // defpackage.qbe
    public final void e() {
        this.b.e();
    }

    @Override // defpackage.qbe
    public final void gR(qbz qbzVar) {
        qcr.h(this.a, qbzVar);
    }
}
