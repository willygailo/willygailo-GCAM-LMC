package defpackage;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class okm extends ong implements Serializable, olt {
    private static final long serialVersionUID = 0;
    public transient Map a;
    public transient okm b;
    private transient Set c;
    private transient Set d;
    private transient Set e;

    public okm(Map map, Map map2) {
        i(map, map2);
    }

    public okm(Map map, okm okmVar) {
        this.a = map;
        this.b = okmVar;
    }

    @Override // defpackage.ong, defpackage.onj
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ Object b() {
        return this.a;
    }

    public Object b(Object obj) {
        throw null;
    }

    @Override // defpackage.ong
    protected final Map c() {
        return this.a;
    }

    @Override // defpackage.ong, java.util.Map
    public final void clear() {
        this.a.clear();
        this.b.a.clear();
    }

    @Override // defpackage.ong, java.util.Map
    public final boolean containsValue(Object obj) {
        return this.b.containsKey(obj);
    }

    public Object d(Object obj) {
        return obj;
    }

    @Override // defpackage.olt
    public final olt e() {
        return this.b;
    }

    @Override // defpackage.ong, java.util.Map
    public final Set entrySet() {
        Set set = this.e;
        if (set != null) {
            return set;
        }
        oki okiVar = new oki(this);
        this.e = okiVar;
        return okiVar;
    }

    public final Object f(Object obj) {
        Object objRemove = this.a.remove(obj);
        h(objRemove);
        return objRemove;
    }

    @Override // defpackage.ong, java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Set values() {
        Set set = this.d;
        if (set != null) {
            return set;
        }
        okl oklVar = new okl(this);
        this.d = oklVar;
        return oklVar;
    }

    public final void h(Object obj) {
        this.b.a.remove(obj);
    }

    final void i(Map map, Map map2) {
        obr.aQ(this.a == null);
        obr.aQ(this.b == null);
        obr.aF(map.isEmpty());
        obr.aF(map2.isEmpty());
        obr.aF(map != map2);
        this.a = map;
        this.b = new okj(map2, this);
    }

    public final void j(Object obj, boolean z, Object obj2, Object obj3) {
        if (z) {
            h(obj2);
        }
        this.b.a.put(obj3, obj);
    }

    @Override // defpackage.olt
    public final void k(Object obj, Object obj2) {
        throw null;
    }

    @Override // defpackage.ong, java.util.Map
    public final Set keySet() {
        Set set = this.c;
        if (set != null) {
            return set;
        }
        okk okkVar = new okk(this);
        this.c = okkVar;
        return okkVar;
    }

    @Override // defpackage.ong, java.util.Map, defpackage.olt
    public Object put(Object obj, Object obj2) {
        b(obj);
        d(obj2);
        boolean zContainsKey = containsKey(obj);
        if (zContainsKey && obr.bc(obj2, get(obj))) {
            return obj2;
        }
        obr.aK(!containsValue(obj2), "value already present: %s", obj2);
        Object objPut = this.a.put(obj, obj2);
        j(obj, zContainsKey, objPut, obj2);
        return objPut;
    }

    @Override // defpackage.ong, java.util.Map
    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // defpackage.ong, java.util.Map
    public final Object remove(Object obj) {
        if (containsKey(obj)) {
            return f(obj);
        }
        return null;
    }
}
