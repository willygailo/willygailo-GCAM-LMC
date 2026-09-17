package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
final class pfp extends pfk {
    final AtomicReferenceFieldUpdater a;
    final AtomicReferenceFieldUpdater b;
    final AtomicReferenceFieldUpdater c;
    final AtomicReferenceFieldUpdater d;
    final AtomicReferenceFieldUpdater e;

    public pfp(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.pfk
    public final void a(pfw pfwVar, pfw pfwVar2) {
        this.b.lazySet(pfwVar, pfwVar2);
    }

    @Override // defpackage.pfk
    public final void b(pfw pfwVar, Thread thread) {
        this.a.lazySet(pfwVar, thread);
    }

    @Override // defpackage.pfk
    public final boolean c(pfx pfxVar, pfo pfoVar, pfo pfoVar2) {
        return this.d.compareAndSet(pfxVar, pfoVar, pfoVar2);
    }

    @Override // defpackage.pfk
    public final boolean d(pfx pfxVar, Object obj, Object obj2) {
        return this.e.compareAndSet(pfxVar, obj, obj2);
    }

    @Override // defpackage.pfk
    public final boolean e(pfx pfxVar, pfw pfwVar, pfw pfwVar2) {
        return this.c.compareAndSet(pfxVar, pfwVar, pfwVar2);
    }
}
