package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nmf {
    public final String a;
    public final ojc b;

    public nmf() {
    }

    public nmf(String str, ojc ojcVar) {
        if (str == null) {
            throw new NullPointerException("Null actionText");
        }
        this.a = str;
        this.b = ojcVar;
    }

    public static nmf a(String str) {
        return new nmf(str, oih.a);
    }

    private static nmf d(String str, String str2) {
        if (true == str.equals(str2)) {
            str2 = null;
        }
        return new nmf(str, ojc.h(str2));
    }

    public final nmf b(String str) {
        str.getClass();
        return d(str, (String) this.b.f());
    }

    public final nmf c(String str) {
        return d(this.a, str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nmf) {
            nmf nmfVar = (nmf) obj;
            if (this.a.equals(nmfVar.a) && this.b.equals(nmfVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String strValueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(str.length() + 45 + String.valueOf(strValueOf).length());
        sb.append("SemanticResultText{actionText=");
        sb.append(str);
        sb.append(", displayText=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
