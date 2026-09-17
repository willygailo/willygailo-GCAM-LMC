package defpackage;

import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class nme {
    private final ojc A;
    public final nmf a;
    public final nlf b;
    public final nmd c;
    public final ojc d;
    public final ojc e;
    public final ojc f;
    public final ojc g;
    public final ojc h;
    public final ojc i;
    private final Float j;
    private final oom k;
    private final ojc l;
    private final ojc m;
    private final ojc n;
    private final ojc o;
    private final ojc p;
    private final boolean q;
    private final ojc r;
    private final ojc s;
    private final ojc t;
    private final ojc u;
    private final ojc v;
    private final ojc w;
    private final ojc x;
    private final ojc y;
    private final ojc z;

    static {
        Collections.singleton(nlf.CONTACT);
    }

    public nme() {
    }

    public nme(nmf nmfVar, nlf nlfVar, nmd nmdVar, Float f, oom oomVar, ojc ojcVar, ojc ojcVar2, ojc ojcVar3, ojc ojcVar4, ojc ojcVar5, ojc ojcVar6, boolean z, ojc ojcVar7, ojc ojcVar8, ojc ojcVar9, ojc ojcVar10, ojc ojcVar11, ojc ojcVar12, ojc ojcVar13, ojc ojcVar14, ojc ojcVar15, ojc ojcVar16, ojc ojcVar17, ojc ojcVar18, ojc ojcVar19, ojc ojcVar20, ojc ojcVar21) {
        this.a = nmfVar;
        this.b = nlfVar;
        this.c = nmdVar;
        this.j = f;
        this.k = oomVar;
        if (ojcVar == null) {
            throw new NullPointerException("Null textImage");
        }
        this.l = ojcVar;
        if (ojcVar2 == null) {
            throw new NullPointerException("Null unstructuredText");
        }
        this.m = ojcVar2;
        if (ojcVar3 == null) {
            throw new NullPointerException("Null singleResultTextAnnotator");
        }
        this.n = ojcVar3;
        if (ojcVar4 == null) {
            throw new NullPointerException("Null barcode");
        }
        this.d = ojcVar4;
        if (ojcVar5 == null) {
            throw new NullPointerException("Null calendarBegin");
        }
        this.o = ojcVar5;
        if (ojcVar6 == null) {
            throw new NullPointerException("Null calendarEnd");
        }
        this.p = ojcVar6;
        this.q = z;
        if (ojcVar7 == null) {
            throw new NullPointerException("Null contact");
        }
        this.e = ojcVar7;
        if (ojcVar8 == null) {
            throw new NullPointerException("Null wifiNetwork");
        }
        this.f = ojcVar8;
        if (ojcVar9 == null) {
            throw new NullPointerException("Null linkedResults");
        }
        this.r = ojcVar9;
        if (ojcVar10 == null) {
            throw new NullPointerException("Null textOrientation");
        }
        this.s = ojcVar10;
        if (ojcVar11 == null) {
            throw new NullPointerException("Null frameInfo");
        }
        this.t = ojcVar11;
        if (ojcVar12 == null) {
            throw new NullPointerException("Null detectedDocument");
        }
        this.u = ojcVar12;
        if (ojcVar13 == null) {
            throw new NullPointerException("Null sceneClassification");
        }
        this.v = ojcVar13;
        if (ojcVar14 == null) {
            throw new NullPointerException("Null sceneClassificationScore");
        }
        this.w = ojcVar14;
        if (ojcVar15 == null) {
            throw new NullPointerException("Null sms");
        }
        this.g = ojcVar15;
        if (ojcVar16 == null) {
            throw new NullPointerException("Null calendarEvent");
        }
        this.h = ojcVar16;
        if (ojcVar17 == null) {
            throw new NullPointerException("Null geo");
        }
        this.i = ojcVar17;
        if (ojcVar18 == null) {
            throw new NullPointerException("Null detection");
        }
        this.x = ojcVar18;
        if (ojcVar19 == null) {
            throw new NullPointerException("Null shoppingInfo");
        }
        this.y = ojcVar19;
        if (ojcVar20 == null) {
            throw new NullPointerException("Null classifications");
        }
        this.z = ojcVar20;
        if (ojcVar21 == null) {
            throw new NullPointerException("Null language");
        }
        this.A = ojcVar21;
    }

    public static nmc a(nmf nmfVar, nlf nlfVar) {
        nmc nmcVarB = b();
        nmcVarB.h(nmfVar);
        nmcVarB.i(nlfVar);
        nmcVarB.g(nmd.PHOTO_OCR);
        nmcVarB.b = Float.valueOf(1.0f);
        return nmcVarB;
    }

    public static nmc b() {
        nmc nmcVar = new nmc(null);
        nmcVar.j(oom.l());
        nmcVar.d = false;
        nmcVar.g(nmd.NONE);
        return nmcVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nme) {
            nme nmeVar = (nme) obj;
            if (this.a.equals(nmeVar.a) && this.b.equals(nmeVar.b) && this.c.equals(nmeVar.c) && this.j.equals(nmeVar.j) && obr.an(this.k, nmeVar.k) && this.l.equals(nmeVar.l) && this.m.equals(nmeVar.m) && this.n.equals(nmeVar.n) && this.d.equals(nmeVar.d) && this.o.equals(nmeVar.o) && this.p.equals(nmeVar.p) && this.q == nmeVar.q && this.e.equals(nmeVar.e) && this.f.equals(nmeVar.f) && this.r.equals(nmeVar.r) && this.s.equals(nmeVar.s) && this.t.equals(nmeVar.t) && this.u.equals(nmeVar.u) && this.v.equals(nmeVar.v) && this.w.equals(nmeVar.w) && this.g.equals(nmeVar.g) && this.h.equals(nmeVar.h) && this.i.equals(nmeVar.i) && this.x.equals(nmeVar.x) && this.y.equals(nmeVar.y) && this.z.equals(nmeVar.z) && this.A.equals(nmeVar.A)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ (true != this.q ? 1237 : 1231)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.c);
        String strValueOf4 = String.valueOf(this.j);
        String strValueOf5 = String.valueOf(this.k);
        String strValueOf6 = String.valueOf(this.l);
        String strValueOf7 = String.valueOf(this.m);
        String strValueOf8 = String.valueOf(this.n);
        String strValueOf9 = String.valueOf(this.d);
        String strValueOf10 = String.valueOf(this.o);
        String strValueOf11 = String.valueOf(this.p);
        boolean z = this.q;
        String strValueOf12 = String.valueOf(this.e);
        String strValueOf13 = String.valueOf(this.f);
        String strValueOf14 = String.valueOf(this.r);
        String strValueOf15 = String.valueOf(this.s);
        String strValueOf16 = String.valueOf(this.t);
        String strValueOf17 = String.valueOf(this.u);
        String strValueOf18 = String.valueOf(this.v);
        String strValueOf19 = String.valueOf(this.w);
        String strValueOf20 = String.valueOf(this.g);
        String strValueOf21 = String.valueOf(this.h);
        String strValueOf22 = String.valueOf(this.i);
        String strValueOf23 = String.valueOf(this.x);
        String strValueOf24 = String.valueOf(this.y);
        String strValueOf25 = String.valueOf(this.z);
        String strValueOf26 = String.valueOf(this.A);
        int length = String.valueOf(strValueOf).length() + 418 + String.valueOf(strValueOf2).length() + String.valueOf(strValueOf3).length() + String.valueOf(strValueOf4).length() + String.valueOf(strValueOf5).length() + String.valueOf(strValueOf6).length() + String.valueOf(strValueOf7).length() + String.valueOf(strValueOf8).length() + String.valueOf(strValueOf9).length() + String.valueOf(strValueOf10).length() + String.valueOf(strValueOf11).length() + String.valueOf(strValueOf12).length() + String.valueOf(strValueOf13).length() + String.valueOf(strValueOf14).length() + String.valueOf(strValueOf15).length();
        int length2 = String.valueOf(strValueOf16).length();
        int length3 = String.valueOf(strValueOf17).length();
        int length4 = String.valueOf(strValueOf18).length();
        int length5 = String.valueOf(strValueOf19).length();
        int length6 = String.valueOf(strValueOf20).length();
        int length7 = String.valueOf(strValueOf21).length();
        int length8 = String.valueOf(strValueOf22).length();
        int length9 = String.valueOf(strValueOf23).length();
        int length10 = String.valueOf(strValueOf24).length();
        StringBuilder sb = new StringBuilder(length + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + String.valueOf(strValueOf25).length() + String.valueOf(strValueOf26).length());
        sb.append("SemanticResult{text=");
        sb.append(strValueOf);
        sb.append(", type=");
        sb.append(strValueOf2);
        sb.append(", engineType=");
        sb.append(strValueOf3);
        sb.append(", confidence=");
        sb.append(strValueOf4);
        sb.append(", boundingPolygons=");
        sb.append(strValueOf5);
        sb.append(", textImage=");
        sb.append(strValueOf6);
        sb.append(", unstructuredText=");
        sb.append(strValueOf7);
        sb.append(", singleResultTextAnnotator=");
        sb.append(strValueOf8);
        sb.append(", barcode=");
        sb.append(strValueOf9);
        sb.append(", calendarBegin=");
        sb.append(strValueOf10);
        sb.append(", calendarEnd=");
        sb.append(strValueOf11);
        sb.append(", hasStreetAddress=");
        sb.append(z);
        sb.append(", contact=");
        sb.append(strValueOf12);
        sb.append(", wifiNetwork=");
        sb.append(strValueOf13);
        sb.append(", linkedResults=");
        sb.append(strValueOf14);
        sb.append(", textOrientation=");
        sb.append(strValueOf15);
        sb.append(", frameInfo=");
        sb.append(strValueOf16);
        sb.append(", detectedDocument=");
        sb.append(strValueOf17);
        sb.append(", sceneClassification=");
        sb.append(strValueOf18);
        sb.append(", sceneClassificationScore=");
        sb.append(strValueOf19);
        sb.append(", sms=");
        sb.append(strValueOf20);
        sb.append(", calendarEvent=");
        sb.append(strValueOf21);
        sb.append(", geo=");
        sb.append(strValueOf22);
        sb.append(", detection=");
        sb.append(strValueOf23);
        sb.append(", shoppingInfo=");
        sb.append(strValueOf24);
        sb.append(", classifications=");
        sb.append(strValueOf25);
        sb.append(", language=");
        sb.append(strValueOf26);
        sb.append("}");
        return sb.toString();
    }
}
