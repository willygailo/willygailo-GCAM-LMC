package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
final class qew extends qjh implements qbi {
    private static final long serialVersionUID = -2514538129242366402L;
    final qym a;
    final qdk b;
    qyn c;
    volatile boolean d;
    volatile boolean e;
    Throwable f;
    final AtomicLong g = new AtomicLong();
    boolean h;

    public qew(qym qymVar, int i) {
        this.a = qymVar;
        this.b = new qid(i);
    }

    @Override // defpackage.qbi, defpackage.qym
    public final void a(qyn qynVar) {
        if (qjn.e(this.c, qynVar)) {
            this.c = qynVar;
            this.a.a(this);
            qynVar.gP(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.qdl
    public final void c() {
        this.b.c();
    }

    @Override // defpackage.qym
    public final void e(Object obj) {
        this.b.gU(obj);
        if (this.h) {
            this.a.e(null);
        } else {
            f();
        }
    }

    final void f() {
        if (getAndIncrement() == 0) {
            qdk qdkVar = this.b;
            qym qymVar = this.a;
            int iAddAndGet = 1;
            while (!h(this.e, qdkVar.i(), qymVar)) {
                long j = this.g.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z = this.e;
                    Object objGS = qdkVar.gS();
                    boolean z2 = objGS == null;
                    if (h(z, z2, qymVar)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    qymVar.e(objGS);
                    j2++;
                }
                if (j2 == j && h(this.e, qdkVar.i(), qymVar)) {
                    return;
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    this.g.addAndGet(-j2);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    @Override // defpackage.qyn
    public final void g() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.c.g();
        if (getAndIncrement() == 0) {
            this.b.c();
        }
    }

    @Override // defpackage.qym
    public final void gO() {
        this.e = true;
        if (this.h) {
            this.a.gO();
        } else {
            f();
        }
    }

    @Override // defpackage.qyn
    public final void gP(long j) {
        if (this.h || !qjn.d(j)) {
            return;
        }
        qmd.U(this.g, j);
        f();
    }

    @Override // defpackage.qdl
    public final Object gS() {
        return this.b.gS();
    }

    final boolean h(boolean z, boolean z2, qym qymVar) {
        if (this.d) {
            this.b.c();
            return true;
        }
        if (!z) {
            return false;
        }
        Throwable th = this.f;
        if (th != null) {
            this.b.c();
            qymVar.j(th);
            return true;
        }
        if (!z2) {
            return false;
        }
        qymVar.gO();
        return true;
    }

    @Override // defpackage.qdl
    public final boolean i() {
        return this.b.i();
    }

    @Override // defpackage.qym
    public final void j(Throwable th) {
        this.f = th;
        this.e = true;
        if (this.h) {
            this.a.j(th);
        } else {
            f();
        }
    }

    @Override // defpackage.qdh
    public final int k() {
        this.h = true;
        return 2;
    }
}
