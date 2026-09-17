package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class grx implements gsa {
    final /* synthetic */ grz a;
    private final AtomicBoolean b = new AtomicBoolean(false);

    public grx(grz grzVar) {
        this.a = grzVar;
    }

    @Override // defpackage.gsa, defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        if (this.b.getAndSet(true)) {
            return;
        }
        grz grzVar = this.a;
        synchronized (grzVar.b) {
            grzVar.e++;
            grzVar.d.a = Integer.valueOf(grzVar.a());
        }
        grzVar.d.c();
        synchronized (grzVar.b) {
            gry gryVar = (gry) grzVar.c.peekFirst();
            if (gryVar == null) {
                return;
            }
            if (!grzVar.f) {
                throw null;
            }
            gryVar.a = new gsd("FiniteTicketPool is closed.");
            grzVar.c.removeFirst();
            grzVar.d.a = Integer.valueOf(grzVar.a());
            grzVar.d.c();
            throw null;
        }
    }
}
