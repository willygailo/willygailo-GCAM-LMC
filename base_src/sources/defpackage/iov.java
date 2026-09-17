package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class iov implements Runnable {
    public final /* synthetic */ ipx a;
    private final /* synthetic */ int b;

    public /* synthetic */ iov(ipx ipxVar, int i) {
        this.b = i;
        this.a = ipxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.a.a();
                break;
            case 1:
                this.a.gl();
                break;
            case 2:
                this.a.f();
                break;
            case 3:
                this.a.g();
                break;
            default:
                this.a.c();
                break;
        }
    }
}
