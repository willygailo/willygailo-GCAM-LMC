package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class mbu {
    public final long a;
    public final long b;
    public final long c;
    private final long d;
    private final String e;
    private final String f;
    private final String g;

    public mbu() {
    }

    public mbu(long j, long j2, long j3, long j4, String str, String str2, String str3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = str;
        this.f = str2;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mbu) {
            mbu mbuVar = (mbu) obj;
            if (this.a == mbuVar.a && this.b == mbuVar.b && this.c == mbuVar.c && this.d == mbuVar.d && this.e.equals(mbuVar.e) && this.f.equals(mbuVar.f) && this.g.equals(mbuVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        long j4 = this.d;
        return this.g.hashCode() ^ ((((((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        long j4 = this.d;
        String str = this.e;
        String str2 = this.f;
        String str3 = this.g;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 203 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("TemporaryMediaFileInfo{groupTimestampNs=");
        sb.append(j);
        sb.append(", groupUtcTimestampMs=");
        sb.append(j2);
        sb.append(", timestampNs=");
        sb.append(j3);
        sb.append(", utcTimestampMs=");
        sb.append(j4);
        sb.append(", groupTag=");
        sb.append(str);
        sb.append(", tag=");
        sb.append(str2);
        sb.append(", extension=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }
}
