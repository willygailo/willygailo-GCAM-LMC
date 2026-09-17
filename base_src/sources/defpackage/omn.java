package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class omn extends omr {
    public static final omn a = new omn();
    private static final long serialVersionUID = 0;

    private omn() {
        super("");
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.omr
    /* JADX INFO: renamed from: a */
    public final int compareTo(omr omrVar) {
        return omrVar == this ? 0 : 1;
    }

    @Override // defpackage.omr
    public final Comparable b() {
        throw new IllegalStateException("range unbounded on this side");
    }

    @Override // defpackage.omr
    public final Comparable c(omw omwVar) {
        return omwVar.b();
    }

    @Override // defpackage.omr, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((omr) obj);
    }

    @Override // defpackage.omr
    public final Comparable d(omw omwVar) {
        throw new AssertionError();
    }

    @Override // defpackage.omr
    public final void e(StringBuilder sb) {
        throw new AssertionError();
    }

    @Override // defpackage.omr
    public final void f(StringBuilder sb) {
        sb.append("+∞)");
    }

    @Override // defpackage.omr
    public final boolean g(Comparable comparable) {
        return false;
    }

    @Override // defpackage.omr
    public final omr h(omw omwVar) {
        throw new AssertionError("this statement should be unreachable");
    }

    @Override // defpackage.omr
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // defpackage.omr
    public final omr i(omw omwVar) {
        throw new IllegalStateException();
    }

    public final String toString() {
        return "+∞";
    }
}
