package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class qhv extends qjj implements qbv {
    private static final long serialVersionUID = 187782011903685568L;
    qbz a;

    public qhv(qym qymVar) {
        super(qymVar);
    }

    @Override // defpackage.qbv
    public final void b(Throwable th) {
        this.b.j(th);
    }

    @Override // defpackage.qbv
    public final void d(Object obj) {
        int i = get();
        while (i != 8) {
            if ((i & (-3)) != 0) {
                return;
            }
            if (i == 2) {
                lazySet(3);
                qym qymVar = this.b;
                qymVar.e(obj);
                if (get() != 4) {
                    qymVar.gO();
                    return;
                }
                return;
            }
            this.c = obj;
            if (compareAndSet(0, 1)) {
                return;
            }
            i = get();
            if (i == 4) {
                this.c = null;
                return;
            }
        }
        this.c = obj;
        lazySet(16);
        qym qymVar2 = this.b;
        qymVar2.e(obj);
        if (get() != 4) {
            qymVar2.gO();
        }
    }

    @Override // defpackage.qjj, defpackage.qyn
    public final void g() {
        super.g();
        this.a.gT();
    }

    @Override // defpackage.qbv
    public final void gR(qbz qbzVar) {
        if (qcr.f(this.a, qbzVar)) {
            this.a = qbzVar;
            this.b.a(this);
        }
    }
}
