package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ikk implements pys {
    private final qkg a;
    private final qkg b;

    public ikk(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final kme get() {
        kme kmeVarA = ((ikj) this.a.get()).a((iki) this.b.get());
        qmd.ae(kmeVarA);
        return kmeVarA;
    }
}
