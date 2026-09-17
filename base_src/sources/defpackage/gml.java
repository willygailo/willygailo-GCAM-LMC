package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gml implements gmu {
    private final gmu a;
    private final gmm b;

    public gml(gmu gmuVar, gmm gmmVar) {
        this.b = gmmVar;
        this.a = gmuVar;
    }

    private final gmt c(gmt gmtVar, gog gogVar) {
        hsa hsaVar = gogVar.b;
        return new gmk(gmtVar, hsaVar.p(), this.b.e(hsaVar.s()), this.b);
    }

    @Override // defpackage.gmu
    public final gmt a(gog gogVar) {
        return c(this.a.a(gogVar), gogVar);
    }

    @Override // defpackage.gmu
    public final gmt b(gog gogVar) {
        gmt gmtVarB = this.a.b(gogVar);
        if (gmtVarB == null) {
            return null;
        }
        return c(gmtVarB, gogVar);
    }
}
