package defpackage;

import android.animation.ValueAnimator;
import com.google.android.apps.camera.ui.views.CaptureAnimationOverlay;

/* JADX INFO: loaded from: classes2.dex */
public final class joe implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ CaptureAnimationOverlay a;

    public joe(CaptureAnimationOverlay captureAnimationOverlay) {
        this.a = captureAnimationOverlay;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
        this.a.invalidate();
    }
}
