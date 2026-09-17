package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hyj implements Runnable {
    public final /* synthetic */ hza a;
    private final /* synthetic */ int b;

    public /* synthetic */ hyj(hza hzaVar, int i) {
        this.b = i;
        this.a = hzaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                hza hzaVar = this.a;
                hzaVar.b.c(new hyj(hzaVar, 1));
                break;
            case 1:
                this.a.v--;
                break;
            default:
                this.a.b.c(new bvf(19));
                break;
        }
    }
}
