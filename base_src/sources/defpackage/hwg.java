package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
final class hwg implements phh {
    final /* synthetic */ long a;
    final /* synthetic */ hwh b;

    public hwg(hwh hwhVar, long j) {
        this.b = hwhVar;
        this.a = j;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        long jUptimeMillis = SystemClock.uptimeMillis() - this.a;
        lji ljiVar = this.b.u;
        if (ljiVar != null) {
            ljiVar.a();
        }
        ((oug) ((oug) ((oug) hwh.a.b()).h(th)).G(2672)).q("HAL failed to restart after %dms due to an exception.", jUptimeMillis);
        if (this.b.c.b(dei.DOGFOOD)) {
            this.b.j.b();
        }
        this.b.s.o(true);
        this.b.m.b(lju.CAMERA_ERROR_CODE_UNKNOWN.u, 4);
    }

    @Override // defpackage.phh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        int i;
        dkk dkkVar = (dkk) obj;
        long jUptimeMillis = SystemClock.uptimeMillis() - this.a;
        lji ljiVar = this.b.u;
        if (ljiVar != null) {
            ljiVar.a();
        }
        if (dkkVar.a) {
            this.b.m.a(true, 0, 0);
        } else {
            Exception exc = dkkVar.c;
            lju ljuVar = dkkVar.b;
            int i2 = ljuVar != null ? ljuVar.u : 0;
            ((oug) ((oug) ((oug) hwh.a.c()).h(exc)).G(2673)).A("HAL failed to restart after %dms due to error (%d): %s", Long.valueOf(jUptimeMillis), Integer.valueOf(i2), ljuVar != null ? ljuVar.c() : "");
            if (this.b.c.b(dei.DOGFOOD)) {
                this.b.j.b();
            }
            if (exc instanceof TimeoutException) {
                i = 7;
            } else if (exc instanceof InterruptedException) {
                i = 8;
            } else {
                i = exc instanceof CameraAccessException ? 4 : 3;
            }
            this.b.m.b(i2, i);
        }
        this.b.s.o(true);
    }
}
