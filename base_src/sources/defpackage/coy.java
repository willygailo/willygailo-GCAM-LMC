package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class coy implements pys {
    private final qkg a;
    private final qkg b;

    public coy(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cox get() {
        return new cox(this.a, ((cov) this.b).get());
    }
}
