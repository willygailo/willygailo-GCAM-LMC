package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class edf {
    private final ope a;
    private final ope b;
    private final ope c;
    private final ope d;
    private final ope e;
    private final ope f;
    private final ope g;
    private final ope h;
    private final ope i;
    private final ope j;
    private final ope k;
    private final ope l;
    private final ope m;
    private final ope n;

    public edf() {
    }

    public edf(ope opeVar, ope opeVar2, ope opeVar3, ope opeVar4, ope opeVar5, ope opeVar6, ope opeVar7, ope opeVar8, ope opeVar9, ope opeVar10, ope opeVar11, ope opeVar12, ope opeVar13, ope opeVar14) {
        this.a = opeVar;
        this.b = opeVar2;
        this.c = opeVar3;
        this.d = opeVar4;
        this.e = opeVar5;
        this.f = opeVar6;
        this.g = opeVar7;
        this.h = opeVar8;
        this.i = opeVar9;
        this.j = opeVar10;
        this.k = opeVar11;
        this.l = opeVar12;
        this.m = opeVar13;
        this.n = opeVar14;
    }

    public static ede o() {
        return new ede(null);
    }

    public final ojc a() {
        return ojc.h((ebn) mip.ei(ebn.class, this.b));
    }

    public final ojc b() {
        return ojc.h((ebp) mip.ei(ebp.class, this.f));
    }

    public final ojc c() {
        return ojc.h((ebs) mip.ei(ebs.class, this.l));
    }

    public final ojc d() {
        return ojc.h((ebt) mip.ei(ebt.class, this.m));
    }

    public final ojc e() {
        return ojc.h((ebu) mip.ei(ebu.class, this.h));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edf) {
            edf edfVar = (edf) obj;
            if (this.a.equals(edfVar.a) && this.b.equals(edfVar.b) && this.c.equals(edfVar.c) && this.d.equals(edfVar.d) && this.e.equals(edfVar.e) && this.f.equals(edfVar.f) && this.g.equals(edfVar.g) && this.h.equals(edfVar.h) && this.i.equals(edfVar.i) && this.j.equals(edfVar.j) && this.k.equals(edfVar.k) && this.l.equals(edfVar.l) && this.m.equals(edfVar.m) && this.n.equals(edfVar.n)) {
                return true;
            }
        }
        return false;
    }

    public final ojc f() {
        return ojc.h((ebq) mip.ei(ebq.class, this.e));
    }

    public final ojc g() {
        return ojc.h((ebo) mip.ei(ebo.class, this.c));
    }

    public final ojc h() {
        return ojc.h((ebz) mip.ei(ebz.class, this.d));
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode();
    }

    public final ojc i() {
        return ojc.h((ebv) mip.ei(ebv.class, this.a));
    }

    public final ojc j() {
        return ojc.h((ebw) mip.ei(ebw.class, this.g));
    }

    public final ojc k() {
        return ojc.h((ebx) mip.ei(ebx.class, this.j));
    }

    public final ojc l() {
        return ojc.h((ebq) mip.ei(ebq.class, this.k));
    }

    public final ojc m() {
        return ojc.h((eby) mip.ei(eby.class, this.n));
    }

    public final ojc n() {
        return ojc.h((ebz) mip.ei(ebz.class, this.i));
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.c);
        String strValueOf4 = String.valueOf(this.d);
        String strValueOf5 = String.valueOf(this.e);
        String strValueOf6 = String.valueOf(this.f);
        String strValueOf7 = String.valueOf(this.g);
        String strValueOf8 = String.valueOf(this.h);
        String strValueOf9 = String.valueOf(this.i);
        String strValueOf10 = String.valueOf(this.j);
        String strValueOf11 = String.valueOf(this.k);
        String strValueOf12 = String.valueOf(this.l);
        String strValueOf13 = String.valueOf(this.m);
        String strValueOf14 = String.valueOf(this.n);
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
        int length12 = String.valueOf(strValueOf12).length();
        StringBuilder sb = new StringBuilder(length + 291 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + String.valueOf(strValueOf13).length() + String.valueOf(strValueOf14).length());
        sb.append("ShotConfig{progressListeners=");
        sb.append(strValueOf);
        sb.append(", baseFrameListeners=");
        sb.append(strValueOf2);
        sb.append(", postViewRgbListeners=");
        sb.append(strValueOf3);
        sb.append(", postViewYuvListeners=");
        sb.append(strValueOf4);
        sb.append(", postViewHardwareBufferListeners=");
        sb.append(strValueOf5);
        sb.append(", dngListeners=");
        sb.append(strValueOf6);
        sb.append(", rawListeners=");
        sb.append(strValueOf7);
        sb.append(", pdListeners=");
        sb.append(strValueOf8);
        sb.append(", yuvListeners=");
        sb.append(strValueOf9);
        sb.append(", rgbListeners=");
        sb.append(strValueOf10);
        sb.append(", hardwareBufferListeners=");
        sb.append(strValueOf11);
        sb.append(", jpegListeners=");
        sb.append(strValueOf12);
        sb.append(", mutableRawListeners=");
        sb.append(strValueOf13);
        sb.append(", shotStatusListeners=");
        sb.append(strValueOf14);
        sb.append("}");
        return sb.toString();
    }
}
