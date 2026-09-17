package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ftj implements pys {
    private final qkg a;
    private final qkg b;

    public ftj(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fpr get() {
        ddf ddfVar = (ddf) this.a.get();
        ((frx) this.b).get();
        fpr fprVar = ddfVar.k(ddr.l) ? fpr.GCA : fpr.FRAMEWORK;
        qmd.ae(fprVar);
        return fprVar;
    }
}
