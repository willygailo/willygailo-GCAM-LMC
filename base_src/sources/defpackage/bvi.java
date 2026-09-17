package defpackage;

import android.hardware.display.DisplayManager;

/* JADX INFO: loaded from: classes.dex */
final class bvi implements DisplayManager.DisplayListener {
    final /* synthetic */ bvk a;

    public bvi(bvk bvkVar) {
        this.a = bvkVar;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        jio jioVar;
        int iD = fcy.d(this.a.w);
        bvk bvkVar = this.a;
        if (((iD - bvkVar.l) + 360) % 360 == 180 && (jioVar = bvkVar.n) != null) {
            jioVar.c();
            this.a.q.g();
        }
        this.a.l = iD;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
