package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fmc implements pys {
    private final qkg a;
    private final qkg b;

    public fmc(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fmb get() {
        return new fmb((lxx) this.a.get(), ((gsi) this.b).get());
    }
}
