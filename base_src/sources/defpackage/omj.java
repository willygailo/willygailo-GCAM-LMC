package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class omj extends oml {
    @Override // defpackage.oml
    public final int a() {
        return 0;
    }

    @Override // defpackage.oml
    public final oml b(Comparable comparable, Comparable comparable2) {
        int iCompareTo = comparable.compareTo(comparable2);
        if (iCompareTo < 0) {
            return oml.c;
        }
        return iCompareTo > 0 ? oml.d : oml.b;
    }
}
