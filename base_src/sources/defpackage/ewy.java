package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ewy implements lie {
    public final /* synthetic */ bro a;
    private final /* synthetic */ int b;

    public /* synthetic */ ewy(bro broVar, int i) {
        this.b = i;
        this.a = broVar;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        switch (this.b) {
            case 0:
                this.a.b();
                break;
            default:
                this.a.j(null);
                break;
        }
    }
}
