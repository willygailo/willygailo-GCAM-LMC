package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class qwk {
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    public final qpe b = qnt.i(null);
    public final qpc c = qnt.g(0);
    public final qpc d = qnt.g(0);
    public final qpc e = qnt.g(0);

    private final qwg g(qwg qwgVar) {
        if (qwgVar.h.f() == 1) {
            this.e.c();
        }
        if (a() == 127) {
            return qwgVar;
        }
        int i = this.c.b & 127;
        while (this.a.get(i) != null) {
            Thread.yield();
        }
        this.a.lazySet(i, qwgVar);
        this.c.c();
        return null;
    }

    public final int a() {
        return this.c.b - this.d.b;
    }

    public final long b(qwk qwkVar, boolean z) {
        qwg qwgVar;
        do {
            qwgVar = (qwg) qwkVar.b.a;
            if (qwgVar == null) {
                return -2L;
            }
            if (z && qwgVar.h.f() != 1) {
                return -2L;
            }
            long j = qwj.a;
            long jNanoTime = System.nanoTime() - qwgVar.g;
            if (jNanoTime < qwj.a) {
                return qwj.a - jNanoTime;
            }
        } while (!qwkVar.b.c(qwgVar, null));
        c(qwgVar, false);
        return -1L;
    }

    public final qwg c(qwg qwgVar, boolean z) {
        if (z) {
            return g(qwgVar);
        }
        qwg qwgVar2 = (qwg) this.b.a(qwgVar);
        if (qwgVar2 == null) {
            return null;
        }
        return g(qwgVar2);
    }

    public final qwg d() {
        qwg qwgVar = (qwg) this.b.a(null);
        return qwgVar == null ? e() : qwgVar;
    }

    public final qwg e() {
        qwg qwgVar;
        while (true) {
            int i = this.d.b;
            if (i - this.c.b == 0) {
                return null;
            }
            int i2 = i & 127;
            if (this.d.d(i, i + 1) && (qwgVar = (qwg) this.a.getAndSet(i2, null)) != null) {
                if (qwgVar.h.f() == 1) {
                    this.e.a();
                    boolean z = qql.a;
                }
                return qwgVar;
            }
        }
    }
}
