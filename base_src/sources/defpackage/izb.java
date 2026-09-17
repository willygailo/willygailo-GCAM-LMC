package defpackage;

import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: loaded from: classes2.dex */
public final class izb extends iyb implements ihv {
    public final ihu m;
    public final ihw n;
    public final ihw o;

    public izb(lda ldaVar, BottomBarController bottomBarController, jlb jlbVar, jak jakVar, jfn jfnVar, gtg gtgVar, imy imyVar, lda ldaVar2, kas kasVar, iud iudVar, ddf ddfVar, byte[] bArr) {
        super(ldaVar, bottomBarController, jlbVar, jakVar, jfnVar, gtgVar, imyVar, ldaVar2, kasVar, iudVar, ddfVar, null);
        this.n = new ihw(new iyz(this), new ihs[0]);
        ihw ihwVar = new ihw(new iza(this), new ihs[0]);
        this.o = ihwVar;
        ihu ihuVar = new ihu(ihwVar, false);
        this.m = ihuVar;
        ihuVar.f();
    }

    @Override // defpackage.ixy
    public final void a() {
        if (this.m.a() == null) {
            return;
        }
        ((ixy) this.m.a().a).a();
    }

    @Override // defpackage.ixy
    public final void b() {
        if (this.m.a() == null) {
            return;
        }
        ((ixy) this.m.a().a).b();
    }

    @Override // defpackage.ihv
    public final void e() {
        this.m.b();
        this.n.e();
        this.o.e();
    }

    @Override // defpackage.ixy, defpackage.ihs, defpackage.iht
    public final void f() {
        this.m.c();
    }

    @Override // defpackage.ixy, defpackage.ihs, defpackage.iht
    public final void g() {
        this.m.d();
    }

    @Override // defpackage.ixy, defpackage.ihs
    public final void h() {
        mip.eQ(this);
    }
}
