package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class mna implements mnb {
    private final Object a;

    public mna(Object obj) {
        this.a = obj;
    }

    private final mnb i(Executor executor, mlu mluVar) {
        moa moaVarI = moa.i();
        k(executor, new mnu(this.a, mluVar, moaVarI, 1), moaVarI);
        return moaVarI;
    }

    private final mnb j(Executor executor, mnf mnfVar) {
        moa moaVarI = moa.i();
        k(executor, new mmx(this.a, mnfVar, executor, moaVarI), moaVarI);
        return moaVarI;
    }

    private static void k(Executor executor, Runnable runnable, moa moaVar) {
        try {
            executor.execute(runnable);
        } catch (Throwable th) {
            moaVar.l(mnc.a(th));
        }
    }

    @Override // defpackage.mnb
    public final mnb a(Executor executor, mlu mluVar) {
        return i(executor, mluVar);
    }

    @Override // defpackage.mnb
    public final mnb b(Executor executor, mnf mnfVar) {
        return j(executor, mnfVar);
    }

    @Override // defpackage.mnb
    public final mnb c(Executor executor, mlu mluVar, mlu mluVar2) {
        return i(executor, mluVar);
    }

    @Override // defpackage.mnb
    public final pht d() {
        return plk.V(this.a);
    }

    @Override // defpackage.mnb
    public final Object e() {
        return this.a;
    }

    @Override // defpackage.mnb
    public final boolean f() {
        return true;
    }

    @Override // defpackage.mnb
    public final mnb g(Executor executor, mtw mtwVar) {
        return j(executor, new mmw(mtwVar, 0));
    }

    @Override // defpackage.mnb
    public final void h(mmg mmgVar) {
    }
}
