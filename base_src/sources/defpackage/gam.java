package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gam implements pys {
    private final qkg a;

    public gam(qkg qkgVar) {
        this.a = qkgVar;
    }

    public static gam b(qkg qkgVar) {
        return new gam(qkgVar);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gak get() {
        return new gak(((lyo) this.a).get());
    }
}
