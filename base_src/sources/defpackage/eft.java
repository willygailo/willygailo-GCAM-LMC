package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eft implements Runnable {
    public final /* synthetic */ lda a;
    private final /* synthetic */ int b;

    public /* synthetic */ eft(lda ldaVar, int i) {
        this.b = i;
        this.a = ldaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.a.fB(1);
                break;
            case 1:
                this.a.fB(0);
                break;
            case 2:
                this.a.fB(false);
                break;
            case 3:
                this.a.fB(true);
                break;
            case 4:
                this.a.fB(true);
                break;
            default:
                this.a.fB(false);
                break;
        }
    }
}
