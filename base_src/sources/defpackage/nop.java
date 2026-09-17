package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class nop extends qnp implements qmu {
    final /* synthetic */ qmu a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nop(qmu qmuVar, int i) {
        super(1);
        this.b = i;
        this.a = qmuVar;
    }

    @Override // defpackage.qmu
    public final /* synthetic */ Object a(Object obj) {
        switch (this.b) {
            case 0:
                npe npeVar = (npe) obj;
                npeVar.getClass();
                return npe.a(npeVar, null, null, (npk) this.a.a(npeVar.h), 767);
            default:
                npe npeVar2 = (npe) obj;
                npeVar2.getClass();
                return (Boolean) this.a.a(npeVar2);
        }
    }
}
