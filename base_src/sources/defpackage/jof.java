package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.google.android.apps.camera.ui.views.CaptureAnimationOverlay;

/* JADX INFO: loaded from: classes2.dex */
public final class jof extends AnimatorListenerAdapter {
    final /* synthetic */ ValueAnimator a;
    final /* synthetic */ CaptureAnimationOverlay b;

    public jof(CaptureAnimationOverlay captureAnimationOverlay, ValueAnimator valueAnimator) {
        this.b = captureAnimationOverlay;
        this.a = valueAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.start();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        CaptureAnimationOverlay captureAnimationOverlay = this.b;
        captureAnimationOverlay.c = 2;
        captureAnimationOverlay.setVisibility(0);
    }
}
