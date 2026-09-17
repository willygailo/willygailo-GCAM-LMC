package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dce implements lie {
    public final /* synthetic */ dcl a;
    private final /* synthetic */ int b;

    public /* synthetic */ dce(dcl dclVar, int i) {
        this.b = i;
        this.a = dclVar;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        switch (this.b) {
            case 0:
                this.a.b();
                break;
            default:
                this.a.b();
                break;
        }
    }
}
