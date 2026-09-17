package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cov implements pys {
    private final qkg a;
    private final qkg b;

    public cov(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cou get() {
        return new cou((nvb) this.a.get(), (dkm) this.b.get(), null, null);
    }
}
