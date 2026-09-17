package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class omv extends omw implements Serializable {
    public static final omv a = new omv();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.omw
    public final /* bridge */ /* synthetic */ long a(Comparable comparable, Comparable comparable2) {
        return ((long) ((Integer) comparable2).intValue()) - ((long) ((Integer) comparable).intValue());
    }

    @Override // defpackage.omw
    public final /* bridge */ /* synthetic */ Comparable b() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.omw
    public final /* bridge */ /* synthetic */ Comparable c() {
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.omw
    public final /* bridge */ /* synthetic */ Comparable d(Comparable comparable) {
        int iIntValue = ((Integer) comparable).intValue();
        if (iIntValue == Integer.MAX_VALUE) {
            return null;
        }
        return Integer.valueOf(iIntValue + 1);
    }

    @Override // defpackage.omw
    public final /* bridge */ /* synthetic */ Comparable e(Comparable comparable, long j) {
        Integer num = (Integer) comparable;
        if (j >= 0) {
            return Integer.valueOf(oxh.A(num.longValue() + j));
        }
        StringBuilder sb = new StringBuilder(57);
        sb.append("distance cannot be negative but was: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.omw
    public final /* bridge */ /* synthetic */ Comparable f(Comparable comparable) {
        int iIntValue = ((Integer) comparable).intValue();
        if (iIntValue == Integer.MIN_VALUE) {
            return null;
        }
        return Integer.valueOf(iIntValue - 1);
    }

    public final String toString() {
        return "DiscreteDomain.integers()";
    }
}
