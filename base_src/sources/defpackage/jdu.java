package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jdu extends jek implements ihv {
    public final ihu a;
    public final ihw b;
    public final ihw c;
    private final ihw g;

    public jdu() {
        ihw ihwVar = new ihw(new jdr(this), new ihs[0]);
        this.g = ihwVar;
        this.b = new ihw(new jds(this), new ihs[0]);
        this.c = new ihw(new jdt(this), new ihs[0]);
        ihu ihuVar = new ihu(ihwVar, false);
        this.a = ihuVar;
        ihuVar.f();
    }

    @Override // defpackage.jea
    public final void a() {
        if (this.a.a() == null) {
            return;
        }
        ((jea) this.a.a().a).a();
    }

    @Override // defpackage.jea
    public final void b() {
        if (this.a.a() == null) {
            return;
        }
        ((jea) this.a.a().a).b();
    }

    @Override // defpackage.jea
    public final void c() {
        if (this.a.a() == null) {
            return;
        }
        ((jea) this.a.a().a).c();
    }

    @Override // defpackage.jea
    public final void d() {
        if (this.a.a() == null) {
            return;
        }
        ((jea) this.a.a().a).d();
    }

    @Override // defpackage.ihv
    public final void e() {
        this.a.b();
        this.g.e();
        this.b.e();
        this.c.e();
    }

    @Override // defpackage.jea, defpackage.ihs, defpackage.iht
    public final void f() {
        this.a.c();
    }

    @Override // defpackage.jea, defpackage.ihs, defpackage.iht
    public final void g() {
        this.a.d();
    }

    @Override // defpackage.jea, defpackage.ihs
    public final void h() {
        mip.eQ(this);
    }
}
