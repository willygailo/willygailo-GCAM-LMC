package defpackage;

import java.util.Comparator;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes2.dex */
public class osr extends osl implements SortedMap {
    private static final long serialVersionUID = 0;

    public osr(SortedMap sortedMap, Object obj) {
        super(sortedMap, obj);
    }

    @Override // defpackage.osl
    public SortedMap c() {
        return (SortedMap) super.c();
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        Comparator comparator;
        synchronized (this.h) {
            comparator = c().comparator();
        }
        return comparator;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        Object objFirstKey;
        synchronized (this.h) {
            objFirstKey = c().firstKey();
        }
        return objFirstKey;
    }

    public SortedMap headMap(Object obj) {
        SortedMap sortedMapN;
        synchronized (this.h) {
            sortedMapN = oxh.n(c().headMap(obj), this.h);
        }
        return sortedMapN;
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        Object objLastKey;
        synchronized (this.h) {
            objLastKey = c().lastKey();
        }
        return objLastKey;
    }

    public SortedMap subMap(Object obj, Object obj2) {
        SortedMap sortedMapN;
        synchronized (this.h) {
            sortedMapN = oxh.n(c().subMap(obj, obj2), this.h);
        }
        return sortedMapN;
    }

    public SortedMap tailMap(Object obj) {
        SortedMap sortedMapN;
        synchronized (this.h) {
            sortedMapN = oxh.n(c().tailMap(obj), this.h);
        }
        return sortedMapN;
    }
}
