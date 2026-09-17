package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cmd implements lij {
    public final /* synthetic */ lnc a;
    public final /* synthetic */ cju b;
    public final /* synthetic */ ckd c;
    private final /* synthetic */ int d;

    public /* synthetic */ cmd(cju cjuVar, lnc lncVar, ckd ckdVar, int i) {
        this.d = i;
        this.b = cjuVar;
        this.a = lncVar;
        this.c = ckdVar;
    }

    public /* synthetic */ cmd(lnc lncVar, cju cjuVar, ckd ckdVar, int i) {
        this.d = i;
        this.a = lncVar;
        this.b = cjuVar;
        this.c = ckdVar;
    }

    @Override // defpackage.lij
    public final void fB(Object obj) {
        switch (this.d) {
            case 0:
                lnc lncVar = this.a;
                cju cjuVar = this.b;
                ckd ckdVar = this.c;
                if (((Boolean) obj).booleanValue()) {
                    cmf.c(lncVar, cjuVar, ckdVar);
                }
                break;
            default:
                cju cjuVar2 = this.b;
                lnc lncVar2 = this.a;
                ckd ckdVar2 = this.c;
                if (((Boolean) ((lce) cjuVar2.g).d).booleanValue()) {
                    cmf.c(lncVar2, cjuVar2, ckdVar2);
                }
                break;
        }
    }
}
