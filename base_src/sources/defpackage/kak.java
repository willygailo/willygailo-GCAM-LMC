package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.zoomui.ZoomUi;

/* JADX INFO: loaded from: classes2.dex */
final class kak extends AnimatorListenerAdapter {
    final /* synthetic */ ZoomUi a;

    public kak(ZoomUi zoomUi) {
        this.a = zoomUi;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.a.b().setAlpha(1.0f);
        this.a.f().setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        this.a.b().setAlpha(0.0f);
        this.a.f().setAlpha(0.0f);
        if (this.a.e().getVisibility() != 8) {
            this.a.b().setVisibility(0);
            this.a.f().setVisibility(0);
        }
    }
}
