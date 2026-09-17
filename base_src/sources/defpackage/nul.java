package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class nul extends qnp implements qmu {
    final /* synthetic */ npe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nul(npe npeVar) {
        super(1);
        this.a = npeVar;
    }

    @Override // defpackage.qmu
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        ((Number) obj).doubleValue();
        npe npeVar = this.a;
        double d = npeVar.h.f;
        double d2 = npeVar.d;
        Double.isNaN(d2);
        return Double.valueOf(d * d2);
    }
}
