package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gma implements pys {
    private final qkg a;

    public gma(qkg qkgVar) {
        this.a = qkgVar;
    }

    public static gma a(qkg qkgVar) {
        return new gma(qkgVar);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final kme get() {
        return new kme(((pyw) this.a).get());
    }
}
