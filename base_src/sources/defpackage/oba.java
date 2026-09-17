package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
final class oba extends AnimatorListenerAdapter {
    final /* synthetic */ obc a;

    public oba(obc obcVar) {
        this.a = obcVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        obc obcVar = this.a;
        if (obcVar.i) {
            obcVar.c.setRepeatCount(-1);
            this.a.m.j();
            this.a.i = false;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        obc obcVar = this.a;
        obcVar.f = (obcVar.f + 1) % obcVar.e.c.length;
        obcVar.g = true;
    }
}
