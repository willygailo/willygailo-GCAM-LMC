package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.google.android.apps.camera.ui.views.FrontLensIndicatorOverlay;

/* JADX INFO: loaded from: classes2.dex */
public final class jon extends AnimatorListenerAdapter {
    final /* synthetic */ FrontLensIndicatorOverlay a;

    public jon(FrontLensIndicatorOverlay frontLensIndicatorOverlay) {
        this.a = frontLensIndicatorOverlay;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        FrontLensIndicatorOverlay frontLensIndicatorOverlay = this.a;
        frontLensIndicatorOverlay.p = 4;
        frontLensIndicatorOverlay.n = frontLensIndicatorOverlay.i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ValueAnimator valueAnimator = this.a.b;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            FrontLensIndicatorOverlay frontLensIndicatorOverlay = this.a;
            frontLensIndicatorOverlay.p = 4;
            ValueAnimator valueAnimator2 = frontLensIndicatorOverlay.b;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                frontLensIndicatorOverlay.b.cancel();
            }
            frontLensIndicatorOverlay.b = ValueAnimator.ofInt(0, 360);
            frontLensIndicatorOverlay.b.setDuration(250L);
            frontLensIndicatorOverlay.b.setInterpolator(frontLensIndicatorOverlay.g);
            frontLensIndicatorOverlay.b.addUpdateListener(new joo(frontLensIndicatorOverlay, 1));
            frontLensIndicatorOverlay.b.start();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        FrontLensIndicatorOverlay frontLensIndicatorOverlay = this.a;
        frontLensIndicatorOverlay.p = 2;
        frontLensIndicatorOverlay.setVisibility(0);
        this.a.e.setAlpha(255);
    }
}
