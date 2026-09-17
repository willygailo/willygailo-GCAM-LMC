package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes2.dex */
final class km implements View.OnAttachStateChangeListener {
    final /* synthetic */ kq a;

    public km(kq kqVar) {
        this.a = kqVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.a.e;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.a.e = view.getViewTreeObserver();
            }
            kq kqVar = this.a;
            kqVar.e.removeGlobalOnLayoutListener(kqVar.c);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
