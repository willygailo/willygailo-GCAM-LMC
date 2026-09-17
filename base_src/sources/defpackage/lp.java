package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes2.dex */
final class lp implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ lr a;

    public lp(lr lrVar) {
        this.a = lrVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.a.u()) {
            lr lrVar = this.a;
            if (lrVar.a.p) {
                return;
            }
            View view = lrVar.c;
            if (view == null || !view.isShown()) {
                this.a.k();
            } else {
                this.a.a.s();
            }
        }
    }
}
