package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
final class hmu extends AnimatorListenerAdapter {
    final /* synthetic */ hmy a;

    public hmu(hmy hmyVar) {
        this.a = hmyVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.h.setVisibility(8);
        this.a.h.removeAllViews();
        this.a.i.setVisibility(8);
        this.a.i.removeAllViews();
        this.a.l.e.animate().alpha(1.0f).withStartAction(new hng(this.a.l.e, 1)).start();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        this.a.l.e.k();
    }
}
