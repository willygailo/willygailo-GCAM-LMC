package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class hif implements hid {
    private final hic f;
    private final his g;
    private final Set e = new HashSet();
    public final AtomicInteger a = new AtomicInteger(0);
    public final pih b = pih.f();
    public final Object c = new Object();
    public int d = 1;

    public hif(hic hicVar, his hisVar) {
        this.f = hicVar;
        this.g = hisVar;
    }

    public final void a() {
        Set setUnmodifiableSet;
        obr.aQ(this.d == 3);
        if (this.e.size() <= 0) {
            this.b.o(new HashSet());
            return;
        }
        hic hicVar = this.f;
        synchronized (((hia) hicVar).e) {
            ((hia) hicVar).g.retainAll(((hia) hicVar).e.keySet());
            setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(((hia) hicVar).g));
        }
        HashSet hashSet = new HashSet();
        for (hin hinVar : this.e) {
            mad madVar = hinVar.a;
            if (madVar != null && setUnmodifiableSet.contains(madVar)) {
                hic hicVar2 = this.f;
                mad madVar2 = hinVar.a;
                synchronized (((hia) hicVar2).e) {
                    if (((hia) hicVar2).g.contains(madVar2)) {
                        ((hia) hicVar2).g.remove(madVar2);
                        if (((hia) hicVar2).e.remove(madVar2) != null) {
                            ((hia) hicVar2).h--;
                        }
                    }
                }
                hashSet.add(hinVar);
            }
        }
        this.b.o(hashSet);
    }

    public final synchronized void b(hin hinVar, hsa hsaVar) {
        synchronized (this.c) {
            obr.aQ(this.d == 2);
            obr.aQ(this.a.get() > 0);
            this.a.incrementAndGet();
            this.e.add(hinVar);
            hie hieVar = new hie(this);
            try {
                hic hicVar = this.f;
                his hisVar = this.g;
                hjb hjbVar = new hjb(hinVar, hisVar.b, hisVar.a, hisVar.c, hsaVar, hisVar.f, hisVar.d, hisVar.e);
                ojc ojcVarI = ojc.i(hieVar);
                HashSet hashSet = new HashSet(1);
                hashSet.add(hjbVar);
                ((hia) hicVar).d(hjbVar.g, hashSet, false, true, ojcVarI);
            } catch (InterruptedException e) {
                e.printStackTrace();
                throw new IllegalStateException("Interrupt should NOT happen, because call is non-blocking");
            }
        }
    }

    @Override // defpackage.hid, defpackage.lie, java.lang.AutoCloseable
    public synchronized void close() {
        synchronized (this.c) {
            int i = this.d;
            boolean z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
            obr.aQ(z);
            if (this.d != 3) {
                this.d = 3;
                if (this.a.decrementAndGet() == 0) {
                    a();
                }
            }
        }
    }
}
