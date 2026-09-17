package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gqd implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final /* synthetic */ int e;

    public gqd(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i) {
        this.e = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
    }

    public gqd(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, byte[] bArr) {
        this.e = i;
        this.b = qkgVar;
        this.d = qkgVar2;
        this.a = qkgVar3;
        this.c = qkgVar4;
    }

    public static gqd a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new gqd(qkgVar, qkgVar2, qkgVar3, qkgVar4, 0);
    }

    public static gqd b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new gqd(qkgVar, qkgVar2, qkgVar3, qkgVar4, 1, null);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        gmu gmuVar;
        switch (this.e) {
            case 0:
                lir lirVar = ((dgb) this.a).get();
                lco lcoVar = (lco) this.b.get();
                gyi gyiVar = ((gyj) this.c).get();
                ham hamVar = ((han) this.d).get();
                goy goyVarB = gyiVar.b(gyiVar.a.r(gyiVar.b, 3), gyiVar.a(3));
                goy goyVarA = hamVar.a();
                return new gom(lirVar, new gol(lcoVar, goyVarB, goyVarA, goyVarB, goyVarA, goyVarB, goyVarA));
            default:
                jrl jrlVar = ((giv) this.b).get();
                ojc ojcVar = (ojc) this.d.get();
                qkg qkgVar = this.a;
                qkg qkgVar2 = this.c;
                if (jrlVar == jrl.IMAGE_INTENT) {
                    obr.aF(ojcVar.g());
                    gmuVar = (gmu) qkgVar2.get();
                } else {
                    gmuVar = (gmu) qkgVar.get();
                }
                qmd.ae(gmuVar);
                return gmuVar;
        }
    }
}
