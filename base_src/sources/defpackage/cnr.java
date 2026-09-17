package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cnr implements pys {
    private final qkg a;
    private final qkg b;

    public cnr(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final lfc get() {
        return ((ddf) this.a.get()).k(dcu.N) ? ((cnt) this.b).get() : new lex();
    }
}
