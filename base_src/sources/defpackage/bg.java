package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: loaded from: classes.dex */
final class bg implements Animation.AnimationListener {
    final /* synthetic */ dp a;
    final /* synthetic */ ViewGroup b;
    final /* synthetic */ View c;
    final /* synthetic */ bi d;

    public bg(dp dpVar, ViewGroup viewGroup, View view, bi biVar) {
        this.a = dpVar;
        this.b = viewGroup;
        this.c = view;
        this.d = biVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.b.post(new bf(this));
        if (cu.Q(2)) {
            String str = "Animation from operation " + this.a + " has ended.";
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (cu.Q(2)) {
            String str = "Animation from operation " + this.a + " has reached onAnimationStart.";
        }
    }
}
