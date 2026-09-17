package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes2.dex */
public final class qwb implements Executor, Closeable {
    public static final qvr a = new qvr("NOT_IN_STACK");
    public final int b;
    public final int c;
    public final long d;
    public final String e = "DefaultDispatcher";
    public final qpd f;
    public final AtomicReferenceArray g;
    public final qpd h;
    public final qvi i;
    public final qvi j;
    private final qpb k;

    public qwb(int i, int i2, long j) {
        this.b = i;
        this.c = i2;
        this.d = j;
        if (i <= 0) {
            throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.i = new qvi();
        this.j = new qvi();
        this.f = qnt.h(0L);
        this.g = new AtomicReferenceArray(i2 + 1);
        this.h = qnt.h(((long) i) << 42);
        this.k = qnt.f(false);
    }

    public static /* synthetic */ void e(qwb qwbVar, Runnable runnable) {
        qwbVar.a(runnable, qwf.a, false);
    }

    public static final void f(qwg qwgVar) {
        qwgVar.getClass();
        try {
            qwgVar.run();
        } catch (Throwable th) {
            Thread threadCurrentThread = Thread.currentThread();
            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
        }
    }

    public static final qwg g(Runnable runnable, qwh qwhVar) {
        long j = qwj.a;
        long jNanoTime = System.nanoTime();
        if (!(runnable instanceof qwg)) {
            return new qwi(runnable, jNanoTime, qwhVar);
        }
        qwg qwgVar = (qwg) runnable;
        qwgVar.g = jNanoTime;
        qwgVar.h = qwhVar;
        return qwgVar;
    }

    private final int h() {
        synchronized (this.g) {
            if (d()) {
                return -1;
            }
            long j = this.h.b;
            int i = (int) (j & 2097151);
            int iF = qno.f(i - ((int) ((j & 4398044413952L) >> 21)), 0);
            if (iF >= this.b) {
                return 0;
            }
            if (i >= this.c) {
                return 0;
            }
            int i2 = ((int) (this.h.b & 2097151)) + 1;
            if (this.g.get(i2) != null) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            qwa qwaVar = new qwa(this, i2);
            this.g.set(i2, qwaVar);
            qpd qpdVar = this.h;
            int i3 = qpf.a;
            if (i2 != ((int) (2097151 & qpd.a.incrementAndGet(qpdVar)))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            qwaVar.start();
            return iF + 1;
        }
    }

    private final qwa i() {
        Thread threadCurrentThread = Thread.currentThread();
        qwa qwaVar = threadCurrentThread instanceof qwa ? (qwa) threadCurrentThread : null;
        if (qwaVar != null && qno.c(qwaVar.d, this)) {
            return qwaVar;
        }
        return null;
    }

    private final boolean j(long j) {
        if (qno.f(((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)), 0) < this.b) {
            int iH = h();
            if (iH == 1) {
                if (this.b > 1) {
                    h();
                }
            } else if (iH <= 0) {
            }
            return true;
        }
        return false;
    }

    private final boolean k() {
        qwa qwaVar;
        do {
            qpd qpdVar = this.f;
            while (true) {
                long j = qpdVar.b;
                qwaVar = (qwa) this.g.get((int) (2097151 & j));
                if (qwaVar != null) {
                    long j2 = (2097152 + j) & (-2097152);
                    int iL = l(qwaVar);
                    if (iL >= 0 && this.f.c(j, j2 | ((long) iL))) {
                        qwaVar.nextParkedWorker = a;
                        break;
                    }
                } else {
                    qwaVar = null;
                    break;
                }
            }
            if (qwaVar == null) {
                return false;
            }
        } while (!qwaVar.b.d(-1, 0));
        LockSupport.unpark(qwaVar);
        return true;
    }

    private static final int l(qwa qwaVar) {
        int i;
        do {
            Object obj = qwaVar.nextParkedWorker;
            if (obj == a) {
                return -1;
            }
            if (obj == null) {
                return 0;
            }
            qwaVar = (qwa) obj;
            i = qwaVar.indexInArray;
        } while (i == 0);
        return i;
    }

    public final void a(Runnable runnable, qwh qwhVar, boolean z) {
        qwg qwgVarC;
        qwhVar.getClass();
        qwg qwgVarG = g(runnable, qwhVar);
        qwa qwaVarI = i();
        if (qwaVarI == null || qwaVarI.e == 5 || (qwgVarG.h.f() == 0 && qwaVarI.e == 2)) {
            qwgVarC = qwgVarG;
        } else {
            qwaVarI.c = true;
            qwgVarC = qwaVarI.a.c(qwgVarG, z);
        }
        if (qwgVarC != null) {
            if (!(qwgVarC.h.f() == 1 ? this.j.d(qwgVarC) : this.i.d(qwgVarC))) {
                throw new RejectedExecutionException(qno.a(this.e, " was terminated"));
            }
        }
        boolean z2 = z && qwaVarI != null;
        if (qwgVarG.h.f() == 0) {
            if (z2) {
                return;
            }
            c();
        } else {
            long jA = this.h.a(2097152L);
            if (z2 || k() || j(jA)) {
                return;
            }
            k();
        }
    }

    public final void b(qwa qwaVar, int i, int i2) {
        qpd qpdVar = this.f;
        while (true) {
            long j = qpdVar.b;
            int iL = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (iL == i) {
                iL = i2 == 0 ? l(qwaVar) : i2;
            }
            if (iL >= 0 && this.f.c(j, j2 | ((long) iL))) {
                return;
            }
        }
    }

    public final void c() {
        if (k() || j(this.h.b)) {
            return;
        }
        k();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        if (this.k.b()) {
            qwa qwaVarI = i();
            synchronized (this.g) {
                i = (int) (this.h.b & 2097151);
            }
            if (i > 0) {
                int i2 = 1;
                while (true) {
                    int i3 = i2 + 1;
                    Object obj = this.g.get(i2);
                    obj.getClass();
                    qwa qwaVar = (qwa) obj;
                    if (qwaVar != qwaVarI) {
                        while (qwaVar.isAlive()) {
                            LockSupport.unpark(qwaVar);
                            qwaVar.join(10000L);
                        }
                        boolean z = qql.a;
                        qwk qwkVar = qwaVar.a;
                        qvi qviVar = this.j;
                        qviVar.getClass();
                        qwg qwgVar = (qwg) qwkVar.b.a(null);
                        if (qwgVar != null) {
                            qviVar.d(qwgVar);
                        }
                        while (true) {
                            qwg qwgVarE = qwkVar.e();
                            if (qwgVarE == null) {
                                break;
                            } else {
                                qviVar.d(qwgVarE);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2 = i3;
                    }
                }
            }
            this.j.c();
            this.i.c();
            while (true) {
                qwg qwgVarB = qwaVarI == null ? null : qwaVarI.b(true);
                if (qwgVarB == null && (qwgVarB = (qwg) this.i.b()) == null && (qwgVarB = (qwg) this.j.b()) == null) {
                    break;
                } else {
                    f(qwgVarB);
                }
            }
            if (qwaVarI != null) {
                qwaVarI.d(5);
            }
            boolean z2 = qql.a;
            qpd qpdVar = this.f;
            int i4 = qpf.a;
            qpdVar.b = 0L;
            this.h.b = 0L;
        }
    }

    public final boolean d() {
        return this.k.a();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        e(this, runnable);
    }

    public final String toString() {
        int i;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList = new ArrayList();
        int length = this.g.length();
        int i5 = 0;
        if (length > 1) {
            int i6 = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            int i7 = 1;
            while (true) {
                int i8 = i7 + 1;
                qwa qwaVar = (qwa) this.g.get(i7);
                if (qwaVar != null) {
                    qwk qwkVar = qwaVar.a;
                    int iA = qwkVar.b.a != null ? qwkVar.a() + 1 : qwkVar.a();
                    int i9 = qwaVar.e;
                    int i10 = i9 - 1;
                    if (i9 == 0) {
                        throw null;
                    }
                    switch (i10) {
                        case 0:
                            i6++;
                            StringBuilder sb = new StringBuilder();
                            sb.append(iA);
                            sb.append('c');
                            arrayList.add(sb.toString());
                            break;
                        case 1:
                            i5++;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(iA);
                            sb2.append('b');
                            arrayList.add(sb2.toString());
                            break;
                        case 2:
                            i4++;
                            break;
                        case 3:
                            i2++;
                            if (iA > 0) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(iA);
                                sb3.append('d');
                                arrayList.add(sb3.toString());
                            }
                            break;
                        case 4:
                            i3++;
                            break;
                    }
                }
                if (i8 >= length) {
                    i = i5;
                    i5 = i6;
                } else {
                    i7 = i8;
                }
            }
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        long j = this.h.b;
        return this.e + '@' + qnm.g(this) + "[Pool Size {core = " + this.b + ", max = " + this.c + "}, Worker States {CPU = " + i5 + ", blocking = " + i + ", parked = " + i4 + ", dormant = " + i2 + ", terminated = " + i3 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.i.a() + ", global blocking queue size = " + this.j.a() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.b - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }
}
