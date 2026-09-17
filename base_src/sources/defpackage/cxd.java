package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cxd implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;

    public cxd(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final lle get() {
        cxc cxcVar = (cxc) this.a.get();
        enl.e((lar) this.c.get(), ((fhq) this.b).get(), cxcVar);
        qmd.ae(cxcVar);
        return cxcVar;
    }
}
