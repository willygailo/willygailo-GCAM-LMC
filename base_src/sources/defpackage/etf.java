package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class etf implements pys {
    private final ete a;

    public etf(ete eteVar) {
        this.a = eteVar;
    }

    public static etf a(ete eteVar) {
        return new etf(eteVar);
    }

    public static fhv c(ete eteVar) {
        fhv fhvVar = eteVar.c;
        qmd.ae(fhvVar);
        return fhvVar;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final fhv get() {
        return c(this.a);
    }
}
