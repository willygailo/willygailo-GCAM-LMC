package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class oig {
    public static final oke a;

    static {
        oke oifVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            oifVar = new oie();
        } catch (Throwable th) {
            SystemClock.elapsedRealtime();
            oifVar = new oif();
        }
        a = oifVar;
    }
}
