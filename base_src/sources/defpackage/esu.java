package defpackage;

import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: loaded from: classes.dex */
public final class esu extends eta implements ihv {
    public final ihu a;
    public final ihw b;
    public final ihw c;
    public final ihw d;
    private final ihw p;

    public esu(jlb jlbVar, jje jjeVar, gtg gtgVar, jgq jgqVar, BottomBarController bottomBarController, kas kasVar, lda ldaVar, jbq jbqVar, ojc ojcVar, ojc ojcVar2, elw elwVar) {
        super(jlbVar, jjeVar, gtgVar, jgqVar, bottomBarController, kasVar, ldaVar, jbqVar, ojcVar, ojcVar2, elwVar);
        this.b = new ihw(new esq(this), new ihs[0]);
        this.c = new ihw(new esr(this), new ihs[0]);
        this.d = new ihw(new ess(this), new ihs[0]);
        ihw ihwVar = new ihw(new est(this), new ihs[0]);
        this.p = ihwVar;
        ihu ihuVar = new ihu(ihwVar, false);
        this.a = ihuVar;
        ihuVar.f();
    }

    @Override // defpackage.esv
    public final void a() {
        if (this.a.a() == null) {
            return;
        }
        ((esv) this.a.a().a).a();
    }

    @Override // defpackage.esv
    public final void b() {
        if (this.a.a() == null) {
            return;
        }
        ((esv) this.a.a().a).b();
    }

    @Override // defpackage.esv
    public final void c() {
        if (this.a.a() == null) {
            return;
        }
        ((esv) this.a.a().a).c();
    }

    @Override // defpackage.esv
    public final void d() {
        if (this.a.a() == null) {
            return;
        }
        ((esv) this.a.a().a).d();
    }

    @Override // defpackage.ihv
    public final void e() {
        this.a.b();
        this.b.e();
        this.c.e();
        this.d.e();
        this.p.e();
    }

    @Override // defpackage.esv, defpackage.ihs, defpackage.iht
    public final void f() {
        this.a.c();
    }

    @Override // defpackage.esv, defpackage.ihs, defpackage.iht
    public final void g() {
        this.a.d();
    }

    @Override // defpackage.esv, defpackage.ihs
    public final void h() {
        mip.eQ(this);
    }
}
