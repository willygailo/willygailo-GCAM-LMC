package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class qgf extends qdn implements Runnable, qbq {
    private static final long serialVersionUID = 6576896619930983584L;
    final qbq a;
    final qbs b;
    final int c;
    qdl d;
    qbz e;
    Throwable f;
    volatile boolean g;
    volatile boolean h;
    int i;
    boolean j;

    public qgf(qbq qbqVar, qbs qbsVar, int i) {
        this.a = qbqVar;
        this.b = qbsVar;
        this.c = i;
    }

    @Override // defpackage.qbq
    public final void b(Throwable th) {
        if (this.g) {
            qmd.R(th);
            return;
        }
        this.f = th;
        this.g = true;
        f();
    }

    @Override // defpackage.qdl
    public final void c() {
        this.d.c();
    }

    @Override // defpackage.qbq
    public final void e(Object obj) {
        if (this.g) {
            return;
        }
        if (this.i != 2) {
            this.d.gU(obj);
        }
        f();
    }

    final void f() {
        if (getAndIncrement() == 0) {
            this.b.b(this);
        }
    }

    final boolean g(boolean z, boolean z2, qbq qbqVar) {
        if (this.h) {
            this.d.c();
            return true;
        }
        if (!z) {
            return false;
        }
        Throwable th = this.f;
        if (th != null) {
            this.h = true;
            this.d.c();
            qbqVar.b(th);
            this.b.gT();
            return true;
        }
        if (!z2) {
            return false;
        }
        this.h = true;
        qbqVar.gQ();
        this.b.gT();
        return true;
    }

    @Override // defpackage.qbq
    public final void gQ() {
        if (this.g) {
            return;
        }
        this.g = true;
        f();
    }

    @Override // defpackage.qbq
    public final void gR(qbz qbzVar) {
        if (qcr.f(this.e, qbzVar)) {
            this.e = qbzVar;
            if (qbzVar instanceof qdg) {
                qdg qdgVar = (qdg) qbzVar;
                int iK = qdgVar.k();
                if (iK == 1) {
                    this.i = 1;
                    this.d = qdgVar;
                    this.g = true;
                    this.a.gR(this);
                    f();
                    return;
                }
                if (iK == 2) {
                    this.i = 2;
                    this.d = qdgVar;
                    this.a.gR(this);
                    return;
                }
            }
            this.d = new qid(this.c);
            this.a.gR(this);
        }
    }

    @Override // defpackage.qdl
    public final Object gS() {
        return this.d.gS();
    }

    @Override // defpackage.qbz
    public final void gT() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.e.gT();
        this.b.gT();
        if (getAndIncrement() == 0) {
            this.d.c();
        }
    }

    @Override // defpackage.qbz
    public final boolean gV() {
        throw null;
    }

    @Override // defpackage.qdl
    public final boolean i() {
        return this.d.i();
    }

    @Override // defpackage.qdh
    public final int k() {
        this.j = true;
        return 2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.j) {
            int iAddAndGet = 1;
            while (!this.h) {
                boolean z = this.g;
                Throwable th = this.f;
                if (z && th != null) {
                    this.h = true;
                    this.a.b(this.f);
                    this.b.gT();
                    return;
                }
                this.a.e(null);
                if (z) {
                    this.h = true;
                    Throwable th2 = this.f;
                    if (th2 != null) {
                        this.a.b(th2);
                    } else {
                        this.a.gQ();
                    }
                    this.b.gT();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            return;
        }
        qdl qdlVar = this.d;
        qbq qbqVar = this.a;
        int iAddAndGet2 = 1;
        while (!g(this.g, qdlVar.i(), qbqVar)) {
            while (true) {
                boolean z2 = this.g;
                try {
                    Object objGS = qdlVar.gS();
                    boolean z3 = objGS == null;
                    if (g(z2, z3, qbqVar)) {
                        return;
                    }
                    if (z3) {
                        break;
                    } else {
                        qbqVar.e(objGS);
                    }
                } catch (Throwable th3) {
                    qmd.Y(th3);
                    this.h = true;
                    this.e.gT();
                    qdlVar.c();
                    qbqVar.b(th3);
                    this.b.gT();
                    return;
                }
            }
            iAddAndGet2 = addAndGet(-iAddAndGet2);
            if (iAddAndGet2 == 0) {
                return;
            }
        }
    }
}
