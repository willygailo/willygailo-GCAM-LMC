package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
final class oah extends AnimatorListenerAdapter {
    final /* synthetic */ oal a;

    public oah(oal oalVar) {
        this.a = oalVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        oal oalVar = this.a;
        oalVar.f = (oalVar.f + 4) % oalVar.e.c.length;
    }
}
