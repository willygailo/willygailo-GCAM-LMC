package defpackage;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.support.wearable.complications.rendering.ComplicationStyle$Builder;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes2.dex */
public final class sp {
    public final TextPaint a;
    public final TextPaint b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final Paint g;
    public final sr h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final ColorFilter l;

    public sp(sr srVar, boolean z, boolean z2, boolean z3) {
        ColorFilter colorMatrixColorFilter;
        this.h = srVar;
        this.i = z;
        this.j = z2;
        this.k = z3;
        boolean z4 = (z && z2) ? false : true;
        if (z2) {
            ComplicationStyle$Builder complicationStyle$Builder = new ComplicationStyle$Builder(srVar);
            if (srVar.b != -16777216) {
                complicationStyle$Builder.a = 0;
            }
            complicationStyle$Builder.c = -1;
            complicationStyle$Builder.d = -1;
            complicationStyle$Builder.j = -1;
            int i = srVar.l;
            if (i != -16777216 && i != 0) {
                complicationStyle$Builder.k = -1;
            }
            complicationStyle$Builder.q = -1;
            if (srVar.t != -16777216) {
                complicationStyle$Builder.r = 0;
            }
            srVar = complicationStyle$Builder.a();
        }
        TextPaint textPaint = new TextPaint();
        this.a = textPaint;
        textPaint.setColor(srVar.d);
        textPaint.setAntiAlias(z4);
        textPaint.setTypeface(srVar.f);
        textPaint.setTextSize(srVar.h);
        textPaint.setAntiAlias(z4);
        if (z4) {
            colorMatrixColorFilter = new PorterDuffColorFilter(srVar.k, PorterDuff.Mode.SRC_IN);
        } else {
            int i2 = srVar.k;
            colorMatrixColorFilter = new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, Color.red(i2), 0.0f, 0.0f, 0.0f, 0.0f, Color.green(i2), 0.0f, 0.0f, 0.0f, 0.0f, Color.blue(i2), 0.0f, 0.0f, 0.0f, 255.0f, -32385.0f}));
        }
        this.l = colorMatrixColorFilter;
        TextPaint textPaint2 = new TextPaint();
        this.b = textPaint2;
        textPaint2.setColor(srVar.e);
        textPaint2.setAntiAlias(z4);
        textPaint2.setTypeface(srVar.g);
        textPaint2.setTextSize(srVar.i);
        textPaint2.setAntiAlias(z4);
        Paint paint = new Paint();
        this.c = paint;
        paint.setColor(srVar.s);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(z4);
        paint.setStrokeWidth(srVar.r);
        Paint paint2 = new Paint();
        this.d = paint2;
        paint2.setColor(srVar.t);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(z4);
        paint2.setStrokeWidth(srVar.r);
        Paint paint3 = new Paint();
        this.e = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setColor(srVar.l);
        if (srVar.m == 2) {
            paint3.setPathEffect(new DashPathEffect(new float[]{srVar.n, srVar.o}, 0.0f));
        }
        if (srVar.m == 0) {
            paint3.setAlpha(0);
        }
        paint3.setStrokeWidth(srVar.q);
        paint3.setAntiAlias(z4);
        Paint paint4 = new Paint();
        this.f = paint4;
        paint4.setColor(srVar.b);
        paint4.setAntiAlias(z4);
        Paint paint5 = new Paint();
        this.g = paint5;
        paint5.setColor(srVar.u);
        paint5.setAntiAlias(z4);
    }

    public final boolean a() {
        return this.i && this.k;
    }
}
