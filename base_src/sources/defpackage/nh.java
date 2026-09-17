package defpackage;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes2.dex */
final class nh implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ nq a;

    public nh(nq nqVar) {
        this.a = nqVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (!this.a.b.u()) {
            this.a.b();
        }
        ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }
}
