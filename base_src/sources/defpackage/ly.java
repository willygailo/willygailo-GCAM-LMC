package defpackage;

import android.support.v7.widget.ActionBarOverlayLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class ly implements Runnable {
    final /* synthetic */ ActionBarOverlayLayout a;
    private final /* synthetic */ int b;

    public ly(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.b = i;
        this.a = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.a.h();
                ActionBarOverlayLayout actionBarOverlayLayout = this.a;
                actionBarOverlayLayout.i = actionBarOverlayLayout.c.animate().translationY(-this.a.c.getHeight()).setListener(this.a.j);
                break;
            default:
                this.a.h();
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.a;
                actionBarOverlayLayout2.i = actionBarOverlayLayout2.c.animate().translationY(0.0f).setListener(this.a.j);
                break;
        }
    }
}
