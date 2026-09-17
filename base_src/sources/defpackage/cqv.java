package defpackage;

/* JADX INFO: loaded from: classes.dex */
class cqv extends cqr {
    final /* synthetic */ cqw b;

    public cqv(cqw cqwVar) {
        this.b = cqwVar;
    }

    @Override // defpackage.cqr
    public void a() {
        if (this.b.f.d() == this.b.m.j(cqj.LOCKED)) {
            this.b.f.p(false);
        }
    }

    @Override // defpackage.cqr
    public void b() {
        cqw cqwVar = this.b;
        if (cqwVar.k) {
            cqwVar.f.g();
            if (this.b.f.d() == this.b.m.j(cqj.LOCKED)) {
                kas kasVar = this.b.f;
                kasVar.B(kasVar.a(false, jrl.VIDEO));
            }
        }
    }

    @Override // defpackage.cqr
    public void d() {
        if (this.b.f.d() == this.b.m.j(cqj.LOCKED)) {
            this.b.f.p(false);
        }
    }

    @Override // defpackage.cqr, defpackage.ihs, defpackage.iht
    public final void f() {
        this.b.f.g();
        this.b.f.w(kag.OFF);
        float fJ = this.b.m.j(cqj.LOCKED);
        if (this.b.f.d() < fJ) {
            this.b.f.B(fJ);
        }
        cqw cqwVar = this.b;
        cqwVar.f.t(cqwVar.m.j(cqj.LOCKED));
        if (this.b.i.g()) {
            ((cuj) this.b.i.c()).l();
            this.b.l.a(ivh.IDLE);
        }
    }

    @Override // defpackage.cqr, defpackage.ihs, defpackage.iht
    public final void g() {
        this.b.l.a(ivh.HIDDEN);
        this.b.f.q();
        this.b.f.o();
        if (this.b.i.g()) {
            ((cuj) this.b.i.c()).b();
        }
    }
}
