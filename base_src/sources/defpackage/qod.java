package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class qod implements qoj {
    private final AtomicReference a;

    public qod(qoj qojVar) {
        this.a = new AtomicReference(qojVar);
    }

    @Override // defpackage.qoj
    public final Iterator a() {
        qoj qojVar = (qoj) this.a.getAndSet(null);
        if (qojVar != null) {
            return qojVar.a();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
