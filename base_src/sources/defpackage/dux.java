package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class dux implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ duy a;
    private final /* synthetic */ int b;

    public dux(duy duyVar, int i) {
        this.b = i;
        this.a = duyVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                this.a.c.d(((Float) valueAnimator.getAnimatedValue()).floatValue());
                this.a.a.invalidate();
                break;
            case 1:
                this.a.c.c(((Float) valueAnimator.getAnimatedValue()).floatValue());
                this.a.a.invalidate();
                break;
            case 2:
                this.a.b.d(((Float) valueAnimator.getAnimatedValue()).floatValue());
                this.a.a.invalidate();
                break;
            case 3:
                this.a.b.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                this.a.a.invalidate();
                break;
            default:
                this.a.b.f(((Float) valueAnimator.getAnimatedValue()).floatValue());
                this.a.a.invalidate();
                break;
        }
    }
}
