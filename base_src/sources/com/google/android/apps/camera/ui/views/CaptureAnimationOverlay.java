package com.google.android.apps.camera.ui.views;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import defpackage.joe;
import defpackage.jof;
import defpackage.jog;
import defpackage.joh;

/* JADX INFO: loaded from: classes.dex */
public class CaptureAnimationOverlay extends View {
    public final Paint a;
    public AnimatorSet b;
    public int c;
    private final RectF d;
    private final Interpolator e;
    private final Interpolator f;
    private final Interpolator g;
    private final ValueAnimator.AnimatorUpdateListener h;

    public CaptureAnimationOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 1;
        this.d = new RectF();
        Paint paint = new Paint();
        this.a = paint;
        paint.setColor(-16777216);
        this.e = new LinearInterpolator();
        this.f = AnimationUtils.loadInterpolator(getContext(), R.interpolator.fast_out_slow_in);
        this.g = AnimationUtils.loadInterpolator(getContext(), R.interpolator.fast_out_linear_in);
        this.h = new joe(this);
    }

    public final void a(boolean z) {
        ValueAnimator valueAnimatorOfFloat;
        AnimatorSet animatorSet = this.b;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.b.cancel();
        }
        if (z) {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 0.6f);
            valueAnimatorOfFloat.setDuration(60L);
            valueAnimatorOfFloat.setInterpolator(this.f);
        } else {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(0.6f, 0.0f);
            valueAnimatorOfFloat.setDuration(60L);
            valueAnimatorOfFloat.setInterpolator(this.g);
        }
        valueAnimatorOfFloat.addUpdateListener(this.h);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.b = animatorSet2;
        animatorSet2.play(valueAnimatorOfFloat);
        this.b.addListener(new joh(this, z));
        this.b.start();
    }

    public final void b() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.76f, 0.76f);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.76f, 0.0f);
        valueAnimatorOfFloat.setDuration(33L);
        valueAnimatorOfFloat2.setDuration(70L);
        valueAnimatorOfFloat.addUpdateListener(this.h);
        valueAnimatorOfFloat2.addUpdateListener(this.h);
        valueAnimatorOfFloat.setInterpolator(this.e);
        valueAnimatorOfFloat2.setInterpolator(this.e);
        valueAnimatorOfFloat.addListener(new jof(this, valueAnimatorOfFloat2));
        valueAnimatorOfFloat2.addListener(new jog(this));
        valueAnimatorOfFloat.start();
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        this.d.set(new Rect(i, i2, i3, i4));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.c != 1) {
            canvas.drawRect(this.d, this.a);
            canvas.clipRect(this.d);
        }
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.d.set(i, i2, i3, i4);
    }
}
