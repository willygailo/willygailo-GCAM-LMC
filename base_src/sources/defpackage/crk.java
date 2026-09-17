package defpackage;

import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: loaded from: classes.dex */
public final class crk extends csg implements ihv {
    public final ihu a;
    public final ihw b;
    public final ihw c;
    public final ihw d;

    public crk(BottomBarController bottomBarController, jlb jlbVar, jak jakVar, jfn jfnVar, csb csbVar, ojc ojcVar, gtg gtgVar) {
        super(bottomBarController, jlbVar, jakVar, jfnVar, csbVar, ojcVar, gtgVar);
        this.b = new ihw(new crh(this), new ihs[0]);
        ihw ihwVar = new ihw(new cri(this), new ihs[0]);
        this.c = ihwVar;
        this.d = new ihw(new crj(this), new ihs[0]);
        ihu ihuVar = new ihu(ihwVar, false);
        this.a = ihuVar;
        ihuVar.f();
    }

    @Override // defpackage.csa, defpackage.crx
    public final void a() {
        if (this.a.a() == null) {
            return;
        }
        ((csa) this.a.a().a).a();
    }

    @Override // defpackage.csa, defpackage.crx
    public final void b() {
        if (this.a.a() == null) {
            return;
        }
        ((csa) this.a.a().a).b();
    }

    @Override // defpackage.csa, defpackage.crx
    public final void c() {
        if (this.a.a() == null) {
            return;
        }
        ((csa) this.a.a().a).c();
    }

    @Override // defpackage.csa, defpackage.crx
    public final void d() {
        if (this.a.a() == null) {
            return;
        }
        ((csa) this.a.a().a).d();
    }

    @Override // defpackage.ihv
    public final void e() {
        this.a.b();
        this.b.e();
        this.c.e();
        this.d.e();
    }

    @Override // defpackage.csa, defpackage.ihs, defpackage.iht
    public final void f() {
        this.a.c();
    }

    @Override // defpackage.csa, defpackage.ihs, defpackage.iht
    public final void g() {
        this.a.d();
    }

    @Override // defpackage.csa, defpackage.ihs
    public final void h() {
        mip.eQ(this);
    }

    @Override // defpackage.csa, defpackage.crx
    public final void i() {
        if (this.a.a() == null) {
            return;
        }
        ((csa) this.a.a().a).i();
    }
}
