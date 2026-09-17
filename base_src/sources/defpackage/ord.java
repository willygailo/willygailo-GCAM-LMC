package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class ord extends oni implements Serializable {
    private static final long serialVersionUID = 0;
    final oqw a;
    transient Set b;
    transient Set c;

    public ord(oqw oqwVar) {
        this.a = oqwVar;
    }

    @Override // defpackage.one, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.one, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.oni, defpackage.oqw
    public final int c(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.one, java.util.Collection, java.util.Set
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public Set d() {
        return Collections.unmodifiableSet(this.a.j());
    }

    @Override // defpackage.oni, defpackage.oqw
    public final void f(Object obj, int i) {
        throw null;
    }

    @Override // defpackage.oni, defpackage.oqw
    public final boolean h(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oni, defpackage.one
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public oqw b() {
        return this.a;
    }

    @Override // defpackage.one, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return ohh.k(this.a.iterator());
    }

    @Override // defpackage.oni, defpackage.oqw
    public Set j() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        Set setD = d();
        this.b = setD;
        return setD;
    }

    @Override // defpackage.oni, defpackage.oqw
    public final Set k() {
        Set set = this.c;
        if (set != null) {
            return set;
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(this.a.k());
        this.c = setUnmodifiableSet;
        return setUnmodifiableSet;
    }

    @Override // defpackage.one, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.one, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.one, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }
}
