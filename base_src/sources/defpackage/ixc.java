package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ixc implements lie {
    public final /* synthetic */ lda a;
    private final /* synthetic */ int b;

    public /* synthetic */ ixc(lda ldaVar, int i) {
        this.b = i;
        this.a = ldaVar;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        switch (this.b) {
            case 0:
                this.a.fB("torch");
                break;
            default:
                this.a.fB(Float.valueOf(-999.0f));
                break;
        }
    }
}
