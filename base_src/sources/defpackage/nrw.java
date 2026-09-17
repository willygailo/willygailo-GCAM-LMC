package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
final class nrw implements qco {
    final /* synthetic */ aml a;
    final /* synthetic */ nsb b;
    final /* synthetic */ nrl c;

    public nrw(aml amlVar, nsb nsbVar, nrl nrlVar) {
        this.a = amlVar;
        this.b = nsbVar;
        this.c = nrlVar;
    }

    @Override // defpackage.qco
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        Object objPrevious;
        int i;
        List list = (List) obj;
        list.getClass();
        ListIterator listIterator = list.listIterator(list.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            i = ((anc) objPrevious).b;
            if (i == 1) {
                break;
            }
        } while (i != 2);
        anc ancVar = (anc) objPrevious;
        if (ancVar == null || ancVar.a.contains(String.valueOf(this.a.hashCode()))) {
            return qbd.a();
        }
        nsb nsbVar = this.b;
        return nsbVar.c(((and) nsbVar.a.get()).d(), this.c, 4);
    }
}
