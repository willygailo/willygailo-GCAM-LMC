package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qgq extends qbm {
    final qjs a;
    qgo b;

    public qgq(qjs qjsVar) {
        this.a = qjsVar;
    }

    final void b(qgo qgoVar) {
        synchronized (this) {
            qgo qgoVar2 = this.b;
            if (qgoVar2 != null && qgoVar2 == qgoVar) {
                qbz qbzVar = qgoVar.b;
                long j = qgoVar.c - 1;
                qgoVar.c = j;
                if (j == 0) {
                    this.b = null;
                    ((qgn) this.a).b((qbz) qgoVar.get());
                }
            }
        }
    }

    final void c(qgo qgoVar) {
        synchronized (this) {
            if (qgoVar.c == 0 && qgoVar == this.b) {
                this.b = null;
                qbz qbzVar = (qbz) qgoVar.get();
                qcr.g(qgoVar);
                qjs qjsVar = this.a;
                if (qbzVar == null) {
                    qgoVar.e = true;
                } else {
                    ((qgn) qjsVar).b(qbzVar);
                }
            }
        }
    }

    @Override // defpackage.qbm
    protected final void g(qbq qbqVar) {
        qgo qgoVar;
        boolean z;
        qgn qgnVar;
        qgm qgmVar;
        synchronized (this) {
            qgoVar = this.b;
            if (qgoVar == null) {
                qgoVar = new qgo(this);
                this.b = qgoVar;
            }
            long j = qgoVar.c + 1;
            qgoVar.c = j;
            if (qgoVar.d || j != 1) {
                z = false;
            } else {
                qgoVar.d = true;
                z = true;
            }
        }
        this.a.f(new qgp(qbqVar, this, qgoVar));
        if (z) {
            qjs qjsVar = this.a;
            while (true) {
                qgnVar = (qgn) qjsVar;
                qgmVar = (qgm) qgnVar.b.get();
                if (qgmVar != null && qgmVar.get() != qgm.b) {
                    break;
                }
                qgm qgmVar2 = new qgm(qgnVar.b);
                if (qgnVar.b.compareAndSet(qgmVar, qgmVar2)) {
                    qgmVar = qgmVar2;
                    break;
                }
            }
            boolean z2 = !qgmVar.c.get() && qgmVar.c.compareAndSet(false, true);
            try {
                qgoVar.a(qgmVar);
                if (z2) {
                    qgnVar.a.f(qgmVar);
                }
            } catch (Throwable th) {
                qmd.Y(th);
                throw qjq.a(th);
            }
        }
    }
}
