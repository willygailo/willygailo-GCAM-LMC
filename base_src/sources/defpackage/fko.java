package defpackage;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
final class fko implements View.OnAttachStateChangeListener {
    final /* synthetic */ AnimatedVectorDrawable a;
    final /* synthetic */ FrameLayout b;
    final /* synthetic */ fkp c;

    public fko(fkp fkpVar, AnimatedVectorDrawable animatedVectorDrawable, FrameLayout frameLayout) {
        this.c = fkpVar;
        this.a = animatedVectorDrawable;
        this.b = frameLayout;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.registerAnimationCallback(new fkn(this));
        this.a.start();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.clearAnimationCallbacks();
        this.b.removeOnAttachStateChangeListener(this);
    }
}
