package defpackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class grz implements lie {
    public final ldf a;
    public final ldd d;
    public int e;
    public final Object b = new ReentrantLock(true);
    public final LinkedList c = new LinkedList();
    public boolean f = false;

    public grz(int i) {
        this.e = i;
        ldd lddVar = new ldd(Integer.valueOf(i));
        this.d = lddVar;
        this.a = new ldf(lddVar);
    }

    public final int a() {
        if (this.f || !this.c.isEmpty()) {
            return 0;
        }
        return this.e;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.b) {
            if (this.f) {
                return;
            }
            this.f = true;
            for (gry gryVar : this.c) {
                gryVar.a = new gsd("FiniteTicketPool closing.");
                arrayList.add(gryVar);
            }
            this.d.a = Integer.valueOf(a());
            if (arrayList.size() > 0) {
                throw null;
            }
            this.d.c();
        }
    }
}
