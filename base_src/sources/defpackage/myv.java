package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class myv implements mvw, mvv {
    private static final ouj a = ouj.h("com/google/android/libraries/performance/primes/metrics/jank/ActivityLevelJankMonitor");
    private final pyn b;
    private boolean c = false;
    private Activity d;

    public myv(pyn pynVar, final qkg qkgVar, final ojc ojcVar, Executor executor) {
        this.b = pynVar;
        executor.execute(new Runnable() { // from class: myu
            @Override // java.lang.Runnable
            public final void run() {
                this.a.c(qkgVar, ojcVar);
            }
        });
    }

    @Override // defpackage.mvw
    public synchronized void a(Activity activity) {
        this.d = activity;
        if (this.c) {
            ((mzd) this.b.get()).d(activity);
        }
    }

    @Override // defpackage.mvv
    public synchronized void b(Activity activity) {
        if (!activity.equals(this.d)) {
            ((oug) ((oug) a.c()).G(3628)).y("Activity mismatch (currentActivity=%s, activity=%s)", this.d, activity);
        }
        if (this.c) {
            ((mzd) this.b.get()).a(activity);
        }
        this.d = null;
    }

    public /* synthetic */ void c(qkg qkgVar, ojc ojcVar) {
        if (((Boolean) qkgVar.get()).booleanValue()) {
            if (ojcVar.g() && !((Boolean) ((qkg) ojcVar.c()).get()).booleanValue()) {
                return;
            }
        } else if (!ojcVar.g() || !((Boolean) ((qkg) ojcVar.c()).get()).booleanValue()) {
            return;
        }
        synchronized (this) {
            this.c = true;
            Activity activity = this.d;
            if (activity != null) {
                a(activity);
            }
        }
    }
}
