package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes2.dex */
final class lq implements View.OnAttachStateChangeListener {
    final /* synthetic */ lr a;

    public lq(lr lrVar) {
        this.a = lrVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.a.d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.a.d = view.getViewTreeObserver();
            }
            lr lrVar = this.a;
            lrVar.d.removeGlobalOnLayoutListener(lrVar.b);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
