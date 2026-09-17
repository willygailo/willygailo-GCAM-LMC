package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class nqp implements qmu {
    final /* synthetic */ nqu a;
    private final /* synthetic */ int b;

    public nqp(nqu nquVar, int i) {
        this.b = i;
        this.a = nquVar;
    }

    @Override // defpackage.qmu
    public final /* synthetic */ Object a(Object obj) {
        switch (this.b) {
            case 0:
                return nql.e(this.a, (qlh) obj);
            default:
                return nql.b(this.a, (qlh) obj);
        }
    }
}
