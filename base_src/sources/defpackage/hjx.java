package defpackage;

import com.google.android.apps.camera.progressoverlay.ProgressOverlay;

/* JADX INFO: loaded from: classes2.dex */
public final class hjx extends hju implements ihv {
    public final ProgressOverlay a;
    public boolean b;
    public final ihu c;
    public final ihw d;
    public final ihw e;

    public hjx(ProgressOverlay progressOverlay, hjo hjoVar) {
        lar.a();
        this.a = progressOverlay;
        ihw ihwVar = new ihw(new hjk(this), new ihs[0]);
        this.d = ihwVar;
        this.e = new ihw(new hjl(this), hjoVar);
        ihu ihuVar = new ihu(ihwVar, false);
        this.c = ihuVar;
        ihuVar.f();
    }

    @Override // defpackage.hju
    public final void a() {
        if (this.c.a() == null) {
            return;
        }
        ((hju) this.c.a().a).a();
    }

    @Override // defpackage.hju
    public final void b() {
        if (this.c.a() == null) {
            return;
        }
        ((hju) this.c.a().a).b();
    }

    @Override // defpackage.ihv
    public final void e() {
        this.c.b();
        this.d.e();
        this.e.e();
    }

    @Override // defpackage.hju, defpackage.ihs, defpackage.iht
    public final void f() {
        this.c.c();
    }

    @Override // defpackage.hju, defpackage.ihs, defpackage.iht
    public final void g() {
        this.c.d();
    }

    @Override // defpackage.hju, defpackage.ihs
    public final void h() {
        mip.eQ(this);
    }
}
