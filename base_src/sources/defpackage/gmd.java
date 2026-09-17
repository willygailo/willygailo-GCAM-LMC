package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gmd implements pys {
    private final qkg a;

    public gmd(qkg qkgVar) {
        this.a = qkgVar;
    }

    public static gmd b(qkg qkgVar) {
        return new gmd(qkgVar);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gmc get() {
        return new gmc(((gjo) this.a).get());
    }
}
