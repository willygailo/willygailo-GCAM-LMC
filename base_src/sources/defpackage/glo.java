package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class glo implements pys {
    private final qkg a;

    public glo(qkg qkgVar) {
        this.a = qkgVar;
    }

    public static glo b(qkg qkgVar) {
        return new glo(qkgVar);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gln get() {
        return new gln((hia) this.a.get());
    }
}
