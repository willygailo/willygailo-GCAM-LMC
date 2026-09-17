package com.google.android.apps.camera.autotimer.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import com.google.android.GoogleCameraEngR18F1.R;
import j$.time.Duration;

/* JADX INFO: loaded from: classes.dex */
public final class AutoTimerIndicatorView extends View {
    public static final Duration a = Duration.ofMillis(250);
    static final Duration b = Duration.ofMillis(100);
    public final View.OnLayoutChangeListener c;
    final Paint d;
    final ValueAnimator e;
    public ViewPropertyAnimator f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final float l;
    private final float m;
    private final float n;
    private final Matrix o;
    private final Paint p;
    private final Paint q;
    private final RectF r;
    private final RectF s;
    private final RectF t;
    private final RectF u;
    private int v;
    private float w;

    public AutoTimerIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayerType(2, null);
        Resources resources = getResources();
        this.h = resources.getDimensionPixelSize(R.dimen.autotimer_indicator_height);
        this.k = resources.getDimensionPixelSize(R.dimen.autotimer_indicator_rounded_corner);
        this.j = resources.getDimensionPixelSize(R.dimen.autotimer_indicator_min_width);
        this.i = resources.getDimensionPixelSize(R.dimen.autotimer_indicator_margin);
        int color = resources.getColor(R.color.autotimer_indicator_foreground);
        this.g = color;
        float dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.autotimer_indicator_border_width);
        this.l = dimensionPixelSize;
        this.o = new Matrix();
        this.r = new RectF();
        this.u = new RectF();
        this.s = new RectF();
        this.t = new RectF();
        Paint paint = new Paint();
        this.d = paint;
        paint.setColor(color);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.p = paint2;
        paint2.setColor(resources.getColor(R.color.autotimer_indicator_background));
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.q = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setColor(resources.getColor(R.color.autotimer_indicator_background_stroke));
        paint3.setAntiAlias(true);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint3.setStrokeWidth(dimensionPixelSize);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f);
        this.e = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: caf
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.invalidate();
            }
        });
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        float integer = resources.getInteger(R.integer.autotimer_indicator_foreground_alpha_min);
        float integer2 = resources.getInteger(R.integer.autotimer_indicator_foreground_alpha_max);
        this.m = integer / integer2;
        this.n = (integer2 - integer) / integer2;
        this.c = new View.OnLayoutChangeListener() { // from class: cag
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                this.a.b(i, i2, i3, i4);
            }
        };
    }

    private static RectF c(int i, int i2, int i3, int i4, int i5) {
        return (i5 == 1 || i5 == 3) ? new RectF(i2, i, i4, i3) : new RectF(i, i2, i3, i4);
    }

    public final void a(float f) {
        this.w = f;
        if (getVisibility() == 0) {
            if (this.e.isRunning()) {
                this.e.cancel();
            }
            this.e.setFloatValues(((Float) this.e.getAnimatedValue()).floatValue(), f);
            this.e.setDuration(b.toMillis());
            this.e.start();
        }
    }

    public final void b(int i, int i2, int i3, int i4) {
        Display display = getDisplay();
        int rotation = display != null ? display.getRotation() : 0;
        this.v = rotation;
        this.o.reset();
        this.o.postRotate((-rotation) * 90, 0.5f, 0.5f);
        this.o.postTranslate((i3 - i) * 0.5f, (i4 - i2) * 0.5f);
        RectF rectFC = c(i, i2, i3, i4, this.v);
        this.t.top = ((-rectFC.height()) * 0.5f) + this.i;
        RectF rectF = this.t;
        rectF.bottom = rectF.top + this.h;
        this.t.left = ((-rectFC.width()) * 0.5f) + this.i;
        RectF rectF2 = this.t;
        rectF2.right = -rectF2.left;
        this.s.top = this.t.top;
        this.s.bottom = this.t.bottom;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        RectF rectFC = c(getLeft(), getTop(), getRight(), getBottom(), this.v);
        float fFloatValue = ((Float) this.e.getAnimatedValue()).floatValue();
        int i = this.j;
        float fWidth = rectFC.width();
        int i2 = this.i;
        this.s.left = (-Math.max(i, (int) ((fWidth - (i2 + i2)) * fFloatValue))) * 0.5f;
        RectF rectF = this.s;
        rectF.right = -rectF.left;
        this.o.mapRect(this.u, this.s);
        this.o.mapRect(this.r, this.t);
        this.d.setColor((((int) (((this.w * this.n) + this.m) * 255.0f)) << 24) | (this.g & 16777215));
        RectF rectF2 = this.r;
        float f = this.k;
        canvas.drawRoundRect(rectF2, f, f, this.p);
        float f2 = this.r.left;
        float f3 = this.l;
        float f4 = this.r.top;
        float f5 = this.l;
        float f6 = this.r.right;
        float f7 = this.l;
        float f8 = this.r.bottom;
        float f9 = this.l;
        float f10 = this.k;
        canvas.drawRoundRect(f2 - f3, f4 - f5, f6 + f7, f8 + f9, f10, f10, this.q);
        RectF rectF3 = this.u;
        float f11 = this.k;
        canvas.drawRoundRect(rectF3, f11, f11, this.d);
    }
}
