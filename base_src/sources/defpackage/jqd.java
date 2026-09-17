package defpackage;

import com.google.android.apps.camera.bottombar.BottomBarListener;

/* JADX INFO: loaded from: classes2.dex */
final class jqd extends BottomBarListener {
    final /* synthetic */ jqi a;

    public jqd(jqi jqiVar) {
        this.a = jqiVar;
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onShutterButtonClicked() {
        if (this.a.h.F()) {
            this.a.h.g();
        }
    }
}
