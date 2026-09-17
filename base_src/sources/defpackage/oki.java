package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class oki extends onl {
    final Set a;
    final /* synthetic */ okm b;

    public oki(okm okmVar) {
        this.b = okmVar;
        this.a = okmVar.a.entrySet();
    }

    @Override // defpackage.one, defpackage.onj
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ Object b() {
        return this.a;
    }

    @Override // defpackage.onl, defpackage.one
    protected final /* synthetic */ Collection b() {
        return this.a;
    }

    @Override // defpackage.onl
    /* JADX INFO: renamed from: c */
    protected final Set a() {
        return this.a;
    }

    @Override // defpackage.one, java.util.Collection, java.util.Set
    public final void clear() {
        this.b.clear();
    }

    @Override // defpackage.one, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set set = this.a;
        if (obj instanceof Map.Entry) {
            return set.contains(obr.af((Map.Entry) obj));
        }
        return false;
    }

    @Override // defpackage.one, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return ohh.Q(this, collection);
    }

    @Override // defpackage.one, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        okm okmVar = this.b;
        return new okg(okmVar, okmVar.a.entrySet().iterator());
    }

    @Override // defpackage.one, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!this.a.contains(obj) || !(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        this.b.b.a.remove(entry.getValue());
        this.a.remove(entry);
        return true;
    }

    @Override // defpackage.one, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        return d(collection);
    }

    @Override // defpackage.one, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        return t(collection);
    }

    @Override // defpackage.one, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return u();
    }

    @Override // defpackage.one, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return obr.O(this, objArr);
    }
}
