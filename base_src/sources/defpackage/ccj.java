package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ccj {
    public final String a;
    public final String b;

    public ccj() {
    }

    public ccj(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static ccj a(String str, String str2) {
        return new ccj(str, str2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ccj) {
            ccj ccjVar = (ccj) obj;
            if (this.a.equals(ccjVar.a) && this.b.equals(ccjVar.b)) {
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
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 44 + str2.length());
        sb.append("ExampleStoreColumn{columnName=");
        sb.append(str);
        sb.append(", columnType=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
