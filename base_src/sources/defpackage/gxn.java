package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gxn implements pys {
    private final qkg a;
    private final qkg b;

    public gxn(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    public static gxn b(qkg qkgVar, qkg qkgVar2) {
        return new gxn(qkgVar, qkgVar2);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gxm get() {
        return new gxm((lzi) this.a.get(), (ddf) this.b.get());
    }
}
