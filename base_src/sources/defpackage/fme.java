package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class fme implements lie {
    public final lce a;
    final Collection b;
    final hha c;

    public fme(hha hhaVar, lce lceVar, Collection collection) {
        this.c = hhaVar;
        this.a = lceVar;
        this.b = collection;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        otj it = ((oom) this.b).iterator();
        while (it.hasNext()) {
            ((lie) it.next()).close();
        }
    }
}
