package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: loaded from: classes.dex */
public final class dbe {
    private final Deque a = new ArrayDeque();

    final synchronized ojc a() {
        if (this.a.isEmpty()) {
            return oih.a;
        }
        return ojc.i((dbd) this.a.getLast());
    }

    final synchronized void b() {
        this.a.removeFirst();
        this.a.size();
    }

    final synchronized void c(dbd dbdVar) {
        this.a.addLast(dbdVar);
        this.a.size();
    }
}
