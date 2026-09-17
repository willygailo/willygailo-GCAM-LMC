package defpackage;

import android.graphics.Color;
import android.graphics.Paint;
import com.google.android.apps.camera.coach.CameraCoachHudView;
import j$.util.function.BooleanSupplier;

/* JADX INFO: loaded from: classes.dex */
public final class dbq {
    public final dbp e;
    public final dbp f;
    public final dbp g;
    public final dbp h;
    public final Paint i;
    public final CameraCoachHudView j;
    public final BooleanSupplier k;
    public fqk o;
    public fqk p;
    public final float a = jsa.b(8.0f);
    public final float b = jsa.b(2.0f);
    public final float c = jsa.b(56.0f);
    public final float d = jsa.b(4.0f);
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;

    public dbq(CameraCoachHudView cameraCoachHudView, BooleanSupplier booleanSupplier) {
        this.j = cameraCoachHudView;
        this.k = booleanSupplier;
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setStrokeWidth(jsa.b(1.0f));
        paint.setAntiAlias(true);
        paint.setAlpha(255);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setShadowLayer(jsa.b(4.0f), 0.0f, jsa.b(1.0f), -16777216);
        Paint paint2 = new Paint();
        paint2.setColor(Color.parseColor("#FDD663"));
        paint2.setStrokeWidth(jsa.b(1.0f));
        paint2.setAntiAlias(true);
        paint2.setAlpha(255);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.SQUARE);
        paint2.setShadowLayer(jsa.b(4.0f), 0.0f, jsa.b(1.0f), -16777216);
        Paint paint3 = new Paint();
        paint3.setColor(-1);
        paint3.setStrokeWidth(jsa.b(2.0f));
        paint3.setAntiAlias(true);
        paint3.setAlpha(255);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeCap(Paint.Cap.SQUARE);
        paint3.setShadowLayer(jsa.b(4.0f), 0.0f, jsa.b(1.0f), -16777216);
        Paint paint4 = new Paint();
        paint4.setColor(Color.parseColor("#FDD663"));
        paint4.setStrokeWidth(jsa.b(2.0f));
        paint4.setAntiAlias(true);
        paint4.setAlpha(255);
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setStrokeCap(Paint.Cap.SQUARE);
        paint4.setShadowLayer(jsa.b(4.0f), 0.0f, jsa.b(1.0f), -16777216);
        Paint paint5 = new Paint();
        paint5.setColor(-1);
        paint5.setAntiAlias(true);
        paint5.setAlpha(255);
        paint5.setTextAlign(Paint.Align.CENTER);
        paint5.setTextSize(cameraCoachHudView.getResources().getDisplayMetrics().scaledDensity * 14.0f);
        paint5.setShadowLayer(jsa.b(4.0f), 0.0f, jsa.b(1.0f), -16777216);
        Paint paint6 = new Paint();
        paint6.setColor(Color.parseColor("#FDD663"));
        paint6.setAntiAlias(true);
        paint6.setAlpha(255);
        paint6.setTextAlign(Paint.Align.CENTER);
        paint6.setTextSize(cameraCoachHudView.getResources().getDisplayMetrics().scaledDensity * 14.0f);
        paint6.setShadowLayer(jsa.b(4.0f), 0.0f, jsa.b(1.0f), -16777216);
        this.e = new dbp(paint2, paint6);
        this.f = new dbp(paint4, paint6);
        this.g = new dbp(paint, paint5);
        this.h = new dbp(paint3, paint5);
        Paint paint7 = new Paint();
        this.i = paint7;
        paint7.setColor(Color.parseColor("#FDD663"));
        paint7.setStrokeWidth(jsa.b(1.0f));
        paint7.setAntiAlias(true);
        paint7.setAlpha(255);
        paint7.setStyle(Paint.Style.STROKE);
        paint7.setStrokeCap(Paint.Cap.SQUARE);
    }

    public final void a() {
        boolean z = this.l;
        this.l = false;
        if (z) {
            this.o = null;
            this.p = null;
            this.n = false;
            this.j.invalidate();
        }
    }
}
