package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class old extends olk implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    public transient Map a;
    public transient int b;

    protected old(Map map) {
        obr.aF(map.isEmpty());
        this.a = map;
    }

    public abstract Collection a();

    @Override // defpackage.oqt
    public Collection b(Object obj) {
        Collection collectionA = (Collection) this.a.get(obj);
        if (collectionA == null) {
            collectionA = a();
        }
        return c(obj, collectionA);
    }

    public Collection c(Object obj, Collection collection) {
        throw null;
    }

    @Override // defpackage.oqt
    public final int e() {
        return this.b;
    }

    @Override // defpackage.olk
    public final Iterator f() {
        return new okp(this);
    }

    final List g(Object obj, List list, okz okzVar) {
        return list instanceof RandomAccess ? new okx(this, obj, list, okzVar) : new olb(this, obj, list, okzVar);
    }

    @Override // defpackage.olk
    public final Map h() {
        return new okt(this, this.a);
    }

    @Override // defpackage.olk
    public final Set i() {
        return new okw(this, this.a);
    }

    @Override // defpackage.oqt
    public final void j() {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.a.clear();
        this.b = 0;
    }

    final void k(Map map) {
        this.a = map;
        this.b = 0;
        for (Collection collection : map.values()) {
            obr.aF(!collection.isEmpty());
            this.b += collection.size();
        }
    }

    @Override // defpackage.olk, defpackage.oqt
    public final void l(Object obj, Object obj2) {
        Collection collection = (Collection) this.a.get(obj);
        if (collection != null) {
            if (collection.add(obj2)) {
                this.b++;
            }
        } else {
            Collection collectionA = a();
            if (!collectionA.add(obj2)) {
                throw new AssertionError("New Collection violated the Collection spec");
            }
            this.b++;
            this.a.put(obj, collectionA);
        }
    }
}
