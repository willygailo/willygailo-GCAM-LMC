package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fbg implements pys {
    private final qkg a;
    private final qkg b;

    public fbg(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fbf get() {
        return new fbf((fbe) ((pyt) this.a).a, (ljf) this.b.get());
    }
}
