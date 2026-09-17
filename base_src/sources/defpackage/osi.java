package defpackage;

import java.util.Iterator;
import java.util.NavigableSet;

/* JADX INFO: loaded from: classes2.dex */
final class osi extends osh implements NavigableSet {
    public osi(osg osgVar) {
        super(osgVar);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return oxh.p(this.a.s(obj, 2).g());
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new osi(this.a.o());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return oxh.p(this.a.gE(obj, 2).l());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new osi(this.a.gE(obj, ohh.V(z)));
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return oxh.p(this.a.s(obj, 1).g());
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return oxh.p(this.a.gE(obj, 1).l());
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return oxh.p(this.a.m());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return oxh.p(this.a.n());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new osi(this.a.r(obj, ohh.V(z), obj2, ohh.V(z2)));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new osi(this.a.s(obj, ohh.V(z)));
    }
}
