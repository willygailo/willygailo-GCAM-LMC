package defpackage;

import com.google.android.apps.camera.bottombar.BottomBarListener;

/* JADX INFO: loaded from: classes2.dex */
final class hmt extends BottomBarListener {
    final /* synthetic */ jfn a;

    public hmt(jfn jfnVar) {
        this.a = jfnVar;
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onCancelButtonPressed() {
        this.a.b();
    }
}
