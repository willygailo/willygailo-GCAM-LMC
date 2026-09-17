package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes2.dex */
public final class oaw extends oat {
    private float c;
    private float d;
    private float e;

    public oaw(obd obdVar) {
        super(obdVar);
        this.c = 300.0f;
    }

    @Override // defpackage.oat
    public final int a() {
        return ((obd) this.a).a;
    }

    @Override // defpackage.oat
    public final int b() {
        return -1;
    }

    @Override // defpackage.oat
    public final void c(Canvas canvas, float f) {
        Rect clipBounds = canvas.getClipBounds();
        this.c = clipBounds.width();
        float f2 = ((obd) this.a).a;
        canvas.translate(clipBounds.left + (clipBounds.width() / 2.0f), clipBounds.top + (clipBounds.height() / 2.0f) + Math.max(0.0f, (clipBounds.height() - ((obd) this.a).a) / 2.0f));
        if (((obd) this.a).i) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.b.f() && ((obd) this.a).e == 1) || (this.b.e() && ((obd) this.a).f == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.b.f() || this.b.e()) {
            canvas.translate(0.0f, (((obd) this.a).a * ((-1.0f) + f)) / 2.0f);
        }
        float f3 = this.c;
        canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
        obd obdVar = (obd) this.a;
        this.d = obdVar.a * f;
        this.e = obdVar.b * f;
    }

    @Override // defpackage.oat
    public final void d(Canvas canvas, Paint paint, float f, float f2, int i) {
        if (f == f2) {
            return;
        }
        float f3 = this.c;
        float f4 = (-f3) / 2.0f;
        float f5 = this.e;
        float f6 = f5 + f5;
        float f7 = f3 - f6;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i);
        float f8 = this.d;
        RectF rectF = new RectF((f * f7) + f4, (-f8) / 2.0f, f4 + (f2 * f7) + f6, f8 / 2.0f);
        float f9 = this.e;
        canvas.drawRoundRect(rectF, f9, f9, paint);
    }

    @Override // defpackage.oat
    public final void e(Canvas canvas, Paint paint) {
        int iW = ohh.W(((obd) this.a).d, this.b.i);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(iW);
        float f = this.c;
        float f2 = this.d;
        RectF rectF = new RectF((-f) / 2.0f, (-f2) / 2.0f, f / 2.0f, f2 / 2.0f);
        float f3 = this.e;
        canvas.drawRoundRect(rectF, f3, f3, paint);
    }
}
