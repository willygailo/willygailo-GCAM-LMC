package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class mnm {
    public final Object[] b;
    public final mnc[] c;
    private final AtomicInteger e;
    public final moa a = moa.i();
    public volatile boolean d = false;

    public mnm(Iterable iterable) {
        int i = 0;
        int iQ = ohh.q(iterable);
        this.b = new Object[iQ];
        this.c = new mnc[iQ];
        this.e = new AtomicInteger(iQ);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ((mnb) it.next()).c(pgr.INSTANCE, new mnk(this, i), new mnl(this, i)).h(mmg.a);
            i++;
        }
    }

    public final void a() {
        if (this.e.decrementAndGet() == 0) {
            if (!this.d) {
                this.a.k(Arrays.asList(this.b));
                return;
            }
            mnc mncVar = null;
            for (mnc mncVar2 : this.c) {
                if (mncVar2 != null && mncVar == null) {
                    mncVar = mncVar2;
                }
            }
            if (mncVar != null) {
                this.a.l(mncVar);
            } else {
                this.a.l(mnc.a(new AssertionError("Result list was marked as having an exception,but no exception was found")));
            }
        }
    }
}
