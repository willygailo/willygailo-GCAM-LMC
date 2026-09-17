package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cgt implements Runnable {
    public final /* synthetic */ cgx a;
    private final /* synthetic */ int b;

    public /* synthetic */ cgt(cgx cgxVar, int i) {
        this.b = i;
        this.a = cgxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.a.v.d();
                break;
            case 1:
                ckn cknVar = this.a.g;
                cknVar.c.execute(new ckm(cknVar, 2));
                break;
            case 2:
                this.a.v.a();
                break;
            default:
                this.a.v.i();
                break;
        }
    }
}
