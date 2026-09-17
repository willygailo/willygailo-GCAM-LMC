package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class mot {
    public static volatile boolean a = false;
    private static volatile boolean c = false;
    public static final Map b = DesugarCollections.synchronizedMap(new WeakHashMap());

    public static void a() {
        ArrayList arrayList = new ArrayList();
        Map map = b;
        synchronized (map) {
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                long j = ((mos) ((Map.Entry) it.next()).getValue()).a;
                throw null;
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            b.remove(arrayList.get(i));
        }
    }

    public static int b() {
        Map map = b;
        synchronized (map) {
            Iterator it = map.values().iterator();
            if (it.hasNext()) {
                long j = ((mos) it.next()).a;
                throw null;
            }
        }
        return 0;
    }
}
