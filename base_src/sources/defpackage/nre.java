package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class nre {
    public final nri a;
    public final nrm b;
    private final qkj c;

    public nre(nri nriVar, mdf mdfVar, nrm nrmVar, qbt qbtVar) {
        nriVar.getClass();
        mdfVar.getClass();
        nrmVar.getClass();
        qbtVar.getClass();
        this.a = nriVar;
        this.b = nrmVar;
        this.c = qmd.N(new nra(qbtVar));
    }

    public final Executor a() {
        return (Executor) this.c.a();
    }
}
