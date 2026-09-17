package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class joi implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ jom a;
    private final /* synthetic */ int b;

    public /* synthetic */ joi(jom jomVar, int i) {
        this.b = i;
        this.a = jomVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                jom jomVar = this.a;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jomVar.e = fFloatValue;
                jomVar.a.setStrokeWidth(fFloatValue);
                jomVar.invalidate();
                break;
            case 1:
                jom jomVar2 = this.a;
                jomVar2.d = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                jomVar2.invalidate();
                break;
            case 2:
                this.a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                jom jomVar3 = this.a;
                jomVar3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jomVar3.invalidate();
                break;
            default:
                this.a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
