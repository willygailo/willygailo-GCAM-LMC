package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gqz implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final /* synthetic */ int d;

    public gqz(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i) {
        this.d = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    public gqz(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, byte[] bArr) {
        this.d = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
    }

    public final lco a() {
        switch (this.d) {
            case 0:
                ghx ghxVar = ((gjo) this.a).get();
                lda ldaVar = (lda) this.b.get();
                lda ldaVar2 = (lda) this.c.get();
                if (ghxVar.k() == lwd.FRONT) {
                    ldaVar = ldaVar2;
                }
                lco lcoVarJ = lcv.j(ldaVar, eto.m);
                qmd.ae(lcoVarJ);
                return lcoVarJ;
            default:
                lco lcoVarJ2 = lcv.j(((eej) this.c).b(), new doo(((Boolean) this.b.get()).booleanValue(), ((Boolean) this.a.get()).booleanValue(), 0));
                qmd.ae(lcoVarJ2);
                return lcoVarJ2;
        }
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.d) {
            case 0:
                break;
        }
        return a();
    }
}
