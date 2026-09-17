package com.google.android.apps.camera.focusindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.duj;
import defpackage.duk;
import defpackage.dul;
import defpackage.dum;
import defpackage.jrz;
import defpackage.lic;

/* JADX INFO: loaded from: classes.dex */
public class FocusIndicatorRingView extends View {
    public final duj a;
    public final dul b;
    public PointF c;
    public final float d;
    private jrz e;
    private boolean f;

    public FocusIndicatorRingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new duk();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        this.b = new dum(shapeDrawable);
        this.d = context.getResources().getDimension(R.dimen.focus_indicator_ring_size) / 2.0f;
    }

    FocusIndicatorRingView(Context context, duj dujVar, dul dulVar) {
        super(context);
        this.a = dujVar;
        this.b = dulVar;
        this.d = context.getResources().getDimension(R.dimen.focus_indicator_ring_size) / 2.0f;
    }

    static int a(jrz jrzVar) {
        jrz jrzVar2 = jrz.PORTRAIT;
        lic licVar = lic.CLOCKWISE_0;
        switch (jrzVar) {
            case PORTRAIT:
                return 0;
            case LANDSCAPE:
                return 90;
            case REVERSE_LANDSCAPE:
                return 270;
            case REVERSE_PORTRAIT:
                return 180;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final void b(PointF pointF) {
        this.c = pointF;
        setX(pointF.x - (getWidth() / 2));
        setY(pointF.y - (getHeight() / 2));
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a.a(canvas);
        this.b.a(canvas);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        lic licVar;
        super.onLayout(z, i, i2, i3, i4);
        View view = (View) getParent();
        jrz jrzVar = this.e;
        jrz jrzVarA = jrz.a(getDisplay(), getContext());
        this.e = jrzVarA;
        if (this.f) {
            PointF pointF = this.c;
            int width = view.getWidth();
            int height = view.getHeight();
            switch (a(jrzVarA) - a(jrzVar)) {
                case -270:
                case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                    licVar = lic.CLOCKWISE_270;
                    break;
                case -180:
                case 180:
                    licVar = lic.CLOCKWISE_180;
                    break;
                case -90:
                case 270:
                    licVar = lic.CLOCKWISE_90;
                    break;
                case 0:
                    licVar = lic.CLOCKWISE_0;
                    break;
                default:
                    throw new IllegalArgumentException();
            }
            if (pointF != null) {
                PointF pointF2 = new PointF();
                switch (licVar.ordinal()) {
                    case 1:
                        pointF2.set(width - pointF.y, pointF.x);
                        break;
                    case 2:
                        pointF2.set(width - pointF.x, height - pointF.y);
                        break;
                    case 3:
                        pointF2.set(pointF.y, height - pointF.x);
                        break;
                    default:
                        pointF2.set(pointF.x, pointF.y);
                        break;
                }
                b(pointF2);
            }
        }
        this.f = true;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.a.b(i, i2);
        this.b.b(i, i2);
    }
}
