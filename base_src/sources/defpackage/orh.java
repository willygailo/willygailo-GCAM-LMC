package defpackage;

import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class orh implements Comparator {
    protected orh() {
    }

    public static orh b(Comparator comparator) {
        return comparator instanceof orh ? (orh) comparator : new omi(comparator);
    }

    public orh a() {
        return new osa(this);
    }

    public final orh c(oiu oiuVar) {
        return new olu(oiuVar, this);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public Object d(Iterator it) {
        Object next = it.next();
        while (it.hasNext()) {
            next = e(next, it.next());
        }
        return next;
    }

    public Object e(Object obj, Object obj2) {
        return compare(obj, obj2) >= 0 ? obj : obj2;
    }

    public final Object f(Iterable iterable) {
        return g(iterable.iterator());
    }

    public Object g(Iterator it) {
        Object next = it.next();
        while (it.hasNext()) {
            next = h(next, it.next());
        }
        return next;
    }

    public Object h(Object obj, Object obj2) {
        return compare(obj, obj2) <= 0 ? obj : obj2;
    }
}
