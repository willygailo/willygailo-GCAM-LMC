package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mca implements pys {
    private final qkg a;
    private final qkg b;

    public mca(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final mbz get() {
        return new mbz((mip) this.a.get(), ((liq) this.b).get(), null, null, null);
    }
}
