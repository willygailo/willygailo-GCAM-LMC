package defpackage;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: loaded from: classes.dex */
public final class gru implements grs {
    private final lis a;
    private final dha b;
    private double c = 33.0d;

    public gru(lir lirVar, dha dhaVar) {
        this.a = lirVar.a("FrameJank");
        this.b = dhaVar;
    }

    @Override // defpackage.grs
    public final void a(lzv lzvVar, double d, double d2) {
        Long l = (Long) lzvVar.d(CaptureResult.SENSOR_TIMESTAMP);
        Long l2 = (Long) lzvVar.d(CaptureResult.SENSOR_FRAME_DURATION);
        if (l != null && l2 != null) {
            this.b.b(l.longValue(), l2.longValue());
        }
        double d3 = this.c;
        if (d3 > 33.0d && d > 33.0d) {
            double d4 = (d - d3) / d3;
            if (d4 >= 1.5d) {
                lis lisVar = this.a;
                StringBuilder sb = new StringBuilder(146);
                sb.append("JANK! Time between frames (");
                sb.append(d);
                sb.append("ms) increased by ");
                sb.append(d4 * 100.0d);
                sb.append("% over the expected delta (");
                sb.append(d3);
                sb.append("ms)");
                lisVar.f(sb.toString());
            }
        }
        if (d > 33.0d) {
            double d5 = this.c;
            if (d > d5) {
                this.c = (d + (d5 * 10.0d)) / 11.0d;
            } else {
                this.c = d;
            }
        }
    }
}
