package defpackage;

import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class jum {
    private static final TreeMap a = new TreeMap();

    public static synchronized long a(long j) {
        Long l;
        l = (Long) a.get(Long.valueOf(j));
        return l != null ? l.longValue() : System.currentTimeMillis();
    }

    public static synchronized void b(long j) {
        TreeMap treeMap = a;
        Long lValueOf = Long.valueOf(j);
        if (!treeMap.containsKey(lValueOf)) {
            treeMap.put(lValueOf, Long.valueOf(System.currentTimeMillis()));
        }
        while (true) {
            TreeMap treeMap2 = a;
            if (treeMap2.size() > 1800) {
                treeMap2.pollFirstEntry();
            }
        }
    }
}
