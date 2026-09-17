package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public enum iqn {
    MANUAL_FPS_30_1X(iqm.SLOWEST, 30, 30.0d, 6.0d, 3.0d, 1.0d, 0.25d),
    MANUAL_FPS_60_2X(iqm.SLOWEST, 60, 60.0d, 8.0d, 4.0d, 1.0d, 0.25d);

    public final oob c;
    public final int e;
    public final int f = 30;
    public final iqm d = iqm.SLOW;

    iqn(iqm iqmVar, int i, double... dArr) {
        this.e = i;
        int iOrdinal = iqmVar.ordinal();
        HashMap mapAb = obr.ab(5);
        for (int i2 = 0; i2 < 5; i2++) {
            mapAb.put(iqm.values()[i2 + iOrdinal], Double.valueOf(dArr[i2]));
        }
        this.c = oob.a(mapAb);
    }

    public static ldz d(iqn iqnVar) {
        for (ldz ldzVar : ldz.values()) {
            int i = iqnVar.e;
            if (i == ldzVar.i && iqnVar.f == ldzVar.j && i == ldzVar.k) {
                return ldzVar;
            }
        }
        throw new IllegalArgumentException("No camcorderCaptureRate found.");
    }

    public final double a(double d) {
        for (iqm iqmVar : iqm.values()) {
            if (this.c.containsKey(iqmVar) && ((Double) this.c.get(iqmVar)).doubleValue() == d) {
                double d2 = this.f;
                Double.isNaN(d2);
                return d2 / d;
            }
        }
        StringBuilder sb = new StringBuilder(51);
        sb.append("Capture rate ");
        sb.append(d);
        sb.append(" is not valid.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final double b() {
        if (this.c.containsKey(this.d)) {
            return ((Double) this.c.get(this.d)).doubleValue();
        }
        Double d = (Double) this.c.get(iqm.SLOWEST);
        d.getClass();
        return d.doubleValue();
    }

    public final iqm c(double d) {
        for (iqm iqmVar : iqm.values()) {
            if (this.c.containsKey(iqmVar) && ((Double) this.c.get(iqmVar)).doubleValue() == d) {
                return iqmVar;
            }
        }
        StringBuilder sb = new StringBuilder(51);
        sb.append("Capture rate ");
        sb.append(d);
        sb.append(" is not valid.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean e(double d) {
        return this.c.containsValue(Double.valueOf(d));
    }
}
