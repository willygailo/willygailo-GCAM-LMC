package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class bcy {
    private final bcx a = new bcx(null);
    private final Map b = new HashMap();

    private static void d(bcx bcxVar) {
        bcx bcxVar2 = bcxVar.d;
        bcxVar2.c = bcxVar.c;
        bcxVar.c.d = bcxVar2;
    }

    private static void e(bcx bcxVar) {
        bcxVar.c.d = bcxVar;
        bcxVar.d.c = bcxVar;
    }

    public final Object a(bdf bdfVar) {
        bcx bcxVar = (bcx) this.b.get(bdfVar);
        if (bcxVar == null) {
            bcxVar = new bcx(bdfVar);
            this.b.put(bdfVar, bcxVar);
        } else {
            bdfVar.a();
        }
        d(bcxVar);
        bcx bcxVar2 = this.a;
        bcxVar.d = bcxVar2;
        bcxVar.c = bcxVar2.c;
        e(bcxVar);
        return bcxVar.b();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [bdf, java.lang.Object] */
    public final Object b() {
        for (bcx bcxVar = this.a.d; !bcxVar.equals(this.a); bcxVar = bcxVar.d) {
            Object objB = bcxVar.b();
            if (objB != null) {
                return objB;
            }
            d(bcxVar);
            this.b.remove(bcxVar.a);
            bcxVar.a.a();
        }
        return null;
    }

    public final void c(bdf bdfVar, Object obj) {
        bcx bcxVar = (bcx) this.b.get(bdfVar);
        if (bcxVar == null) {
            bcxVar = new bcx(bdfVar);
            d(bcxVar);
            bcx bcxVar2 = this.a;
            bcxVar.d = bcxVar2.d;
            bcxVar.c = bcxVar2;
            e(bcxVar);
            this.b.put(bdfVar, bcxVar);
        } else {
            bdfVar.a();
        }
        if (bcxVar.b == null) {
            bcxVar.b = new ArrayList();
        }
        bcxVar.b.add(obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        bcx bcxVar = this.a.c;
        boolean z = false;
        while (!bcxVar.equals(this.a)) {
            sb.append('{');
            sb.append(bcxVar.a);
            sb.append(':');
            sb.append(bcxVar.a());
            sb.append("}, ");
            bcxVar = bcxVar.c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
