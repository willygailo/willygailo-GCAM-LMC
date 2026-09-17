package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class qfu implements qbq, qbz {
    final qbq a;
    final qcn b;
    final qcn c;
    qbz d;
    boolean e;

    public qfu(qbq qbqVar, qcn qcnVar, qcn qcnVar2) {
        this.a = qbqVar;
        this.b = qcnVar;
        this.c = qcnVar2;
    }

    @Override // defpackage.qbq
    public final void b(Throwable th) {
        if (this.e) {
            qmd.R(th);
            return;
        }
        this.e = true;
        try {
            this.c.a(th);
        } catch (Throwable th2) {
            qmd.Y(th2);
            th = new qcg(th, th2);
        }
        this.a.b(th);
    }

    @Override // defpackage.qbq
    public final void e(Object obj) {
        if (this.e) {
            return;
        }
        try {
            this.b.a(obj);
            this.a.e(obj);
        } catch (Throwable th) {
            qmd.Y(th);
            this.d.gT();
            b(th);
        }
    }

    @Override // defpackage.qbq
    public final void gQ() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.a.gQ();
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
    }

    @Override // defpackage.qbz
    public final boolean gV() {
        throw null;
    }
}
