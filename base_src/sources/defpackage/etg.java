package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class etg implements pys {
    private final ete a;

    public etg(ete eteVar) {
        this.a = eteVar;
    }

    public static etg a(ete eteVar) {
        return new etg(eteVar);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final bqg get() {
        bqg bqgVar = this.a.b;
        qmd.ae(bqgVar);
        return bqgVar;
    }
}
