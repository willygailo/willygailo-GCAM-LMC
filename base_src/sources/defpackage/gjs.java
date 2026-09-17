package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class gjs extends maa {
    public final Map a;

    public gjs(mad madVar) {
        super(madVar);
        this.a = new ConcurrentHashMap();
    }

    public gjs(mad madVar, pht phtVar) {
        this(madVar);
        if (phtVar != null) {
            this.a.put(gjr.a, phtVar);
        }
    }

    public final pht k() {
        return (pht) l(gjr.a);
    }

    public final Object l(gjq gjqVar) {
        if (this.a.containsKey(gjqVar)) {
            return this.a.get(gjqVar);
        }
        return null;
    }

    public final boolean m() {
        return a() != -1;
    }
}
