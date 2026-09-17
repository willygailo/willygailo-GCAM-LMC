package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class fyk implements lij {
    final /* synthetic */ fyr a;
    private final /* synthetic */ int b;

    public fyk(fyr fyrVar, int i) {
        this.b = i;
        this.a = fyrVar;
    }

    @Override // defpackage.lij
    public final /* synthetic */ void fB(Object obj) {
        switch (this.b) {
            case 0:
                this.a.B((String) obj);
                break;
            default:
                fyr fyrVar = this.a;
                if (fyrVar.p == 1 && fyrVar.P == 0) {
                    fyrVar.B.post(new fyi(this, null));
                    break;
                }
                break;
        }
    }
}
