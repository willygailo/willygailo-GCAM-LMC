package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gng implements Runnable {
    public final /* synthetic */ lie a;
    private final /* synthetic */ int b;

    public /* synthetic */ gng(lie lieVar, int i) {
        this.b = i;
        this.a = lieVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.a.close();
                break;
            case 1:
                this.a.close();
                break;
            case 2:
                this.a.close();
                break;
            case 3:
                this.a.close();
                break;
            default:
                this.a.close();
                break;
        }
    }
}
