package com.google.android.apps.camera.evcomp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.dmf;

/* JADX INFO: loaded from: classes.dex */
public class EvCompSlider extends FrameLayout {
    private final AccessibilityManager a;
    private final Paint b;
    private final Paint c;
    private final int d;
    private final int e;
    private int f;

    public EvCompSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        this.d = getResources().getDimensionPixelSize(R.dimen.evcomp_slider_width);
        this.e = getResources().getDimensionPixelSize(R.dimen.evcomp_slider_touch_area_width);
        Paint paint = new Paint();
        this.b = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.c = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(getResources().getDimensionPixelSize(R.dimen.evcomp_slider_stroke_width));
        paint2.setAntiAlias(true);
        this.a = (AccessibilityManager) context.getSystemService("accessibility");
    }

    public final void a(int i, int i2, int i3, int i4) {
        this.f = i;
        this.b.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i, i2, i3, Shader.TileMode.MIRROR));
        this.c.setColor(i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.a.isTouchExplorationEnabled()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof dmf) {
                return childAt.dispatchTouchEvent(motionEvent);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRoundRect(getMeasuredWidth() - (this.e / 2), 0.0f, (getMeasuredWidth() - (this.e / 2)) + this.d, this.f, getResources().getDimensionPixelSize(R.dimen.evcomp_slider_radius), getResources().getDimensionPixelSize(R.dimen.evcomp_slider_radius), this.b);
        canvas.drawRoundRect(getMeasuredWidth() - (this.e / 2), 0.0f, (getMeasuredWidth() - (this.e / 2)) + this.d, this.f, getResources().getDimensionPixelSize(R.dimen.evcomp_slider_radius), getResources().getDimensionPixelSize(R.dimen.evcomp_slider_radius), this.c);
    }
}
