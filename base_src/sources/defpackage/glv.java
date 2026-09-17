package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class glv implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;

    public glv(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    public static glv b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new glv(qkgVar, qkgVar2, qkgVar3);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final glu get() {
        return new glu(((dgb) this.a).get(), ((pyw) this.b).get(), (lar) this.c.get(), dug.a());
    }
}
