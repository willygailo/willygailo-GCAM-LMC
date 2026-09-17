package defpackage;

import android.os.PowerManager;

/* JADX INFO: loaded from: classes2.dex */
public final class hhp {
    private final PowerManager a;
    private final String b = "ProcessingService";
    private final long c;
    private PowerManager.WakeLock d;

    public hhp(PowerManager powerManager, long j) {
        this.a = powerManager;
        this.c = j;
    }

    public final synchronized void a(String str) {
        PowerManager powerManager = this.a;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(str2.length() + 1 + String.valueOf(str).length());
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, sb.toString());
        wakeLockNewWakeLock.acquire(this.c);
        PowerManager.WakeLock wakeLock = this.d;
        if (wakeLock != null) {
            wakeLock.release();
        }
        this.d = wakeLockNewWakeLock;
    }

    public final synchronized void b() {
        PowerManager.WakeLock wakeLock = this.d;
        if (wakeLock != null) {
            wakeLock.release();
            this.d = null;
        }
    }
}
