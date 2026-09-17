package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes2.dex */
public final class nxu implements Runnable {
    public boolean a;
    public int b;
    final /* synthetic */ BottomSheetBehavior c;
    private final View d;

    public nxu(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.c = bottomSheetBehavior;
        this.d = view;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        acb acbVar = this.c.t;
        if (acbVar == null || !acbVar.l()) {
            this.c.G(this.b);
        } else {
            gl.A(this.d, this);
        }
        this.a = false;
    }
}
