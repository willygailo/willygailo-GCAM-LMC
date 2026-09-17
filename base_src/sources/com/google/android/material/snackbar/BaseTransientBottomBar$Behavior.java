package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import defpackage.kkm;
import defpackage.ock;

/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior {
    public BaseTransientBottomBar$Behavior() {
        this.d = SwipeDismissBehavior.y(0.1f);
        this.e = SwipeDismissBehavior.y(0.6f);
        this.b = 0;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.aae
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        switch (motionEvent.getActionMasked()) {
            case 0:
                if (coordinatorLayout.m(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    synchronized (kkm.a().a) {
                        break;
                    }
                }
                break;
            case 1:
            case 3:
                synchronized (kkm.a().a) {
                    break;
                }
                break;
        }
        return super.d(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean x(View view) {
        return view instanceof ock;
    }
}
