package defpackage;

import android.hardware.camera2.CaptureResult;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class cmk extends mip {
    private final lfj a;
    private boolean b;
    private long c;

    public cmk(lfj lfjVar) {
        this.a = lfjVar;
    }

    @Override // defpackage.mip
    public final synchronized void b(lzv lzvVar) {
        Long l = (Long) lzvVar.d(CaptureResult.SENSOR_TIMESTAMP);
        l.getClass();
        long jLongValue = l.longValue() / 1000;
        if (!this.b) {
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
            long jUptimeMillis = SystemClock.uptimeMillis();
            Long.signum(jUptimeMillis);
            this.c = jElapsedRealtimeNanos - (jUptimeMillis * 1000);
            this.b = true;
        }
        long j = jLongValue - this.c;
        ojc ojcVarP = this.a.p();
        if (ojcVarP.g()) {
            ((lfd) ojcVarP.c()).l(new cmj(lzvVar), j);
        }
    }
}
