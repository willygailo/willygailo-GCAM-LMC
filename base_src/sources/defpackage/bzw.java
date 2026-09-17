package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
final class bzw extends AnimatorListenerAdapter {
    final /* synthetic */ bzy a;

    public bzw(bzy bzyVar) {
        this.a = bzyVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.g = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.setVisibility(0);
        this.a.a.setAlpha(0.0f);
        this.a.b.setAlpha(0.0f);
    }
}
