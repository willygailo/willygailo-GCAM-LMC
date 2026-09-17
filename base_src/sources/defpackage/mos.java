package defpackage;

import android.os.Process;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class mos {
    public final long a;

    public mos() {
        this.a = SystemClock.elapsedRealtimeNanos();
        new Throwable();
    }

    public mos(long j) {
        this.a = j;
    }

    public mos(ddf ddfVar) {
        int iIntValue = ((Integer) ddfVar.a(ddl.n).c()).intValue();
        this.a = (iIntValue > 0 ? iIntValue : 420L) * 1000000;
    }

    public mos(byte[] bArr) {
        this.a = Process.getStartUptimeMillis();
    }
}
