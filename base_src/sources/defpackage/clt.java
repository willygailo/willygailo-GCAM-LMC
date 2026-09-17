package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
final class clt implements lmu {
    final /* synthetic */ AtomicInteger a;
    final /* synthetic */ pih b;
    final /* synthetic */ lmv c;
    final /* synthetic */ clx d;

    public clt(clx clxVar, AtomicInteger atomicInteger, pih pihVar, lmv lmvVar) {
        this.d = clxVar;
        this.a = atomicInteger;
        this.b = pihVar;
        this.c = lmvVar;
    }

    @Override // defpackage.lmu
    public final void a(lrr lrrVar) {
        if (this.a.incrementAndGet() == this.d.f) {
            this.b.o(clx.b);
            this.c.l(this);
        }
    }
}
