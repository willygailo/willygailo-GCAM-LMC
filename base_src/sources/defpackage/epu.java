package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
final class epu extends Animatable2.AnimationCallback {
    final /* synthetic */ AnimatedVectorDrawable a;
    final /* synthetic */ epw b;

    public epu(epw epwVar, AnimatedVectorDrawable animatedVectorDrawable) {
        this.b = epwVar;
        this.a = animatedVectorDrawable;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        lar larVar = this.b.a;
        AnimatedVectorDrawable animatedVectorDrawable = this.a;
        animatedVectorDrawable.getClass();
        larVar.execute(new fkm(animatedVectorDrawable, 1));
    }
}
