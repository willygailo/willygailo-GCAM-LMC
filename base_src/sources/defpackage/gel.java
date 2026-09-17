package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
final class gel implements gex {
    final /* synthetic */ Object a;
    final /* synthetic */ AtomicBoolean b;
    final /* synthetic */ gex c;
    final /* synthetic */ gem d;

    public gel(gem gemVar, Object obj, AtomicBoolean atomicBoolean, gex gexVar) {
        this.d = gemVar;
        this.a = obj;
        this.b = atomicBoolean;
        this.c = gexVar;
    }

    @Override // defpackage.gex
    public final void a() {
        this.d.b.removeCallbacksAndMessages(this.a);
        if (this.b.getAndSet(true)) {
            return;
        }
        this.c.a();
    }

    @Override // defpackage.gex
    public final void b(Throwable th) {
        this.d.b.removeCallbacksAndMessages(this.a);
        if (this.b.getAndSet(true)) {
            ((oug) ((oug) ((oug) gem.a.b()).h(th)).G((char) 2067)).o("HDR+ also failed after timeout");
        } else {
            this.c.b(th);
        }
    }

    @Override // defpackage.gex
    public final void c(mad madVar) {
        this.d.b.removeCallbacksAndMessages(this.a);
        if (this.b.getAndSet(true)) {
            madVar.close();
        } else {
            this.c.c(madVar);
        }
    }
}
