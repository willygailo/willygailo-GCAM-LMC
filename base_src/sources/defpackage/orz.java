package defpackage;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class orz extends orh implements Serializable {
    static final orz a = new orz();
    private static final long serialVersionUID = 0;

    private orz() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.orh
    public final orh a() {
        return ore.a;
    }

    @Override // defpackage.orh, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    @Override // defpackage.orh
    public final /* bridge */ /* synthetic */ Object d(Iterator it) {
        return (Comparable) ore.a.g(it);
    }

    @Override // defpackage.orh
    public final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2) {
        return (Comparable) ore.a.h((Comparable) obj, (Comparable) obj2);
    }

    @Override // defpackage.orh
    public final /* bridge */ /* synthetic */ Object g(Iterator it) {
        return (Comparable) ore.a.d(it);
    }

    @Override // defpackage.orh
    public final /* bridge */ /* synthetic */ Object h(Object obj, Object obj2) {
        return (Comparable) ore.a.e((Comparable) obj, (Comparable) obj2);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
