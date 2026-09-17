package defpackage;

import android.graphics.Paint;
import com.google.android.apps.camera.coach.CameraCoachHudView;

/* JADX INFO: loaded from: classes.dex */
public final class dbc {
    public static final float a = jsa.b(18.0f);
    public static final float b = jsa.b(2.0f);
    public static final float c = jsa.b(12.0f);
    public final CameraCoachHudView d;
    public final Paint e;
    public final Paint f;
    public final Paint g;
    public boolean h;
    public float i;
    public float j;
    public float k = 9.424778f;
    public float l = 9.424778f;
    public float m = 4.0f;

    static {
        jsa.b(7.0f);
    }

    public dbc(CameraCoachHudView cameraCoachHudView) {
        this.d = cameraCoachHudView;
        Paint paint = new Paint();
        this.e = paint;
        paint.setColor(-1);
        paint.setStrokeWidth(jsa.b(1.0f));
        paint.setAntiAlias(true);
        paint.setAlpha(153);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        Paint paint2 = new Paint();
        this.f = paint2;
        paint2.setColor(-1);
        paint2.setAntiAlias(true);
        paint2.setAlpha(153);
        Paint paint3 = new Paint();
        this.g = paint3;
        paint3.setColor(-1);
        paint3.setAntiAlias(true);
        paint3.setAlpha(153);
    }

    public final void a() {
        boolean z = this.h;
        this.h = false;
        if (z) {
            this.k = 9.424778f;
            this.l = 9.424778f;
            this.d.invalidate();
        }
    }
}
