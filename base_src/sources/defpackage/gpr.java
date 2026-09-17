package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gpr implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;

    public gpr(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gvr get() {
        ddf ddfVar = (ddf) this.a.get();
        ojz ojzVar = (ojz) this.b.get();
        gvr gvrVar = ((gwp) this.c).get();
        gwi gwiVar = (gwi) this.d.get();
        if (!((Boolean) ojzVar.a()).booleanValue() || ddfVar.k(ddm.F)) {
            gvrVar = gwiVar;
        }
        qmd.ae(gvrVar);
        return gvrVar;
    }
}
