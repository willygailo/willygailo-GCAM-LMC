package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public enum qjn implements qyn {
    CANCELLED;

    public static void a(AtomicReference atomicReference, AtomicLong atomicLong, long j) {
        qyn qynVar = (qyn) atomicReference.get();
        if (qynVar != null) {
            qynVar.gP(j);
            return;
        }
        if (d(j)) {
            qmd.U(atomicLong, j);
            qyn qynVar2 = (qyn) atomicReference.get();
            if (qynVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    qynVar2.gP(andSet);
                }
            }
        }
    }

    public static void b(long j) {
        StringBuilder sb = new StringBuilder(50);
        sb.append("More produced than requested: ");
        sb.append(j);
        qmd.R(new qcj(sb.toString()));
    }

    public static void c() {
        qmd.R(new qcj("Subscription already set!"));
    }

    public static boolean d(long j) {
        if (j > 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder(46);
        sb.append("n > 0 required but it was ");
        sb.append(j);
        qmd.R(new IllegalArgumentException(sb.toString()));
        return false;
    }

    public static boolean e(qyn qynVar, qyn qynVar2) {
        if (qynVar2 == null) {
            qmd.R(new NullPointerException("next is null"));
            return false;
        }
        if (qynVar == null) {
            return true;
        }
        qynVar2.g();
        c();
        return false;
    }

    public static void f(AtomicReference atomicReference) {
        qyn qynVar;
        qyn qynVar2 = (qyn) atomicReference.get();
        qjn qjnVar = CANCELLED;
        if (qynVar2 == qjnVar || (qynVar = (qyn) atomicReference.getAndSet(qjnVar)) == qjnVar || qynVar == null) {
            return;
        }
        qynVar.g();
    }

    public static void h(AtomicReference atomicReference, AtomicLong atomicLong, qyn qynVar) {
        qmd.W(qynVar, "s is null");
        if (atomicReference.compareAndSet(null, qynVar)) {
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                qynVar.gP(andSet);
                return;
            }
            return;
        }
        qynVar.g();
        if (atomicReference.get() != CANCELLED) {
            c();
        }
    }

    @Override // defpackage.qyn
    public final void g() {
    }

    @Override // defpackage.qyn
    public final void gP(long j) {
    }
}
