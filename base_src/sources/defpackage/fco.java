package defpackage;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class fco extends fct {
    private PointF m;

    @Override // defpackage.fcp
    public final void a(float[] fArr) throws fcq {
        f(fArr, this.m.x, this.m.y, 1.0f);
    }

    public final void b(PointF pointF) {
        PointF pointF2 = new PointF();
        this.m = pointF2;
        pointF2.set(pointF);
    }
}
