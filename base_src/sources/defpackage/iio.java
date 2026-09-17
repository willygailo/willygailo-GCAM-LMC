package defpackage;

import android.os.SystemClock;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class iio {
    private final LinkedList a = new LinkedList();
    private final fjs b;

    public iio(fjs fjsVar) {
        this.b = fjsVar;
    }

    public final synchronized int a() {
        return this.a.size() > 0 ? ((mjg) this.a.getLast()).b : 0;
    }

    public final synchronized iin b() {
        while (!this.a.isEmpty()) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            mjg mjgVar = (mjg) this.a.removeFirst();
            if (jUptimeMillis - mjgVar.a <= 60000) {
                iin iinVar = new iin();
                iinVar.b = mjgVar.b;
                iinVar.a = jUptimeMillis - mjgVar.a;
                return iinVar;
            }
        }
        return null;
    }

    public final synchronized void c(iij iijVar) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        long jConvert = TimeUnit.MILLISECONDS.convert(jElapsedRealtimeNanos, TimeUnit.NANOSECONDS);
        this.a.add(new mjg(SystemClock.uptimeMillis(), this.a.size()));
        this.b.U(8, null, null, null, iijVar.a());
        iim iimVar = ((iik) iijVar).j;
        if (iimVar != null) {
            iimVar.b = jElapsedRealtimeNanos;
        }
        ((iik) iijVar).a = jConvert;
    }
}
