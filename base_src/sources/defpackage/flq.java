package defpackage;

import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: loaded from: classes.dex */
public final class flq extends fly implements ihv {
    public final ihu a;
    public final ihw b;
    public final ihw c;
    public final ihw d;
    public final ihw e;
    public final ihw f;
    private final ihw o;

    public flq(jlb jlbVar, jje jjeVar, gtg gtgVar, jgq jgqVar, BottomBarController bottomBarController, gvb gvbVar, eam eamVar, kas kasVar) {
        super(jlbVar, jjeVar, gtgVar, jgqVar, bottomBarController, gvbVar, eamVar, kasVar);
        this.b = new ihw(new flk(this), new ihs[0]);
        this.c = new ihw(new fll(this), new ihs[0]);
        this.d = new ihw(new flm(this), new ihs[0]);
        this.e = new ihw(new fln(this), new ihs[0]);
        this.f = new ihw(new flo(this), new ihs[0]);
        ihw ihwVar = new ihw(new flp(this), new ihs[0]);
        this.o = ihwVar;
        ihu ihuVar = new ihu(ihwVar, false);
        this.a = ihuVar;
        ihuVar.f();
    }

    @Override // defpackage.flr
    public final void a() {
        if (this.a.a() == null) {
            return;
        }
        ((flr) this.a.a().a).a();
    }

    @Override // defpackage.flr
    public final void b() {
        if (this.a.a() == null) {
            return;
        }
        ((flr) this.a.a().a).b();
    }

    @Override // defpackage.flr
    public final void c() {
        if (this.a.a() == null) {
            return;
        }
        ((flr) this.a.a().a).c();
    }

    @Override // defpackage.flr
    public final void d() {
        if (this.a.a() == null) {
            return;
        }
        ((flr) this.a.a().a).d();
    }

    @Override // defpackage.ihv
    public final void e() {
        this.a.b();
        this.b.e();
        this.c.e();
        this.d.e();
        this.e.e();
        this.f.e();
        this.o.e();
    }

    @Override // defpackage.flr, defpackage.ihs, defpackage.iht
    public final void f() {
        this.a.c();
    }

    @Override // defpackage.flr
    public final void fZ() {
        if (this.a.a() == null) {
            return;
        }
        ((flr) this.a.a().a).fZ();
    }

    @Override // defpackage.flr, defpackage.ihs, defpackage.iht
    public final void g() {
        this.a.d();
    }

    @Override // defpackage.flr, defpackage.ihs
    public final void h() {
        mip.eQ(this);
    }

    @Override // defpackage.flr
    public final void i() {
        if (this.a.a() == null) {
            return;
        }
        ((flr) this.a.a().a).i();
    }

    @Override // defpackage.flr
    public final void j() {
        if (this.a.a() == null) {
            return;
        }
        ((flr) this.a.a().a).j();
    }
}
