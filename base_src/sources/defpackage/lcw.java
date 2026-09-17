package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class lcw implements lco {
    private final ojz a;
    private final lce b;
    private final lco c;

    public lcw(ojz ojzVar) {
        this.a = ojzVar;
        lce lceVar = new lce(ojzVar.a());
        this.b = lceVar;
        this.c = lci.c(lceVar);
    }

    @Override // defpackage.lco
    public final lie a(lij lijVar, Executor executor) {
        return this.c.a(lijVar, executor);
    }

    public final void c() {
        this.b.fB(this.a.a());
    }

    @Override // defpackage.lco
    public final Object fA() {
        return this.b.d;
    }

    public final String toString() {
        ojb ojbVarBa = obr.ba("PollingObs");
        ojbVarBa.a(this.a);
        return ojbVarBa.toString();
    }
}
