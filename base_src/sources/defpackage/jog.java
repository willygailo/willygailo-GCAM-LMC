package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.ui.views.CaptureAnimationOverlay;

/* JADX INFO: loaded from: classes2.dex */
public final class jog extends AnimatorListenerAdapter {
    final /* synthetic */ CaptureAnimationOverlay a;

    public jog(CaptureAnimationOverlay captureAnimationOverlay) {
        this.a = captureAnimationOverlay;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        CaptureAnimationOverlay captureAnimationOverlay = this.a;
        captureAnimationOverlay.c = 1;
        captureAnimationOverlay.setVisibility(4);
    }
}
