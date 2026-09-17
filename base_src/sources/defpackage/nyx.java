package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class nyx extends AnimatorListenerAdapter {
    final /* synthetic */ nzf a;

    public nyx(nzf nzfVar) {
        this.a = nzfVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        nzf nzfVar = this.a;
        nzfVar.w = 0;
        nzfVar.r = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.x.g(0, false);
        nzf nzfVar = this.a;
        nzfVar.w = 2;
        nzfVar.r = animator;
    }
}
