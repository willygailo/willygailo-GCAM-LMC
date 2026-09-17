package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class oap extends AnimatorListenerAdapter {
    final /* synthetic */ oas a;

    public oap(oas oasVar) {
        this.a = oasVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        oas oasVar = this.a;
        List<ga> list = oasVar.f;
        if (list == null || oasVar.g) {
            return;
        }
        for (ga gaVar : list) {
        }
    }
}
