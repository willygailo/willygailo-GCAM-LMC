package defpackage;

import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: loaded from: classes2.dex */
public final class izx extends izs implements ihv {
    public final BottomBarController a;
    public final jlb b;
    public final gtg c;
    public final gfy e;
    public final jjp f;
    public final ihu g;
    public final ihw j;
    public final ihw k;
    public final lce d = new lce(false);
    public final ihw h = new ihw(new izh(this), new ihs[0]);
    public final ihw i = new ihw(new izi(this), new ihs[0]);

    public izx(BottomBarController bottomBarController, jlb jlbVar, gtg gtgVar, jjp jjpVar, gfy gfyVar) {
        this.a = bottomBarController;
        this.b = jlbVar;
        this.c = gtgVar;
        this.f = jjpVar;
        this.e = gfyVar;
        ihw ihwVar = new ihw(new izj(this), new ihs[0]);
        this.j = ihwVar;
        this.k = new ihw(new izk(this), new ihs[0]);
        ihu ihuVar = new ihu(ihwVar, false);
        this.g = ihuVar;
        ihuVar.f();
    }

    @Override // defpackage.izs
    public final void a() {
        if (this.g.a() == null) {
            return;
        }
        ((izs) this.g.a().a).a();
    }

    @Override // defpackage.izs
    public final void b() {
        if (this.g.a() == null) {
            return;
        }
        ((izs) this.g.a().a).b();
    }

    @Override // defpackage.izs
    public final void c() {
        if (this.g.a() == null) {
            return;
        }
        ((izs) this.g.a().a).c();
    }

    @Override // defpackage.izs
    public final void d() {
        if (this.g.a() == null) {
            return;
        }
        ((izs) this.g.a().a).d();
    }

    @Override // defpackage.ihv
    public final void e() {
        this.g.b();
        this.h.e();
        this.i.e();
        this.j.e();
        this.k.e();
    }

    @Override // defpackage.izs, defpackage.ihs, defpackage.iht
    public final void f() {
        this.g.c();
    }

    @Override // defpackage.izs, defpackage.ihs, defpackage.iht
    public final void g() {
        this.g.d();
    }

    @Override // defpackage.izs
    public final void gm() {
        if (this.g.a() == null) {
            return;
        }
        ((izs) this.g.a().a).gm();
    }

    @Override // defpackage.izs, defpackage.ihs
    public final void h() {
        mip.eQ(this);
    }
}
