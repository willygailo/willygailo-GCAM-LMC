package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qjf implements qbi, qdi, qde {
    protected final qym a;
    protected qyn b;
    protected qdi c;
    protected boolean d;
    final ntq e;

    public qjf(qym qymVar, ntq ntqVar) {
        this.a = qymVar;
        this.e = ntqVar;
    }

    @Override // defpackage.qbi, defpackage.qym
    public final void a(qyn qynVar) {
        if (qjn.e(this.b, qynVar)) {
            this.b = qynVar;
            if (qynVar instanceof qdi) {
                this.c = (qdi) qynVar;
            }
            this.a.a(this);
        }
    }

    @Override // defpackage.qdl
    public final void c() {
        this.c.c();
    }

    @Override // defpackage.qde
    public final boolean d(Object obj) {
        if (this.d) {
            return false;
        }
        try {
            boolean zA = this.e.a(obj);
            if (zA) {
                this.a.e(obj);
            }
            return zA;
        } catch (Throwable th) {
            qmd.Y(th);
            this.b.g();
            j(th);
            return true;
        }
    }

    @Override // defpackage.qym
    public final void e(Object obj) {
        if (d(obj)) {
            return;
        }
        this.b.gP(1L);
    }

    @Override // defpackage.qyn
    public final void g() {
        this.b.g();
    }

    @Override // defpackage.qym
    public final void gO() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.a.gO();
    }

    @Override // defpackage.qyn
    public final void gP(long j) {
        this.b.gP(j);
    }

    @Override // defpackage.qdl
    public final Object gS() {
        Object objGS;
        qdi qdiVar = this.c;
        ntq ntqVar = this.e;
        do {
            objGS = qdiVar.gS();
            if (objGS == null) {
                return null;
            }
        } while (!ntqVar.a(objGS));
        return objGS;
    }

    @Override // defpackage.qdl
    public final boolean gU(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.qdl
    public final boolean i() {
        return this.c.i();
    }

    @Override // defpackage.qym
    public final void j(Throwable th) {
        if (this.d) {
            qmd.R(th);
        } else {
            this.d = true;
            this.a.j(th);
        }
    }

    @Override // defpackage.qdh
    public final int k() {
        return 0;
    }
}
