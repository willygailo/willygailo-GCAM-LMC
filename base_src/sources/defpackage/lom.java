package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class lom {
    public final lqp a;
    private final Map b = new HashMap();
    private Runnable c;

    public lom(lqp lqpVar) {
        this.a = lqpVar;
    }

    public final synchronized ope a() {
        return ope.F(this.b.values());
    }

    public final synchronized void b(Runnable runnable) {
        obr.aR(this.c == null, "Listener is already set, override not supported.");
        this.c = runnable;
    }

    public final void c(lnq lnqVar) {
        if (this.a.a(lnqVar.a)) {
            return;
        }
        d(ope.H(lnqVar));
    }

    public final void d(Set set) {
        Runnable runnable;
        synchronized (this) {
            Iterator it = set.iterator();
            runnable = null;
            while (it.hasNext()) {
                lnq lnqVar = (lnq) it.next();
                if (!this.a.a(lnqVar.a)) {
                    if (!this.b.containsKey(lnqVar.a) || !lnqVar.equals(this.b.get(lnqVar.a))) {
                        runnable = this.c;
                        this.b.put(lnqVar.a, lnqVar);
                    }
                }
            }
        }
        if (runnable != null) {
            runnable.run();
        }
    }
}
