package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.aae;
import defpackage.nwj;
import defpackage.nxi;

/* JADX INFO: loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior extends aae {
    public ViewPropertyAnimator a;
    private int b;
    private int c;

    public HideBottomViewOnScrollBehavior() {
        this.b = 0;
        this.c = 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.c = 2;
    }

    private final void x(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.a = view.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new nxi(this));
    }

    @Override // defpackage.aae
    public final boolean e(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.b = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        return false;
    }

    @Override // defpackage.aae
    public final void n(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        if (i > 0) {
            if (this.c == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.a;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.c = 1;
            x(view, this.b, 175L, nwj.c);
            return;
        }
        if (i >= 0 || this.c == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.a;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.c = 2;
        x(view, 0, 225L, nwj.d);
    }

    @Override // defpackage.aae
    public final boolean q(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        return i == 2;
    }
}
