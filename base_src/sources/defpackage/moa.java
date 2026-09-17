package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class moa implements mnb {
    public volatile Object a = null;
    public volatile mnc b = null;
    private mnw c = null;
    private mnw d = null;

    private moa() {
    }

    public static moa i() {
        return new moa();
    }

    public static void j(Object obj, mlu mluVar, moa moaVar) {
        try {
            moaVar.k(mluVar.a(obj));
        } catch (mnc e) {
            moaVar.l(e);
        } catch (Throwable th) {
            moaVar.l(mnc.a(th));
        }
    }

    public static void n(Object obj, mnf mnfVar, Executor executor, moa moaVar) {
        try {
            mnfVar.a(obj, executor).c(pgr.INSTANCE, new mny(moaVar), new mnx(moaVar)).h(mmg.a);
        } catch (mnc e) {
            moaVar.l(e);
        } catch (Throwable th) {
            moaVar.l(mnc.a(th));
        }
    }

    private final void o() {
        mnw mnwVar;
        synchronized (this) {
            this.c = null;
            this.d = null;
            notifyAll();
        }
        for (mnwVar = this.c; mnwVar != null; mnwVar = mnwVar.a) {
            try {
                mnwVar.b.execute(mnwVar.c);
            } catch (Throwable th) {
                moa moaVar = mnwVar.d;
                if (moaVar == null) {
                    throw th;
                }
                moaVar.l(mnc.a(th));
            }
        }
    }

    private final void p(Executor executor, Runnable runnable, moa moaVar) {
        synchronized (this) {
            if (f()) {
                throw new IllegalStateException("Should not be delaying execution when done");
            }
            mnw mnwVar = new mnw(executor, runnable, moaVar);
            mnw mnwVar2 = this.d;
            if (mnwVar2 != null) {
                mnwVar2.a = mnwVar;
            } else {
                this.c = mnwVar;
            }
            this.d = mnwVar;
        }
    }

    private static void q(mnc mncVar, mlu mluVar, Executor executor, moa moaVar) {
        try {
            executor.execute(new mnu(mncVar, mluVar, moaVar, 0));
        } catch (Throwable th) {
            moaVar.l(mnc.a(th));
        }
    }

    private static void r(Object obj, mlu mluVar, Executor executor, moa moaVar) {
        try {
            executor.execute(new mnu(obj, mluVar, moaVar, 0));
        } catch (Throwable th) {
            moaVar.l(mnc.a(th));
        }
    }

    private static void s(mnc mncVar, mnf mnfVar, Executor executor, moa moaVar, mwp mwpVar) {
        try {
            executor.execute(new mnv(mncVar, mnfVar, executor, moaVar, mwpVar, null, null, null));
        } catch (Throwable th) {
            moaVar.l(mnc.a(th));
        }
    }

    private static void t(Object obj, mnf mnfVar, Executor executor, moa moaVar, mwp mwpVar) {
        try {
            executor.execute(new mnv(obj, mnfVar, executor, moaVar, mwpVar, null, null, null));
        } catch (Throwable th) {
            moaVar.l(mnc.a(th));
        }
    }

    @Override // defpackage.mnb
    public final mnb a(Executor executor, mlu mluVar) {
        moa moaVarI = i();
        Object obj = this.a;
        if (obj != null) {
            r(obj, mluVar, executor, moaVarI);
            return moaVarI;
        }
        mnc mncVar = this.b;
        if (mncVar != null) {
            moaVarI.l(mncVar);
            return moaVarI;
        }
        synchronized (this) {
            Object obj2 = this.a;
            if (obj2 == null && (mncVar = this.b) == null) {
                p(executor, new mnq(this, mluVar, moaVarI), moaVarI);
                return moaVarI;
            }
            if (obj2 != null) {
                r(obj2, mluVar, executor, moaVarI);
            } else {
                moaVarI.l(mncVar);
            }
            return moaVarI;
        }
    }

    @Override // defpackage.mnb
    public final mnb b(Executor executor, mnf mnfVar) {
        mwp mwpVar = mob.a;
        moa moaVarI = i();
        Object obj = this.a;
        if (obj != null) {
            t(obj, mnfVar, executor, moaVarI, mwpVar);
            return moaVarI;
        }
        mnc mncVar = this.b;
        if (mncVar != null) {
            moaVarI.l(mncVar);
            return moaVarI;
        }
        synchronized (this) {
            Object obj2 = this.a;
            if (obj2 == null && (mncVar = this.b) == null) {
                p(executor, new mns(this, mnfVar, executor, moaVarI, mwpVar, null, null, null), moaVarI);
                return moaVarI;
            }
            if (obj2 != null) {
                t(obj2, mnfVar, executor, moaVarI, mwpVar);
            } else {
                moaVarI.l(mncVar);
            }
            return moaVarI;
        }
    }

    @Override // defpackage.mnb
    public final mnb c(Executor executor, mlu mluVar, mlu mluVar2) {
        moa moaVarI = i();
        Object obj = this.a;
        if (obj != null) {
            r(obj, mluVar, executor, moaVarI);
            return moaVarI;
        }
        mnc mncVar = this.b;
        if (mncVar != null) {
            q(mncVar, mluVar2, executor, moaVarI);
            return moaVarI;
        }
        synchronized (this) {
            Object obj2 = this.a;
            if (obj2 == null && (mncVar = this.b) == null) {
                p(executor, new mnr(this, mluVar, moaVarI, mluVar2), moaVarI);
                return moaVarI;
            }
            if (obj2 != null) {
                r(obj2, mluVar, executor, moaVarI);
            } else {
                q(mncVar, mluVar2, executor, moaVarI);
            }
            return moaVarI;
        }
    }

    @Override // defpackage.mnb
    public final pht d() {
        return new mnz(this);
    }

    @Override // defpackage.mnb
    public final Object e() throws mnc {
        Object obj;
        Object obj2 = this.a;
        if (obj2 != null) {
            return obj2;
        }
        if (this.b != null) {
            throw this.b;
        }
        synchronized (this) {
            while (!f()) {
                wait();
            }
            obj = this.a;
            if (obj == null) {
                throw this.b;
            }
        }
        return obj;
    }

    @Override // defpackage.mnb
    public final boolean f() {
        return (this.a == null && this.b == null) ? false : true;
    }

    @Override // defpackage.mnb
    public final mnb g(Executor executor, mtw mtwVar) {
        mnn mnnVar = new mnn(this, mtwVar);
        mno mnoVar = new mno(this, mtwVar);
        mwp mwpVar = mob.a;
        moa moaVarI = i();
        Object obj = this.a;
        if (obj != null) {
            t(obj, mnnVar, executor, moaVarI, mwpVar);
        } else {
            mnc mncVar = this.b;
            if (mncVar != null) {
                s(mncVar, mnoVar, executor, moaVarI, mwpVar);
            } else {
                synchronized (this) {
                    Object obj2 = this.a;
                    if (obj2 == null && (mncVar = this.b) == null) {
                        p(executor, new mnt(this, mnnVar, executor, moaVarI, mwpVar, mnoVar, null, null, null), moaVarI);
                    } else if (obj2 != null) {
                        t(obj2, mnnVar, executor, moaVarI, mwpVar);
                    } else {
                        s(mncVar, mnoVar, executor, moaVarI, mwpVar);
                    }
                }
            }
        }
        return moaVarI;
    }

    @Override // defpackage.mnb
    public final void h(mmg mmgVar) {
        if (this.a != null) {
            return;
        }
        mnc mncVar = this.b;
        if (mncVar != null) {
            throw okd.a(mncVar);
        }
        synchronized (this) {
            Object obj = this.a;
            if (obj == null && (mncVar = this.b) == null) {
                m(pgr.INSTANCE, new mnp(this, mmgVar));
                return;
            }
            if (obj == null) {
                throw okd.a(mncVar);
            }
        }
    }

    public final void k(Object obj) {
        if (f()) {
            return;
        }
        synchronized (this) {
            if (f()) {
                return;
            }
            this.a = obj;
            o();
        }
    }

    public final void l(mnc mncVar) {
        if (f()) {
            return;
        }
        synchronized (this) {
            if (f()) {
                return;
            }
            this.b = mncVar;
            o();
        }
    }

    public final void m(Executor executor, Runnable runnable) {
        synchronized (this) {
            if (f()) {
                throw new IllegalStateException("Should not be delaying execution when done");
            }
            mnw mnwVar = new mnw(executor, runnable);
            mnw mnwVar2 = this.d;
            if (mnwVar2 != null) {
                mnwVar2.a = mnwVar;
            } else {
                this.c = mnwVar;
            }
            this.d = mnwVar;
        }
    }
}
