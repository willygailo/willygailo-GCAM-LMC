package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes.dex */
public final class dfi implements btw {
    public final ConcurrentLinkedQueue a = new ConcurrentLinkedQueue();

    @Override // defpackage.btw
    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((btw) it.next()).a();
        }
    }
}
