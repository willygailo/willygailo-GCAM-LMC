package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes2.dex */
public final class oag extends oat {
    private int c;
    private float d;
    private float e;
    private float f;

    public oag(oam oamVar) {
        super(oamVar);
        this.c = 1;
    }

    private final int g() {
        oam oamVar = (oam) this.a;
        int i = oamVar.g;
        int i2 = oamVar.h;
        return i + i2 + i2;
    }

    private final void h(Canvas canvas, Paint paint, float f, float f2, float f3) {
        canvas.save();
        canvas.rotate(f3);
        float f4 = this.f;
        float f5 = f / 2.0f;
        canvas.drawRoundRect(new RectF(f4 - f5, f2, f4 + f5, -f2), f2, f2, paint);
        canvas.restore();
    }

    @Override // defpackage.oat
    public final int a() {
        return g();
    }

    @Override // defpackage.oat
    public final int b() {
        return g();
    }

    @Override // defpackage.oat
    public final void c(Canvas canvas, float f) {
        oam oamVar = (oam) this.a;
        float f2 = (oamVar.g / 2.0f) + oamVar.h;
        canvas.translate(f2, f2);
        canvas.rotate(-90.0f);
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        oam oamVar2 = (oam) this.a;
        this.c = oamVar2.i == 0 ? 1 : -1;
        int i = oamVar2.a;
        this.d = i * f;
        this.e = oamVar2.b * f;
        this.f = (oamVar2.g - i) / 2.0f;
        if ((this.b.f() && ((oam) this.a).e == 2) || (this.b.e() && ((oam) this.a).f == 1)) {
            this.f += ((1.0f - f) * ((oam) this.a).a) / 2.0f;
        } else if ((this.b.f() && ((oam) this.a).e == 1) || (this.b.e() && ((oam) this.a).f == 2)) {
            this.f -= ((1.0f - f) * ((oam) this.a).a) / 2.0f;
        }
    }

    @Override // defpackage.oat
    public final void d(Canvas canvas, Paint paint, float f, float f2, int i) {
        if (f == f2) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.d);
        float f3 = this.c;
        float f4 = f * 360.0f * f3;
        float f5 = f2 >= f ? (f2 - f) * 360.0f * f3 : ((1.0f + f2) - f) * 360.0f * f3;
        float f6 = this.f;
        float f7 = -f6;
        canvas.drawArc(new RectF(f7, f7, f6, f6), f4, f5, false, paint);
        if (this.e <= 0.0f || Math.abs(f5) >= 360.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        h(canvas, paint, this.d, this.e, f4);
        h(canvas, paint, this.d, this.e, f4 + f5);
    }

    @Override // defpackage.oat
    public final void e(Canvas canvas, Paint paint) {
        int iW = ohh.W(((oam) this.a).d, this.b.i);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(iW);
        paint.setStrokeWidth(this.d);
        float f = this.f;
        float f2 = -f;
        canvas.drawArc(new RectF(f2, f2, f, f), 0.0f, 360.0f, false, paint);
    }
}
