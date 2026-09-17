package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class gza implements lmv {
    public static final ouj a = ouj.h("com/google/android/apps/camera/pixelcamerakit/commands/PckDynamicRawFrameBuffer");
    public final ReentrantLock b = new ReentrantLock(true);
    public final List c = new ArrayList();
    public String d;
    public lmv e;
    public lmt f;
    public boolean g;
    public final lmu h;
    private final lnc i;

    public gza(final lnc lncVar, Map map, lco lcoVar, lap lapVar, final Executor executor, int i) {
        lvs lvsVarC;
        lmu lmuVar = new lmu() { // from class: gyy
            @Override // defpackage.lmu
            public final void a(lrr lrrVar) {
                oom oomVarJ;
                gza gzaVar = this.a;
                if (gzaVar.g) {
                    return;
                }
                synchronized (gzaVar) {
                    oomVarJ = oom.j(gzaVar.c);
                }
                int size = oomVarJ.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((lmu) oomVarJ.get(i2)).a(lrrVar);
                }
            }
        };
        this.h = lmuVar;
        obr.aF(true ^ map.isEmpty());
        this.i = lncVar;
        lqd lqdVar = (lqd) map.get(hdr.RAW_WIDE);
        lqdVar.getClass();
        lmv lmvVarR = lncVar.r(lqdVar, i);
        this.e = lmvVarR;
        lmvVarR.k(lmuVar);
        lvs lvsVarC2 = fvq.C(lqdVar);
        lvsVarC2.getClass();
        this.d = lvsVarC2.a;
        final HashMap map2 = new HashMap();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            lqd lqdVar2 = (lqd) map.get((hdr) it.next());
            if (lqdVar2 != null && (lvsVarC = fvq.C(lqdVar2)) != null) {
                map2.put(lvsVarC.a, lqdVar2);
            }
        }
        lapVar.c(lcoVar.a(new lij() { // from class: gyx
            @Override // defpackage.lij
            public final void fB(Object obj) {
                this.a.s(map2, lncVar, executor, (String) obj);
            }
        }, executor));
    }

    private static void t(lnc lncVar, lmv lmvVar) {
        if (lmvVar != null) {
            lmvVar.close();
            for (lnx lnxVar : ((low) lmvVar).h.c) {
                if (fvq.z(lnxVar)) {
                    lncVar.d(lnxVar);
                }
            }
        }
    }

    @Override // defpackage.lmv
    public final int a() {
        return this.e.a();
    }

    @Override // defpackage.lmv
    public final int b() {
        return this.e.b();
    }

    @Override // defpackage.lmv
    public final lmr c() {
        return this.e.c();
    }

    @Override // defpackage.lmv, defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        if (this.g) {
            return;
        }
        synchronized (this) {
            this.c.clear();
        }
        lie lieVarR = r();
        try {
            this.g = true;
            this.e.l(this.h);
            t(this.i, this.e);
            lieVarR.close();
        } catch (Throwable th) {
            try {
                lieVarR.close();
            } catch (Throwable th2) {
            }
            throw th;
        }
    }

    @Override // defpackage.lmv
    public final lmr d(ojf ojfVar) {
        return this.e.d(ojfVar);
    }

    @Override // defpackage.lmv
    public final lmr e() {
        return this.e.e();
    }

    @Override // defpackage.lmv
    public final lmr f(ojf ojfVar) {
        return this.e.f(ojfVar);
    }

    @Override // defpackage.lmv
    public final lmr g() {
        return this.e.g();
    }

    @Override // defpackage.lmv
    public final lmr h() {
        return this.e.h();
    }

    @Override // defpackage.lmv
    public final List i() {
        return this.e.i();
    }

    @Override // defpackage.lmv
    public final List j() {
        return this.e.j();
    }

    @Override // defpackage.lmv
    public final synchronized void k(lmu lmuVar) {
        this.c.add(lmuVar);
    }

    @Override // defpackage.lmv
    public final synchronized void l(lmu lmuVar) {
        this.c.remove(lmuVar);
    }

    @Override // defpackage.lmv
    public final void m(int i) {
        this.e.m(i);
    }

    @Override // defpackage.lmv
    public final void n(lmt lmtVar) {
        this.f = lmtVar;
        this.e.n(lmtVar);
    }

    @Override // defpackage.lmv
    public final boolean o(lmw lmwVar) {
        return this.e.o(lmwVar);
    }

    @Override // defpackage.lmv
    public final boolean p() {
        return this.e.p();
    }

    @Override // defpackage.lmv
    public final lqd q() {
        return ((low) this.e).h;
    }

    public final lie r() {
        this.b.lock();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        return new lie() { // from class: gyw
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                gza gzaVar = this.a;
                if (atomicBoolean.getAndSet(false)) {
                    gzaVar.b.unlock();
                }
            }
        };
    }

    final /* synthetic */ void s(Map map, lnc lncVar, Executor executor, String str) {
        ReentrantLock reentrantLock;
        Thread.currentThread().getId();
        this.b.lock();
        try {
            if (this.g || !map.containsKey(str) || str.equals(this.d)) {
                reentrantLock = this.b;
            } else {
                int iA = this.e.a();
                this.e.l(this.h);
                lmv lmvVar = this.e;
                ope opeVar = ((low) lmvVar).h.c;
                t(lncVar, lmvVar);
                gyz gyzVar = new gyz(this, str, map, lncVar, iA);
                gyzVar.hashCode();
                try {
                    executor.execute(gyzVar);
                    this.d = str;
                    return;
                } catch (RejectedExecutionException e) {
                    ((oug) ((oug) ((oug) a.c()).h(e)).G(2220)).r("Error attaching FrameBuffer for camera %s", str);
                    reentrantLock = this.b;
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            this.b.unlock();
            throw th;
        }
    }
}
