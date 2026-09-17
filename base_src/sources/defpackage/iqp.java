package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class iqp {
    public final ldz a;
    public final leb b;
    public final cle c;
    public final ojc d;
    public final iqn e;
    public final lic f;
    public final String g;
    public final boolean h;
    public final hsq i;
    private final ojc j;
    private final long k;
    private final long l;
    private final long m;
    private final long n;

    public iqp() {
    }

    public iqp(ldz ldzVar, leb lebVar, ojc ojcVar, cle cleVar, ojc ojcVar2, iqn iqnVar, long j, long j2, long j3, long j4, lic licVar, String str, boolean z, hsq hsqVar) {
        this.a = ldzVar;
        this.b = lebVar;
        this.j = ojcVar;
        this.c = cleVar;
        this.d = ojcVar2;
        this.e = iqnVar;
        this.k = j;
        this.l = j2;
        this.m = j3;
        this.n = j4;
        this.f = licVar;
        this.g = str;
        this.h = z;
        this.i = hsqVar;
    }

    public static iqo a() {
        iqo iqoVar = new iqo(null);
        iqoVar.i(0L);
        iqoVar.h(0L);
        iqoVar.c(0L);
        iqoVar.d(0L);
        return iqoVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iqp) {
            iqp iqpVar = (iqp) obj;
            if (this.a.equals(iqpVar.a) && this.b.equals(iqpVar.b) && this.j.equals(iqpVar.j) && this.c.equals(iqpVar.c) && this.d.equals(iqpVar.d) && this.e.equals(iqpVar.e) && this.k == iqpVar.k && this.l == iqpVar.l && this.m == iqpVar.m && this.n == iqpVar.n && this.f.equals(iqpVar.f) && this.g.equals(iqpVar.g) && this.h == iqpVar.h && this.i.equals(iqpVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        int iHashCode2 = this.b.hashCode();
        int iHashCode3 = this.c.hashCode();
        int iHashCode4 = this.d.hashCode();
        int iHashCode5 = this.e.hashCode();
        long j = this.k;
        long j2 = this.l;
        long j3 = this.m;
        long j4 = this.n;
        return ((((((((((((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ 2040732332) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ this.i.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.j);
        String strValueOf4 = String.valueOf(this.c);
        String strValueOf5 = String.valueOf(this.d);
        String strValueOf6 = String.valueOf(this.e);
        long j = this.k;
        long j2 = this.l;
        long j3 = this.m;
        long j4 = this.n;
        String strValueOf7 = String.valueOf(this.f);
        String str = this.g;
        boolean z = this.h;
        String strValueOf8 = String.valueOf(this.i);
        int length = String.valueOf(strValueOf).length();
        int length2 = String.valueOf(strValueOf2).length();
        int length3 = String.valueOf(strValueOf3).length();
        int length4 = String.valueOf(strValueOf4).length();
        int length5 = String.valueOf(strValueOf5).length();
        int length6 = String.valueOf(strValueOf6).length();
        int length7 = String.valueOf(strValueOf7).length();
        StringBuilder sb = new StringBuilder(length + 324 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(str).length() + String.valueOf(strValueOf8).length());
        sb.append("TimelapseVideoFile{camcorderCaptureRate=");
        sb.append(strValueOf);
        sb.append(", camcorderVideoResolution=");
        sb.append(strValueOf2);
        sb.append(", videoFile=");
        sb.append(strValueOf3);
        sb.append(", outputVideo=");
        sb.append(strValueOf4);
        sb.append(", location=");
        sb.append(strValueOf5);
        sb.append(", timelapseMode=");
        sb.append(strValueOf6);
        sb.append(", recordingDurationMs=");
        sb.append(j);
        sb.append(", outputDurationMs=");
        sb.append(j2);
        sb.append(", frameCount=");
        sb.append(j3);
        sb.append(", frameDropped=");
        sb.append(j4);
        sb.append(", orientation=");
        sb.append(strValueOf7);
        sb.append(", title=");
        sb.append(str);
        sb.append(", isSecureVideo=");
        sb.append(z);
        sb.append(", shotInfo=");
        sb.append(strValueOf8);
        sb.append("}");
        return sb.toString();
    }
}
