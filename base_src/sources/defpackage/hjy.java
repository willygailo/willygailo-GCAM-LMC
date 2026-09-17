package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.params.Face;

/* JADX INFO: loaded from: classes2.dex */
public final class hjy {
    public final Rect a;
    public final int b;
    public final PointF c;
    public final PointF d;
    public final PointF e;
    public final PointF f;
    public final PointF g;
    public final PointF h;
    public final int i;
    public final float j;
    public final float k;
    public final float l;

    public hjy(int i, Rect rect, int i2, PointF pointF, PointF pointF2, PointF pointF3) {
        this(i, rect, i2, pointF, pointF2, pointF3, null, null, null, 0.0f, 0.0f, 0.0f);
    }

    public hjy(int i, Rect rect, int i2, PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4, PointF pointF5, PointF pointF6, float f, float f2, float f3) {
        this.a = rect;
        this.b = i2;
        this.c = pointF;
        this.d = pointF2;
        this.e = pointF3;
        this.f = pointF4;
        this.g = pointF5;
        this.h = pointF6;
        this.i = i;
        this.j = f;
        this.k = f2;
        this.l = f3;
    }

    public static hjy a(Face face) {
        return new hjy(face.getId(), face.getBounds(), face.getScore(), face.getLeftEyePosition() == null ? null : new PointF(face.getLeftEyePosition()), face.getRightEyePosition() == null ? null : new PointF(face.getRightEyePosition()), face.getMouthPosition() == null ? null : new PointF(face.getMouthPosition()));
    }

    public static hjy b(lzs lzsVar) {
        return new hjy(lzsVar.a.getId(), lzsVar.a.getBounds(), lzsVar.a.getScore(), lzsVar.a((byte) 1), lzsVar.a((byte) 2), lzsVar.a((byte) 4), lzsVar.a((byte) 3), lzsVar.a((byte) 5), lzsVar.a((byte) 6), lzsVar.b, lzsVar.c, lzsVar.d);
    }
}
