package defpackage;

import com.google.android.apps.camera.bottombar.BottomBarListener;

/* JADX INFO: loaded from: classes.dex */
final class ezx extends BottomBarListener {
    final /* synthetic */ fah a;

    public ezx(fah fahVar) {
        this.a = fahVar;
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onCameraSwitchButtonClicked() {
        cvo cvoVar = this.a.l;
        if (cvoVar != null) {
            cvoVar.h(bvf.c);
            this.a.d.j();
        }
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onRetakeButtonPressed() {
        this.a.i.b();
        ezn eznVar = this.a.r;
        lar.a();
        eznVar.g = false;
        eznVar.e.a();
        eznVar.f.setVisibility(8);
        eznVar.b.k(true);
        ((bvk) eznVar.b).p.e(true);
        eznVar.b.o();
    }
}
