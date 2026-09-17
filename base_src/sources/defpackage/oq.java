package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes2.dex */
final class oq implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ or a;

    public oq(or orVar) {
        this.a = orVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        this.a.b.setAlpha(iFloatValue);
        this.a.c.setAlpha(iFloatValue);
        this.a.d();
    }
}
