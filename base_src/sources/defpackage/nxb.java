package defpackage;

import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes2.dex */
final class nxb implements Runnable {
    final /* synthetic */ nxc a;
    private final CoordinatorLayout b;
    private final View c;

    public nxb(nxc nxcVar, CoordinatorLayout coordinatorLayout, View view) {
        this.a = nxcVar;
        this.b = coordinatorLayout;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OverScroller overScroller;
        if (this.c == null || (overScroller = this.a.c) == null) {
            return;
        }
        if (!overScroller.computeScrollOffset()) {
            this.a.B(this.b, this.c);
            return;
        }
        nxc nxcVar = this.a;
        nxcVar.F(this.b, this.c, nxcVar.c.getCurrY());
        gl.A(this.c, this);
    }
}
