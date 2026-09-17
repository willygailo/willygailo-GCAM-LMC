package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
final class oai extends AnimatorListenerAdapter {
    final /* synthetic */ oal a;

    public oai(oal oalVar) {
        this.a = oalVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.a();
        ga gaVar = this.a.i;
        if (gaVar != null) {
            gaVar.j();
        }
    }
}
