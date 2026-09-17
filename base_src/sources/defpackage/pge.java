package defpackage;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
abstract class pge extends pgi {
    private static final Logger c = Logger.getLogger(pge.class.getName());
    public ood a;
    private final boolean f;
    private final boolean g;

    public pge(ood oodVar, boolean z, boolean z2) {
        super(oodVar.size());
        oodVar.getClass();
        this.a = oodVar;
        this.f = z;
        this.g = z2;
    }

    private final void t(Throwable th) {
        th.getClass();
        if (this.f && !a(th)) {
            Set set = this.seenExceptions;
            if (set == null) {
                Set setD = obr.D();
                f(setD);
                pgi.b.b(this, setD);
                set = this.seenExceptions;
                set.getClass();
            }
            if (v(set, th)) {
                u(th);
                return;
            }
        }
        if (th instanceof Error) {
            u(th);
        }
    }

    private static void u(Throwable th) {
        c.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private static boolean v(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // defpackage.pfx
    protected final void c() {
        ood oodVar = this.a;
        s(1);
        if ((oodVar != null) && isCancelled()) {
            boolean zP = p();
            oti otiVarListIterator = oodVar.listIterator();
            while (otiVarListIterator.hasNext()) {
                ((Future) otiVarListIterator.next()).cancel(zP);
            }
        }
    }

    @Override // defpackage.pgi
    public final void f(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable thK = k();
        thK.getClass();
        v(set, thK);
    }

    public abstract void g(int i, Object obj);

    @Override // defpackage.pfx
    protected final String ga() {
        ood oodVar = this.a;
        if (oodVar == null) {
            return super.ga();
        }
        String strValueOf = String.valueOf(oodVar);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 8);
        sb.append("futures=");
        sb.append(strValueOf);
        return sb.toString();
    }

    public final void h(int i, Future future) {
        try {
            g(i, plk.ad(future));
        } catch (ExecutionException e) {
            t(e.getCause());
        } catch (Throwable th) {
            t(th);
        }
    }

    public final void i(ood oodVar) {
        int iA = pgi.b.a(this);
        int i = 0;
        obr.aR(iA >= 0, "Less than 0 remaining futures");
        if (iA == 0) {
            if (oodVar != null) {
                oti otiVarListIterator = oodVar.listIterator();
                while (otiVarListIterator.hasNext()) {
                    Future future = (Future) otiVarListIterator.next();
                    if (!future.isCancelled()) {
                        h(i, future);
                    }
                    i++;
                }
            }
            this.seenExceptions = null;
            q();
            s(2);
        }
    }

    public abstract void q();

    final void r() {
        ood oodVar = this.a;
        oodVar.getClass();
        if (oodVar.isEmpty()) {
            q();
            return;
        }
        if (!this.f) {
            pgd pgdVar = new pgd(this, this.g ? this.a : null);
            oti otiVarListIterator = this.a.listIterator();
            while (otiVarListIterator.hasNext()) {
                ((pht) otiVarListIterator.next()).d(pgdVar, pgr.INSTANCE);
            }
            return;
        }
        oti otiVarListIterator2 = this.a.listIterator();
        int i = 0;
        while (otiVarListIterator2.hasNext()) {
            pht phtVar = (pht) otiVarListIterator2.next();
            phtVar.d(new pgc(this, phtVar, i), pgr.INSTANCE);
            i++;
        }
    }

    public void s(int i) {
        this.a = null;
    }
}
