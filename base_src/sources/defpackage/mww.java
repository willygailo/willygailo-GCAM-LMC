package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mww {
    public abstract pqm a(String str, Object obj);

    public abstract pqm b(pqm pqmVar, pqm pqmVar2);

    public abstract String c(pqm pqmVar);

    public final List d(Map map) {
        pqm pqmVarA;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null && (pqmVarA = a((String) entry.getKey(), entry.getValue())) != null) {
                arrayList.add(pqmVarA);
            }
        }
        return arrayList;
    }

    public final List e(List list, List list2) {
        pqm pqmVar;
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pqm pqmVar2 = (pqm) it.next();
            String strC = c(pqmVar2);
            Iterator it2 = list2.iterator();
            do {
                if (!it2.hasNext()) {
                    pqmVar = null;
                    break;
                }
                pqmVar = (pqm) it2.next();
            } while (!strC.equals(c(pqmVar)));
            pqm pqmVarB = b(pqmVar2, pqmVar);
            if (pqmVarB != null) {
                arrayList.add(pqmVarB);
            }
        }
        return arrayList;
    }
}
