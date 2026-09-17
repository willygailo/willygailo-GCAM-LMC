package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
final class bd extends AnimatorListenerAdapter {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ View b;
    final /* synthetic */ boolean c;
    final /* synthetic */ dp d;
    final /* synthetic */ bi e;

    public bd(ViewGroup viewGroup, View view, boolean z, dp dpVar, bi biVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = dpVar;
        this.e = biVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.endViewTransition(this.b);
        if (this.c) {
            d.o(this.d.e, this.b);
        }
        this.e.b();
        if (cu.Q(2)) {
            String str = "Animator from operation " + this.d + " has ended.";
        }
    }
}
