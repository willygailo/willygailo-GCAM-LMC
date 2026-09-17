package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.ui.views.CaptureAnimationOverlay;

/* JADX INFO: loaded from: classes2.dex */
public final class joh extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ CaptureAnimationOverlay b;

    public joh(CaptureAnimationOverlay captureAnimationOverlay, boolean z) {
        this.b = captureAnimationOverlay;
        this.a = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.a) {
            return;
        }
        CaptureAnimationOverlay captureAnimationOverlay = this.b;
        captureAnimationOverlay.c = 1;
        captureAnimationOverlay.setVisibility(4);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            return;
        }
        CaptureAnimationOverlay captureAnimationOverlay = this.b;
        captureAnimationOverlay.c = 1;
        captureAnimationOverlay.setVisibility(4);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.a) {
            CaptureAnimationOverlay captureAnimationOverlay = this.b;
            captureAnimationOverlay.c = 3;
            captureAnimationOverlay.setVisibility(0);
        }
    }
}
