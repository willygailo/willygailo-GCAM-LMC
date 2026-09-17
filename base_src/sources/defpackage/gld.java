package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class gld implements oiu {
    final /* synthetic */ List a;

    public gld(List list) {
        this.a = list;
    }

    @Override // defpackage.oiu
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        Set set = (Set) obj;
        set.getClass();
        obr.aQ(set.size() == 1);
        hin hinVar = (hin) ohh.r(set, 0);
        long jD = hinVar.a.d();
        hinVar.a.close();
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((mad) it.next()).d()));
        }
        int iIndexOf = arrayList.indexOf(Long.valueOf(jD));
        obr.aQ(iIndexOf >= 0);
        return Integer.valueOf(iIndexOf);
    }
}
