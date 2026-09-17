package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class igs implements Runnable {
    public final /* synthetic */ igu a;
    private final /* synthetic */ int b;

    public /* synthetic */ igs(igu iguVar, int i) {
        this.b = i;
        this.a = iguVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.a.f = true;
                break;
            default:
                this.a.g = true;
                break;
        }
    }
}
