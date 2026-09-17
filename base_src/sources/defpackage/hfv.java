package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class hfv {
    public final String a;
    public final String b;
    public final long c;
    public final msq d;

    public hfv() {
    }

    public hfv(msq msqVar, String str, String str2, long j, byte[] bArr) {
        this.d = msqVar;
        if (str == null) {
            throw new NullPointerException("Null xmpMetadataMain");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null xmpMetadataExtended");
        }
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hfv) {
            hfv hfvVar = (hfv) obj;
            if (this.d.equals(hfvVar.d) && this.a.equals(hfvVar.a) && this.b.equals(hfvVar.b) && this.c == hfvVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode();
        int iHashCode2 = this.a.hashCode();
        int iHashCode3 = this.b.hashCode();
        long j = this.c;
        return ((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.d);
        String str = this.a;
        String str2 = this.b;
        long j = this.c;
        int length = String.valueOf(strValueOf).length();
        StringBuilder sb = new StringBuilder(length + 87 + str.length() + str2.length());
        sb.append("UpsampledImage{image=");
        sb.append(strValueOf);
        sb.append(", xmpMetadataMain=");
        sb.append(str);
        sb.append(", xmpMetadataExtended=");
        sb.append(str2);
        sb.append(", id=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
