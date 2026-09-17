package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class ckv {
    public final llz a;
    public final File b;
    public final hsc c;
    public final hsg d;
    public final lig e;
    public final long f;
    public final int g;
    public final hsq h;
    private final ojc i;
    private final mbs j;
    private final int k;
    private final long l;

    public ckv() {
    }

    public ckv(llz llzVar, File file, hsc hscVar, hsg hsgVar, ojc ojcVar, mbs mbsVar, lig ligVar, int i, long j, long j2, int i2, hsq hsqVar) {
        this.a = llzVar;
        this.b = file;
        this.c = hscVar;
        this.d = hsgVar;
        this.i = ojcVar;
        this.j = mbsVar;
        this.e = ligVar;
        this.k = i;
        this.l = j;
        this.f = j2;
        this.g = i2;
        this.h = hsqVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ckv) {
            ckv ckvVar = (ckv) obj;
            if (this.a.equals(ckvVar.a) && this.b.equals(ckvVar.b) && this.c.equals(ckvVar.c) && this.d.equals(ckvVar.d) && this.i.equals(ckvVar.i) && this.j.equals(ckvVar.j) && this.e.equals(ckvVar.e) && this.k == ckvVar.k && this.l == ckvVar.l && this.f == ckvVar.f && this.g == ckvVar.g && this.h.equals(ckvVar.h)) {
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
        int iHashCode5 = this.i.hashCode();
        int iHashCode6 = this.j.hashCode();
        int iHashCode7 = this.e.hashCode();
        int i = this.k;
        long j = this.l;
        long j2 = this.f;
        return ((((((((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ iHashCode7) * 1000003) ^ i) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.c);
        String strValueOf4 = String.valueOf(this.d);
        String strValueOf5 = String.valueOf(this.i);
        String strValueOf6 = String.valueOf(this.j);
        String strValueOf7 = String.valueOf(this.e);
        int i = this.k;
        long j = this.l;
        long j2 = this.f;
        int i2 = this.g;
        String strValueOf8 = String.valueOf(this.h);
        int length = String.valueOf(strValueOf).length();
        int length2 = String.valueOf(strValueOf2).length();
        int length3 = String.valueOf(strValueOf3).length();
        int length4 = String.valueOf(strValueOf4).length();
        int length5 = String.valueOf(strValueOf5).length();
        int length6 = String.valueOf(strValueOf6).length();
        StringBuilder sb = new StringBuilder(length + 244 + length2 + length3 + length4 + length5 + length6 + String.valueOf(strValueOf7).length() + String.valueOf(strValueOf8).length());
        sb.append("CamcorderSnapshot{exifInfo=");
        sb.append(strValueOf);
        sb.append(", filePath=");
        sb.append(strValueOf2);
        sb.append(", gcaMediaFile=");
        sb.append(strValueOf3);
        sb.append(", gcaMediaGroup=");
        sb.append(strValueOf4);
        sb.append(", location=");
        sb.append(strValueOf5);
        sb.append(", mimeType=");
        sb.append(strValueOf6);
        sb.append(", size=");
        sb.append(strValueOf7);
        sb.append(", orientation=");
        sb.append(i);
        sb.append(", takenTime=");
        sb.append(j);
        sb.append(", requestProcessingTimeMilliseconds=");
        sb.append(j2);
        sb.append(", retries=");
        sb.append(i2);
        sb.append(", shotInfo=");
        sb.append(strValueOf8);
        sb.append("}");
        return sb.toString();
    }
}
