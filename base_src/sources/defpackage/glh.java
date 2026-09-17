package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class glh implements pys {
    private final qkg a;
    private final qkg b;

    public glh(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    public static glh b(qkg qkgVar, qkg qkgVar2) {
        return new glh(qkgVar, qkgVar2);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final glg get() {
        return new glj((gmm) this.b.get());
    }
}
