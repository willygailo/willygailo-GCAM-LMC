package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class olu extends orh implements Serializable {
    private static final long serialVersionUID = 0;
    final oiu a;
    final orh b;

    public olu(oiu oiuVar, orh orhVar) {
        oiuVar.getClass();
        this.a = oiuVar;
        this.b = orhVar;
    }

    @Override // defpackage.orh, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.b.compare(this.a.a(obj), this.a.a(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof olu) {
            olu oluVar = (olu) obj;
            if (this.a.equals(oluVar.a) && this.b.equals(oluVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        String strValueOf2 = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 13 + String.valueOf(strValueOf2).length());
        sb.append(strValueOf);
        sb.append(".onResultOf(");
        sb.append(strValueOf2);
        sb.append(")");
        return sb.toString();
    }
}
