package defpackage;

import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;

/* JADX INFO: loaded from: classes2.dex */
class ixq extends ixk {
    final /* synthetic */ ixx a;

    public ixq(ixx ixxVar) {
        this.a = ixxVar;
    }

    @Override // defpackage.ixk
    public void a() {
        this.a.m = true;
    }

    @Override // defpackage.ixk, defpackage.ihs, defpackage.iht
    public final void f() {
        this.a.u();
        this.a.b.j(jrl.PHOTO_SPHERE, true);
        this.a.A(jrl.PHOTO_SPHERE);
        this.a.s().c = false;
        this.a.b.l(false);
        ((jny) this.a.h).get().setVisibility(4);
        this.a.t();
        this.a.b.c();
        this.a.a.v(false);
        if (this.a.k.k(ddl.V)) {
            this.a.a.g();
        }
        ixx ixxVar = this.a;
        OptionsMenuContainer optionsMenuContainer = ixxVar.d.aV;
        if (optionsMenuContainer != null) {
            optionsMenuContainer.u = true;
        }
        ixxVar.o.c(jri.b(jrl.PHOTO_SPHERE).d(this.a.q()), jri.b(jrl.PHOTO_SPHERE).c(this.a.q()));
        this.a.o.a();
        this.a.z(1);
    }

    @Override // defpackage.ixk, defpackage.ihs, defpackage.iht
    public final void g() {
        this.a.s().c = true;
        ixx ixxVar = this.a;
        ixxVar.z(ixxVar.l);
        ixx ixxVar2 = this.a;
        OptionsMenuContainer optionsMenuContainer = ixxVar2.d.aV;
        if (optionsMenuContainer != null) {
            optionsMenuContainer.u = false;
        }
        ((jny) ixxVar2.h).get().setVisibility(0);
        this.a.o.b();
    }
}
