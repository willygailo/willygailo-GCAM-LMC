package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class aac implements ft {
    final /* synthetic */ CoordinatorLayout a;

    public aac(CoordinatorLayout coordinatorLayout) {
        this.a = coordinatorLayout;
    }

    @Override // defpackage.ft
    public final gy a(View view, gy gyVar) {
        CoordinatorLayout coordinatorLayout = this.a;
        if (!Objects.equals(coordinatorLayout.f, gyVar)) {
            coordinatorLayout.f = gyVar;
            boolean z = gyVar.d() > 0;
            coordinatorLayout.g = z;
            coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
            if (!gyVar.r()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (gl.R(childAt) && ((aah) childAt.getLayoutParams()).a != null && gyVar.r()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return gyVar;
    }
}
