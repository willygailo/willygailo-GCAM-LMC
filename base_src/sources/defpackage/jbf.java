package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jbf {
    private final ojc a;
    private final int b;

    public jbf() {
    }

    public jbf(int i, ojc ojcVar) {
        this.b = i;
        this.a = ojcVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jbf) {
            jbf jbfVar = (jbf) obj;
            if (this.b == jbfVar.b && this.a.equals(jbfVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        String str;
        switch (this.b) {
            case 1:
                str = "CLOSED";
                break;
            case 2:
                str = "BOOK";
                break;
            default:
                str = "FLAT";
                break;
        }
        String strValueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(str.length() + 32 + String.valueOf(strValueOf).length());
        sb.append("FoldState{getType=");
        sb.append(str);
        sb.append(", foldBounds=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
