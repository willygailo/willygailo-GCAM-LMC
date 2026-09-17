package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hgk {
    public final ojc a;
    public final ojc b;
    public final ojc c;

    public hgk() {
    }

    public hgk(ojc ojcVar, ojc ojcVar2, ojc ojcVar3) {
        this.a = ojcVar;
        this.b = ojcVar2;
        this.c = ojcVar3;
    }

    public static hgj a() {
        return new hgj(null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hgk) {
            hgk hgkVar = (hgk) obj;
            if (this.a.equals(hgkVar.a) && this.b.equals(hgkVar.b) && this.c.equals(hgkVar.c)) {
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
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.c);
        int length = String.valueOf(strValueOf).length();
        StringBuilder sb = new StringBuilder(length + 59 + String.valueOf(strValueOf2).length() + String.valueOf(strValueOf3).length());
        sb.append("PortraitJpegMetadata{main=");
        sb.append(strValueOf);
        sb.append(", extended=");
        sb.append(strValueOf2);
        sb.append(", dynamicDepthResult=");
        sb.append(strValueOf3);
        sb.append("}");
        return sb.toString();
    }
}
