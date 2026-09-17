package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class ppy extends pqa {
    private static final Class c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    static List a(Object obj, long j) {
        return (List) prv.h(obj, j);
    }

    private static List e(Object obj, long j, int i) {
        List listE;
        List listA = a(obj, j);
        if (listA.isEmpty()) {
            if (listA instanceof ppx) {
                listE = new ppw(i);
            } else {
                listE = ((listA instanceof pqt) && (listA instanceof ppm)) ? ((ppm) listA).e(i) : new ArrayList(i);
            }
            prv.u(obj, j, listE);
            return listE;
        }
        if (c.isAssignableFrom(listA.getClass())) {
            ArrayList arrayList = new ArrayList(listA.size() + i);
            arrayList.addAll(listA);
            prv.u(obj, j, arrayList);
            return arrayList;
        }
        if (listA instanceof prq) {
            ppw ppwVar = new ppw(listA.size() + i);
            ppwVar.addAll((prq) listA);
            prv.u(obj, j, ppwVar);
            return ppwVar;
        }
        if (!(listA instanceof pqt) || !(listA instanceof ppm)) {
            return listA;
        }
        ppm ppmVar = (ppm) listA;
        if (ppmVar.c()) {
            return listA;
        }
        ppm ppmVarE = ppmVar.e(listA.size() + i);
        prv.u(obj, j, ppmVarE);
        return ppmVarE;
    }

    @Override // defpackage.pqa
    public final List b(Object obj, long j) {
        return e(obj, j, 10);
    }

    @Override // defpackage.pqa
    public final void c(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) prv.h(obj, j);
        if (list instanceof ppx) {
            objUnmodifiableList = ((ppx) list).d();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof pqt) && (list instanceof ppm)) {
                ppm ppmVar = (ppm) list;
                if (ppmVar.c()) {
                    ppmVar.b();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        prv.u(obj, j, objUnmodifiableList);
    }

    @Override // defpackage.pqa
    public final void d(Object obj, Object obj2, long j) {
        List listA = a(obj2, j);
        List listE = e(obj, j, listA.size());
        int size = listE.size();
        int size2 = listA.size();
        if (size > 0 && size2 > 0) {
            listE.addAll(listA);
        }
        if (size > 0) {
            listA = listE;
        }
        prv.u(obj, j, listA);
    }
}
