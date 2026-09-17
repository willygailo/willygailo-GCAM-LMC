package defpackage;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: loaded from: classes.dex */
public final class gsj implements lij {
    private static final ouj b = ouj.h("com/google/android/apps/camera/one/util/TimestampWaiter");
    private final long c;
    private Long d;
    private boolean e = false;
    public final pih a = pih.f();

    public gsj(long j) {
        this.c = j;
    }

    @Override // defpackage.lij
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void fB(lzr lzrVar) {
        if (this.e) {
            return;
        }
        if (this.d == null) {
            this.d = Long.valueOf(lzrVar.b());
        }
        long jB = lzrVar.b();
        Long l = this.d;
        obr.ao(l);
        long jLongValue = jB - l.longValue();
        Long l2 = (Long) lzrVar.d(CaptureResult.SENSOR_TIMESTAMP);
        if (l2 != null && l2.longValue() > this.c) {
            this.e = true;
            this.a.o(true);
        } else if (jLongValue >= 10) {
            ((oug) ((oug) b.c()).G(2109)).A("timeout waiting for %d at %d, after %dframes", Long.valueOf(this.c), l2, Long.valueOf(jLongValue));
            this.e = true;
            this.a.o(false);
        }
    }
}
