package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
final class qfd extends AtomicInteger implements qbi, qyn {
    private static final long serialVersionUID = -1776795561228106469L;
    final qym a;
    final qcm b;
    final qdk c;
    final AtomicLong d;
    final int e;
    final int f;
    volatile boolean g;
    volatile boolean h;
    Throwable i;
    qyn j;
    Object k;
    int l;

    public qfd(qym qymVar, qcm qcmVar, Object obj, int i) {
        this.a = qymVar;
        this.b = qcmVar;
        this.k = obj;
        this.e = i;
        this.f = i - (i >> 2);
        qic qicVar = new qic(i);
        this.c = qicVar;
        qicVar.gU(obj);
        this.d = new AtomicLong();
    }

    @Override // defpackage.qbi, defpackage.qym
    public final void a(qyn qynVar) {
        if (qjn.e(this.j, qynVar)) {
            this.j = qynVar;
            this.a.a(this);
            qynVar.gP(this.e - 1);
        }
    }

    final void b() {
        Throwable th;
        if (getAndIncrement() != 0) {
            return;
        }
        qym qymVar = this.a;
        qdk qdkVar = this.c;
        int i = this.f;
        int i2 = this.l;
        int iAddAndGet = 1;
        do {
            long j = this.d.get();
            long j2 = 0;
            long j3 = 0;
            while (j3 != j) {
                if (this.g) {
                    qdkVar.c();
                    return;
                }
                boolean z = this.h;
                if (z && (th = this.i) != null) {
                    qdkVar.c();
                    qymVar.j(th);
                    return;
                }
                Object objGS = qdkVar.gS();
                if (!z) {
                    if (objGS == null) {
                        break;
                    }
                } else if (objGS == null) {
                    qymVar.gO();
                    return;
                }
                qymVar.e(objGS);
                j3++;
                i2++;
                if (i2 == i) {
                    this.j.gP(i);
                    i2 = 0;
                }
            }
            if (j3 == j && this.h) {
                Throwable th2 = this.i;
                if (th2 != null) {
                    qdkVar.c();
                    qymVar.j(th2);
                    return;
                } else if (qdkVar.i()) {
                    qymVar.gO();
                    return;
                }
            }
            if (j3 != 0) {
                AtomicLong atomicLong = this.d;
                while (true) {
                    long j4 = atomicLong.get();
                    if (j4 == Long.MAX_VALUE) {
                        break;
                    }
                    long j5 = j4 - j3;
                    if (j5 < j2) {
                        StringBuilder sb = new StringBuilder(50);
                        sb.append("More produced than requested: ");
                        sb.append(j5);
                        qmd.R(new IllegalStateException(sb.toString()));
                        j5 = 0;
                    }
                    if (atomicLong.compareAndSet(j4, j5)) {
                        break;
                    } else {
                        j2 = 0;
                    }
                }
            }
            this.l = i2;
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // defpackage.qym
    public final void e(Object obj) {
        if (this.h) {
            return;
        }
        try {
            Object objA = this.b.a(this.k, obj);
            qmd.W(objA, "The accumulator returned a null value");
            this.k = objA;
            this.c.gU(objA);
            b();
        } catch (Throwable th) {
            qmd.Y(th);
            this.j.g();
            j(th);
        }
    }

    @Override // defpackage.qyn
    public final void g() {
        this.g = true;
        this.j.g();
        if (getAndIncrement() == 0) {
            this.c.c();
        }
    }

    @Override // defpackage.qym
    public final void gO() {
        if (this.h) {
            return;
        }
        this.h = true;
        b();
    }

    @Override // defpackage.qyn
    public final void gP(long j) {
        if (qjn.d(j)) {
            qmd.U(this.d, j);
            b();
        }
    }

    @Override // defpackage.qym
    public final void j(Throwable th) {
        if (this.h) {
            qmd.R(th);
            return;
        }
        this.i = th;
        this.h = true;
        b();
    }
}
