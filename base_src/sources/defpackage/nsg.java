package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nsg implements qts {
    final /* synthetic */ List a;
    final /* synthetic */ List b;

    public nsg(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    @Override // defpackage.qts
    public final Object emit(Object obj, qlh qlhVar) {
        nqi nqiVar = (nqi) obj;
        nqh nqhVar = nqiVar.a;
        List list = nqiVar.b;
        this.a.add(nqhVar);
        qmd.A(this.b, list);
        return qks.a;
    }
}
