package defpackage;

/* JADX INFO: loaded from: classes.dex */
class cqs extends cqr {
    final /* synthetic */ cqw b;

    public cqs(cqw cqwVar) {
        this.b = cqwVar;
    }

    @Override // defpackage.cqr
    public void a() {
    }

    @Override // defpackage.cqr
    public void b() {
    }

    @Override // defpackage.cqr
    public void c() {
    }

    @Override // defpackage.cqr, defpackage.ihs, defpackage.iht
    public final void f() {
        this.b.f.g();
        this.b.f.w(kag.ALL);
        cqw cqwVar = this.b;
        cqwVar.f.s(((Float) cqwVar.h.g(dcu.A).c()).floatValue() / this.b.m.i());
        cqw cqwVar2 = this.b;
        cqwVar2.f.t(cqwVar2.m.j(cqj.ACTIVE));
        this.b.f.r(StrictMath.max(this.b.f.c(), this.b.f.d() / this.b.m.i()));
        this.b.f.h();
    }

    @Override // defpackage.cqr, defpackage.ihs, defpackage.iht
    public final void g() {
        this.b.f.q();
        this.b.f.n();
        this.b.f.o();
        if (this.b.j.i()) {
            this.b.g.fB(Float.valueOf(this.b.f.d() * this.b.m.i()));
        }
    }
}
