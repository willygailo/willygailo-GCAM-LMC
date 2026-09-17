package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
final class cll implements lmu {
    final /* synthetic */ AtomicInteger a;
    final /* synthetic */ pih b;
    final /* synthetic */ lmv c;
    final /* synthetic */ clp d;

    public cll(clp clpVar, AtomicInteger atomicInteger, pih pihVar, lmv lmvVar) {
        this.d = clpVar;
        this.a = atomicInteger;
        this.b = pihVar;
        this.c = lmvVar;
    }

    @Override // defpackage.lmu
    public final void a(lrr lrrVar) {
        if (this.a.incrementAndGet() == this.d.f) {
            this.b.o(clp.b);
            this.c.l(this);
        }
    }
}
