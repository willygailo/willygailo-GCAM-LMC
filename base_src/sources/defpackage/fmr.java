package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fmr implements pys {
    private final qkg a;

    public fmr(qkg qkgVar) {
        this.a = qkgVar;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fmp get() {
        return new fmp(((fxb) this.a).get());
    }
}
