package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class bmb {
    private final Map a = new LinkedHashMap(100, 0.75f, true);
    private final long b;
    private long c;

    public bmb(long j) {
        this.b = j;
    }

    protected int a(Object obj) {
        return 1;
    }

    protected void c(Object obj, Object obj2) {
    }

    public final synchronized long e() {
        return this.b;
    }

    public final synchronized Object f(Object obj) {
        bma bmaVar;
        bmaVar = (bma) this.a.get(obj);
        return bmaVar != null ? bmaVar.a : null;
    }

    public final synchronized Object g(Object obj, Object obj2) {
        int iA = a(obj2);
        long j = iA;
        if (j >= this.b) {
            c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.c += j;
        }
        bma bmaVar = (bma) this.a.put(obj, obj2 == null ? null : new bma(obj2, iA));
        if (bmaVar != null) {
            this.c -= (long) bmaVar.b;
            if (!bmaVar.a.equals(obj2)) {
                c(obj, bmaVar.a);
            }
        }
        j(this.b);
        if (bmaVar != null) {
            return bmaVar.a;
        }
        return null;
    }

    public final synchronized Object h(Object obj) {
        Object obj2;
        bma bmaVar = (bma) this.a.remove(obj);
        if (bmaVar == null) {
            obj2 = null;
        } else {
            this.c -= (long) bmaVar.b;
            obj2 = bmaVar.a;
        }
        return obj2;
    }

    public final void i() {
        j(0L);
    }

    public final synchronized void j(long j) {
        while (this.c > j) {
            Iterator it = this.a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            bma bmaVar = (bma) entry.getValue();
            this.c -= (long) bmaVar.b;
            Object key = entry.getKey();
            it.remove();
            c(key, bmaVar.a);
        }
    }
}
