package defpackage;

import android.hardware.display.DisplayManager;

/* JADX INFO: loaded from: classes2.dex */
final class jmm implements DisplayManager.DisplayListener {
    final /* synthetic */ jmn a;

    public jmm(jmn jmnVar) {
        this.a = jmnVar;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        int iA;
        if (i != 0 || (iA = this.a.a()) <= 0 || this.a.e.get() == iA) {
            return;
        }
        this.a.b(false);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
