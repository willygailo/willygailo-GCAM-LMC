package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class lci implements lco {
    private final lco a;

    private lci(lco lcoVar) {
        this.a = lcoVar;
    }

    public static lco c(lco lcoVar) {
        return lcoVar instanceof lci ? lcoVar : new lci(lcoVar);
    }

    @Override // defpackage.lco
    public final lie a(lij lijVar, Executor executor) {
        return this.a.a(new lch(executor, lijVar), new ldb());
    }

    @Override // defpackage.lco
    public final Object fA() {
        return this.a.fA();
    }

    public final String toString() {
        ojb ojbVarBa = obr.ba("FilteredObs");
        ojbVarBa.a(this.a);
        return ojbVarBa.toString();
    }
}
