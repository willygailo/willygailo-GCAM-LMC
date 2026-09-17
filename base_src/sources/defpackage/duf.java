package defpackage;

import android.graphics.PointF;
import android.graphics.RectF;
import android.util.SizeF;

/* JADX INFO: loaded from: classes.dex */
public final class duf {
    private static final ouj a = ouj.h("com/google/android/apps/camera/filmstrip/transition/FilmstripTransitionTransformBuilder");
    private final float b;
    private final float c;
    private final PointF d;
    private final PointF e;
    private final float f;
    private final float g;

    public duf(SizeF sizeF, RectF rectF, RectF rectF2, RectF rectF3, float f) {
        float f2;
        float f3;
        float f4;
        if (!rectF.contains(rectF2)) {
            ((oug) ((oug) a.b()).G((char) 937)).o("Expected that the photos target area is contained in the camera window area.");
        }
        RectF rectF4 = new RectF(rectF2);
        rectF4.intersect(rectF);
        SizeF sizeF2 = new SizeF(rectF4.width(), rectF4.height());
        PointF pointF = new PointF(rectF4.left - rectF.left, rectF4.top - rectF.top);
        float width = sizeF.getWidth();
        float height = sizeF.getHeight();
        float width2 = sizeF2.getWidth();
        float height2 = sizeF2.getHeight();
        float f5 = width / height > width2 / height2 ? width2 / width : height2 / height;
        this.b = f5;
        float width3 = sizeF.getWidth();
        float height3 = sizeF.getHeight();
        float f6 = width3 < height3 ? f / width3 : f / height3;
        this.c = f6;
        float width4 = sizeF.getWidth();
        float height4 = sizeF.getHeight();
        float width5 = sizeF2.getWidth();
        float height5 = sizeF2.getHeight();
        float f7 = width5 / height5;
        float f8 = width4 / height4;
        if (f8 > f7) {
            f3 = width5 / f8;
            f2 = width5;
        } else {
            f2 = height5 * f8;
            f3 = height5;
        }
        float f9 = 0.0f;
        if (f8 > f7) {
            f4 = (height5 - f3) / 2.0f;
        } else {
            f9 = (width5 - f2) / 2.0f;
            f4 = 0.0f;
        }
        float f10 = f9 + pointF.x;
        float f11 = f4 + pointF.y;
        if (f5 != 1.0f) {
            f10 += (f2 - width4) / 2.0f;
            f11 += (f3 - height4) / 2.0f;
        }
        this.d = new PointF(f10, f11);
        float width6 = sizeF.getWidth();
        float height6 = sizeF.getHeight();
        float f12 = rectF3.left;
        float f13 = rectF3.top;
        float fWidth = (rectF3.width() - f) / 2.0f;
        float f14 = f12 + fWidth;
        float f15 = f13 + fWidth;
        if (f6 != 1.0f) {
            f14 += (f - width6) / 2.0f;
            f15 += (f - height6) / 2.0f;
        }
        this.e = new PointF(f14, f15);
        float width7 = sizeF.getWidth() / 2.0f;
        float height7 = sizeF.getHeight() / 2.0f;
        this.f = (float) Math.sqrt((width7 * width7) + (height7 * height7));
        this.g = Math.min(sizeF.getWidth() / 2.0f, sizeF.getHeight() / 2.0f);
    }

    public final due a() {
        return new due(this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
