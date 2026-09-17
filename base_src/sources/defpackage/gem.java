package defpackage;

import android.os.Handler;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class gem implements gey {
    public static final ouj a = ouj.h("com/google/android/apps/camera/moments/TimeLimitedMomentsHdrPlusLauncher");
    public final Handler b;
    private final gey c;

    public gem(gey geyVar, Handler handler) {
        this.c = geyVar;
        this.b = handler;
    }

    @Override // defpackage.gey
    public final int a() {
        this.c.a();
        return 1;
    }

    @Override // defpackage.gey
    public final void b(lmr lmrVar, gfs gfsVar, gfi gfiVar, final gex gexVar) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Object obj = new Object();
        this.b.postDelayed(new Runnable() { // from class: gek
            @Override // java.lang.Runnable
            public final void run() {
                AtomicBoolean atomicBoolean2 = atomicBoolean;
                gex gexVar2 = gexVar;
                if (atomicBoolean2.getAndSet(true)) {
                    return;
                }
                gexVar2.b(new TimeoutException("HDR+ timed out after 10000 ms"));
            }
        }, obj, 10000L);
        this.c.b(lmrVar, gfsVar, gfiVar, new gel(this, obj, atomicBoolean, gexVar));
    }

    @Override // defpackage.gey
    public final boolean c(lmr lmrVar, hcg hcgVar) {
        return true;
    }
}
