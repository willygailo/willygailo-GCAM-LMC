package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class noq {
    public final noc a;

    public noq(noc nocVar) {
        nocVar.getClass();
        this.a = nocVar;
    }

    public final qbu a(nrl nrlVar, nqh nqhVar, npe npeVar, qmu qmuVar) {
        npeVar.getClass();
        qmuVar.getClass();
        return b(nrlVar, nqhVar, qmd.q(npeVar), qmuVar).l(noi.c);
    }

    public final qbu b(nrl nrlVar, nqh nqhVar, List list, qmu qmuVar) {
        qmuVar.getClass();
        ArrayList arrayList = new ArrayList(qmd.B(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            npe npeVar = (npe) it.next();
            arrayList.add(npe.a(npeVar, null, null, (npk) qmuVar.a(npeVar.h), 767));
        }
        return this.a.c(nrlVar, qmd.q(nqhVar), arrayList).d(arrayList);
    }

    public final qbu c(nrl nrlVar, nqh nqhVar, qmu qmuVar) {
        nqh nqhVarD = nqh.d(nqhVar, null, null, (npk) qmuVar.a(nqhVar.r), 786431);
        return this.a.d(nrlVar, nqhVarD).d(nqhVarD);
    }

    public final qbu d(nrl nrlVar, nqi nqiVar, qmu qmuVar) {
        nqh nqhVar = nqiVar.a;
        return qbu.m(c(nrlVar, nqhVar, qmuVar), b(nrlVar, nqhVar, nqiVar.b, qmuVar), non.a);
    }

    public final qbu e(nrl nrlVar, List list, qmu qmuVar, qmu qmuVar2) {
        nrlVar.getClass();
        list.getClass();
        qmuVar.getClass();
        ArrayList arrayList = new ArrayList(qmd.B(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nqh nqhVar = ((nqi) it.next()).a;
            arrayList.add(nqh.d(nqhVar, null, null, (npk) qmuVar2.a(nqhVar.r), 786431));
        }
        List listC = qnt.c(qnt.d(new qot(new qog(qmd.z(list), noj.e, qor.e), new nop(qmuVar, 1), 1), new nop(qmuVar2, 0)));
        return naq.e(this.a.e(nrlVar, arrayList), new noo(this, nrlVar, arrayList, listC)).d(new qkl(arrayList, listC));
    }
}
