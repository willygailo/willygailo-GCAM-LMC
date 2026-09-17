package defpackage;

import android.media.MediaCodec;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class iod {
    public static final ouj a = ouj.h("com/google/android/apps/camera/timelapse/TimelapseFrameSelector");
    public lvj A;
    public ldv B;
    public final ddf q;
    public final MediaCodec.Callback r;
    public final lda t;
    public iql u;
    public iqo v;
    public pih x;
    public ios z;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final pgl d = new pgl(null);
    public final AtomicLong e = new AtomicLong(0);
    public final AtomicLong f = new AtomicLong(0);
    public final AtomicLong g = new AtomicLong(0);
    public final AtomicLong h = new AtomicLong(0);
    public final AtomicLong i = new AtomicLong(0);
    public final AtomicLong j = new AtomicLong(0);
    public final AtomicLong k = new AtomicLong(0);
    public final AtomicLong l = new AtomicLong(0);
    public final AtomicLong m = new AtomicLong(0);
    public final AtomicLong n = new AtomicLong(0);
    public final AtomicLong o = new AtomicLong(0);
    public final AtomicLong p = new AtomicLong(0);
    public final Object s = new Object();
    public ojc w = oih.a;
    public iqn y = iqn.MANUAL_FPS_30_1X;

    public iod(ddf ddfVar, lda ldaVar) {
        this.q = ddfVar;
        this.t = ldaVar;
        this.r = new ioc(this, ddfVar);
    }

    public final long a() {
        return this.f.get();
    }

    public final long b() {
        return this.g.get() - this.f.get();
    }

    public final long c() {
        return TimeUnit.SECONDS.toMillis(this.g.get()) / ((long) e().f);
    }

    public final long d() {
        return this.e.get();
    }

    final iqn e() {
        iqn iqnVar;
        synchronized (this.s) {
            iqnVar = this.y;
        }
        return iqnVar;
    }

    public final void f() {
        if (this.n.get() > 0) {
            AtomicLong atomicLong = this.o;
            atomicLong.set((atomicLong.get() + TimeUnit.MILLISECONDS.toNanos(SystemClock.uptimeMillis())) - this.n.get());
        }
    }
}
