package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class djc implements pys {
    private final qkg a;
    private final qkg b;

    public djc(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gxm get() {
        return new gxm((ddf) this.a.get(), (lzi) this.b.get());
    }
}
