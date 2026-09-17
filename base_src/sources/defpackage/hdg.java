package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
final class hdg extends mip {
    final /* synthetic */ AtomicInteger a;
    final /* synthetic */ int b;
    final /* synthetic */ pih c;
    final /* synthetic */ gvm d;

    public hdg(AtomicInteger atomicInteger, int i, pih pihVar, gvm gvmVar) {
        this.a = atomicInteger;
        this.b = i;
        this.c = pihVar;
        this.d = gvmVar;
    }

    @Override // defpackage.mip
    public final void b(lzv lzvVar) {
        if (this.a.incrementAndGet() == this.b) {
            this.c.o(bxg.g);
            this.d.o(this);
        }
    }
}
