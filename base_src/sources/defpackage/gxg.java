package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gxg implements Runnable {
    public final /* synthetic */ gxh a;
    private final /* synthetic */ int b;

    public /* synthetic */ gxg(gxh gxhVar, int i) {
        this.b = i;
        this.a = gxhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((itw) this.a.d.a.c()).h();
                break;
            case 1:
                ((itw) this.a.d.a.c()).h();
                break;
            default:
                ((itw) this.a.d.a.c()).h();
                break;
        }
    }
}
