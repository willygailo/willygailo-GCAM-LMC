package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
final class lad implements lie {
    final /* synthetic */ lae a;
    private final AtomicBoolean b = new AtomicBoolean(false);

    public lad(lae laeVar) {
        this.a = laeVar;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        boolean z = true;
        if (this.b.getAndSet(true)) {
            return;
        }
        synchronized (this.a.d) {
            lae laeVar = this.a;
            int i = laeVar.b - 1;
            laeVar.b = i;
            obr.aG(i >= 0, "The number of handles should never be negative.");
        }
        lae laeVar2 = this.a;
        synchronized (laeVar2.d) {
            if (laeVar2.f) {
                return;
            }
            if (laeVar2.b == 0) {
                lbk lbkVar = laeVar2.c;
                if (lbkVar != null) {
                    lbkVar.b(laeVar2.e);
                    z = false;
                } else {
                    laeVar2.f = true;
                }
            } else {
                z = false;
            }
            if (z) {
                laeVar2.a.close();
            }
        }
    }
}
