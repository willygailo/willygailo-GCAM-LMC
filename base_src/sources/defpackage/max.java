package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class max {
    public final mat a;
    public final long b;
    public final String c;
    public final mam d;
    public final ope e;
    public final ope f;
    public final ope g;
    public final oom h;
    public final mcc i;
    public final int j;
    private final long k;

    public max() {
    }

    public max(mat matVar, long j, long j2, String str, mam mamVar, ope opeVar, ope opeVar2, ope opeVar3, int i, oom oomVar, mcc mccVar) {
        this.a = matVar;
        this.k = j;
        this.b = j2;
        this.c = str;
        this.d = mamVar;
        this.e = opeVar;
        this.f = opeVar2;
        this.g = opeVar3;
        this.j = i;
        this.h = oomVar;
        this.i = mccVar;
    }

    public final boolean equals(Object obj) {
        mam mamVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof max)) {
            return false;
        }
        max maxVar = (max) obj;
        if (this.a.equals(maxVar.a) && this.k == maxVar.k && this.b == maxVar.b && this.c.equals(maxVar.c) && ((mamVar = this.d) != null ? mamVar.equals(maxVar.d) : maxVar.d == null) && this.e.equals(maxVar.e) && this.f.equals(maxVar.f) && this.g.equals(maxVar.g)) {
            int i = this.j;
            int i2 = maxVar.j;
            if (i == 0) {
                throw null;
            }
            if (i == i2 && obr.an(this.h, maxVar.h) && this.i.equals(maxVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        long j = this.k;
        long j2 = this.b;
        int iHashCode2 = (((((((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        mam mamVar = this.d;
        int iHashCode3 = (((((((iHashCode2 ^ (mamVar == null ? 0 : mamVar.hashCode())) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003;
        int i = this.j;
        if (i != 0) {
            return ((((iHashCode3 ^ i) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
        }
        throw null;
    }

    public final String toString() {
        String str;
        String strValueOf = String.valueOf(this.a);
        long j = this.k;
        long j2 = this.b;
        String str2 = this.c;
        String strValueOf2 = String.valueOf(this.d);
        String strValueOf3 = String.valueOf(this.e);
        String strValueOf4 = String.valueOf(this.f);
        String strValueOf5 = String.valueOf(this.g);
        switch (this.j) {
            case 1:
                str = "NONE";
                break;
            case 2:
                str = "PUBLISH";
                break;
            case 3:
                str = "ABANDON";
                break;
            default:
                str = "null";
                break;
        }
        String strValueOf6 = String.valueOf(this.h);
        String strValueOf7 = String.valueOf(this.i);
        int length = String.valueOf(strValueOf).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(strValueOf2).length();
        int length4 = String.valueOf(strValueOf3).length();
        int length5 = String.valueOf(strValueOf4).length();
        int length6 = String.valueOf(strValueOf5).length();
        int length7 = str.length();
        StringBuilder sb = new StringBuilder(length + 212 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(strValueOf6).length() + String.valueOf(strValueOf7).length());
        sb.append("MediaGroupInfo{mediaGroupId=");
        sb.append(strValueOf);
        sb.append(", timestampNs=");
        sb.append(j);
        sb.append(", utcTimestampMs=");
        sb.append(j2);
        sb.append(", tag=");
        sb.append(str2);
        sb.append(", primary=");
        sb.append(strValueOf2);
        sb.append(", mediaFiles=");
        sb.append(strValueOf3);
        sb.append(", privateMediaFiles=");
        sb.append(strValueOf4);
        sb.append(", cachedFiles=");
        sb.append(strValueOf5);
        sb.append(", publishIntent=");
        sb.append(str);
        sb.append(", listeners=");
        sb.append(strValueOf6);
        sb.append(", contentResolverApi=");
        sb.append(strValueOf7);
        sb.append("}");
        return sb.toString();
    }
}
