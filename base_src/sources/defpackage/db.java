package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class db {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public cw d;

    final bu a(String str) {
        da daVar = (da) this.b.get(str);
        if (daVar != null) {
            return daVar.c;
        }
        return null;
    }

    final bu b(String str) {
        for (da daVar : this.b.values()) {
            if (daVar != null) {
                bu buVarB = daVar.c;
                if (!str.equals(buVarB.k)) {
                    buVarB = buVarB.A.a.b(str);
                }
                if (buVarB != null) {
                    return buVarB;
                }
            }
        }
        return null;
    }

    final cy c(String str, cy cyVar) {
        return cyVar != null ? (cy) this.c.put(str, cyVar) : (cy) this.c.remove(str);
    }

    final da d(String str) {
        return (da) this.b.get(str);
    }

    final List e() {
        ArrayList arrayList = new ArrayList();
        for (da daVar : this.b.values()) {
            if (daVar != null) {
                arrayList.add(daVar);
            }
        }
        return arrayList;
    }

    final List f() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    final void g(bu buVar) {
        if (this.a.contains(buVar)) {
            throw new IllegalStateException("Fragment already added: " + buVar);
        }
        synchronized (this.a) {
            this.a.add(buVar);
        }
        buVar.q = true;
    }

    final void h() {
        this.b.values().removeAll(Collections.singleton(null));
    }

    final void i(da daVar) {
        bu buVar = daVar.c;
        if (l(buVar.k)) {
            return;
        }
        this.b.put(buVar.k, daVar);
        boolean z = buVar.I;
        if (cu.Q(2)) {
            String str = "Added fragment to active set " + buVar;
        }
    }

    final void j(da daVar) {
        bu buVar = daVar.c;
        if (buVar.H) {
            this.d.d(buVar);
        }
        if (((da) this.b.put(buVar.k, null)) != null && cu.Q(2)) {
            String str = "Removed fragment from active set " + buVar;
        }
    }

    final void k(bu buVar) {
        synchronized (this.a) {
            this.a.remove(buVar);
        }
        buVar.q = false;
    }

    final boolean l(String str) {
        return this.b.get(str) != null;
    }
}
