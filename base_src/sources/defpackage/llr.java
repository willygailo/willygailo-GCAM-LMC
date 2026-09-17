package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class llr implements llt {
    public final List a = new CopyOnWriteArrayList();

    public final synchronized lie a(final llt lltVar) {
        lltVar.getClass();
        this.a.add(lltVar);
        return new lie() { // from class: llq
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                llr llrVar = this.a;
                llt lltVar2 = lltVar;
                synchronized (llrVar) {
                    llrVar.a.remove(lltVar2);
                }
            }
        };
    }

    @Override // defpackage.llt
    public final synchronized void e(Throwable th) {
        throw null;
    }

    @Override // defpackage.llt
    public final synchronized void f(Throwable th) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((llt) it.next()).f(th);
        }
    }
}
