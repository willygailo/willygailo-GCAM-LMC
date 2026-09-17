package androidx.work;

import defpackage.amq;
import defpackage.amt;
import defpackage.gd;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class OverwritingInputMerger extends amt {
    @Override // defpackage.amt
    public final amq a(List list) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            map2.putAll(((amq) it.next()).b());
        }
        gd.o(map2, map);
        return gd.n(map);
    }
}
