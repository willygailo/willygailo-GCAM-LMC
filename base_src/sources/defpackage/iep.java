package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class iep implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ies a;
    private final /* synthetic */ int b;

    public /* synthetic */ iep(ies iesVar, int i) {
        this.b = i;
        this.a = iesVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                ies iesVar = this.a;
                iesVar.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                iesVar.requestLayout();
                break;
            case 1:
                ies iesVar2 = this.a;
                iesVar2.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (iesVar2.f == 1) {
                    iesVar2.setAlpha(1.0f - valueAnimator.getAnimatedFraction());
                }
                iesVar2.requestLayout();
                break;
            default:
                ies iesVar3 = this.a;
                iesVar3.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                iesVar3.requestLayout();
                break;
        }
    }
}
