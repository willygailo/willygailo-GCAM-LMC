package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class btn implements Runnable {
    public final /* synthetic */ btp a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ btn(btp btpVar, int i, int i2) {
        this.c = i2;
        this.a = btpVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                btp btpVar = this.a;
                int i = this.b;
                try {
                    btpVar.h();
                } catch (InterruptedException e) {
                    btpVar.b.post(new btn(btpVar, i, 1));
                    return;
                }
                break;
            default:
                this.a.c(this.b, "Acquiring semaphore");
                Thread.currentThread().interrupt();
                break;
        }
    }
}
