package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eqr implements lij {
    public final /* synthetic */ eqx a;
    private final /* synthetic */ int b;

    public /* synthetic */ eqr(eqx eqxVar, int i) {
        this.b = i;
        this.a = eqxVar;
    }

    @Override // defpackage.lij
    public final void fB(Object obj) {
        switch (this.b) {
            case 0:
                eqx eqxVar = this.a;
                eqxVar.i(((htj) eqxVar.o.fA()).d, ((Boolean) obj).booleanValue());
                break;
            case 1:
                eqx eqxVar2 = this.a;
                eqxVar2.i(((htj) obj).d, eqxVar2.p.d());
                break;
            default:
                this.a.r = ((Integer) obj).intValue();
                break;
        }
    }
}
