package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class qga extends AtomicInteger implements qbq, qbz {
    private static final long serialVersionUID = 8600231336733376951L;
    final qbq a;
    final qco e;
    qbz g;
    volatile boolean h;
    final qby b = new qby();
    final qjo d = new qjo();
    final AtomicInteger c = new AtomicInteger(1);
    final AtomicReference f = new AtomicReference();

    public qga(qbq qbqVar, qco qcoVar) {
        this.a = qbqVar;
        this.e = qcoVar;
    }

    @Override // defpackage.qbq
    public final void b(Throwable th) {
        this.c.decrementAndGet();
        if (!qjq.c(this.d, th)) {
            qmd.R(th);
        } else {
            this.b.gT();
            g();
        }
    }

    @Override // defpackage.qbq
    public final void e(Object obj) {
        try {
            qbj qbjVar = ((aiv) this.e).a;
            this.c.getAndIncrement();
            qfz qfzVar = new qfz(this);
            if (this.h || !this.b.b(qfzVar)) {
                return;
            }
            qbjVar.a(qfzVar);
        } catch (Throwable th) {
            qmd.Y(th);
            this.g.gT();
            b(th);
        }
    }

    final void f() {
        qid qidVar = (qid) this.f.get();
        if (qidVar != null) {
            qidVar.c();
        }
    }

    final void g() {
        if (getAndIncrement() == 0) {
            h();
        }
    }

    @Override // defpackage.qbq
    public final void gQ() {
        this.c.decrementAndGet();
        g();
    }

    @Override // defpackage.qbq
    public final void gR(qbz qbzVar) {
        if (qcr.f(this.g, qbzVar)) {
            this.g = qbzVar;
            this.a.gR(this);
        }
    }

    @Override // defpackage.qbz
    public final void gT() {
        this.h = true;
        this.g.gT();
        this.b.gT();
    }

    @Override // defpackage.qbz
    public final boolean gV() {
        throw null;
    }

    final void h() {
        qbq qbqVar = this.a;
        AtomicInteger atomicInteger = this.c;
        AtomicReference atomicReference = this.f;
        int iAddAndGet = 1;
        while (!this.h) {
            if (((Throwable) this.d.get()) != null) {
                Throwable thB = qjq.b(this.d);
                f();
                qbqVar.b(thB);
                return;
            }
            int i = atomicInteger.get();
            qid qidVar = (qid) atomicReference.get();
            Object objGS = qidVar != null ? qidVar.gS() : null;
            if (i == 0) {
                if (objGS == null) {
                    Throwable thB2 = qjq.b(this.d);
                    if (thB2 != null) {
                        qbqVar.b(thB2);
                        return;
                    } else {
                        qbqVar.gQ();
                        return;
                    }
                }
            } else if (objGS == null) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            qbqVar.e(objGS);
        }
        f();
    }
}
