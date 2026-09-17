package defpackage;

import android.graphics.PointF;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final class fvs {
    private PointF a;
    private PointF b;
    private PointF c;

    public final synchronized float a() {
        PointF pointF;
        pointF = this.a;
        return (pointF == null || this.b == null) ? 0.0f : pointF.y - this.b.y;
    }

    public final synchronized void b(MotionEvent motionEvent) {
        PointF pointF = new PointF(motionEvent.getRawX(), motionEvent.getRawY());
        PointF pointF2 = this.b;
        this.c = pointF2;
        PointF pointF3 = this.a;
        this.b = pointF3;
        this.a = pointF;
        if (pointF3 == null) {
            this.b = pointF;
        }
        if (pointF2 == null) {
            this.c = pointF;
        }
    }

    public final synchronized void c() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
