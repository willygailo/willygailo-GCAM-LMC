package defpackage;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class gri implements grp, lie {
    public static final ouj a = ouj.h("com/google/android/apps/camera/one/smartmetering/PckSmartMeteringController");
    public final giq d;
    public final edm e;
    public final hcg f;
    public final Executor g;
    public final hev h;
    public final ljf i;
    public int k;
    public boolean l;
    public final grb m;
    private final lmv n;
    private final grg o;
    private lie q;
    private lzv r;
    public final Object b = new Object();
    public final Object c = new Object();
    public boolean j = false;
    private final ExecutorService p = mip.bM("waitForFrame");

    public gri(lmv lmvVar, ojz ojzVar, grb grbVar, giq giqVar, edm edmVar, hcg hcgVar, Executor executor, Set set, ljf ljfVar) {
        this.n = lmvVar;
        this.m = grbVar;
        this.d = giqVar;
        this.e = edmVar;
        this.f = hcgVar;
        this.o = new grg(this, ojzVar);
        this.g = executor;
        this.h = new hev(set);
        this.i = ljfVar;
    }

    private final void d() {
        synchronized (this.b) {
            if (this.q != null) {
                this.i.e("close");
                lie lieVar = this.q;
                lieVar.getClass();
                lieVar.close();
                this.i.f();
                this.q = null;
            }
        }
    }

    private final void e(final long j) {
        Runnable runnable = new Runnable() { // from class: grc
            @Override // java.lang.Runnable
            public final void run() {
                ljf ljfVar;
                gri griVar = this.a;
                long j2 = j;
                try {
                    try {
                        griVar.i.e("waitUntilFrame");
                        giq giqVar = griVar.d;
                        long nanos = TimeUnit.MILLISECONDS.toNanos(165L);
                        giqVar.a.lock();
                        while (giqVar.c < j2 && nanos > 0) {
                            try {
                                nanos = giqVar.b.awaitNanos(nanos);
                            } catch (Throwable th) {
                                giqVar.a.unlock();
                                throw th;
                            }
                        }
                        giqVar.a.unlock();
                        if (nanos <= 0) {
                            ((oug) ((oug) gri.a.b()).G(2102)).q("Timeout waiting for frame %d", j2);
                        }
                        ljfVar = griVar.i;
                    } catch (InterruptedException e) {
                        ((oug) ((oug) ((oug) gri.a.b()).h(e)).G(2103)).q("Error waiting for frame %d", j2);
                        Thread.currentThread().interrupt();
                        ljfVar = griVar.i;
                    }
                    ljfVar.f();
                } catch (Throwable th2) {
                    griVar.i.f();
                    throw th2;
                }
            }
        };
        try {
            try {
                this.i.e("waitFuture");
                this.p.submit(runnable).get();
                this.i.f();
            } catch (RejectedExecutionException e) {
                ((oug) ((oug) ((oug) a.b()).h(e)).G(2106)).q("Error trying to wait for frame %d", j);
                throw new ExecutionException(e);
            }
        } catch (Throwable th) {
            this.i.f();
            throw th;
        }
    }

    @Override // defpackage.grp
    public final ojc a() {
        ojc ojcVarA;
        synchronized (this.c) {
            ojcVarA = this.m.a();
        }
        return ojcVarA;
    }

    public final void b() {
        lie lieVar;
        synchronized (this.b) {
            if (this.j) {
                return;
            }
            if (this.k <= 0 && this.q == null) {
                final grg grgVar = this.o;
                final lmv lmvVar = this.n;
                synchronized (grgVar.a) {
                    lmvVar.k(grgVar);
                    grgVar.b = true;
                    lieVar = new lie() { // from class: grd
                        @Override // defpackage.lie, java.lang.AutoCloseable
                        public final void close() {
                            grg grgVar2 = grgVar;
                            lmv lmvVar2 = lmvVar;
                            synchronized (grgVar2.a) {
                                lmvVar2.l(grgVar2);
                                grgVar2.b = false;
                            }
                        }
                    };
                }
                this.q = lieVar;
            }
        }
    }

    @Override // defpackage.grp
    public final grh c(long j) {
        lzv lzvVar;
        ljf ljfVar;
        grh grhVar;
        ljf ljfVar2;
        synchronized (this.b) {
            if (this.j) {
                throw new llv("SmartMeteringController already closed");
            }
            this.i.e("pauseLoop");
            d();
            this.i.f();
            int i = this.k;
            if (i > 0) {
                this.k = i + 1;
                return new grh(this, this.r);
            }
            synchronized (this.c) {
                lzvVar = null;
                try {
                    try {
                        this.i.e("waitForMeteringFrame");
                        giq giqVar = this.d;
                        giqVar.a.lock();
                        try {
                            long j2 = giqVar.c;
                            giqVar.a.unlock();
                            int i2 = 0;
                            while (i2 < 10) {
                                e(((long) i2) + j2);
                                i2++;
                                ljf ljfVar3 = this.i;
                                StringBuilder sb = new StringBuilder(19);
                                sb.append("attempt-");
                                sb.append(i2);
                                ljfVar3.e(sb.toString());
                                try {
                                    try {
                                        lmr lmrVarH = this.n.h();
                                        if (lmrVarH == null) {
                                            ljfVar2 = this.i;
                                        } else {
                                            try {
                                                lmw lmwVarB = lmrVarH.b();
                                                lmwVarB.getClass();
                                                if (lmwVarB.c >= j) {
                                                    this.i.e("awaitMetadata");
                                                    mip.bi(lmrVarH);
                                                    if (lmrVarH.h()) {
                                                        lzv lzvVarC = lmrVarH.c();
                                                        lmrVarH.close();
                                                        this.i.f();
                                                        lzvVar = lzvVarC;
                                                        break;
                                                    }
                                                }
                                                lmrVarH.close();
                                                ljfVar2 = this.i;
                                            } catch (Throwable th) {
                                                try {
                                                    lmrVarH.close();
                                                } catch (Throwable th2) {
                                                }
                                                throw th;
                                            }
                                        }
                                    } catch (InterruptedException e) {
                                        Thread.currentThread().interrupt();
                                        ((oug) ((oug) a.b()).G(2100)).o("Error retrieving metadata from frame.");
                                        ljfVar2 = this.i;
                                    }
                                    ljfVar2.f();
                                } catch (Throwable th3) {
                                    this.i.f();
                                    throw th3;
                                }
                            }
                            ljfVar = this.i;
                        } catch (Throwable th4) {
                            giqVar.a.unlock();
                            throw th4;
                        }
                    } catch (Throwable th5) {
                        this.i.f();
                        throw th5;
                    }
                } catch (InterruptedException | ExecutionException e2) {
                    ((oug) ((oug) ((oug) a.c()).h(e2)).G(2098)).o("SmartMetering failed");
                    ljfVar = this.i;
                }
                ljfVar.f();
            }
            synchronized (this.b) {
                if (lzvVar != null) {
                    this.k++;
                    this.r = lzvVar;
                    grhVar = new grh(this, lzvVar);
                } else {
                    grhVar = new grh(this, lzvVar);
                }
                throw th;
            }
            return grhVar;
        }
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.b) {
            if (this.j) {
                return;
            }
            this.j = true;
            synchronized (this.b) {
                this.l = false;
                d();
            }
            this.p.shutdownNow();
            this.o.close();
            this.n.close();
        }
    }
}
