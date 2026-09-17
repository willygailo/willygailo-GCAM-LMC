package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class gsb implements gsa {
    final /* synthetic */ gsc a;
    private final AtomicBoolean b = new AtomicBoolean(false);

    public gsb(gsc gscVar) {
        this.a = gscVar;
    }

    @Override // defpackage.gsa, defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        if (this.b.getAndSet(true)) {
            return;
        }
        gsc gscVar = this.a;
        synchronized (gscVar.a) {
            gscVar.fB(Integer.valueOf(((Integer) gscVar.d).intValue() - 1));
        }
    }
}
