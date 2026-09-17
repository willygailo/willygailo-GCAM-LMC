package defpackage;

import com.google.android.apps.camera.whitebalance.ManualWhiteBalanceUi;

/* JADX INFO: loaded from: classes2.dex */
public final class jyy extends jzq implements ihv {
    public final ihu a;
    public final ihw b;
    public final ihw c;
    public final ihw d;
    public final ihw e;

    public jyy(ManualWhiteBalanceUi manualWhiteBalanceUi, lar larVar) {
        super(manualWhiteBalanceUi, larVar);
        ihw ihwVar = new ihw(new jyu(this), new ihs[0]);
        this.b = ihwVar;
        this.c = new ihw(new jyv(this), new ihs[0]);
        this.d = new ihw(new jyw(this), new ihs[0]);
        this.e = new ihw(new jyx(this), new ihs[0]);
        ihu ihuVar = new ihu(ihwVar, false);
        this.a = ihuVar;
        ihuVar.f();
    }

    @Override // defpackage.jzi
    public final void a(boolean z) {
        if (this.a.a() == null) {
            return;
        }
        ((jzi) this.a.a().a).a(z);
    }

    @Override // defpackage.jzi
    public final void b(boolean z) {
        if (this.a.a() == null) {
            return;
        }
        ((jzi) this.a.a().a).b(z);
    }

    @Override // defpackage.jzi
    public final void c(boolean z) {
        if (this.a.a() == null) {
            return;
        }
        ((jzi) this.a.a().a).c(z);
    }

    @Override // defpackage.jzi
    public final void d() {
        if (this.a.a() == null) {
            return;
        }
        ((jzi) this.a.a().a).d();
    }

    @Override // defpackage.ihv
    public final void e() {
        this.a.b();
        this.b.e();
        this.c.e();
        this.d.e();
        this.e.e();
    }

    @Override // defpackage.jzi, defpackage.ihs, defpackage.iht
    public final void f() {
        this.a.c();
    }

    @Override // defpackage.jzi, defpackage.ihs, defpackage.iht
    public final void g() {
        this.a.d();
    }

    @Override // defpackage.jzi
    public final void gt(boolean z) {
        if (this.a.a() == null) {
            return;
        }
        ((jzi) this.a.a().a).gt(z);
    }

    @Override // defpackage.jzi, defpackage.ihs
    public final void h() {
        mip.eQ(this);
    }

    @Override // defpackage.jzi
    public final void i() {
        if (this.a.a() == null) {
            return;
        }
        ((jzi) this.a.a().a).i();
    }

    @Override // defpackage.jzi
    public final void j() {
        if (this.a.a() == null) {
            return;
        }
        ((jzi) this.a.a().a).j();
    }
}
