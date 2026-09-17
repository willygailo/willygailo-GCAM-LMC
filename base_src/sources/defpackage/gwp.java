package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gwp implements pys {
    private final qkg a;

    public gwp(qkg qkgVar) {
        this.a = qkgVar;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gwo get() {
        return new gwo(((dgb) this.a).get());
    }
}
