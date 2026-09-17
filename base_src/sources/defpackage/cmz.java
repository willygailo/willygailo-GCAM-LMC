package defpackage;

import j$.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class cmz implements lie {
    public final lfj a;
    public final List b;
    public final AtomicBoolean c;
    public final hth d;
    public final hss e;
    public final cik f;

    public cmz(lfj lfjVar, ckt cktVar, hth hthVar, cik cikVar) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.c = new AtomicBoolean(false);
        this.a = lfjVar;
        this.d = hthVar;
        this.e = cktVar.a.b();
        this.f = cikVar;
        arrayList.add(cktVar);
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        if (this.c.compareAndSet(false, true)) {
            this.a.close();
            Collection.EL.stream(this.b).map(cgw.e).forEach(cez.d);
        }
    }
}
