package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class nas implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ nat a;
    private final AtomicReference b;

    public nas(nat natVar, View view) {
        this.a = natVar;
        this.b = new AtomicReference(view);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = (View) this.b.getAndSet(null);
        if (view == null) {
            return true;
        }
        try {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            myw.e().postAtFrontOfQueue(new nap(this.a, 2));
            myw.h(new nap(this.a, 3));
        } catch (RuntimeException e) {
        }
        return true;
    }
}
