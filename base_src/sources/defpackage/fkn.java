package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
final class fkn extends Animatable2.AnimationCallback {
    final /* synthetic */ fko a;

    public fkn(fko fkoVar) {
        this.a = fkoVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        fko fkoVar = this.a;
        lar larVar = fkoVar.c.a;
        AnimatedVectorDrawable animatedVectorDrawable = fkoVar.a;
        animatedVectorDrawable.getClass();
        larVar.execute(new fkm(animatedVectorDrawable, 0));
    }
}
