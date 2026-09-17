package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class num extends qnp implements qmu {
    final /* synthetic */ List a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public num(List list) {
        super(1);
        this.a = list;
    }

    @Override // defpackage.qmu
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        List<npe> list = this.a;
        Double dValueOf = Double.valueOf(dDoubleValue);
        for (npe npeVar : list) {
            double dDoubleValue2 = dValueOf.doubleValue();
            double d = npeVar.d;
            Double.isNaN(d);
            dValueOf = Double.valueOf(dDoubleValue2 - d);
        }
        return dValueOf;
    }
}
