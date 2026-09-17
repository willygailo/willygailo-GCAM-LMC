package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class noe implements qco {
    final /* synthetic */ nog a;

    public noe(nog nogVar) {
        this.a = nogVar;
    }

    @Override // defpackage.qco
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        List<nqh> list = (List) obj;
        list.getClass();
        nog nogVar = this.a;
        ArrayList arrayList = new ArrayList(qmd.B(list));
        for (nqh nqhVar : list) {
            ((ohh) nogVar.b.a.get()).getClass();
            nqhVar.getClass();
            arrayList.add(new now(nqhVar));
        }
        return arrayList;
    }
}
