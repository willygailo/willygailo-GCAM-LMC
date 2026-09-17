package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
final class qgp extends AtomicBoolean implements qbq, qbz {
    private static final long serialVersionUID = -7419642935409022375L;
    final qbq a;
    final qgq b;
    final qgo c;
    qbz d;

    public qgp(qbq qbqVar, qgq qgqVar, qgo qgoVar) {
        this.a = qbqVar;
        this.b = qgqVar;
        this.c = qgoVar;
    }

    @Override // defpackage.qbq
    public final void b(Throwable th) {
        if (!compareAndSet(false, true)) {
            qmd.R(th);
        } else {
            this.b.b(this.c);
            this.a.b(th);
        }
    }

    @Override // defpackage.qbq
    public final void e(Object obj) {
        this.a.e(obj);
    }

    @Override // defpackage.qbq
    public final void gQ() {
        if (compareAndSet(false, true)) {
            this.b.b(this.c);
            this.a.gQ();
        }
    }

    @Override // defpackage.qbq
    public final void gR(qbz qbzVar) {
        if (qcr.f(this.d, qbzVar)) {
            this.d = qbzVar;
            this.a.gR(this);
        }
    }

    @Override // defpackage.qbz
    public final void gT() {
        this.d.gT();
        if (compareAndSet(false, true)) {
            qgq qgqVar = this.b;
            qgo qgoVar = this.c;
            synchronized (qgqVar) {
                qgo qgoVar2 = qgqVar.b;
                if (qgoVar2 != null && qgoVar2 == qgoVar) {
                    long j = qgoVar.c - 1;
                    qgoVar.c = j;
                    if (j == 0 && qgoVar.d) {
                        qgqVar.c(qgoVar);
                    }
                }
            }
        }
    }

    @Override // defpackage.qbz
    public final boolean gV() {
        throw null;
    }
}
