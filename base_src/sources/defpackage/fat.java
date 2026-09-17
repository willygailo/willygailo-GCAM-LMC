package defpackage;

import com.google.android.apps.camera.bottombar.BottomBarListener;

/* JADX INFO: loaded from: classes.dex */
final class fat extends BottomBarListener {
    final /* synthetic */ fbb a;

    public fat(fbb fbbVar) {
        this.a = fbbVar;
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onCameraSwitchButtonClicked() {
        this.a.c.h(new Runnable() { // from class: fas
            @Override // java.lang.Runnable
            public final void run() {
                fbb fbbVar = this.a.a;
                if (fbbVar.a) {
                    if (fbbVar.M != null) {
                        fbbVar.c.i();
                    }
                    fbbVar.r.j();
                    fbbVar.w();
                    fbbVar.r.p(false);
                }
            }
        });
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onThumbnailButtonClicked() {
    }
}
