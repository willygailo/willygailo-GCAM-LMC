package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class qgx implements qbq, qbz {
    final qbq a;
    boolean b;
    qbz c;
    long d = 1;

    public qgx(qbq qbqVar) {
        this.a = qbqVar;
    }

    @Override // defpackage.qbq
    public final void b(Throwable th) {
        if (this.b) {
            qmd.R(th);
            return;
        }
        this.b = true;
        this.c.gT();
        this.a.b(th);
    }

    @Override // defpackage.qbq
    public final void e(Object obj) {
        if (this.b) {
            return;
        }
        long j = this.d;
        long j2 = (-1) + j;
        this.d = j2;
        if (j > 0) {
            this.a.e(obj);
            if (j2 == 0) {
                gQ();
            }
        }
    }

    @Override // defpackage.qbq
    public final void gQ() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.c.gT();
        this.a.gQ();
    }

    @Override // defpackage.qbq
    public final void gR(qbz qbzVar) {
        if (qcr.f(this.c, qbzVar)) {
            this.c = qbzVar;
            if (this.d != 0) {
                this.a.gR(this);
                return;
            }
            this.b = true;
            qbzVar.gT();
            qcs.e(this.a);
        }
    }

    @Override // defpackage.qbz
    public final void gT() {
        this.c.gT();
    }

    @Override // defpackage.qbz
    public final boolean gV() {
        throw null;
    }
}
