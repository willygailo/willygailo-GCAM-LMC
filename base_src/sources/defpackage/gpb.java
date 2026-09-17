package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
final class gpb implements gox {
    final /* synthetic */ pih a;
    final /* synthetic */ gpd b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public gpb(gpd gpdVar, pih pihVar) {
        this.b = gpdVar;
        this.a = pihVar;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        if (this.c.getAndSet(true)) {
            return;
        }
        gpd gpdVar = this.b;
        gpdVar.e.fB(Boolean.valueOf(gpdVar.f.decrementAndGet() > 0));
        this.b.d.c();
        this.a.o(true);
    }
}
