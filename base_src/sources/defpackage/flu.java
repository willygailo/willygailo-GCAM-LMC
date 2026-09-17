package defpackage;

/* JADX INFO: loaded from: classes.dex */
class flu extends flr {
    final /* synthetic */ fly b;

    public flu(fly flyVar) {
        this.b = flyVar;
    }

    @Override // defpackage.flr
    public void a() {
        this.b.i.j();
        this.b.j.p(true);
        this.b.k.setClickable(true);
        this.b.n.v(true);
        this.b.n.h();
    }

    @Override // defpackage.flr
    public void c() {
    }

    @Override // defpackage.flr
    public void d() {
    }

    @Override // defpackage.flr, defpackage.ihs, defpackage.iht
    public final void f() {
        this.b.i.l();
        this.b.j.p(false);
        this.b.k.setClickable(false);
        this.b.n.g();
        this.b.n.v(false);
        if (this.b.m.m()) {
            this.b.g.J();
        } else {
            this.b.g.Q();
        }
    }

    @Override // defpackage.flr
    public void fZ() {
    }
}
