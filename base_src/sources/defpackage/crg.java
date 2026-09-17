package defpackage;

import android.view.Window;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: loaded from: classes.dex */
public final class crg extends crw implements ihv {
    public final ihu a;
    public final ihw b;
    public final ihw c;
    public final ihw d;

    public crg(BottomBarController bottomBarController, jlb jlbVar, kas kasVar, Window window, jak jakVar, jdy jdyVar, jfn jfnVar, csb csbVar, byte[] bArr, byte[] bArr2) {
        super(bottomBarController, jlbVar, kasVar, window, jakVar, jdyVar, jfnVar, csbVar, null, null);
        ihw ihwVar = new ihw(new crd(this), new ihs[0]);
        this.b = ihwVar;
        this.c = new ihw(new cre(this), new ihs[0]);
        this.d = new ihw(new crf(this), new ihs[0]);
        ihu ihuVar = new ihu(ihwVar, false);
        this.a = ihuVar;
        ihuVar.f();
    }

    @Override // defpackage.csa, defpackage.crx
    public final void a() {
        if (this.a.a() == null) {
            return;
        }
        ((csa) this.a.a().a).a();
    }

    @Override // defpackage.csa, defpackage.crx
    public final void b() {
        if (this.a.a() == null) {
            return;
        }
        ((csa) this.a.a().a).b();
    }

    @Override // defpackage.csa, defpackage.crx
    public final void c() {
        if (this.a.a() == null) {
            return;
        }
        ((csa) this.a.a().a).c();
    }

    @Override // defpackage.csa, defpackage.crx
    public final void d() {
        if (this.a.a() == null) {
            return;
        }
        ((csa) this.a.a().a).d();
    }

    @Override // defpackage.ihv
    public final void e() {
        this.a.b();
        this.b.e();
        this.c.e();
        this.d.e();
    }

    @Override // defpackage.crw, defpackage.csa, defpackage.ihs, defpackage.iht
    public final void f() {
        super.f();
        this.a.c();
    }

    @Override // defpackage.crw, defpackage.csa, defpackage.ihs, defpackage.iht
    public final void g() {
        super.g();
        this.a.d();
    }

    @Override // defpackage.csa, defpackage.ihs
    public final void h() {
        mip.eQ(this);
    }

    @Override // defpackage.csa, defpackage.crx
    public final void i() {
        if (this.a.a() == null) {
            return;
        }
        ((csa) this.a.a().a).i();
    }
}
