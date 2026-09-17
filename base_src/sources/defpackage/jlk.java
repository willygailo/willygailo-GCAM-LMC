package defpackage;

import android.animation.ValueAnimator;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButtonProgressOverlay;

/* JADX INFO: loaded from: classes2.dex */
public final class jlk implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ ShutterButtonProgressOverlay a;
    private final /* synthetic */ int b;

    public jlk(ShutterButtonProgressOverlay shutterButtonProgressOverlay, int i) {
        this.b = i;
        this.a = shutterButtonProgressOverlay;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                this.a.b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.a.invalidate();
                break;
            case 1:
                this.a.d = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.a.invalidate();
                break;
            case 2:
                this.a.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ShutterButtonProgressOverlay shutterButtonProgressOverlay = this.a;
                shutterButtonProgressOverlay.a.setStrokeWidth(shutterButtonProgressOverlay.c);
                this.a.invalidate();
                break;
            default:
                this.a.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.a.invalidate();
                break;
        }
    }
}
