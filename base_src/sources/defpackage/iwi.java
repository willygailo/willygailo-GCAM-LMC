package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class iwi implements pys {
    private final qkg a;
    private final qkg b;

    public iwi(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final kas get() {
        bqg bqgVarB = ((etg) this.a).get();
        kbi kbiVar = (kbi) this.b.get();
        bqgVarB.i().c(kbiVar);
        return kbiVar;
    }
}
