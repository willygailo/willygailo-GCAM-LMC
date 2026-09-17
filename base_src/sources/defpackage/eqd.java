package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eqd implements lij {
    public final /* synthetic */ lce a;
    private final /* synthetic */ int b;

    public /* synthetic */ eqd(lce lceVar, int i) {
        this.b = i;
        this.a = lceVar;
    }

    @Override // defpackage.lij
    public final void fB(Object obj) {
        switch (this.b) {
            case 0:
                this.a.fB(0);
                break;
            case 1:
                this.a.fB(obj);
                break;
            default:
                this.a.fB(((hte) obj) == hte.ON ? hkc.CONTINUOUS_PICTURE : hkc.OFF);
                break;
        }
    }
}
