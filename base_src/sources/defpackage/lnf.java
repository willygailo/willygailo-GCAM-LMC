package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lnf {
    public final lvs a;
    public final lnp b;
    public final lnt c;
    public final lnt d;
    public final lnt e;
    public final lnt f;
    public final oom g;
    public final ope h;
    public final llt i;
    public final lmo j;
    public final long k;
    public final int l;
    public final ope m;
    public final mip n;
    private final lnt o;

    public lnf() {
    }

    public lnf(lvs lvsVar, lnp lnpVar, lnt lntVar, lnt lntVar2, lnt lntVar3, lnt lntVar4, lnt lntVar5, mip mipVar, oom oomVar, ope opeVar, llt lltVar, lmo lmoVar, long j, int i, ope opeVar2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = lvsVar;
        this.b = lnpVar;
        this.c = lntVar;
        this.d = lntVar2;
        this.o = lntVar3;
        this.e = lntVar4;
        this.f = lntVar5;
        this.n = mipVar;
        this.g = oomVar;
        this.h = opeVar;
        this.i = lltVar;
        this.j = lmoVar;
        this.k = j;
        this.l = i;
        this.m = opeVar2;
    }

    public static lne a() {
        lne lneVar = new lne();
        lneVar.g(lnp.NORMAL);
        lneVar.j(new lnt(1));
        lneVar.a = new lnt(2);
        lneVar.b = new lnt(-1);
        lneVar.c = new lnt(1);
        lneVar.i(new lnt(5));
        lneVar.k(lnb.a);
        lneVar.e(new lno());
        lneVar.d = 3100010001000L;
        lneVar.e = 60;
        lneVar.h(orx.a);
        return lneVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lnf) {
            lnf lnfVar = (lnf) obj;
            if (this.a.equals(lnfVar.a) && this.b.equals(lnfVar.b) && this.c.equals(lnfVar.c) && this.d.equals(lnfVar.d) && this.o.equals(lnfVar.o) && this.e.equals(lnfVar.e) && this.f.equals(lnfVar.f) && this.n.equals(lnfVar.n) && obr.an(this.g, lnfVar.g) && this.h.equals(lnfVar.h) && this.i.equals(lnfVar.i) && this.j.equals(lnfVar.j) && this.k == lnfVar.k && this.l == lnfVar.l && this.m.equals(lnfVar.m)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a.b;
        int iHashCode = this.b.hashCode();
        int iHashCode2 = this.c.hashCode();
        int iHashCode3 = this.d.hashCode();
        int iHashCode4 = this.o.hashCode();
        int iHashCode5 = this.e.hashCode();
        int iHashCode6 = this.f.hashCode();
        int iHashCode7 = this.n.hashCode();
        int iHashCode8 = this.g.hashCode();
        int iHashCode9 = this.h.hashCode();
        int iHashCode10 = this.i.hashCode();
        int iHashCode11 = this.j.hashCode();
        long j = this.k;
        return ((((((((((((((((((((((((((((i ^ 1000003) * 1000003) ^ iHashCode) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ iHashCode7) * 1000003) ^ iHashCode8) * 1000003) ^ iHashCode9) * 1000003) ^ iHashCode10) * 1000003) ^ iHashCode11) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.l) * 1000003) ^ this.m.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.c);
        String strValueOf4 = String.valueOf(this.d);
        String strValueOf5 = String.valueOf(this.o);
        String strValueOf6 = String.valueOf(this.e);
        String strValueOf7 = String.valueOf(this.f);
        String strValueOf8 = String.valueOf(this.n);
        String strValueOf9 = String.valueOf(this.g);
        String strValueOf10 = String.valueOf(this.h);
        String strValueOf11 = String.valueOf(this.i);
        String strValueOf12 = String.valueOf(this.j);
        long j = this.k;
        int i = this.l;
        String strValueOf13 = String.valueOf(this.m);
        int length = String.valueOf(strValueOf).length();
        int length2 = String.valueOf(strValueOf2).length();
        int length3 = String.valueOf(strValueOf3).length();
        int length4 = String.valueOf(strValueOf4).length();
        int length5 = String.valueOf(strValueOf5).length();
        int length6 = String.valueOf(strValueOf6).length();
        int length7 = String.valueOf(strValueOf7).length();
        int length8 = String.valueOf(strValueOf8).length();
        int length9 = String.valueOf(strValueOf9).length();
        int length10 = String.valueOf(strValueOf10).length();
        int length11 = String.valueOf(strValueOf11).length();
        StringBuilder sb = new StringBuilder(length + 325 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + String.valueOf(strValueOf12).length() + String.valueOf(strValueOf13).length());
        sb.append("FrameServerConfig{cameraId=");
        sb.append(strValueOf);
        sb.append(", operatingMode=");
        sb.append(strValueOf2);
        sb.append(", template=");
        sb.append(strValueOf3);
        sb.append(", captureTemplate=");
        sb.append(strValueOf4);
        sb.append(", reprocessingTemplate=");
        sb.append(strValueOf5);
        sb.append(", repeatingTemplate=");
        sb.append(strValueOf6);
        sb.append(", repeatingCaptureTemplate=");
        sb.append(strValueOf7);
        sb.append(", frameListener=");
        sb.append(strValueOf8);
        sb.append(", streams=");
        sb.append(strValueOf9);
        sb.append(", sessionParameters=");
        sb.append(strValueOf10);
        sb.append(", fatalErrorHandler=");
        sb.append(strValueOf11);
        sb.append(", cameraDeviceErrorListener=");
        sb.append(strValueOf12);
        sb.append(", result3ATimeoutNs=");
        sb.append(j);
        sb.append(", result3ATimeoutFrameCount=");
        sb.append(i);
        sb.append(", quirks=");
        sb.append(strValueOf13);
        sb.append("}");
        return sb.toString();
    }
}
