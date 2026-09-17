package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import com.google.android.apps.camera.coach.CameraCoachHudView;
import j$.util.function.BooleanSupplier;

/* JADX INFO: loaded from: classes.dex */
public final class dck {
    private static final float n = jsa.b(18.0f);
    private static final float o = jsa.b(2.0f);
    public final CameraCoachHudView a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final BooleanSupplier g;
    public boolean h;
    public float i;
    public float j;
    public float k = 9.424778f;
    public float l = 9.424778f;
    public boolean m = false;

    public dck(CameraCoachHudView cameraCoachHudView, BooleanSupplier booleanSupplier) {
        this.a = cameraCoachHudView;
        this.g = booleanSupplier;
        Paint paint = new Paint();
        this.b = paint;
        paint.setColor(-1);
        paint.setStrokeWidth(jsa.b(1.0f));
        paint.setAntiAlias(true);
        paint.setAlpha(255);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setShadowLayer(jsa.b(4.0f), 0.0f, jsa.b(1.0f), -16777216);
        Paint paint2 = new Paint();
        this.d = paint2;
        paint2.setColor(Color.parseColor("#FDD663"));
        paint2.setStrokeWidth(jsa.b(2.0f));
        paint2.setAntiAlias(true);
        paint2.setAlpha(255);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.SQUARE);
        paint2.setShadowLayer(jsa.b(4.0f), 0.0f, jsa.b(1.0f), -16777216);
        Paint paint3 = new Paint();
        this.e = paint3;
        paint3.setColor(Color.parseColor("#FDD663"));
        paint3.setStrokeWidth(jsa.b(1.0f));
        paint3.setAntiAlias(true);
        paint3.setAlpha(255);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeCap(Paint.Cap.SQUARE);
        paint3.setShadowLayer(jsa.b(4.0f), 0.0f, jsa.b(1.0f), -16777216);
        Paint paint4 = new Paint();
        this.c = paint4;
        paint4.setColor(-1);
        paint4.setAntiAlias(true);
        paint4.setAlpha(255);
        Paint paint5 = new Paint();
        this.f = paint5;
        paint5.setColor(Color.parseColor("#FDD663"));
        paint5.setAntiAlias(true);
        paint5.setAlpha(255);
    }

    public static void a(float f, float f2, Paint paint, Paint paint2, Canvas canvas) {
        float f3 = o;
        canvas.drawCircle(f, f2, f3, paint2);
        float f4 = n;
        canvas.drawLine(f - (f4 / 2.0f), f2, f - f3, f2, paint);
        canvas.drawLine(f + (f4 / 2.0f), f2, f + f3, f2, paint);
        canvas.drawLine(f, f2 - (f4 / 2.0f), f, f2 - f3, paint);
        canvas.drawLine(f, f2 + (f4 / 2.0f), f, f2 + f3, paint);
    }

    public final void b() {
        boolean z = this.h;
        this.h = false;
        if (z) {
            this.k = 9.424778f;
            this.l = 9.424778f;
            this.m = false;
            this.a.invalidate();
        }
    }
}
