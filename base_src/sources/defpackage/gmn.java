package defpackage;

import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class gmn implements lie {
    final /* synthetic */ gmo a;
    final /* synthetic */ gmp b;

    public gmn(gmp gmpVar, gmo gmoVar) {
        this.b = gmpVar;
        this.a = gmoVar;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        gmp gmpVar = this.b;
        gmo gmoVar = this.a;
        synchronized (gmpVar.a) {
            Iterator it = gmoVar.d.iterator();
            while (it.hasNext()) {
                gmpVar.b.remove((Long) it.next());
            }
            plk.af(plk.S(gmr.a(Collections.unmodifiableMap(gmoVar.c).values()), gmr.a(Collections.unmodifiableList(gmoVar.g))), new gmq(gmpVar.c, gmoVar), pgr.INSTANCE);
        }
    }
}
