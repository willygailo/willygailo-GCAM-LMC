package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class blz {
    private static final double a = 1.0d / Math.pow(10.0d, 6.0d);

    public static double a(long j) {
        double dElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() - j;
        double d = a;
        Double.isNaN(dElapsedRealtimeNanos);
        return dElapsedRealtimeNanos * d;
    }

    public static long b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
