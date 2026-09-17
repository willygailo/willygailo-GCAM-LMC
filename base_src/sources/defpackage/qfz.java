package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class qfz extends AtomicReference implements qbk, qbz {
    private static final long serialVersionUID = -502562646270949838L;
    final /* synthetic */ qga a;

    public qfz(qga qgaVar) {
        this.a = qgaVar;
    }

    @Override // defpackage.qbk
    public final void a() {
        qga qgaVar = this.a;
        qgaVar.b.c(this);
        if (qgaVar.get() != 0 || !qgaVar.compareAndSet(0, 1)) {
            qgaVar.c.decrementAndGet();
            qgaVar.g();
            return;
        }
        int iDecrementAndGet = qgaVar.c.decrementAndGet();
        qid qidVar = (qid) qgaVar.f.get();
        if (iDecrementAndGet != 0 || (qidVar != null && !qidVar.i())) {
            if (qgaVar.decrementAndGet() == 0) {
                return;
            }
            qgaVar.h();
        } else {
            Throwable thB = qjq.b(qgaVar.d);
            if (thB != null) {
                qgaVar.a.b(thB);
            } else {
                qgaVar.a.gQ();
            }
        }
    }

    @Override // defpackage.qbk
    public final void b(Throwable th) {
        qga qgaVar = this.a;
        qgaVar.b.c(this);
        if (!qjq.c(qgaVar.d, th)) {
            qmd.R(th);
            return;
        }
        qgaVar.g.gT();
        qgaVar.b.gT();
        qgaVar.c.decrementAndGet();
        qgaVar.g();
    }

    @Override // defpackage.qbk
    public final void c(qbz qbzVar) {
        qcr.e(this, qbzVar);
    }

    @Override // defpackage.qbk
    public final void d(Object obj) {
        qid qidVar;
        qga qgaVar = this.a;
        qgaVar.b.c(this);
        if (qgaVar.get() == 0 && qgaVar.compareAndSet(0, 1)) {
            qgaVar.a.e(obj);
            int iDecrementAndGet = qgaVar.c.decrementAndGet();
            qid qidVar2 = (qid) qgaVar.f.get();
            if (iDecrementAndGet == 0 && (qidVar2 == null || qidVar2.i())) {
                Throwable thB = qjq.b(qgaVar.d);
                if (thB != null) {
                    qgaVar.a.b(thB);
                    return;
                } else {
                    qgaVar.a.gQ();
                    return;
                }
            }
            if (qgaVar.decrementAndGet() == 0) {
                return;
            }
        } else {
            do {
                qidVar = (qid) qgaVar.f.get();
                if (qidVar != null) {
                    break;
                } else {
                    qidVar = new qid(qbh.a);
                }
            } while (!qgaVar.f.compareAndSet(null, qidVar));
            synchronized (qidVar) {
                qidVar.gU(obj);
            }
            qgaVar.c.decrementAndGet();
            if (qgaVar.getAndIncrement() != 0) {
                return;
            }
        }
        qgaVar.h();
    }

    @Override // defpackage.qbz
    public final void gT() {
        qcr.g(this);
    }

    @Override // defpackage.qbz
    public final boolean gV() {
        throw null;
    }
}
