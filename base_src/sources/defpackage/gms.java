package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gms implements pys {
    private final qkg a;

    public gms(qkg qkgVar) {
        this.a = qkgVar;
    }

    public static gms b(qkg qkgVar) {
        return new gms(qkgVar);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gmr get() {
        return new gmr(((dgb) this.a).get());
    }
}
