package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gjh implements pys {
    private final qkg a;

    public gjh(qkg qkgVar) {
        this.a = qkgVar;
    }

    public static gjh b(qkg qkgVar) {
        return new gjh(qkgVar);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gjg get() {
        return new gjg(((gra) this.a).a());
    }
}
