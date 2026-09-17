package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fvl implements pys {
    private final qkg a;
    private final qkg b;

    public fvl(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fvk get() {
        return new fvk((lda) this.a.get(), ((emd) this.b).get());
    }
}
