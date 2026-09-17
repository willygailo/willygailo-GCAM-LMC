package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.zoomui.ZoomUi;

/* JADX INFO: loaded from: classes2.dex */
final class kal extends AnimatorListenerAdapter {
    final /* synthetic */ ZoomUi a;

    public kal(ZoomUi zoomUi) {
        this.a = zoomUi;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.a.n().b(false);
        this.a.n().setVisibility(0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        this.a.n().b(false);
        this.a.n().setVisibility(4);
    }
}
