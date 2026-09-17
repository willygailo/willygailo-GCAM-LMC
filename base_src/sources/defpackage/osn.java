package defpackage;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public final class osn extends oss implements NavigableSet {
    private static final long serialVersionUID = 0;
    transient NavigableSet a;

    public osn(NavigableSet navigableSet, Object obj) {
        super(navigableSet, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.oss
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final NavigableSet a() {
        return (NavigableSet) super.a();
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        Object objCeiling;
        synchronized (this.h) {
            objCeiling = a().ceiling(obj);
        }
        return objCeiling;
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return a().descendingIterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        synchronized (this.h) {
            NavigableSet navigableSet = this.a;
            if (navigableSet != null) {
                return navigableSet;
            }
            NavigableSet navigableSetL = oxh.l(a().descendingSet(), this.h);
            this.a = navigableSetL;
            return navigableSetL;
        }
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        Object objFloor;
        synchronized (this.h) {
            objFloor = a().floor(obj);
        }
        return objFloor;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        NavigableSet navigableSetL;
        synchronized (this.h) {
            navigableSetL = oxh.l(a().headSet(obj, z), this.h);
        }
        return navigableSetL;
    }

    @Override // defpackage.oss, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        Object objHigher;
        synchronized (this.h) {
            objHigher = a().higher(obj);
        }
        return objHigher;
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        Object objLower;
        synchronized (this.h) {
            objLower = a().lower(obj);
        }
        return objLower;
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        Object objPollFirst;
        synchronized (this.h) {
            objPollFirst = a().pollFirst();
        }
        return objPollFirst;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Object objPollLast;
        synchronized (this.h) {
            objPollLast = a().pollLast();
        }
        return objPollLast;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        NavigableSet navigableSetL;
        synchronized (this.h) {
            navigableSetL = oxh.l(a().subSet(obj, z, obj2, z2), this.h);
        }
        return navigableSetL;
    }

    @Override // defpackage.oss, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        NavigableSet navigableSetL;
        synchronized (this.h) {
            navigableSetL = oxh.l(a().tailSet(obj, z), this.h);
        }
        return navigableSetL;
    }

    @Override // defpackage.oss, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
