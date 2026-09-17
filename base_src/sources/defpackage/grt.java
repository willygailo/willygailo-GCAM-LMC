package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class grt extends mip {
    private final Set a;
    private long b = -1;
    private double c = -1.0d;

    public grt(Set set) {
        this.a = set;
    }

    @Override // defpackage.mip
    public final void b(lzv lzvVar) {
        double d;
        Long l = (Long) lzvVar.d(CaptureResult.SENSOR_TIMESTAMP);
        long jLongValue = l == null ? -1L : l.longValue();
        long j = this.b;
        double d2 = -1.0d;
        if (j >= 0) {
            double d3 = jLongValue - j;
            Double.isNaN(d3);
            double d4 = d3 / 1000000.0d;
            double d5 = this.c;
            d2 = d5 > 0.0d ? d5 : -1.0d;
            this.c = d4;
            d = d2;
            d2 = d4;
        } else {
            d = -1.0d;
        }
        this.b = jLongValue;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((grs) it.next()).a(lzvVar, d2, d);
        }
    }
}
