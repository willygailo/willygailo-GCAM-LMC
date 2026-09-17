package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class epv {
    public final esn a;
    public final String b;
    public final iuu c;

    public epv() {
    }

    public epv(esn esnVar, String str, iuu iuuVar) {
        if (esnVar == null) {
            throw new NullPointerException("Null option");
        }
        this.a = esnVar;
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.b = str;
        this.c = iuuVar;
    }

    static epv a(esn esnVar, String str, iuu iuuVar) {
        return new epv(esnVar, str, iuuVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof epv) {
            epv epvVar = (epv) obj;
            if (this.a.equals(epvVar.a) && this.b.equals(epvVar.b) && this.c.equals(epvVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String str = this.b;
        String strValueOf2 = String.valueOf(this.c);
        int length = String.valueOf(strValueOf).length();
        StringBuilder sb = new StringBuilder(length + 34 + str.length() + String.valueOf(strValueOf2).length());
        sb.append("Data{option=");
        sb.append(strValueOf);
        sb.append(", title=");
        sb.append(str);
        sb.append(", subModeTab=");
        sb.append(strValueOf2);
        sb.append("}");
        return sb.toString();
    }
}
