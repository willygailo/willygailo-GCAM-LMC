package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ilv {
    public static final ilv a = a(-1, -1, 0, 0);
    public final long b;
    public final long c;
    private final long d;
    private final long e;

    public ilv() {
    }

    public ilv(long j, long j2, long j3, long j4) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
    }

    public static ilv a(long j, long j2, long j3, long j4) {
        return new ilv(j, j2, j3, j4);
    }

    public final boolean b() {
        return this.e < this.b;
    }

    public final boolean c() {
        return this.d < this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ilv) {
            ilv ilvVar = (ilv) obj;
            if (this.b == ilvVar.b && this.c == ilvVar.c && this.d == ilvVar.d && this.e == ilvVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.c;
        return ((int) this.e) ^ ((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) this.d)) * 1000003);
    }

    public final String toString() {
        long j = this.b;
        long j2 = this.c;
        long j3 = this.d;
        long j4 = this.e;
        StringBuilder sb = new StringBuilder(174);
        sb.append("SpaceAvailability{rawAvailableBytes=");
        sb.append(j);
        sb.append(", totalBytes=");
        sb.append(j2);
        sb.append(", videoThresholdBytes=");
        sb.append(j3);
        sb.append(", photoThresholdBytes=");
        sb.append(j4);
        sb.append("}");
        return sb.toString();
    }
}
