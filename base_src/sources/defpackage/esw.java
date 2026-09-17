package defpackage;

/* JADX INFO: loaded from: classes.dex */
class esw extends esv {
    final /* synthetic */ eta b;

    public esw(eta etaVar) {
        this.b = etaVar;
    }

    @Override // defpackage.esv
    public void a() {
    }

    @Override // defpackage.esv
    public void b() {
    }

    @Override // defpackage.esv, defpackage.ihs, defpackage.iht
    public final void f() {
        this.b.h.p(false);
        this.b.i.setClickable(false);
        this.b.j.g();
        if (this.b.l.g()) {
            ((eso) this.b.l.c()).a(false);
        }
        if (!esn.a(((Integer) this.b.k.fA()).intValue()).equals(esn.ACTION)) {
            this.b.g.l();
            this.b.j.v(false);
            this.b.o.a();
            if (this.b.l.g()) {
                ((eso) this.b.l.c()).d();
            }
            if (this.b.m.g()) {
                ((eqy) this.b.m.c()).d();
            }
        }
        this.b.e.T();
    }

    @Override // defpackage.esv, defpackage.ihs, defpackage.iht
    public final void g() {
        this.b.g.j();
        this.b.h.p(true);
        this.b.i.setClickable(true);
        this.b.j.v(true);
        this.b.j.h();
        this.b.o.b();
        if (this.b.l.g()) {
            ((eso) this.b.l.c()).e();
            ((eso) this.b.l.c()).a(true);
        }
        if (this.b.m.g()) {
            ((eqy) this.b.m.c()).e(this.b.n);
        }
    }
}
