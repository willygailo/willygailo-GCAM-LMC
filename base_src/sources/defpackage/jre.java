package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.ui.zoomlock.ZoomLockView;

/* JADX INFO: loaded from: classes2.dex */
public final class jre extends AnimatorListenerAdapter {
    final /* synthetic */ ZoomLockView a;

    public jre(ZoomLockView zoomLockView) {
        this.a = zoomLockView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setVisibility(8);
        this.a.e.setTranslationX(0.0f);
        this.a.e.setTranslationY(0.0f);
        this.a.a.setTranslationY(0.0f);
        this.a.a.setTranslationX(0.0f);
        this.a.b.setScaleX(0.0f);
        this.a.b.setScaleY(0.0f);
        this.a.b.setTranslationX(0.0f);
        this.a.b.setTranslationY(0.0f);
        ZoomLockView zoomLockView = this.a;
        zoomLockView.f = false;
        zoomLockView.setAlpha(1.0f);
        super.onAnimationEnd(animator);
    }
}
