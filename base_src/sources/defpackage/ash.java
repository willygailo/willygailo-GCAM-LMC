package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
final class ash extends asc {
    final AtomicReferenceFieldUpdater a;
    final AtomicReferenceFieldUpdater b;
    final AtomicReferenceFieldUpdater c;
    final AtomicReferenceFieldUpdater d;
    final AtomicReferenceFieldUpdater e;

    public ash(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.asc
    public final void a(ask askVar, ask askVar2) {
        this.b.lazySet(askVar, askVar2);
    }

    @Override // defpackage.asc
    public final void b(ask askVar, Thread thread) {
        this.a.lazySet(askVar, thread);
    }

    @Override // defpackage.asc
    public final boolean c(asl aslVar, asg asgVar, asg asgVar2) {
        return this.d.compareAndSet(aslVar, asgVar, asgVar2);
    }

    @Override // defpackage.asc
    public final boolean d(asl aslVar, Object obj, Object obj2) {
        return this.e.compareAndSet(aslVar, obj, obj2);
    }

    @Override // defpackage.asc
    public final boolean e(asl aslVar, ask askVar, ask askVar2) {
        return this.c.compareAndSet(aslVar, askVar, askVar2);
    }
}
