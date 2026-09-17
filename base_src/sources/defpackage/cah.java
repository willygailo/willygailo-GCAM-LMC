package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.autotimer.ui.AutoTimerIndicatorView;

/* JADX INFO: loaded from: classes.dex */
public final class cah extends AnimatorListenerAdapter {
    final /* synthetic */ AutoTimerIndicatorView a;

    public cah(AutoTimerIndicatorView autoTimerIndicatorView) {
        this.a = autoTimerIndicatorView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setVisibility(0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.setVisibility(0);
    }
}
