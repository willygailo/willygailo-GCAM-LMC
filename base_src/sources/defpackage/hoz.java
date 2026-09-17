package defpackage;

import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: loaded from: classes2.dex */
public final class hoz extends hos implements ihv {
    public final fjs a;
    public final pyn b;
    public final ihu c;
    public final ihw d = new ihw(new hok(this), new ihs[0]);
    public final ihw e = new ihw(new hol(this), new ihs[0]);
    public final ihw f;
    public final ihw g;
    private final BottomBarController h;
    private final img i;
    private final lco j;
    private final hug k;
    private final jsc l;

    public hoz(fjs fjsVar, BottomBarController bottomBarController, pyn pynVar, jsc jscVar, img imgVar, lda ldaVar, hug hugVar) {
        this.a = fjsVar;
        this.b = pynVar;
        this.h = bottomBarController;
        this.l = jscVar;
        this.i = imgVar;
        this.j = ldaVar;
        this.k = hugVar;
        ihw ihwVar = new ihw(new hom(this), new ihs[0]);
        this.f = ihwVar;
        this.g = new ihw(new hon(this), new ihs[0]);
        ihu ihuVar = new ihu(ihwVar, false);
        this.c = ihuVar;
        ihuVar.f();
    }

    @Override // defpackage.hos
    public final void a() {
        if (this.c.a() == null) {
            return;
        }
        ((hos) this.c.a().a).a();
    }

    @Override // defpackage.hos
    public final void b() {
        if (this.c.a() == null) {
            return;
        }
        ((hos) this.c.a().a).b();
    }

    @Override // defpackage.hos
    public final void c() {
        if (this.c.a() == null) {
            return;
        }
        ((hos) this.c.a().a).c();
    }

    @Override // defpackage.hos
    public final void d() {
        if (this.c.a() == null) {
            return;
        }
        ((hos) this.c.a().a).d();
    }

    @Override // defpackage.ihv
    public final void e() {
        this.c.b();
        this.d.e();
        this.e.e();
        this.f.e();
        this.g.e();
    }

    @Override // defpackage.hos, defpackage.ihs, defpackage.iht
    public final void f() {
        this.c.c();
    }

    @Override // defpackage.hos, defpackage.ihs, defpackage.iht
    public final void g() {
        this.c.d();
    }

    @Override // defpackage.hos, defpackage.ihs
    public final void h() {
        mip.eQ(this);
    }

    public final void i() {
        this.h.setSelfieFlashState(true);
        this.k.e(htu.k, true);
        if (k()) {
            this.l.b(((hpc) this.b.get()).a());
        } else {
            this.l.c();
        }
        this.i.a(1812);
        ((hpc) this.b.get()).e(k());
    }

    public final void j() {
        this.h.setSelfieFlashState(false);
        this.l.a();
        ((hpc) this.b.get()).d();
        this.k.e(htu.k, false);
        this.i.a(1797);
    }

    public final boolean k() {
        return ((jrl) this.j.fA()) == jrl.LONG_EXPOSURE;
    }
}
