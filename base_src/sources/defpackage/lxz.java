package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class lxz extends lya {
    lym a = null;
    private final qkg b;

    public lxz(qkg qkgVar) {
        this.b = qkgVar;
    }

    @Override // defpackage.lya
    public final void a(Object obj, lye lyeVar) {
        synchronized (this) {
            if (this.a == null) {
                this.a = (lym) this.b.get();
            }
            this.a.a(obj);
        }
    }

    @Override // defpackage.lya
    public final void b(lyr lyrVar, lyj lyjVar) {
        lym lymVar;
        synchronized (this) {
            lymVar = this.a;
            this.a = null;
        }
        if (lymVar != null) {
            lyrVar.a(lyjVar);
            lymVar.b(lyrVar, ((lyk) lyjVar).b);
        }
    }
}
