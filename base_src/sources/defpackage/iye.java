package defpackage;

import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: loaded from: classes2.dex */
public final class iye extends iwm implements ihv {
    public final ihu l;
    public final ihw m;
    public final ihw n;

    public iye(bzg bzgVar, BottomBarController bottomBarController, jlb jlbVar, jak jakVar, jfn jfnVar, gtg gtgVar, imy imyVar, kas kasVar, iud iudVar, ddf ddfVar, byte[] bArr) {
        super(bzgVar, bottomBarController, jlbVar, jakVar, jfnVar, gtgVar, imyVar, kasVar, iudVar, ddfVar, null);
        this.m = new ihw(new iyc(this), new ihs[0]);
        ihw ihwVar = new ihw(new iyd(this), new ihs[0]);
        this.n = ihwVar;
        ihu ihuVar = new ihu(ihwVar, false);
        this.l = ihuVar;
        ihuVar.f();
    }

    @Override // defpackage.iwj
    public final void a() {
        if (this.l.a() == null) {
            return;
        }
        ((iwj) this.l.a().a).a();
    }

    @Override // defpackage.iwj
    public final void b() {
        if (this.l.a() == null) {
            return;
        }
        ((iwj) this.l.a().a).b();
    }

    @Override // defpackage.ihv
    public final void e() {
        this.l.b();
        this.m.e();
        this.n.e();
    }

    @Override // defpackage.iwj, defpackage.ihs, defpackage.iht
    public final void f() {
        this.l.c();
    }

    @Override // defpackage.iwj, defpackage.ihs, defpackage.iht
    public final void g() {
        this.l.d();
    }

    @Override // defpackage.iwj, defpackage.ihs
    public final void h() {
        mip.eQ(this);
    }
}
