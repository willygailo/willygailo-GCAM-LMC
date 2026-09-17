package defpackage;

/* JADX INFO: loaded from: classes2.dex */
class ixu extends ixk {
    final /* synthetic */ ixx a;

    public ixu(ixx ixxVar) {
        this.a = ixxVar;
    }

    @Override // defpackage.ixk
    public void a() {
        this.a.m = true;
    }

    @Override // defpackage.ixk
    public void c() {
    }

    @Override // defpackage.ixk
    public void d() {
    }

    @Override // defpackage.ixk, defpackage.ihs, defpackage.iht
    public final void f() {
        ixx ixxVar = this.a;
        ixxVar.n = ixxVar.i.d();
        this.a.s().d = true;
        this.a.w();
        this.a.A(jrl.SLOW_MOTION);
        this.a.a.v(true);
        kas kasVar = this.a.a;
        if (((kbi) kasVar).L) {
            kasVar.h();
        }
        this.a.c.b();
        this.a.t();
        this.a.b.j(jrl.SLOW_MOTION, true);
        if (this.a.k.k(dcu.J)) {
            this.a.b.m();
            return;
        }
        this.a.b.l(false);
        this.a.b.c();
        this.a.o.c(jri.b(jrl.SLOW_MOTION).d(this.a.q()), jri.b(jrl.SLOW_MOTION).c(this.a.q()));
        this.a.o.a();
    }

    @Override // defpackage.ixk, defpackage.ihs, defpackage.iht
    public final void g() {
        ixx ixxVar = this.a;
        lwd lwdVar = ixxVar.n;
        if (lwdVar != null) {
            ixxVar.i.g(lwdVar);
        }
        this.a.s().d = false;
        this.a.a.v(false);
        this.a.c.a();
        this.a.g.c();
        if (this.a.k.k(dcu.J)) {
            this.a.f.c();
        } else {
            this.a.o.b();
        }
    }

    @Override // defpackage.ixk
    public void i() {
    }

    @Override // defpackage.ixk
    public void k() {
    }

    @Override // defpackage.ixk
    public void l() {
    }

    @Override // defpackage.ixk
    public void p() {
    }
}
