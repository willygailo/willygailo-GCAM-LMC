package defpackage;

import com.google.android.apps.camera.bottombar.BottomBarListener;

/* JADX INFO: loaded from: classes.dex */
final class eyw extends BottomBarListener {
    final /* synthetic */ ezg a;

    public eyw(ezg ezgVar) {
        this.a = ezgVar;
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onCameraSwitchButtonClicked() {
        this.a.c.h(new Runnable() { // from class: eyv
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.u();
            }
        });
    }
}
