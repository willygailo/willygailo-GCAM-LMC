package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bqd implements pys {
    private final qkg a;
    private final qkg b;

    public bqd(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bqc get() {
        return new bqc(((eth) this.a).get(), (hug) this.b.get(), null, null);
    }
}
