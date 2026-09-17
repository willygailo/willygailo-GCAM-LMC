package defpackage;

import android.animation.ValueAnimator;
import com.google.android.apps.camera.ui.views.FrontLensIndicatorOverlay;

/* JADX INFO: loaded from: classes2.dex */
public final class joo implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ FrontLensIndicatorOverlay a;
    private final /* synthetic */ int b;

    public joo(FrontLensIndicatorOverlay frontLensIndicatorOverlay, int i) {
        this.b = i;
        this.a = frontLensIndicatorOverlay;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                this.a.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrontLensIndicatorOverlay frontLensIndicatorOverlay = this.a;
                frontLensIndicatorOverlay.d.setStrokeWidth(frontLensIndicatorOverlay.n);
                this.a.invalidate();
                break;
            case 1:
                this.a.h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.a.invalidate();
                FrontLensIndicatorOverlay frontLensIndicatorOverlay2 = this.a;
                if (frontLensIndicatorOverlay2.h == 360) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                    valueAnimatorOfFloat.setDuration(250L);
                    valueAnimatorOfFloat.setInterpolator(frontLensIndicatorOverlay2.f);
                    valueAnimatorOfFloat.addListener(new jop(frontLensIndicatorOverlay2));
                    valueAnimatorOfFloat.addUpdateListener(new joo(frontLensIndicatorOverlay2, 2));
                    valueAnimatorOfFloat.start();
                }
                break;
            default:
                this.a.m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrontLensIndicatorOverlay frontLensIndicatorOverlay3 = this.a;
                frontLensIndicatorOverlay3.e.setAlpha((int) (frontLensIndicatorOverlay3.m * 255.0f));
                this.a.invalidate();
                break;
        }
    }
}
