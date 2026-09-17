package defpackage;

import com.google.android.apps.camera.bottombar.BottomBarListener;

/* JADX INFO: loaded from: classes.dex */
final class exb extends BottomBarListener {
    final /* synthetic */ cvo a;
    final /* synthetic */ exi b;
    final /* synthetic */ jrh c;

    public exb(exi exiVar, jrh jrhVar, cvo cvoVar) {
        this.b = exiVar;
        this.c = jrhVar;
        this.a = cvoVar;
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onCameraSwitchButtonClicked() {
        if (this.c.h) {
            return;
        }
        this.a.h(new Runnable() { // from class: exa
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.w(false);
            }
        });
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onThumbnailButtonClicked() {
    }
}
