package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes2.dex */
final class nyz implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ float a;
    final /* synthetic */ float b;
    final /* synthetic */ float c;
    final /* synthetic */ float d;
    final /* synthetic */ float e;
    final /* synthetic */ float f;
    final /* synthetic */ float g;
    final /* synthetic */ Matrix h;
    final /* synthetic */ nzf i;

    public nyz(nzf nzfVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, Matrix matrix) {
        this.i = nzfVar;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = matrix;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.i.x.setAlpha(nwj.b(this.a, this.b, 0.0f, 0.2f, fFloatValue));
        this.i.x.setScaleX(nwj.a(this.c, this.d, fFloatValue));
        this.i.x.setScaleY(nwj.a(this.e, this.d, fFloatValue));
        this.i.u = nwj.a(this.f, this.g, fFloatValue);
        this.i.d(nwj.a(this.f, this.g, fFloatValue), this.h);
        this.i.x.setImageMatrix(this.h);
    }
}
