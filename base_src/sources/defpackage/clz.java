package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class clz implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;

    public clz(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final clg get() {
        clg clgVar;
        pyn pynVarA = pyr.a(this.a);
        pyr.a(this.b);
        ddf ddfVar = (ddf) this.c.get();
        if (((lda) this.d.get()).fA() != jrl.VIDEO) {
            clgVar = (clg) pynVarA.get();
        } else {
            ddi ddiVar = dcu.a;
            ddfVar.b();
            clgVar = (clg) pynVarA.get();
        }
        qmd.ae(clgVar);
        return clgVar;
    }
}
