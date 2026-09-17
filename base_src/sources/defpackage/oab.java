package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class oab implements Runnable {
    final /* synthetic */ oae a;
    private final /* synthetic */ int b;

    public oab(oae oaeVar, int i) {
        this.b = i;
        this.a = oaeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                oae oaeVar = this.a;
                ((oas) oaeVar.getCurrentDrawable()).g(false, false, true);
                if (oaeVar.getProgressDrawable() == null || !oaeVar.getProgressDrawable().isVisible()) {
                    if (oaeVar.getIndeterminateDrawable() == null || !oaeVar.getIndeterminateDrawable().isVisible()) {
                        oaeVar.setVisibility(4);
                    }
                }
                break;
            default:
                this.a.e();
                break;
        }
    }
}
