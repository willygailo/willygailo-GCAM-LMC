package defpackage;

/* JADX INFO: loaded from: classes2.dex */
class ixz extends ixy {
    final /* synthetic */ iyb a;

    public ixz(iyb iybVar) {
        this.a = iybVar;
    }

    @Override // defpackage.ixy
    public void b() {
    }

    @Override // defpackage.ixy, defpackage.ihs, defpackage.iht
    public final void f() {
        this.a.b.fB(true);
        iyb iybVar = this.a;
        iybVar.k = iybVar.a.r();
        this.a.a.l(false);
        this.a.i.b(false);
        this.a.h.v(false);
        this.a.c.startCountdown();
        this.a.a.v(false);
        this.a.d.L();
        this.a.e.d(false);
        this.a.f.l();
        jxn.c();
    }

    @Override // defpackage.ixy, defpackage.ihs, defpackage.iht
    public final void g() {
        this.a.b.fB(false);
        iyb iybVar = this.a;
        iybVar.a.l(iybVar.k);
        this.a.c.stopCountdown();
        iyb iybVar2 = this.a;
        iybVar2.a.v(iybVar2.k);
        this.a.d.ac();
        this.a.e.d(true);
        this.a.f.j();
        this.a.h.v(true);
        jxn.d();
        if (((Boolean) ((lce) this.a.l.a).d).booleanValue() || (!this.a.i.f() && !this.a.j.k(ddl.br))) {
            this.a.i.g(false);
        }
        kas kasVar = this.a.h;
        if (!((kbi) kasVar).L && !kasVar.E()) {
            iyb iybVar3 = this.a;
            if (!iybVar3.h.D((jrl) iybVar3.g.fA())) {
                return;
            }
        }
        this.a.h.h();
    }
}
