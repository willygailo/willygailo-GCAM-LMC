package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class nyw extends AnimatorListenerAdapter {
    final /* synthetic */ nzf a;
    private boolean b;

    public nyw(nzf nzfVar) {
        this.a = nzfVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        nzf nzfVar = this.a;
        nzfVar.w = 0;
        nzfVar.r = null;
        if (this.b) {
            return;
        }
        nzfVar.x.g(4, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.x.g(0, false);
        nzf nzfVar = this.a;
        nzfVar.w = 1;
        nzfVar.r = animator;
        this.b = false;
    }
}
