package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class apr implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ aps b;

    public apr(aps apsVar, List list) {
        this.b = apsVar;
        this.a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((apa) it.next()).a(this.b.d);
        }
    }
}
