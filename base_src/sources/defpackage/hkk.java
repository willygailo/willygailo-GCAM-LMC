package defpackage;

import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class hkk {
    private final TreeMap a = new TreeMap();
    private final TreeMap b = new TreeMap();

    public final synchronized void a(long j, psn psnVar, pso psoVar) {
        TreeMap treeMap = this.a;
        Long lValueOf = Long.valueOf(j);
        treeMap.put(lValueOf, psnVar);
        this.b.put(lValueOf, psoVar);
        while (this.a.size() > 1000) {
            TreeMap treeMap2 = this.a;
            treeMap2.remove(treeMap2.firstKey());
            TreeMap treeMap3 = this.b;
            treeMap3.remove(treeMap3.firstKey());
        }
    }

    public final synchronized void b(long j) {
    }

    public final synchronized void c(long j) {
    }
}
