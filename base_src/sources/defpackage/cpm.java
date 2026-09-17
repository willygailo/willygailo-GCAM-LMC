package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cpm {
    public leb a = leb.RES_1080P;
    private final cph b;
    private final cpi c;
    private final cpf d;
    private final cpe e;
    private final lda f;
    private final lce g;

    public cpm(cph cphVar, cpi cpiVar, lce lceVar, cpf cpfVar, cpe cpeVar, lda ldaVar) {
        this.g = lceVar;
        this.b = cphVar;
        this.c = cpiVar;
        this.d = cpfVar;
        this.e = cpeVar;
        this.f = ldaVar;
    }

    public final cpl a(jrl jrlVar) {
        jrl jrlVar2 = jrl.UNINITIALIZED;
        switch (jrlVar.ordinal()) {
            case 2:
                if (this.f.fA() == cqj.CINEMATIC) {
                    return this.e;
                }
                return this.a.e() ? this.c : this.b;
            case 5:
                return this.g;
            case 8:
                return this.d;
            default:
                return this.b;
        }
    }
}
