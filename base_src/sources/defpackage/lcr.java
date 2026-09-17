package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class lcr extends ldl {
    final /* synthetic */ oiu a;
    final /* synthetic */ lco b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lcr(lco lcoVar, oiu oiuVar, lco lcoVar2) {
        super(lcoVar);
        this.a = oiuVar;
        this.b = lcoVar2;
    }

    @Override // defpackage.ldl
    protected final Object c(Object obj) {
        return this.a.a(obj);
    }

    public final String toString() {
        ojb ojbVarBa = obr.ba("TransformedObs");
        ojbVarBa.b("input", this.b);
        ojbVarBa.b("func", this.a);
        return ojbVarBa.toString();
    }
}
