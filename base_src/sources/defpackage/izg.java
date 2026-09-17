package defpackage;

import android.view.Window;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: loaded from: classes2.dex */
public final class izg extends izr implements ihv {
    public final ihu a;
    public final ihw b;
    public final ihw c;

    public izg(lda ldaVar, BottomBarController bottomBarController, jlb jlbVar, kas kasVar, Window window, jak jakVar, jdy jdyVar, gtg gtgVar, jfn jfnVar, iyb iybVar, byte[] bArr, byte[] bArr2) {
        super(ldaVar, bottomBarController, jlbVar, kasVar, window, jakVar, jdyVar, gtgVar, jfnVar, null, null);
        ihw ihwVar = new ihw(new ize(this), iybVar);
        this.b = ihwVar;
        this.c = new ihw(new izf(this), new ihs[0]);
        ihu ihuVar = new ihu(ihwVar, false);
        this.a = ihuVar;
        ihuVar.f();
    }

    @Override // defpackage.izo
    public final void a() {
        if (this.a.a() == null) {
            return;
        }
        ((izo) this.a.a().a).a();
    }

    @Override // defpackage.izo
    public final void b() {
        if (this.a.a() == null) {
            return;
        }
        ((izo) this.a.a().a).b();
    }

    @Override // defpackage.ihv
    public final void e() {
        this.a.b();
        this.b.e();
        this.c.e();
    }

    @Override // defpackage.izr, defpackage.izo, defpackage.ihs, defpackage.iht
    public final void f() {
        super.f();
        this.a.c();
    }

    @Override // defpackage.izr, defpackage.izo, defpackage.ihs, defpackage.iht
    public final void g() {
        super.g();
        this.a.d();
    }

    @Override // defpackage.izo, defpackage.ihs
    public final void h() {
        mip.eQ(this);
    }
}
