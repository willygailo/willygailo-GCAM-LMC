package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
final class oax extends AnimatorListenerAdapter {
    final /* synthetic */ oaz a;

    public oax(oaz oazVar) {
        this.a = oazVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        oaz oazVar = this.a;
        oazVar.c = (oazVar.c + 1) % oazVar.b.c.length;
        oazVar.d = true;
    }
}
