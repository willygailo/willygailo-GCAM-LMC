package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class ore extends orh implements Serializable {
    public static final ore a = new ore();
    private static final long serialVersionUID = 0;

    private ore() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.orh
    public final orh a() {
        return orz.a;
    }

    @Override // defpackage.orh, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
