package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
final class jes extends AnimatorListenerAdapter {
    final /* synthetic */ jet a;

    public jes(jet jetVar) {
        this.a = jetVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        jet jetVar = this.a;
        jetVar.h.o(jetVar.g, true);
        jev jevVar = jetVar.l;
        if (jevVar != null) {
            jevVar.a();
        }
        jetVar.f = false;
        this.a.h(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.h(false);
    }
}
