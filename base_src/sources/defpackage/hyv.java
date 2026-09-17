package defpackage;

import android.graphics.Point;
import android.graphics.PointF;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class hyv extends jxi {
    final /* synthetic */ pht a;

    public hyv(pht phtVar) {
        this.a = phtVar;
    }

    @Override // defpackage.jxj
    public final boolean a(PointF pointF) {
        hza hzaVar = (hza) mip.bY(this.a);
        if (hzaVar == null) {
            return false;
        }
        lar.a();
        final float[] fArr = {pointF.x, pointF.y};
        hzaVar.m.mapPoints(fArr);
        hzaVar.h(new hyx() { // from class: hyt
            @Override // defpackage.hyx
            public final void a(Object obj) {
                float[] fArr2 = fArr;
                Point point = new Point((int) fArr2[0], (int) fArr2[1]);
                hzu hzuVar = (hzu) obj;
                obr.aQ(hzuVar.d);
                if (hzuVar.e) {
                    iat iatVar = hzuVar.a;
                    if (iatVar instanceof iaq) {
                        ((iaq) iatVar).f(point);
                    }
                }
            }
        });
        hzaVar.w = Math.max(hzaVar.w, SystemClock.elapsedRealtime() + 1000);
        return false;
    }
}
