package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dsw implements Runnable {
    public final /* synthetic */ qkg a;
    private final /* synthetic */ int b;

    public /* synthetic */ dsw(qkg qkgVar, int i) {
        this.b = i;
        this.a = qkgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((dsv) this.a.get()).a();
                break;
            case 1:
                ((dob) this.a).get().run();
                break;
            default:
                try {
                    ((fqs) this.a.get()).d();
                } catch (RuntimeException e) {
                    ((oug) ((oug) ((oug) fsq.a.c()).h(e)).G((char) 1947)).o("Prewarm of microvideo encoder failed... will try again later!");
                    return;
                }
                break;
        }
    }
}
