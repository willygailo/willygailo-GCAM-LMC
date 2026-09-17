package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class kim {
    private static final Set a = Collections.newSetFromMap(new WeakHashMap());

    public static Set a() {
        Set set = a;
        synchronized (set) {
        }
        return set;
    }

    public void b(kji kjiVar) {
        throw null;
    }

    public void c(kji kjiVar) {
        throw null;
    }
}
