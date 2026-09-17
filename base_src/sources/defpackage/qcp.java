package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class qcp extends AtomicReference implements qbz {
    private static final long serialVersionUID = 5718521705281392066L;

    public qcp(nua nuaVar) {
        super(nuaVar);
    }

    @Override // defpackage.qbz
    public final void gT() {
        nua nuaVar;
        if (get() == null || (nuaVar = (nua) getAndSet(null)) == null) {
            return;
        }
        try {
            nuaVar.a.e();
            pvn pvnVar = nuaVar.a;
            synchronized (pvnVar) {
                pvn pvnVar2 = ((pvl) pvnVar).b;
                if (pvnVar2 != null) {
                    synchronized (pvnVar2) {
                        ((pvi) pvnVar2).g = 3;
                        pvnVar2.notifyAll();
                    }
                    ((pvl) pvnVar).b = null;
                }
                ((pvl) pvnVar).c = 3;
                pvnVar.notifyAll();
            }
        } catch (Exception e) {
            qmd.Y(e);
            qmd.R(e);
        }
    }

    @Override // defpackage.qbz
    public final boolean gV() {
        throw null;
    }
}
