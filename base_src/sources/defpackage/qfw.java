package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class qfw extends AtomicReference implements qbq {
    private static final long serialVersionUID = -4606175640614850599L;
    final long a;
    final qfx b;
    volatile boolean c;
    volatile qdl d;
    int e;

    public qfw(qfx qfxVar, long j) {
        this.a = j;
        this.b = qfxVar;
    }

    @Override // defpackage.qbq
    public final void b(Throwable th) {
        if (!qjq.c(this.b.i, th)) {
            qmd.R(th);
            return;
        }
        qfx qfxVar = this.b;
        boolean z = qfxVar.d;
        qfxVar.k();
        this.c = true;
        this.b.f();
    }

    @Override // defpackage.qbq
    public final void e(Object obj) {
        if (this.e != 0) {
            this.b.f();
            return;
        }
        qfx qfxVar = this.b;
        if (qfxVar.get() == 0 && qfxVar.compareAndSet(0, 1)) {
            qfxVar.c.e(obj);
            if (qfxVar.decrementAndGet() == 0) {
                return;
            }
        } else {
            qdl qidVar = this.d;
            if (qidVar == null) {
                qidVar = new qid(qfxVar.f);
                this.d = qidVar;
            }
            qidVar.gU(obj);
            if (qfxVar.getAndIncrement() != 0) {
                return;
            }
        }
        qfxVar.g();
    }

    @Override // defpackage.qbq
    public final void gQ() {
        this.c = true;
        this.b.f();
    }

    @Override // defpackage.qbq
    public final void gR(qbz qbzVar) {
        if (qcr.e(this, qbzVar) && (qbzVar instanceof qdg)) {
            qdg qdgVar = (qdg) qbzVar;
            int iK = qdgVar.k();
            if (iK == 1) {
                this.e = 1;
                this.d = qdgVar;
                this.c = true;
                this.b.f();
                return;
            }
            if (iK == 2) {
                this.e = 2;
                this.d = qdgVar;
            }
        }
    }
}
