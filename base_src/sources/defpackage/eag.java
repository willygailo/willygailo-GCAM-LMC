package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eag implements Runnable {
    public final /* synthetic */ eah a;
    private final /* synthetic */ int b;

    public /* synthetic */ eag(eah eahVar, int i) {
        this.b = i;
        this.a = eahVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.a.c(0.5f);
                return;
            case 1:
                this.a.c(1.0f);
                return;
            default:
                eah eahVar = this.a;
                eahVar.c(1.0f);
                synchronized (eahVar.a) {
                    eahVar.c = null;
                    break;
                }
                return;
        }
    }
}
