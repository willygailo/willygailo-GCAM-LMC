package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dgb implements pys {
    private final qkg a;

    public dgb(qkg qkgVar) {
        this.a = qkgVar;
    }

    public static lir b(lis lisVar) {
        return lisVar instanceof lir ? (lir) lisVar : new dge(lisVar);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final lir get() {
        return b(((liq) this.a).get());
    }
}
