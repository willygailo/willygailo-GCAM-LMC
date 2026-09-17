package defpackage;

import com.google.android.apps.camera.rewind.ui.RewindControllerView;
import com.google.android.apps.camera.rewind.ui.RewindPreview;
import com.google.android.apps.camera.ui.views.ViewfinderCover;

/* JADX INFO: loaded from: classes2.dex */
public final class hmd extends hni implements ihv {
    public final ihu a;
    public final ihw b;
    public final ihw c;
    public final ihw d;

    public hmd(hmy hmyVar, ViewfinderCover viewfinderCover, RewindPreview rewindPreview, RewindControllerView rewindControllerView) {
        super(hmyVar, viewfinderCover, rewindPreview, rewindControllerView);
        ihw ihwVar = new ihw(new hma(this), new ihs[0]);
        this.b = ihwVar;
        this.c = new ihw(new hmb(this), new ihs[0]);
        this.d = new ihw(new hmc(this), new ihs[0]);
        ihu ihuVar = new ihu(ihwVar, false);
        this.a = ihuVar;
        ihuVar.f();
    }

    @Override // defpackage.hnd
    public final void a() {
        if (this.a.a() == null) {
            return;
        }
        ((hnd) this.a.a().a).a();
    }

    @Override // defpackage.hnd
    public final void b() {
        if (this.a.a() == null) {
            return;
        }
        ((hnd) this.a.a().a).b();
    }

    @Override // defpackage.hnd
    public final void c() {
        if (this.a.a() == null) {
            return;
        }
        ((hnd) this.a.a().a).c();
    }

    @Override // defpackage.ihv
    public final void e() {
        this.a.b();
        this.b.e();
        this.c.e();
        this.d.e();
    }

    @Override // defpackage.hnd, defpackage.ihs, defpackage.iht
    public final void f() {
        this.a.c();
    }

    @Override // defpackage.hnd, defpackage.ihs, defpackage.iht
    public final void g() {
        this.a.d();
    }

    @Override // defpackage.hnd, defpackage.ihs
    public final void h() {
        mip.eQ(this);
    }
}
