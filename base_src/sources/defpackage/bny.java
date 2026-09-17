package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.params.MeteringRectangle;

/* JADX INFO: loaded from: classes.dex */
public final class bny {
    private final gsn a;
    private final lzh b;
    private final ddf c;
    private final ghx d;
    private final fcy e;

    public bny(gsn gsnVar, fcy fcyVar, ghx ghxVar, lzh lzhVar, ddf ddfVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = gsnVar;
        this.e = fcyVar;
        this.d = ghxVar;
        this.b = lzhVar;
        this.c = ddfVar;
    }

    private final MeteringRectangle[] e(ggy ggyVar) {
        return (gsn.g(this.d, this.c) && this.b.g) ? ggyVar.b(this.a.d().a) : ggyVar.b(((gsm) this.a.fA()).a);
    }

    private final MeteringRectangle[] f(PointF pointF, int i) {
        int iF = this.d.f();
        obr.aG(iF % 90 == 0, "sensorOrientation must be a multiple of 90");
        obr.aG(iF >= 0, "sensorOrientation must not be negative");
        return e(new bnx(pointF, pointF, new nle(iF % 360), i, null, null));
    }

    public final MeteringRectangle[] a() {
        ggw.c();
        Rect rect = ((gsm) this.a.fA()).a;
        return ggw.a;
    }

    public final MeteringRectangle[] b(PointF pointF) {
        return e(bnx.c(pointF, pointF, this.d.f()));
    }

    public final MeteringRectangle[] c(PointF pointF) {
        return f(pointF, 2);
    }

    public final MeteringRectangle[] d(PointF pointF) {
        return f(pointF, 1);
    }
}
