package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class cjo {
    public final Map a;
    public final ghx b;

    public cjo(ghx ghxVar, Map map) {
        this.b = ghxVar;
        this.a = map;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            map.get((ldz) it.next());
        }
    }

    public final boolean a(ldz ldzVar, leb lebVar) {
        List list = (List) this.a.get(ldzVar);
        list.getClass();
        return list.contains(lebVar);
    }
}
