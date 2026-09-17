package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public final class osd extends onm implements NavigableSet, Serializable {
    private static final long serialVersionUID = 0;
    private final NavigableSet a;
    private final SortedSet b;
    private transient osd c;

    public osd(NavigableSet navigableSet) {
        navigableSet.getClass();
        this.a = navigableSet;
        this.b = Collections.unmodifiableSortedSet(navigableSet);
    }

    @Override // defpackage.one, defpackage.onj
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ Object b() {
        return this.b;
    }

    @Override // defpackage.onl, defpackage.one
    protected final /* synthetic */ Collection b() {
        return this.b;
    }

    @Override // defpackage.onm, defpackage.onl
    /* JADX INFO: renamed from: c */
    protected final /* synthetic */ Set a() {
        return this.b;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return this.a.ceiling(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ohh.k(this.a.descendingIterator());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        osd osdVar = this.c;
        if (osdVar != null) {
            return osdVar;
        }
        osd osdVar2 = new osd(this.a.descendingSet());
        this.c = osdVar2;
        osdVar2.c = this;
        return osdVar2;
    }

    @Override // defpackage.onm
    protected final SortedSet e() {
        return this.b;
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return this.a.floor(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return obr.C(this.a.headSet(obj, z));
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return this.a.higher(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return this.a.lower(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return obr.C(this.a.subSet(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return obr.C(this.a.tailSet(obj, z));
    }
}
