package defpackage;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public class oss extends osq implements SortedSet {
    private static final long serialVersionUID = 0;

    public oss(SortedSet sortedSet, Object obj) {
        super(sortedSet, obj);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        Comparator comparator;
        synchronized (this.h) {
            comparator = a().comparator();
        }
        return comparator;
    }

    @Override // defpackage.osq
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SortedSet d() {
        return (SortedSet) super.d();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Object objFirst;
        synchronized (this.h) {
            objFirst = a().first();
        }
        return objFirst;
    }

    public SortedSet headSet(Object obj) {
        SortedSet sortedSetO;
        synchronized (this.h) {
            sortedSetO = oxh.o(a().headSet(obj), this.h);
        }
        return sortedSetO;
    }

    @Override // java.util.SortedSet
    public final Object last() {
        Object objLast;
        synchronized (this.h) {
            objLast = a().last();
        }
        return objLast;
    }

    public SortedSet subSet(Object obj, Object obj2) {
        SortedSet sortedSetO;
        synchronized (this.h) {
            sortedSetO = oxh.o(a().subSet(obj, obj2), this.h);
        }
        return sortedSetO;
    }

    public SortedSet tailSet(Object obj) {
        SortedSet sortedSetO;
        synchronized (this.h) {
            sortedSetO = oxh.o(a().tailSet(obj), this.h);
        }
        return sortedSetO;
    }
}
