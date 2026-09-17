package defpackage;

import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: loaded from: classes.dex */
public final class egv extends ejj implements ihv {
    public final ihu a;
    public final ihw b;
    public final ihw c;

    public egv(jlb jlbVar, BottomBarController bottomBarController, gtg gtgVar, ehw ehwVar, jjp jjpVar) {
        super(jlbVar, bottomBarController, gtgVar, ehwVar, jjpVar);
        ihw ihwVar = new ihw(new egt(this), new ihs[0]);
        this.b = ihwVar;
        this.c = new ihw(new egu(this), new ihs[0]);
        ihu ihuVar = new ihu(ihwVar, false);
        this.a = ihuVar;
        ihuVar.f();
    }

    @Override // defpackage.ejg
    public final void a() {
        if (this.a.a() == null) {
            return;
        }
        ((ejg) this.a.a().a).a();
    }

    @Override // defpackage.ejg
    public final void b() {
        if (this.a.a() == null) {
            return;
        }
        ((ejg) this.a.a().a).b();
    }

    @Override // defpackage.ihv
    public final void e() {
        this.a.b();
        this.b.e();
        this.c.e();
    }

    @Override // defpackage.ejj, defpackage.ejg, defpackage.ihs, defpackage.iht
    public final void f() {
        super.f();
        this.a.c();
    }

    @Override // defpackage.ejj, defpackage.ejg, defpackage.ihs, defpackage.iht
    public final void g() {
        super.g();
        this.a.d();
    }

    @Override // defpackage.ejg, defpackage.ihs
    public final void h() {
        mip.eQ(this);
    }
}
