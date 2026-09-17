package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cps implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;

    public cps(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cpt get() {
        cpt cptVar;
        pyn pynVarA = pyr.a(this.a);
        pyn pynVarA2 = pyr.a(this.b);
        cib cibVar = (cib) this.c.get();
        ddf ddfVar = (ddf) this.d.get();
        if (cibVar.a() == jrl.VIDEO) {
            ddi ddiVar = dcu.a;
            ddfVar.d();
            cptVar = (cpt) pynVarA.get();
        } else {
            cptVar = (cpt) pynVarA2.get();
        }
        qmd.ae(cptVar);
        return cptVar;
    }
}
