package defpackage;

import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: loaded from: classes2.dex */
public final class iyl extends ixj implements ihv {
    public final ihu o;
    public final ihw p;
    public final ihw q;
    public final ihw r;

    public iyl(jdy jdyVar, epj epjVar, BottomBarController bottomBarController, gtg gtgVar, kas kasVar, jak jakVar, qkg qkgVar, jlb jlbVar, eah eahVar, jgq jgqVar, cvo cvoVar, hug hugVar, lda ldaVar, elw elwVar, iwm iwmVar, ixx ixxVar, iyb iybVar, byte[] bArr, byte[] bArr2) {
        super(jdyVar, epjVar, bottomBarController, gtgVar, kasVar, jakVar, qkgVar, jlbVar, eahVar, jgqVar, cvoVar, hugVar, ldaVar, elwVar, null, null);
        ihw ihwVar = new ihw(new iyi(this), iwmVar, ixxVar, iybVar);
        this.p = ihwVar;
        this.q = new ihw(new iyj(this), new ihs[0]);
        this.r = new ihw(new iyk(this), new ihs[0]);
        ihu ihuVar = new ihu(ihwVar, false);
        this.o = ihuVar;
        ihuVar.f();
    }

    @Override // defpackage.ihr
    public final void b() {
        if (this.o.a() == null) {
            return;
        }
        ((ihr) this.o.a().a).b();
    }

    @Override // defpackage.ihr
    public final void c() {
        if (this.o.a() == null) {
            return;
        }
        ((ihr) this.o.a().a).c();
    }

    @Override // defpackage.ihr
    public final void d() {
        if (this.o.a() == null) {
            return;
        }
        ((ihr) this.o.a().a).d();
    }

    @Override // defpackage.ihv
    public final void e() {
        this.o.b();
        this.p.e();
        this.q.e();
        this.r.e();
    }

    @Override // defpackage.ihr, defpackage.ihs, defpackage.iht
    public final void f() {
        super.f();
        this.o.c();
    }

    @Override // defpackage.ihr, defpackage.ihs, defpackage.iht
    public final void g() {
        super.g();
        this.o.d();
    }

    @Override // defpackage.ihr, defpackage.ihs
    public final void h() {
        mip.eQ(this);
    }

    @Override // defpackage.ihr
    public final void i() {
        if (this.o.a() == null) {
            return;
        }
        ((ihr) this.o.a().a).i();
    }
}
