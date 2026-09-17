package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class qwj {
    public static final long a = qnm.p("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, Long.MAX_VALUE);
    public static final int b;
    public static final int c;
    public static final long d;

    static {
        qnm.r("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12);
        int iR = qnm.r("kotlinx.coroutines.scheduler.core.pool.size", qno.f(qvs.a, 2), 1, 0, 8);
        b = iR;
        c = qnm.r("kotlinx.coroutines.scheduler.max.pool.size", qno.h(qvs.a * 128, iR, 2097150), 0, 2097150, 4);
        d = TimeUnit.SECONDS.toNanos(qnm.p("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
    }
}
