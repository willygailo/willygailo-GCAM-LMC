package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class qdr extends AtomicReference implements qbq, qbz {
    private static final long serialVersionUID = -7251123623727029452L;
    final qcn a;
    final qcn b;

    public qdr(qcn qcnVar, qcn qcnVar2) {
        this.a = qcnVar;
        this.b = qcnVar2;
    }

    @Override // defpackage.qbq
    public final void b(Throwable th) {
        if (gV()) {
            qmd.R(th);
            return;
        }
        lazySet(qcr.DISPOSED);
        try {
            this.b.a(th);
        } catch (Throwable th2) {
            qmd.Y(th2);
            qmd.R(new qcg(th, th2));
        }
    }

    @Override // defpackage.qbq
    public final void e(Object obj) {
        if (gV()) {
            return;
        }
        try {
            this.a.a(obj);
        } catch (Throwable th) {
            qmd.Y(th);
            ((qbz) get()).gT();
            b(th);
        }
    }

    @Override // defpackage.qbq
    public final void gQ() {
        if (gV()) {
            return;
        }
        lazySet(qcr.DISPOSED);
    }

    @Override // defpackage.qbq
    public final void gR(qbz qbzVar) {
        qcr.e(this, qbzVar);
    }

    @Override // defpackage.qbz
    public final void gT() {
        qcr.g(this);
    }

    @Override // defpackage.qbz
    public final boolean gV() {
        return get() == qcr.DISPOSED;
    }
}
