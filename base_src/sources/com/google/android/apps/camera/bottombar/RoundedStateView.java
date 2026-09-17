package com.google.android.apps.camera.bottombar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ImageButton;
import defpackage.jsa;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class RoundedStateView extends ImageButton {
    private static final float INTER_CIRCLE_RING_ALPHA = 0.32f;
    private Paint borderStrokePaint;
    private int buttonCenterX;
    private int buttonCenterY;
    private Paint mainCircleButtonPaint;
    private float rippleRingDiameterEnd;

    public RoundedStateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize();
    }

    private void initialize() {
        setClickable(true);
        this.rippleRingDiameterEnd = getResources().getDimension(R.dimen.rounded_thumbnail_ripple_ring_diameter_max);
        Paint paint = new Paint(1);
        this.borderStrokePaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.borderStrokePaint.setStrokeWidth(jsa.b(2.0f));
        this.borderStrokePaint.setColor(-1);
        Paint paint2 = new Paint();
        this.mainCircleButtonPaint = paint2;
        paint2.setAntiAlias(true);
        this.mainCircleButtonPaint.setColor(Color.argb(81, 0, 0, 0));
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        canvas.save();
        canvas.drawCircle(this.buttonCenterX, this.buttonCenterY, getResources().getDimension(R.dimen.bottom_border_ring_diameter), this.borderStrokePaint);
        canvas.drawCircle(this.buttonCenterX, this.buttonCenterY, getResources().getDimension(R.dimen.bottom_inner_circle_diameter), this.mainCircleButtonPaint);
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = (int) this.rippleRingDiameterEnd;
        setMeasuredDimension(i3, i3);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        this.buttonCenterX = i / 2;
        this.buttonCenterY = i2 / 2;
        super.onSizeChanged(i, i2, i3, i4);
    }
}
