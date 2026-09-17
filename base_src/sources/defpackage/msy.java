package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class msy implements Runnable {
    public final /* synthetic */ mta a;
    private final /* synthetic */ int b;

    public /* synthetic */ msy(mta mtaVar, int i) {
        this.b = i;
        this.a = mtaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.a.a();
                break;
            default:
                mta mtaVar = this.a;
                mtaVar.d.o(null);
                mtaVar.a();
                break;
        }
    }
}
