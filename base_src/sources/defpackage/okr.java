package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class okr extends oqn {
    final /* synthetic */ okt a;

    public okr(okt oktVar) {
        this.a = oktVar;
    }

    @Override // defpackage.oqn
    public final Map a() {
        return this.a;
    }

    @Override // defpackage.oqn, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return ohh.R(this.a.a.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new oks(this.a);
    }

    @Override // defpackage.oqn, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object objRemove;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        old oldVar = this.a.b;
        Object key = entry.getKey();
        Map map = oldVar.a;
        map.getClass();
        try {
            objRemove = map.remove(key);
        } catch (ClassCastException | NullPointerException e) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        collection.clear();
        oldVar.b -= size;
        return true;
    }
}
