package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class crs extends crp implements ihv {
    public final dmh a;
    public final gfy b;
    public final ihu c;
    public final ihw d;
    public final ihw e;
    public ghx f;

    public crs(dmh dmhVar, gfy gfyVar) {
        this.a = dmhVar;
        this.b = gfyVar;
        ihw ihwVar = new ihw(new crb(this), new ihs[0]);
        this.d = ihwVar;
        this.e = new ihw(new crc(this), new ihs[0]);
        ihu ihuVar = new ihu(ihwVar, false);
        this.c = ihuVar;
        ihuVar.f();
    }

    @Override // defpackage.crp
    public final void a(ghx ghxVar) {
        if (this.c.a() == null) {
            return;
        }
        ((crp) this.c.a().a).a(ghxVar);
    }

    @Override // defpackage.crp
    public final void b() {
        if (this.c.a() == null) {
            return;
        }
        ((crp) this.c.a().a).b();
    }

    @Override // defpackage.ihv
    public final void e() {
        this.c.b();
        this.d.e();
        this.e.e();
    }

    @Override // defpackage.crp, defpackage.ihs, defpackage.iht
    public final void f() {
        this.c.c();
    }

    @Override // defpackage.crp, defpackage.ihs, defpackage.iht
    public final void g() {
        this.c.d();
    }

    @Override // defpackage.crp, defpackage.ihs
    public final void h() {
        mip.eQ(this);
    }
}
