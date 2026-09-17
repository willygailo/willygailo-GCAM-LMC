package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lsl implements Runnable {
    public final /* synthetic */ lap a;
    private final /* synthetic */ int b;

    public /* synthetic */ lsl(lap lapVar, int i) {
        this.b = i;
        this.a = lapVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.a.close();
                break;
            default:
                this.a.close();
                break;
        }
    }
}
