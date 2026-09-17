package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pks implements pys {
    private final qkg a;
    private final qkg b;

    public pks(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    public static pks b(qkg qkgVar, qkg qkgVar2) {
        return new pks(qkgVar, qkgVar2);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final pkr get() {
        return new pkr(((gjp) this.a).get(), ((lhr) this.b).get());
    }
}
