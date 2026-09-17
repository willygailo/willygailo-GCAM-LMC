package defpackage;

import android.hardware.display.DisplayManager;

/* JADX INFO: loaded from: classes.dex */
final class fxw implements DisplayManager.DisplayListener {
    final /* synthetic */ fyr a;

    public fxw(fyr fyrVar) {
        this.a = fyrVar;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        int iD = fcy.d(this.a.U.n());
        fyr fyrVar = this.a;
        if (((iD - fyrVar.y) + 360) % 360 == 180) {
            fyrVar.G();
        }
        this.a.y = iD;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
