package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jyi implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;

    public jyi(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final jyh get() {
        ((emd) this.a).get();
        fhv fhvVar = ((etj) this.b).get();
        lar larVar = (lar) this.c.get();
        lis lisVar = ((liq) this.d).get();
        return new jyh(fhvVar, larVar, lisVar);
    }
}
