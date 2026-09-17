package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ghw {
    private final fwi a;
    private final fxc b;
    private final pht c;

    public ghw(fwi fwiVar, fxc fxcVar, pht phtVar) {
        this.a = fwiVar;
        this.b = fxcVar;
        this.c = phtVar;
    }

    public final void a(ghu ghuVar) {
        fwi fwiVar = this.a;
        fxc fxcVar = this.b;
        lvs lvsVarB = fxcVar.b.b(fxcVar.d, fxcVar.c, bqe.m(fxcVar.a) ? lwd.FRONT : lwd.BACK);
        if (lvsVarB == null) {
            lvsVarB = fxcVar.d.b();
            lvsVarB.getClass();
        }
        ghuVar.b(fwiVar.a(lvsVarB, ghuVar.k), this.c);
    }
}
