package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class qfx extends AtomicInteger implements qbz, qbq {
    static final qfw[] a = new qfw[0];
    static final qfw[] b = new qfw[0];
    private static final long serialVersionUID = -2117620485640801370L;
    final qbq c;
    final int f;
    volatile qdk g;
    volatile boolean h;
    volatile boolean j;
    qbz l;
    long m;
    long n;
    int o;
    int q;
    final qjo i = new qjo();
    final boolean d = false;
    final int e = 2;
    final Queue p = new ArrayDeque(2);
    final AtomicReference k = new AtomicReference(a);

    public qfx(qbq qbqVar, int i) {
        this.c = qbqVar;
        this.f = i;
    }

    @Override // defpackage.qbq
    public final void b(Throwable th) {
        if (this.h) {
            qmd.R(th);
        } else if (!qjq.c(this.i, th)) {
            qmd.R(th);
        } else {
            this.h = true;
            f();
        }
    }

    @Override // defpackage.qbq
    public final void e(Object obj) {
        if (this.h) {
            return;
        }
        try {
            qbp qbpVar = (qbp) obj;
            qmd.W(qbpVar, "The mapper returned a null ObservableSource");
            synchronized (this) {
                int i = this.q;
                if (i == this.e) {
                    this.p.offer(qbpVar);
                } else {
                    this.q = i + 1;
                    i(qbpVar);
                }
            }
        } catch (Throwable th) {
            qmd.Y(th);
            this.l.gT();
            b(th);
        }
    }

    final void f() {
        if (getAndIncrement() == 0) {
            g();
        }
    }

    /* JADX WARN: Code duplicated, block: B:119:0x00de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00df  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e6  */
    final void g() {
        int size;
        boolean z;
        qbq qbqVar = this.c;
        int iAddAndGet = 1;
        while (!j()) {
            qdk qdkVar = this.g;
            if (qdkVar != null) {
                while (!j()) {
                    Object objGS = qdkVar.gS();
                    if (objGS != null) {
                        qbqVar.e(objGS);
                    }
                }
                return;
            }
            boolean z2 = this.h;
            qdk qdkVar2 = this.g;
            qfw[] qfwVarArr = (qfw[]) this.k.get();
            int length = qfwVarArr.length;
            synchronized (this) {
                size = this.p.size();
            }
            if (z2 && ((qdkVar2 == null || qdkVar2.i()) && length == 0 && size == 0)) {
                Throwable thB = qjq.b(this.i);
                if (thB != qjq.a) {
                    if (thB == null) {
                        qbqVar.gQ();
                        return;
                    } else {
                        qbqVar.b(thB);
                        return;
                    }
                }
                return;
            }
            int i = 0;
            if (length != 0) {
                long j = this.n;
                int i2 = this.o;
                if (length <= i2 || qfwVarArr[i2].a != j) {
                    if (length <= i2) {
                        i2 = 0;
                    }
                    for (int i3 = 0; i3 < length && qfwVarArr[i2].a != j; i3++) {
                        i2++;
                        if (i2 == length) {
                            i2 = 0;
                        }
                    }
                    this.o = i2;
                    this.n = qfwVarArr[i2].a;
                }
                int i4 = 0;
                for (int i5 = 0; i5 < length; i5++) {
                    if (j()) {
                        return;
                    }
                    qfw qfwVar = qfwVarArr[i2];
                    qdl qdlVar = qfwVar.d;
                    if (qdlVar != null) {
                        do {
                            try {
                                Object objGS2 = qdlVar.gS();
                                if (objGS2 == null) {
                                    z = qfwVar.c;
                                    qdl qdlVar2 = qfwVar.d;
                                    if (z && (qdlVar2 == null || qdlVar2.i())) {
                                        h(qfwVar);
                                        if (j()) {
                                            return;
                                        } else {
                                            i4++;
                                        }
                                    }
                                    i2++;
                                    if (i2 == length) {
                                        i2 = 0;
                                    }
                                } else {
                                    qbqVar.e(objGS2);
                                }
                            } catch (Throwable th) {
                                qmd.Y(th);
                                qcr.g(qfwVar);
                                qjq.c(this.i, th);
                                if (j()) {
                                    return;
                                }
                                h(qfwVar);
                                i4++;
                                i2++;
                                if (i2 == length) {
                                    i2 = 0;
                                }
                            }
                        } while (!j());
                        return;
                    }
                    z = qfwVar.c;
                    qdl qdlVar3 = qfwVar.d;
                    if (z) {
                        h(qfwVar);
                        if (j()) {
                            return;
                        } else {
                            i4++;
                        }
                    }
                    i2++;
                    if (i2 == length) {
                        i2 = 0;
                    }
                }
                this.o = i2;
                this.n = qfwVarArr[i2].a;
                i = i4;
            }
            if (i == 0) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                while (true) {
                    int i6 = i - 1;
                    if (i != 0) {
                        synchronized (this) {
                            qbp qbpVar = (qbp) this.p.poll();
                            if (qbpVar == null) {
                                this.q--;
                            } else {
                                i(qbpVar);
                            }
                        }
                        i = i6;
                    }
                }
            }
        }
    }

    @Override // defpackage.qbq
    public final void gQ() {
        if (this.h) {
            return;
        }
        this.h = true;
        f();
    }

    @Override // defpackage.qbq
    public final void gR(qbz qbzVar) {
        if (qcr.f(this.l, qbzVar)) {
            this.l = qbzVar;
            this.c.gR(this);
        }
    }

    @Override // defpackage.qbz
    public final void gT() {
        Throwable thB;
        if (this.j) {
            return;
        }
        this.j = true;
        if (!k() || (thB = qjq.b(this.i)) == null || thB == qjq.a) {
            return;
        }
        qmd.R(thB);
    }

    @Override // defpackage.qbz
    public final boolean gV() {
        throw null;
    }

    final void h(qfw qfwVar) {
        qfw[] qfwVarArr;
        qfw[] qfwVarArr2;
        do {
            qfwVarArr = (qfw[]) this.k.get();
            int length = qfwVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (qfwVarArr[i] == qfwVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                qfwVarArr2 = a;
            } else {
                qfw[] qfwVarArr3 = new qfw[length - 1];
                System.arraycopy(qfwVarArr, 0, qfwVarArr3, 0, i);
                System.arraycopy(qfwVarArr, i + 1, qfwVarArr3, i, (length - i) - 1);
                qfwVarArr2 = qfwVarArr3;
            }
        } while (!this.k.compareAndSet(qfwVarArr, qfwVarArr2));
    }

    final void i(qbp qbpVar) {
        boolean z;
        qfw[] qfwVarArr;
        qfw[] qfwVarArr2;
        do {
            z = false;
            if (!(qbpVar instanceof Callable)) {
                long j = this.m;
                this.m = 1 + j;
                qfw qfwVar = new qfw(this, j);
                do {
                    qfwVarArr = (qfw[]) this.k.get();
                    if (qfwVarArr == b) {
                        qcr.g(qfwVar);
                        return;
                    }
                    int length = qfwVarArr.length;
                    qfwVarArr2 = new qfw[length + 1];
                    System.arraycopy(qfwVarArr, 0, qfwVarArr2, 0, length);
                    qfwVarArr2[length] = qfwVar;
                } while (!this.k.compareAndSet(qfwVarArr, qfwVarArr2));
                qbpVar.f(qfwVar);
                return;
            }
            try {
                Object objCall = ((Callable) qbpVar).call();
                if (objCall != null) {
                    if (get() == 0 && compareAndSet(0, 1)) {
                        this.c.e(objCall);
                        if (decrementAndGet() != 0) {
                            g();
                        }
                    } else {
                        qdk qicVar = this.g;
                        if (qicVar == null) {
                            qicVar = new qic(this.e);
                            this.g = qicVar;
                        }
                        if (qicVar.gU(objCall)) {
                            if (getAndIncrement() != 0) {
                                return;
                            }
                            g();
                        } else {
                            b(new IllegalStateException("Scalar queue full?!"));
                        }
                    }
                }
            } catch (Throwable th) {
                qmd.Y(th);
                qjq.c(this.i, th);
                f();
            }
            synchronized (this) {
                qbpVar = (qbp) this.p.poll();
                if (qbpVar == null) {
                    this.q--;
                    z = true;
                }
            }
        } while (!z);
        f();
    }

    final boolean j() {
        if (this.j) {
            return true;
        }
        if (((Throwable) this.i.get()) == null) {
            return false;
        }
        k();
        Throwable thB = qjq.b(this.i);
        if (thB != qjq.a) {
            this.c.b(thB);
        }
        return true;
    }

    final boolean k() {
        qfw[] qfwVarArr;
        this.l.gT();
        qfw[] qfwVarArr2 = (qfw[]) this.k.get();
        qfw[] qfwVarArr3 = b;
        if (qfwVarArr2 == qfwVarArr3 || (qfwVarArr = (qfw[]) this.k.getAndSet(qfwVarArr3)) == qfwVarArr3) {
            return false;
        }
        for (qfw qfwVar : qfwVarArr) {
            qcr.g(qfwVar);
        }
        return true;
    }
}
