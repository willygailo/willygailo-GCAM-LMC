package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
final class xm extends xh {
    final AtomicReferenceFieldUpdater a;
    final AtomicReferenceFieldUpdater b;
    final AtomicReferenceFieldUpdater c;
    final AtomicReferenceFieldUpdater d;
    final AtomicReferenceFieldUpdater e;

    public xm(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.xh
    public final void a(xp xpVar, xp xpVar2) {
        this.b.lazySet(xpVar, xpVar2);
    }

    @Override // defpackage.xh
    public final void b(xp xpVar, Thread thread) {
        this.a.lazySet(xpVar, thread);
    }

    @Override // defpackage.xh
    public final boolean c(xq xqVar, xl xlVar, xl xlVar2) {
        return this.d.compareAndSet(xqVar, xlVar, xlVar2);
    }

    @Override // defpackage.xh
    public final boolean d(xq xqVar, Object obj, Object obj2) {
        return this.e.compareAndSet(xqVar, obj, obj2);
    }

    @Override // defpackage.xh
    public final boolean e(xq xqVar, xp xpVar, xp xpVar2) {
        return this.c.compareAndSet(xqVar, xpVar, xpVar2);
    }
}
