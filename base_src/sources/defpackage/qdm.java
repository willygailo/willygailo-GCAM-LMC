package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qdm implements qbq, qdg {
    protected final qbq a;
    protected qbz b;
    protected qdg c;
    protected boolean d;

    public qdm(qbq qbqVar) {
        this.a = qbqVar;
    }

    @Override // defpackage.qbq
    public void b(Throwable th) {
        if (this.d) {
            qmd.R(th);
        } else {
            this.d = true;
            this.a.b(th);
        }
    }

    @Override // defpackage.qdl
    public void c() {
        this.c.c();
    }

    protected final void f(Throwable th) {
        qmd.Y(th);
        this.b.gT();
        b(th);
    }

    @Override // defpackage.qbq
    public void gQ() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.a.gQ();
    }

    @Override // defpackage.qbq
    public final void gR(qbz qbzVar) {
        if (qcr.f(this.b, qbzVar)) {
            this.b = qbzVar;
            if (qbzVar instanceof qdg) {
                this.c = (qdg) qbzVar;
            }
            this.a.gR(this);
        }
    }

    @Override // defpackage.qbz
    public final void gT() {
        this.b.gT();
    }

    @Override // defpackage.qdl
    public final boolean gU(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.qbz
    public final boolean gV() {
        throw null;
    }

    @Override // defpackage.qdl
    public final boolean i() {
        return this.c.i();
    }
}
