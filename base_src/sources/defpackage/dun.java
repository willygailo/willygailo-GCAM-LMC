package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;

/* JADX INFO: loaded from: classes.dex */
public final class dun extends AnimatorListenerAdapter {
    final /* synthetic */ FocusIndicatorView a;

    public dun(FocusIndicatorView focusIndicatorView) {
        this.a = focusIndicatorView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.m = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.m = animator;
    }
}
