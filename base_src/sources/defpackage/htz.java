package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class htz {
    public final hts a;
    public final lda b;

    public htz() {
    }

    public htz(hts htsVar, lda ldaVar) {
        if (htsVar == null) {
            throw new NullPointerException("Null settingsKey");
        }
        this.a = htsVar;
        this.b = ldaVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof htz) {
            htz htzVar = (htz) obj;
            if (this.a.equals(htzVar.a) && this.b.equals(htzVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 39 + String.valueOf(strValueOf2).length());
        sb.append("KeyAndProperty{settingsKey=");
        sb.append(strValueOf);
        sb.append(", property=");
        sb.append(strValueOf2);
        sb.append("}");
        return sb.toString();
    }
}
