package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
class osl extends oso implements Map {
    private static final long serialVersionUID = 0;
    transient Set a;
    transient Collection b;
    transient Set c;

    public osl(Map map, Object obj) {
        super(map, obj);
    }

    /* JADX INFO: renamed from: a */
    public Map c() {
        return (Map) this.g;
    }

    @Override // java.util.Map
    public final void clear() {
        synchronized (this.h) {
            c().clear();
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        boolean zContainsKey;
        synchronized (this.h) {
            zContainsKey = c().containsKey(obj);
        }
        return zContainsKey;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        boolean zContainsValue;
        synchronized (this.h) {
            zContainsValue = c().containsValue(obj);
        }
        return zContainsValue;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        Set set;
        synchronized (this.h) {
            if (this.c == null) {
                this.c = oxh.m(c().entrySet(), this.h);
            }
            set = this.c;
        }
        return set;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.h) {
            zEquals = c().equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        synchronized (this.h) {
            obj2 = c().get(obj);
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int iHashCode;
        synchronized (this.h) {
            iHashCode = c().hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.h) {
            zIsEmpty = c().isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Map
    public Set keySet() {
        Set set;
        synchronized (this.h) {
            if (this.a == null) {
                this.a = oxh.m(c().keySet(), this.h);
            }
            set = this.a;
        }
        return set;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        Object objPut;
        synchronized (this.h) {
            objPut = c().put(obj, obj2);
        }
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        synchronized (this.h) {
            c().putAll(map);
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        Object objRemove;
        synchronized (this.h) {
            objRemove = c().remove(obj);
        }
        return objRemove;
    }

    @Override // java.util.Map
    public final int size() {
        int size;
        synchronized (this.h) {
            size = c().size();
        }
        return size;
    }

    @Override // java.util.Map
    public final Collection values() {
        Collection collection;
        synchronized (this.h) {
            if (this.b == null) {
                this.b = new osj(c().values(), this.h);
            }
            collection = this.b;
        }
        return collection;
    }
}
