package defpackage;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: loaded from: classes2.dex */
public final class nxk implements hj {
    final /* synthetic */ SwipeDismissBehavior a;

    public nxk(SwipeDismissBehavior swipeDismissBehavior) {
        this.a = swipeDismissBehavior;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    @Override // defpackage.hj
    public final boolean a(View view) {
        int width;
        boolean z = false;
        if (!this.a.x(view)) {
            return false;
        }
        boolean z2 = gl.f(view) == 1;
        int i = this.a.b;
        if (i == 0) {
            if (z2) {
                width = -view.getWidth();
            }
            gl.x(view, width);
            view.setAlpha(0.0f);
            return true;
        }
        z = z2;
        if (i != 1 || z) {
            width = view.getWidth();
        } else {
            width = -view.getWidth();
        }
        gl.x(view, width);
        view.setAlpha(0.0f);
        return true;
    }
}
