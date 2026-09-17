package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class njg implements nin {
    public static final InputStream b(nim nimVar) {
        InputStream inputStreamD = nimVar.a.d(nimVar.d);
        ArrayList arrayList = new ArrayList();
        arrayList.add(inputStreamD);
        if (!nimVar.c.isEmpty()) {
            List list = nimVar.c;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                njk njkVarA = ((njm) it.next()).a();
                if (njkVarA != null) {
                    arrayList2.add(njkVarA);
                }
            }
            nij nijVar = !arrayList2.isEmpty() ? new nij(inputStreamD, arrayList2) : null;
            if (nijVar != null) {
                arrayList.add(nijVar);
            }
        }
        for (njn njnVar : nimVar.b) {
            arrayList.add(njnVar.c());
        }
        Collections.reverse(arrayList);
        return (InputStream) arrayList.get(0);
    }

    @Override // defpackage.nin
    public final /* bridge */ /* synthetic */ Object a(nim nimVar) {
        return b(nimVar);
    }
}
