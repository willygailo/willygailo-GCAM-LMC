package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bsv implements pys {
    private final qkg a;
    private final qkg b;

    public bsv(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bsu get() {
        return new bsu(((bsw) this.a).get(), (ddf) this.b.get());
    }
}
