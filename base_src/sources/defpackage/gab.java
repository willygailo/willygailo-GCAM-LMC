package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.camera.bottombar.BottomBarListener;

/* JADX INFO: loaded from: classes.dex */
final class gab extends BottomBarListener {
    final /* synthetic */ gac a;

    public gab(gac gacVar) {
        this.a = gacVar;
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onCameraSwitchButtonClicked() {
        this.a.c.d();
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onRetakeButtonPressed() {
        this.a.v();
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onReviewPlayButtonPressed() {
        synchronized (this.a.f) {
            gac gacVar = this.a;
            if (gacVar.j != null) {
                obr.aR(gacVar.h.g(), "URI not set.");
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setFlags(1);
                intent.setDataAndType((Uri) this.a.h.c(), this.a.j.h.a.f.i);
                try {
                    this.a.g.o(intent);
                } catch (ActivityNotFoundException e) {
                    ((oug) ((oug) ((oug) gac.b.b()).h(e)).G(2034)).o("Couldn't view video");
                }
            }
        }
    }
}
