package com.google.android.apps.camera.wear.wearappv2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.aas;

/* JADX INFO: loaded from: classes.dex */
public final class WearZoomUi extends View {
    private final Paint a;
    private final Paint b;
    private final Paint c;
    private final float d;
    private final float e;
    private float f;

    public WearZoomUi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        this.f = 240.0f;
        Resources resources = context.getResources();
        this.d = resources.getDimension(R.dimen.wear_zoom_bar_range_margin_outer);
        this.e = resources.getDimension(R.dimen.wear_zoom_bar_slider_size);
        Paint paint = new Paint();
        this.a = paint;
        paint.setColor(aas.a(context, R.color.light_grey));
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setAlpha(143);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(resources.getDimension(R.dimen.wear_zoom_bar_range_width));
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setColor(aas.a(context, android.R.color.white));
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.c = paint3;
        paint3.setColor(aas.a(context, R.color.zoom_slider_text));
        paint3.setAntiAlias(true);
        try {
            paint3.setTypeface(Typeface.create("google-sans", 1));
        } catch (RuntimeException e) {
            this.c.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
        }
        this.c.setTextSize(resources.getDimension(R.dimen.wear_zoom_bar_slider_text_size));
    }

    public final float a() {
        return getWidth() / 2.0f;
    }

    public final float b() {
        return getHeight() / 2.0f;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        float fMin = (Math.min(getWidth(), getHeight()) / 2) - this.d;
        canvas.drawArc(a() - fMin, b() - fMin, a() + fMin, b() + fMin, 150.0f, 60.0f, false, this.a);
        double d = this.f;
        double d2 = fMin;
        Double.isNaN(d);
        double d3 = d - 90.0d;
        double dCos = Math.cos(Math.toRadians(d3));
        Double.isNaN(d2);
        double dA = a();
        Double.isNaN(dA);
        float f = (float) ((dCos * d2) + dA);
        double dSin = Math.sin(Math.toRadians(d3));
        Double.isNaN(d2);
        double d4 = dSin * d2;
        double dB = b();
        Double.isNaN(dB);
        float f2 = (float) (d4 + dB);
        canvas.drawCircle(f, f2, this.e, this.b);
        if (TextUtils.isEmpty(null)) {
            return;
        }
        canvas.rotate(180.0f, f, f2);
        new Rect();
        throw null;
    }

    @Override // android.view.View
    public final void setPressed(boolean z) {
        isPressed();
        super.setPressed(z);
    }
}
