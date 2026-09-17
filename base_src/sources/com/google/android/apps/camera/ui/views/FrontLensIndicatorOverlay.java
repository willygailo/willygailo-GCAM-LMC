package com.google.android.apps.camera.ui.views;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import defpackage.bpx;
import defpackage.dcw;
import defpackage.dcy;
import defpackage.ddf;
import defpackage.ddl;
import defpackage.jrz;
import defpackage.mip;
import defpackage.obr;
import defpackage.ouj;

/* JADX INFO: loaded from: classes.dex */
public class FrontLensIndicatorOverlay extends View {
    public static final ouj a = ouj.h("com/google/android/apps/camera/ui/views/FrontLensIndicatorOverlay");
    public ValueAnimator b;
    public final dcw c;
    public final Paint d;
    public final Paint e;
    public final Interpolator f;
    public final Interpolator g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public jrz o;
    public int p;
    private final RectF q;

    /* JADX WARN: Multi-variable type inference failed */
    public FrontLensIndicatorOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = null;
        this.q = new RectF();
        this.h = 0;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 0.0f;
        this.m = 1.0f;
        this.o = jrz.PORTRAIT;
        this.p = 1;
        ddf ddfVarA = ((bpx) context).a();
        this.c = dcy.a(ddfVarA, ((Integer) ddfVarA.a(dcy.a).c()).intValue());
        this.f = new LinearInterpolator();
        this.g = AnimationUtils.loadInterpolator(getContext(), R.interpolator.fast_out_slow_in);
        this.i = context.getResources().getDimensionPixelSize(com.google.android.GoogleCameraEngR18F1.R.dimen.pie_progress_front_lens_width);
        Paint paint = new Paint();
        this.d = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(ddfVarA.k(ddl.ay) ? obr.e(this, com.google.android.GoogleCameraEngR18F1.R.attr.colorOnSurface) : -1);
        paint.setAlpha(51);
        Paint paint2 = new Paint(paint);
        this.e = paint2;
        paint2.setAlpha((int) (this.m * 255.0f));
    }

    public final void a() {
        Trace.beginSection("FrontLensIndicator:applyOrientation");
        mip.es(this, this.o);
        Trace.endSection();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        float f = this.j;
        float f2 = this.k;
        float f3 = this.l;
        int i = this.p;
        if (i == 4 || i == 3) {
            this.d.setStrokeWidth(this.n);
            this.e.setStrokeWidth(this.n);
            this.q.set(f - f3, f2 - f3, f + f3, f2 + f3);
            canvas.drawArc(this.q, -99.0f, this.h, false, this.e);
        }
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            a();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        Trace.beginSection("FrontLensIndicator:onMeasure");
        if (jrz.b(this.o)) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i2, i);
        }
        Trace.endSection();
    }
}
