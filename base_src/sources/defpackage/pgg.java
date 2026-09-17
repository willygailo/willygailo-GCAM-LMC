package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
final class pgg extends pgf {
    final AtomicReferenceFieldUpdater a;
    final AtomicIntegerFieldUpdater b;

    public pgg(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicIntegerFieldUpdater;
    }

    @Override // defpackage.pgf
    public final int a(pgi pgiVar) {
        return this.b.decrementAndGet(pgiVar);
    }

    @Override // defpackage.pgf
    public final void b(pgi pgiVar, Set set) {
        this.a.compareAndSet(pgiVar, null, set);
    }
}
