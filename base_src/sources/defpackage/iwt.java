package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class iwt extends iwo implements ihv {
    public final lar a;
    public final gfy b;
    public final dmh c;
    public final ihu d;
    public final ihw e;
    public final ihw f;
    public ghx g = null;
    public final imy h;

    public iwt(lar larVar, gfy gfyVar, imy imyVar, dmh dmhVar, byte[] bArr) {
        this.a = larVar;
        this.b = gfyVar;
        this.h = imyVar;
        this.c = dmhVar;
        ihw ihwVar = new ihw(new iyg(this), new ihs[0]);
        this.e = ihwVar;
        this.f = new ihw(new iyh(this), new ihs[0]);
        ihu ihuVar = new ihu(ihwVar, false);
        this.d = ihuVar;
        ihuVar.f();
    }

    @Override // defpackage.iwo
    public final void a() {
        if (this.d.a() == null) {
            return;
        }
        ((iwo) this.d.a().a).a();
    }

    @Override // defpackage.iwo
    public final void b(ghx ghxVar, lap lapVar) {
        if (this.d.a() == null) {
            return;
        }
        ((iwo) this.d.a().a).b(ghxVar, lapVar);
    }

    @Override // defpackage.ihv
    public final void e() {
        this.d.b();
        this.e.e();
        this.f.e();
    }

    @Override // defpackage.iwo, defpackage.ihs, defpackage.iht
    public final void f() {
        this.d.c();
    }

    @Override // defpackage.iwo, defpackage.ihs, defpackage.iht
    public final void g() {
        this.d.d();
    }

    @Override // defpackage.iwo, defpackage.ihs
    public final void h() {
        mip.eQ(this);
    }
}
