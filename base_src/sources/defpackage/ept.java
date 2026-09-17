package defpackage;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
final class ept implements View.OnAttachStateChangeListener {
    final /* synthetic */ AnimatedVectorDrawable a;
    final /* synthetic */ AnimatedVectorDrawable b;
    final /* synthetic */ View c;

    public ept(AnimatedVectorDrawable animatedVectorDrawable, AnimatedVectorDrawable animatedVectorDrawable2, View view) {
        this.a = animatedVectorDrawable;
        this.b = animatedVectorDrawable2;
        this.c = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        epw.c(this.a);
        epw.c(this.b);
        this.c.removeOnAttachStateChangeListener(this);
    }
}
