package defpackage;

import com.google.android.apps.camera.zoomui.ZoomUi;

/* JADX INFO: loaded from: classes2.dex */
public final class kab extends kcb implements ihv {
    public final ihu a;
    public final ihw b;
    public final ihw c;

    public kab(ZoomUi zoomUi, kbx kbxVar) {
        super(zoomUi);
        ihw ihwVar = new ihw(new jzz(this), new ihs[0]);
        this.b = ihwVar;
        this.c = new ihw(new kaa(this), kbxVar);
        ihu ihuVar = new ihu(ihwVar, false);
        this.a = ihuVar;
        ihuVar.f();
    }

    @Override // defpackage.kby
    public final void a() {
        if (this.a.a() == null) {
            return;
        }
        ((kby) this.a.a().a).a();
    }

    @Override // defpackage.kby
    public final void b() {
        if (this.a.a() == null) {
            return;
        }
        ((kby) this.a.a().a).b();
    }

    @Override // defpackage.ihv
    public final void e() {
        this.a.b();
        this.b.e();
        this.c.e();
    }

    @Override // defpackage.kby, defpackage.ihs, defpackage.iht
    public final void f() {
        this.a.c();
    }

    @Override // defpackage.kby, defpackage.ihs, defpackage.iht
    public final void g() {
        this.a.d();
    }

    @Override // defpackage.kby, defpackage.ihs
    public final void h() {
        mip.eQ(this);
    }
}
