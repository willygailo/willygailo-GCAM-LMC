package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dvr implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;

    public dvr(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
    }

    public static dvr a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new dvr(qkgVar, qkgVar2, qkgVar3, qkgVar4);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Boolean get() {
        gxm gxmVar = ((djc) this.a).get();
        ddf ddfVar = (ddf) this.b.get();
        nez nezVar = ((gjf) this.c).get();
        ghx ghxVar = ((gjo) this.d).get();
        ddi ddiVar = ddl.a;
        ddfVar.b();
        boolean z = true;
        boolean z2 = gxmVar.c() && nezVar.a;
        boolean z3 = ddfVar.j(dec.b) && ghxVar.k() == lwd.BACK;
        if (!z2 && !z3) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
