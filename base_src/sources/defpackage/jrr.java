package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes2.dex */
public final class jrr {
    private static final ouj a = ouj.h("com/google/android/apps/camera/uiutils/FocusPointNormalizer");
    private final gvb b;

    public jrr(gvb gvbVar) {
        this.b = gvbVar;
    }

    private static final float b(float f) {
        return Math.max(0.0f, Math.min(1.0f, f));
    }

    public final PointF a(PointF pointF, RectF rectF, lwd lwdVar) {
        if (pointF.x < 0.0f || pointF.y < 0.0f) {
            ((oug) ((oug) a.c()).G((char) 3489)).r("Negative focus point: %s", pointF);
        }
        float[] fArr = {b((pointF.x - rectF.left) / rectF.width()), b((pointF.y - rectF.top) / rectF.height())};
        int iA = this.b.f().a();
        Matrix matrix = new Matrix();
        matrix.setRotate(iA, 0.5f, 0.5f);
        matrix.mapPoints(fArr);
        if (lwdVar == lwd.FRONT) {
            fArr[0] = 1.0f - fArr[0];
        }
        return new PointF(fArr[0], fArr[1]);
    }
}
