package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bah {
    private static final bad a = new baf();
    private final Map b = new HashMap();

    public final synchronized bae a(Object obj) {
        bad badVar;
        aae.s(obj);
        badVar = (bad) this.b.get(obj.getClass());
        if (badVar == null) {
            for (bad badVar2 : this.b.values()) {
                if (badVar2.b().isAssignableFrom(obj.getClass())) {
                    badVar = badVar2;
                    break;
                }
            }
        }
        if (badVar == null) {
            badVar = a;
        }
        return badVar.a(obj);
    }

    public final synchronized void b(bad badVar) {
        this.b.put(badVar.b(), badVar);
    }
}
