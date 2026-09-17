package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class efz implements pys {
    private final qkg a;
    private final qkg b;

    public efz(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final efy get() {
        return new efy(this.a, (ddf) this.b.get());
    }
}
