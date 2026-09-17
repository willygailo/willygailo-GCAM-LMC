package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class kl implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ kq a;

    public kl(kq kqVar) {
        this.a = kqVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (!this.a.u() || this.a.b.size() <= 0 || ((kp) this.a.b.get(0)).a.p) {
            return;
        }
        View view = this.a.d;
        if (view == null || !view.isShown()) {
            this.a.k();
            return;
        }
        Iterator it = this.a.b.iterator();
        while (it.hasNext()) {
            ((kp) it.next()).a.s();
        }
    }
}
