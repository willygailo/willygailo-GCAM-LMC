package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dfa implements lie {
    public final /* synthetic */ pht a;
    private final /* synthetic */ int b;

    public /* synthetic */ dfa(pht phtVar, int i) {
        this.b = i;
        this.a = phtVar;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        switch (this.b) {
            case 0:
                this.a.cancel(true);
                break;
            case 1:
                this.a.cancel(true);
                break;
            case 2:
                this.a.cancel(true);
                break;
            default:
                this.a.cancel(true);
                break;
        }
    }
}
