package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class mdi implements mdf {
    @Override // defpackage.mdf
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // defpackage.mdf
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // defpackage.mdf
    public final long c() {
        return mdh.a ? SystemClock.elapsedRealtimeNanos() : SystemClock.elapsedRealtime() * 1000000;
    }
}
