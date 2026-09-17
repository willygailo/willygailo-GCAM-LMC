package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fpw implements Runnable {
    public final /* synthetic */ fpz a;
    private final /* synthetic */ int b;

    public /* synthetic */ fpw(fpz fpzVar, int i) {
        this.b = i;
        this.a = fpzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((dvt) this.a.a.c()).a();
                return;
            case 1:
                fpz fpzVar = this.a;
                synchronized (fpzVar) {
                    fpzVar.b.getLooper().quitSafely();
                    fpzVar.b.removeCallbacksAndMessages(null);
                    if (fpzVar.a.g()) {
                        ((dvt) fpzVar.a.c()).close();
                    }
                    break;
                }
                return;
            default:
                this.a.c();
                return;
        }
    }
}
