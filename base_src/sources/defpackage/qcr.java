package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public enum qcr implements qbz {
    DISPOSED;

    public static void b() {
        qmd.R(new qcj("Disposable already set!"));
    }

    public static boolean c(qbz qbzVar) {
        return qbzVar == DISPOSED;
    }

    public static boolean e(AtomicReference atomicReference, qbz qbzVar) {
        qmd.W(qbzVar, "d is null");
        if (atomicReference.compareAndSet(null, qbzVar)) {
            return true;
        }
        qbzVar.gT();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        b();
        return false;
    }

    public static boolean f(qbz qbzVar, qbz qbzVar2) {
        if (qbzVar2 == null) {
            qmd.R(new NullPointerException("next is null"));
            return false;
        }
        if (qbzVar == null) {
            return true;
        }
        qbzVar2.gT();
        b();
        return false;
    }

    public static void g(AtomicReference atomicReference) {
        qbz qbzVar;
        qbz qbzVar2 = (qbz) atomicReference.get();
        qcr qcrVar = DISPOSED;
        if (qbzVar2 == qcrVar || (qbzVar = (qbz) atomicReference.getAndSet(qcrVar)) == qcrVar || qbzVar == null) {
            return;
        }
        qbzVar.gT();
    }

    public static void h(AtomicReference atomicReference, qbz qbzVar) {
        qbz qbzVar2;
        do {
            qbzVar2 = (qbz) atomicReference.get();
            if (qbzVar2 == DISPOSED) {
                if (qbzVar != null) {
                    qbzVar.gT();
                    return;
                }
                return;
            }
        } while (!atomicReference.compareAndSet(qbzVar2, qbzVar));
    }

    public static void i(AtomicReference atomicReference, qbz qbzVar) {
        qbz qbzVar2;
        do {
            qbzVar2 = (qbz) atomicReference.get();
            if (qbzVar2 == DISPOSED) {
                if (qbzVar != null) {
                    qbzVar.gT();
                    return;
                }
                return;
            }
        } while (!atomicReference.compareAndSet(qbzVar2, qbzVar));
        if (qbzVar2 != null) {
            qbzVar2.gT();
        }
    }

    @Override // defpackage.qbz
    public final void gT() {
    }

    @Override // defpackage.qbz
    public final boolean gV() {
        throw null;
    }
}
