package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jvg extends jvo implements ihv {
    public final ihu a;
    public final ihw b;
    public final ihw c;

    public jvg() {
        ihw ihwVar = new ihw(new jve(this), new ihs[0]);
        this.b = ihwVar;
        this.c = new ihw(new jvf(this), new ihs[0]);
        ihu ihuVar = new ihu(ihwVar, false);
        this.a = ihuVar;
        ihuVar.f();
    }

    @Override // defpackage.jvl
    public final void a() {
        if (this.a.a() == null) {
            return;
        }
        ((jvl) this.a.a().a).a();
    }

    @Override // defpackage.jvl
    public final void b() {
        if (this.a.a() == null) {
            return;
        }
        ((jvl) this.a.a().a).b();
    }

    @Override // defpackage.jvo, defpackage.jvl
    public final void c(jvy jvyVar, jvq jvqVar) {
        if (this.a.a() != null) {
            ((jvl) this.a.a().a).c(jvyVar, jvqVar);
        } else {
            this.d = ((jwd) jvyVar).f;
            this.e = jvqVar;
        }
    }

    @Override // defpackage.ihv
    public final void e() {
        this.a.b();
        this.b.e();
        this.c.e();
    }

    @Override // defpackage.jvl, defpackage.ihs, defpackage.iht
    public final void f() {
        this.a.c();
    }

    @Override // defpackage.jvl, defpackage.ihs, defpackage.iht
    public final void g() {
        this.a.d();
    }

    @Override // defpackage.jvl, defpackage.ihs
    public final void h() {
        mip.eQ(this);
    }
}
