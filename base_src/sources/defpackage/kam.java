package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.ViewGroup;
import com.google.android.apps.camera.zoomui.ZoomUi;

/* JADX INFO: loaded from: classes2.dex */
final class kam extends AnimatorListenerAdapter {
    final /* synthetic */ ZoomUi a;

    public kam(ZoomUi zoomUi) {
        this.a = zoomUi;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a.e().getVisibility() == 8) {
            this.a.e().setVisibility(0);
            this.a.b().setVisibility(0);
            this.a.f().setVisibility(0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ViewGroup viewGroupB = this.a.b();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupB, (Property<ViewGroup, Float>) ZoomUi.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(60L);
        objectAnimatorOfFloat.setInterpolator(new adt());
        objectAnimatorOfFloat.addListener(new kaj(viewGroupB));
        objectAnimatorOfFloat.start();
    }
}
