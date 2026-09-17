package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class vd implements Iterable {
    public uz b;
    public uz c;
    public final WeakHashMap d = new WeakHashMap();
    public int e = 0;

    protected uz a(Object obj) {
        uz uzVar = this.b;
        while (uzVar != null && !uzVar.a.equals(obj)) {
            uzVar = uzVar.c;
        }
        return uzVar;
    }

    public Object b(Object obj) {
        uz uzVarA = a(obj);
        if (uzVarA == null) {
            return null;
        }
        this.e--;
        if (!this.d.isEmpty()) {
            Iterator it = this.d.keySet().iterator();
            while (it.hasNext()) {
                ((vc) it.next()).fo(uzVarA);
            }
        }
        uz uzVar = uzVarA.d;
        uz uzVar2 = uzVarA.c;
        if (uzVar != null) {
            uzVar.c = uzVar2;
        } else {
            this.b = uzVar2;
        }
        uz uzVar3 = uzVarA.c;
        if (uzVar3 != null) {
            uzVar3.d = uzVar;
        } else {
            this.c = uzVar;
        }
        uzVarA.c = null;
        uzVarA.d = null;
        return uzVarA.b;
    }

    public final uz d(Object obj, Object obj2) {
        uz uzVar = new uz(obj, obj2);
        this.e++;
        uz uzVar2 = this.c;
        if (uzVar2 == null) {
            this.b = uzVar;
        } else {
            uzVar2.c = uzVar;
            uzVar.d = uzVar2;
        }
        this.c = uzVar;
        return uzVar;
    }

    public final va e() {
        va vaVar = new va(this);
        this.d.put(vaVar, false);
        return vaVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vd)) {
            return false;
        }
        vd vdVar = (vd) obj;
        if (this.e != vdVar.e) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = vdVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry next = ((vb) it).next();
            Map.Entry next2 = ((vb) it2).next();
            if (next != null) {
                if (next != null || next.equals(next2)) {
                }
            } else if (next2 == null) {
                next2 = null;
                if (next != null) {
                }
            }
            return false;
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public final Object f(Object obj, Object obj2) {
        uz uzVarA = a(obj);
        if (uzVarA != null) {
            return uzVarA.b;
        }
        d(obj, obj2);
        return null;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((vb) it).next().hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ux uxVar = new ux(this.b, this.c);
        this.d.put(uxVar, false);
        return uxVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((vb) it).next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
