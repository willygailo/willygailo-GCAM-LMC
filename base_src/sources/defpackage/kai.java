package defpackage;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import com.google.android.apps.camera.zoomui.ZoomUi;

/* JADX INFO: loaded from: classes2.dex */
public final class kai implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ ZoomUi a;
    private final /* synthetic */ int b;

    public kai(ZoomUi zoomUi, int i) {
        this.b = i;
        this.a = zoomUi;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.a.e().getLayoutParams();
                layoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.a.e().setLayoutParams(layoutParams);
                break;
            case 1:
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.a.e().getLayoutParams();
                layoutParams2.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.a.e().setLayoutParams(layoutParams2);
                break;
            case 2:
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.a.e().getLayoutParams();
                layoutParams3.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.a.e().setLayoutParams(layoutParams3);
                break;
            default:
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.a.e().getLayoutParams();
                layoutParams4.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.a.e().setLayoutParams(layoutParams4);
                break;
        }
    }
}
