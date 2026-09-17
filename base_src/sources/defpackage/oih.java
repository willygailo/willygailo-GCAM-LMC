package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oih extends ojc {
    public static final oih a = new oih();
    private static final long serialVersionUID = 0;

    private oih() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.ojc
    public final ojc a(ojc ojcVar) {
        return ojcVar;
    }

    @Override // defpackage.ojc
    public final ojc b(oiu oiuVar) {
        oiuVar.getClass();
        return a;
    }

    @Override // defpackage.ojc
    public final Object c() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // defpackage.ojc
    public final Object d(ojz ojzVar) {
        return ojzVar.a();
    }

    @Override // defpackage.ojc
    public final Object e(Object obj) {
        obj.getClass();
        return obj;
    }

    @Override // defpackage.ojc
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // defpackage.ojc
    public final Object f() {
        return null;
    }

    @Override // defpackage.ojc
    public final boolean g() {
        return false;
    }

    @Override // defpackage.ojc
    public final int hashCode() {
        return 2040732332;
    }

    @Override // defpackage.ojc
    public final String toString() {
        return "Optional.absent()";
    }
}
