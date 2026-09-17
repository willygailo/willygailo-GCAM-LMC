package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public class qjm extends AtomicInteger implements qyn {
    private static final long serialVersionUID = -2189523197179400958L;
    qyn c;
    long d;
    final AtomicReference e = new AtomicReference();
    final AtomicLong f = new AtomicLong();
    final AtomicLong g = new AtomicLong();
    volatile boolean h;
    public boolean i;

    final void b() {
        if (getAndIncrement() != 0) {
            return;
        }
        c();
    }

    final void c() {
        int iAddAndGet = 1;
        qyn qynVar = null;
        long jV = 0;
        do {
            qyn qynVar2 = (qyn) this.e.get();
            if (qynVar2 != null) {
                qynVar2 = (qyn) this.e.getAndSet(null);
            }
            long andSet = this.f.get();
            if (andSet != 0) {
                andSet = this.f.getAndSet(0L);
            }
            long andSet2 = this.g.get();
            if (andSet2 != 0) {
                andSet2 = this.g.getAndSet(0L);
            }
            qyn qynVar3 = this.c;
            if (this.h) {
                if (qynVar3 != null) {
                    qynVar3.g();
                    this.c = null;
                }
                if (qynVar2 != null) {
                    qynVar2.g();
                }
            } else {
                long jV2 = this.d;
                if (jV2 != Long.MAX_VALUE) {
                    jV2 = qmd.V(jV2, andSet);
                    if (jV2 != Long.MAX_VALUE) {
                        jV2 -= andSet2;
                        if (jV2 < 0) {
                            qjn.b(jV2);
                            jV2 = 0;
                        }
                    }
                    this.d = jV2;
                }
                if (qynVar2 != null) {
                    this.c = qynVar2;
                    if (jV2 != 0) {
                        jV = qmd.V(jV, jV2);
                        qynVar = qynVar2;
                    }
                } else if (qynVar3 != null && andSet != 0) {
                    jV = qmd.V(jV, andSet);
                    qynVar = qynVar3;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
        if (jV != 0) {
            qynVar.gP(jV);
        }
    }

    public final void f(long j) {
        if (this.i) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            qmd.U(this.g, j);
            b();
            return;
        }
        long j2 = this.d;
        if (j2 != Long.MAX_VALUE) {
            long j3 = j2 - j;
            if (j3 < 0) {
                qjn.b(j3);
                j3 = 0;
            }
            this.d = j3;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        c();
    }

    @Override // defpackage.qyn
    public final void g() {
        if (this.h) {
            return;
        }
        this.h = true;
        b();
    }

    @Override // defpackage.qyn
    public final void gP(long j) {
        if (!qjn.d(j) || this.i) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            qmd.U(this.f, j);
            b();
            return;
        }
        long j2 = this.d;
        if (j2 != Long.MAX_VALUE) {
            long jV = qmd.V(j2, j);
            this.d = jV;
            if (jV == Long.MAX_VALUE) {
                this.i = true;
            }
        }
        qyn qynVar = this.c;
        if (decrementAndGet() != 0) {
            c();
        }
        if (qynVar != null) {
            qynVar.gP(j);
        }
    }

    public final void h(qyn qynVar) {
        if (this.h) {
            qynVar.g();
            return;
        }
        qmd.W(qynVar, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            b();
            return;
        }
        this.c = qynVar;
        long j = this.d;
        if (decrementAndGet() != 0) {
            c();
        }
        if (j != 0) {
            qynVar.gP(j);
        }
    }
}
