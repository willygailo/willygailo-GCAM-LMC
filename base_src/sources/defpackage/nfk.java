package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nfk implements ojz {
    public final /* synthetic */ nfm a;
    private final /* synthetic */ int b;

    public /* synthetic */ nfk(nfm nfmVar, int i) {
        this.b = i;
        this.a = nfmVar;
    }

    @Override // defpackage.ojz
    public final Object a() {
        switch (this.b) {
            case 0:
                return this.a.a();
            default:
                return this.a.b();
        }
    }
}
