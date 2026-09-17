package defpackage;

import android.content.Context;
import java.text.DateFormat;

/* JADX INFO: loaded from: classes2.dex */
public final class mbj {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final DateFormat j;
    public final Context k;
    public final String l;
    public final String m;
    public final String n;
    public final mcc o;
    public final boolean p;
    public final long q;
    public final long r;
    private final oor s;

    public mbj() {
    }

    public mbj(String str, String str2, String str3, String str4, String str5, String str6, int i, boolean z, boolean z2, DateFormat dateFormat, oor oorVar, Context context, String str7, String str8, String str9, mcc mccVar, boolean z3, long j, long j2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = i;
        this.h = z;
        this.i = z2;
        this.j = dateFormat;
        this.s = oorVar;
        this.k = context;
        this.l = str7;
        this.m = str8;
        this.n = str9;
        this.o = mccVar;
        this.p = z3;
        this.q = j;
        this.r = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mbj) {
            mbj mbjVar = (mbj) obj;
            if (this.a.equals(mbjVar.a) && this.b.equals(mbjVar.b) && this.c.equals(mbjVar.c) && this.d.equals(mbjVar.d) && this.e.equals(mbjVar.e) && this.f.equals(mbjVar.f) && this.g == mbjVar.g && this.h == mbjVar.h && this.i == mbjVar.i && this.j.equals(mbjVar.j) && this.s.equals(mbjVar.s) && this.k.equals(mbjVar.k) && this.l.equals(mbjVar.l) && this.m.equals(mbjVar.m) && this.n.equals(mbjVar.n) && this.o.equals(mbjVar.o) && this.p == mbjVar.p && this.q == mbjVar.q && this.r == mbjVar.r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.s.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003;
        int i = true == this.p ? 1231 : 1237;
        long j = this.q;
        long j2 = this.r;
        return ((((iHashCode ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        String str5 = this.e;
        String str6 = this.f;
        int i = this.g;
        boolean z = this.h;
        boolean z2 = this.i;
        String strValueOf = String.valueOf(this.j);
        String strValueOf2 = String.valueOf(this.s);
        String strValueOf3 = String.valueOf(this.k);
        String str7 = this.l;
        String str8 = this.m;
        String str9 = this.n;
        String strValueOf4 = String.valueOf(this.o);
        boolean z3 = this.p;
        long j = this.q;
        long j2 = this.r;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(str4).length();
        int length5 = String.valueOf(str5).length();
        int length6 = String.valueOf(str6).length();
        int length7 = String.valueOf(strValueOf).length();
        int length8 = String.valueOf(strValueOf2).length();
        int length9 = String.valueOf(strValueOf3).length();
        int length10 = String.valueOf(str7).length();
        int length11 = String.valueOf(str8).length();
        StringBuilder sb = new StringBuilder(length + 530 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + String.valueOf(str9).length() + String.valueOf(strValueOf4).length());
        sb.append("Config{filenameDefaultPrefix=");
        sb.append(str);
        sb.append(", filenameImagePrefix=");
        sb.append(str2);
        sb.append(", filenameVideoPrefix=");
        sb.append(str3);
        sb.append(", filenameTmpPrefix=");
        sb.append(str4);
        sb.append(", filenameBurstTagPrefix=");
        sb.append(str5);
        sb.append(", filenameBurstPrimaryTag=");
        sb.append(str6);
        sb.append(", filenameBurstDigitCount=");
        sb.append(i);
        sb.append(", filenameBurstTagRequired=");
        sb.append(z);
        sb.append(", filenameBurstUseGroupTag=");
        sb.append(z2);
        sb.append(", filenameGroupFormat=");
        sb.append(strValueOf);
        sb.append(", filenameMimeTypeGroupPrefix=");
        sb.append(strValueOf2);
        sb.append(", storageContext=");
        sb.append(strValueOf3);
        sb.append(", storageCacheSubpath=");
        sb.append(str7);
        sb.append(", storageDataSubpath=");
        sb.append(str8);
        sb.append(", storageDcimSubpath=");
        sb.append(str9);
        sb.append(", defaultContentResolverApi=");
        sb.append(strValueOf4);
        sb.append(", notifyChangeOnPublish=");
        sb.append(z3);
        sb.append(", notifyChangeTimeoutMs=");
        sb.append(j);
        sb.append(", storageAutoPublishTimeoutMs=");
        sb.append(j2);
        sb.append("}");
        return sb.toString();
    }
}
