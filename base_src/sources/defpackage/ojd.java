package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class ojd implements Serializable {
    private static final long serialVersionUID = 747826592375603043L;
    public final Object a;
    public final Object b;

    protected ojd(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public static ojd a(Object obj, Object obj2) {
        return new ojd(obj, obj2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ojd) {
            ojd ojdVar = (ojd) obj;
            if (obr.bc(this.a, ojdVar.a) && obr.bc(this.b, ojdVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return (iHashCode * 31) + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 4 + String.valueOf(strValueOf2).length());
        sb.append("(");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(strValueOf2);
        sb.append(")");
        return sb.toString();
    }
}
