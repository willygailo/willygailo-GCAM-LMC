package defpackage;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class cw extends aeu {
    public static final aev a = new afd(1);
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean g = false;

    public cw(boolean z) {
        this.e = z;
    }

    final void a(bu buVar) {
        if (cu.Q(3)) {
            String str = "Clearing non-config state for " + buVar;
        }
        b(buVar.k);
    }

    public final void b(String str) {
        cw cwVar = (cw) this.c.get(str);
        if (cwVar != null) {
            cwVar.c();
            this.c.remove(str);
        }
        aih aihVar = (aih) this.d.get(str);
        if (aihVar != null) {
            aihVar.b();
            this.d.remove(str);
        }
    }

    @Override // defpackage.aeu
    public final void c() {
        if (cu.Q(3)) {
            String str = "onCleared called for " + this;
        }
        this.f = true;
    }

    final void d(bu buVar) {
        if (this.g || this.b.remove(buVar.k) == null || !cu.Q(2)) {
            return;
        }
        String str = "Updating retained Fragments: Removed " + buVar;
    }

    final boolean e(bu buVar) {
        if (this.b.containsKey(buVar.k) && this.e) {
            return this.f;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cw cwVar = (cw) obj;
        return this.b.equals(cwVar.b) && this.c.equals(cwVar.c) && this.d.equals(cwVar.d);
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
