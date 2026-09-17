package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import com.google.android.apps.camera.ui.zoomlock.ZoomLockView;

/* JADX INFO: loaded from: classes2.dex */
public final class jrb implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ ZoomLockView a;

    public jrb(ZoomLockView zoomLockView) {
        this.a = zoomLockView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((GradientDrawable) this.a.b.getBackground()).setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
