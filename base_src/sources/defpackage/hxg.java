package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hxg implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;

    public hxg(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final iao get() {
        hza hzaVar = (hza) this.a.get();
        enl.f((lar) this.b.get(), ((etj) this.c).get(), hzaVar);
        qmd.ae(hzaVar);
        return hzaVar;
    }
}
