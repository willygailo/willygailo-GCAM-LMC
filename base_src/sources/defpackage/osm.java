package defpackage;

import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes2.dex */
public final class osm extends osr implements NavigableMap {
    private static final long serialVersionUID = 0;
    transient NavigableSet d;
    transient NavigableMap e;
    transient NavigableSet f;

    public osm(NavigableMap navigableMap, Object obj) {
        super(navigableMap, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.osr
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final NavigableMap c() {
        return (NavigableMap) super.c();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryJ;
        synchronized (this.h) {
            entryJ = oxh.j(a().ceilingEntry(obj), this.h);
        }
        return entryJ;
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        Object objCeilingKey;
        synchronized (this.h) {
            objCeilingKey = a().ceilingKey(obj);
        }
        return objCeilingKey;
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        synchronized (this.h) {
            NavigableSet navigableSet = this.d;
            if (navigableSet != null) {
                return navigableSet;
            }
            NavigableSet navigableSetL = oxh.l(a().descendingKeySet(), this.h);
            this.d = navigableSetL;
            return navigableSetL;
        }
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        synchronized (this.h) {
            NavigableMap navigableMap = this.e;
            if (navigableMap != null) {
                return navigableMap;
            }
            NavigableMap navigableMapK = oxh.k(a().descendingMap(), this.h);
            this.e = navigableMapK;
            return navigableMapK;
        }
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry entryJ;
        synchronized (this.h) {
            entryJ = oxh.j(a().firstEntry(), this.h);
        }
        return entryJ;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryJ;
        synchronized (this.h) {
            entryJ = oxh.j(a().floorEntry(obj), this.h);
        }
        return entryJ;
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        Object objFloorKey;
        synchronized (this.h) {
            objFloorKey = a().floorKey(obj);
        }
        return objFloorKey;
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        NavigableMap navigableMapK;
        synchronized (this.h) {
            navigableMapK = oxh.k(a().headMap(obj, z), this.h);
        }
        return navigableMapK;
    }

    @Override // defpackage.osr, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryJ;
        synchronized (this.h) {
            entryJ = oxh.j(a().higherEntry(obj), this.h);
        }
        return entryJ;
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        Object objHigherKey;
        synchronized (this.h) {
            objHigherKey = a().higherKey(obj);
        }
        return objHigherKey;
    }

    @Override // defpackage.osl, java.util.Map
    public final Set keySet() {
        return navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry entryJ;
        synchronized (this.h) {
            entryJ = oxh.j(a().lastEntry(), this.h);
        }
        return entryJ;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryJ;
        synchronized (this.h) {
            entryJ = oxh.j(a().lowerEntry(obj), this.h);
        }
        return entryJ;
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        Object objLowerKey;
        synchronized (this.h) {
            objLowerKey = a().lowerKey(obj);
        }
        return objLowerKey;
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        synchronized (this.h) {
            NavigableSet navigableSet = this.f;
            if (navigableSet != null) {
                return navigableSet;
            }
            NavigableSet navigableSetL = oxh.l(a().navigableKeySet(), this.h);
            this.f = navigableSetL;
            return navigableSetL;
        }
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        Map.Entry entryJ;
        synchronized (this.h) {
            entryJ = oxh.j(a().pollFirstEntry(), this.h);
        }
        return entryJ;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        Map.Entry entryJ;
        synchronized (this.h) {
            entryJ = oxh.j(a().pollLastEntry(), this.h);
        }
        return entryJ;
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        NavigableMap navigableMapK;
        synchronized (this.h) {
            navigableMapK = oxh.k(a().subMap(obj, z, obj2, z2), this.h);
        }
        return navigableMapK;
    }

    @Override // defpackage.osr, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        NavigableMap navigableMapK;
        synchronized (this.h) {
            navigableMapK = oxh.k(a().tailMap(obj, z), this.h);
        }
        return navigableMapK;
    }

    @Override // defpackage.osr, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
