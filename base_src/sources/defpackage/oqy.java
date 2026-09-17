package defpackage;

/* JADX INFO: loaded from: classes2.dex */
abstract class oqy implements oqv {
    public final boolean equals(Object obj) {
        if (obj instanceof oqv) {
            oqv oqvVar = (oqv) obj;
            if (a() == oqvVar.a() && obr.bc(b(), oqvVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object objB = b();
        return (objB == null ? 0 : objB.hashCode()) ^ a();
    }

    @Override // defpackage.oqv
    public final String toString() {
        String strValueOf = String.valueOf(b());
        int iA = a();
        if (iA == 1) {
            return strValueOf;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 14);
        sb.append(strValueOf);
        sb.append(" x ");
        sb.append(iA);
        return sb.toString();
    }
}
