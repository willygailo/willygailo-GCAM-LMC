package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class neq {
    public final Context a;
    public final ojz b;

    public neq() {
    }

    public neq(Context context, ojz ojzVar) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        this.a = context;
        this.b = ojzVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof neq) {
            neq neqVar = (neq) obj;
            if (this.a.equals(neqVar.a)) {
                ojz ojzVar = this.b;
                ojz ojzVar2 = neqVar.b;
                if (ojzVar != null ? ojzVar.equals(ojzVar2) : ojzVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        ojz ojzVar = this.b;
        return iHashCode ^ (ojzVar == null ? 0 : ojzVar.hashCode());
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 46 + String.valueOf(strValueOf2).length());
        sb.append("FlagsContext{context=");
        sb.append(strValueOf);
        sb.append(", hermeticFileOverrides=");
        sb.append(strValueOf2);
        sb.append("}");
        return sb.toString();
    }
}
