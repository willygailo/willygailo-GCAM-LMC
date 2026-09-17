package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class orm extends olo {
    final Comparable a;
    final /* synthetic */ orp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public orm(orp orpVar, Comparable comparable) {
        super(comparable);
        this.b = orpVar;
        this.a = orpVar.last();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.olo
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (orp.T(obj, this.a)) {
            return null;
        }
        return this.b.a.d(obj);
    }
}
