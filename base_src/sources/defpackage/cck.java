package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cck {
    public final String a;
    public final oom b;
    public final cbr c;

    public cck() {
    }

    public cck(String str, oom oomVar, cbr cbrVar) {
        this.a = str;
        this.b = oomVar;
        if (cbrVar == null) {
            throw new NullPointerException("Null converter");
        }
        this.c = cbrVar;
    }

    public static cck a(String str, oom oomVar, cbr cbrVar) {
        return new cck(str, oomVar, cbrVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cck) {
            cck cckVar = (cck) obj;
            if (this.a.equals(cckVar.a) && obr.an(this.b, cckVar.b) && this.c.equals(cckVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String strValueOf = String.valueOf(this.b);
        String strValueOf2 = String.valueOf(this.c);
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 57 + String.valueOf(strValueOf).length() + String.valueOf(strValueOf2).length());
        sb.append("ExampleStoreTable{tableName=");
        sb.append(str);
        sb.append(", customColumns=");
        sb.append(strValueOf);
        sb.append(", converter=");
        sb.append(strValueOf2);
        sb.append("}");
        return sb.toString();
    }
}
