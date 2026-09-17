package com.google.android.apps.camera.ui.shutterbutton;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.jlk;
import defpackage.jll;
import defpackage.jlm;

/* JADX INFO: loaded from: classes.dex */
public class ShutterButtonProgressOverlay extends View {
    public final Paint a;
    public int b;
    public float c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public AnimatorSet i;
    public ValueAnimator j;
    public int k;
    private final int l;
    private final Paint m;
    private final Interpolator n;
    private final Interpolator o;
    private int p;
    private int q;
    private int r;
    private final RectF s;
    private AnimatorSet t;

    public ShutterButtonProgressOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = 1;
        this.d = 0;
        this.p = 0;
        this.s = new RectF();
        this.g = true;
        this.h = true;
        this.i = null;
        this.t = null;
        this.j = null;
        setVisibility(4);
        this.l = context.getResources().getDimensionPixelSize(R.dimen.pie_progress_radius_max);
        this.e = context.getResources().getDimensionPixelSize(R.dimen.pie_progress_radius);
        this.f = context.getResources().getDimensionPixelSize(R.dimen.pie_progress_width);
        this.n = new LinearInterpolator();
        this.o = AnimationUtils.loadInterpolator(getContext(), android.R.interpolator.fast_out_slow_in);
        Paint paint = new Paint();
        this.a = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setAlpha(51);
        Paint paint2 = new Paint(paint);
        this.m = paint2;
        paint2.setAlpha(255);
        this.g = true;
    }

    public final void a() {
        AnimatorSet animatorSet = this.t;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.t.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f, 0.0f);
        valueAnimatorOfFloat.setDuration(120L);
        valueAnimatorOfFloat.setInterpolator(this.n);
        valueAnimatorOfFloat.addUpdateListener(new jlk(this, 3));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.t = animatorSet2;
        animatorSet2.play(valueAnimatorOfFloat);
        this.t.addListener(new jlm(this));
        this.t.start();
    }

    public final void b(int i, long j, boolean z) {
        int iMin = Math.min(100, Math.max(i, 0));
        if (iMin == 0) {
            AnimatorSet animatorSet = this.t;
            if (animatorSet != null && animatorSet.isRunning()) {
                this.t.cancel();
            }
            if (this.g) {
                this.d = 0;
                this.p = 0;
                this.g = false;
                this.h = true;
                AnimatorSet animatorSet2 = this.i;
                if (animatorSet2 != null && animatorSet2.isRunning()) {
                    this.i.cancel();
                }
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.l, this.e);
                valueAnimatorOfInt.setDuration(120L);
                valueAnimatorOfInt.setInterpolator(this.o);
                valueAnimatorOfInt.addUpdateListener(new jlk(this, 0));
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.f);
                valueAnimatorOfFloat.setDuration(120L);
                valueAnimatorOfFloat.setInterpolator(this.o);
                valueAnimatorOfFloat.addUpdateListener(new jlk(this, 2));
                AnimatorSet animatorSet3 = new AnimatorSet();
                this.i = animatorSet3;
                animatorSet3.playTogether(valueAnimatorOfInt, valueAnimatorOfFloat);
                this.i.addListener(new jll(this));
                this.i.start();
                return;
            }
            return;
        }
        AnimatorSet animatorSet4 = this.i;
        if (animatorSet4 != null && animatorSet4.isRunning()) {
            this.i.cancel();
        }
        this.k = 4;
        if (j > 0) {
            ValueAnimator valueAnimator = this.j;
            boolean z2 = valueAnimator != null && valueAnimator.isRunning();
            if (iMin < 100 && !z2) {
                long j2 = true != z ? j : 3000L;
                int i2 = z ? (int) (j / 3000) : 0;
                ValueAnimator valueAnimator2 = this.j;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.j.cancel();
                }
                ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(0, 360);
                this.j = valueAnimatorOfInt2;
                valueAnimatorOfInt2.setDuration(j2);
                this.j.setInterpolator(this.o);
                this.j.addUpdateListener(new jlk(this, 1));
                this.j.setRepeatCount(i2);
                this.j.start();
            }
        } else {
            this.d = (int) (iMin * 3.6f);
            invalidate();
        }
        if (iMin == 100) {
            ValueAnimator valueAnimator3 = this.j;
            if (valueAnimator3 != null && valueAnimator3.isRunning()) {
                this.j.cancel();
            }
            a();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.k == 1) {
            return;
        }
        if (this.h) {
            canvas.drawCircle(this.q, this.r, this.b, this.a);
        }
        int i = this.k;
        if (i == 4 || i == 3) {
            this.a.setStrokeWidth(this.c);
            this.m.setStrokeWidth(this.c);
            RectF rectF = this.s;
            int i2 = this.q;
            int i3 = this.b;
            int i4 = this.r;
            rectF.set(i2 - i3, i4 - i3, i2 + i3, i4 + i3);
            canvas.drawArc(this.s, this.p - 100, 20.0f, false, this.m);
            this.p = this.d;
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            this.q = (i3 - i) / 2;
            this.r = (i4 - i2) / 2;
        }
    }
}
