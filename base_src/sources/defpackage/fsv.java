package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fsv implements lie {
    public final /* synthetic */ fty a;
    private final /* synthetic */ int b;

    public /* synthetic */ fsv(fty ftyVar, int i) {
        this.b = i;
        this.a = ftyVar;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        switch (this.b) {
            case 0:
                this.a.a();
                break;
            default:
                this.a.a();
                break;
        }
    }
}
