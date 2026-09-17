package defpackage;

import android.animation.Animator;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class fem implements Animator.AnimatorListener {
    final /* synthetic */ View a;
    final /* synthetic */ fen b;

    public fem(fen fenVar, View view) {
        this.b = fenVar;
        this.a = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setAlpha(0.0f);
        this.a.setVisibility(8);
        this.b.a.removeAllListeners();
        this.b.a = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.setVisibility(0);
    }
}
