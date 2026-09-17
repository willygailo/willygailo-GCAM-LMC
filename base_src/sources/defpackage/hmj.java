package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class hmj implements fpq {
    @Override // defpackage.fpq
    public final boolean a(orj orjVar) {
        return orj.d(Long.valueOf(SystemClock.elapsedRealtimeNanos() - TimeUnit.NANOSECONDS.convert(5L, TimeUnit.SECONDS))).o(orjVar);
    }

    @Override // defpackage.fpq
    public final boolean b(orj orjVar) {
        return false;
    }
}
