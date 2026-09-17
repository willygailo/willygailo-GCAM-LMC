package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bsj implements gmu {
    private final brg a;
    private final pht b;
    private final gmu c;

    public bsj(gmu gmuVar, brg brgVar, pht phtVar) {
        this.a = brgVar;
        phtVar.getClass();
        this.b = phtVar;
        gmuVar.getClass();
        this.c = gmuVar;
    }

    @Override // defpackage.gmu
    public final gmt a(gog gogVar) {
        return new bsi(this.a, this.b, this.c.a(gogVar));
    }

    @Override // defpackage.gmu
    public final gmt b(gog gogVar) {
        gmt gmtVarB = this.c.b(gogVar);
        if (gmtVarB == null) {
            return null;
        }
        return new bsi(this.a, this.b, gmtVarB);
    }
}
