package defpackage;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class fkb {
    public final boolean a;
    public final float b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final float f;
    public final Boolean g;
    public final Rect h;
    public final Boolean i;
    public final Boolean j;
    public final pba k;
    public final ojc l;
    public final pbt m;
    public final boolean n;
    public final int o;
    public final int p;
    private final String q;

    public fkb() {
    }

    public fkb(int i, String str, boolean z, float f, String str2, boolean z2, boolean z3, float f2, Boolean bool, Rect rect, Boolean bool2, Boolean bool3, int i2, pba pbaVar, ojc ojcVar, pbt pbtVar, boolean z4) {
        this.o = i;
        this.q = str;
        this.a = z;
        this.b = f;
        this.c = str2;
        this.d = z2;
        this.e = z3;
        this.f = f2;
        this.g = bool;
        this.h = rect;
        this.i = bool2;
        this.j = bool3;
        this.p = i2;
        this.k = pbaVar;
        this.l = ojcVar;
        this.m = pbtVar;
        this.n = z4;
    }

    public static fka a() {
        fka fkaVar = new fka(null);
        fkaVar.d = 1;
        fkaVar.c(pba.h);
        fkaVar.b = oih.a;
        fkaVar.f(pbt.d);
        return fkaVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fkb)) {
            return false;
        }
        fkb fkbVar = (fkb) obj;
        int i = this.o;
        int i2 = fkbVar.o;
        if (i == 0) {
            throw null;
        }
        if (i == i2 && this.q.equals(fkbVar.q) && this.a == fkbVar.a && Float.floatToIntBits(this.b) == Float.floatToIntBits(fkbVar.b) && this.c.equals(fkbVar.c) && this.d == fkbVar.d && this.e == fkbVar.e && Float.floatToIntBits(this.f) == Float.floatToIntBits(fkbVar.f) && this.g.equals(fkbVar.g) && this.h.equals(fkbVar.h) && this.i.equals(fkbVar.i) && this.j.equals(fkbVar.j)) {
            int i3 = this.p;
            int i4 = fkbVar.p;
            if (i3 == 0) {
                throw null;
            }
            if (i3 == i4 && this.k.equals(fkbVar.k) && this.l.equals(fkbVar.l) && this.m.equals(fkbVar.m) && this.n == fkbVar.n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.o;
        if (i == 0) {
            throw null;
        }
        int iHashCode = (((((((((((((((((((((((i ^ 1000003) * 1000003) ^ this.q.hashCode()) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.f)) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        int i2 = this.p;
        if (i2 == 0) {
            throw null;
        }
        int i3 = (iHashCode ^ i2) * 1000003;
        pba pbaVar = this.k;
        int iB = pbaVar.aD;
        if (iB == 0) {
            iB = pqu.a.b(pbaVar).b(pbaVar);
            pbaVar.aD = iB;
        }
        int iHashCode2 = (((i3 ^ iB) * 1000003) ^ this.l.hashCode()) * 1000003;
        pbt pbtVar = this.m;
        int iB2 = pbtVar.aD;
        if (iB2 == 0) {
            iB2 = pqu.a.b(pbtVar).b(pbtVar);
            pbtVar.aD = iB2;
        }
        return ((iHashCode2 ^ iB2) * 1000003) ^ (true == this.n ? 1231 : 1237);
    }

    public final String toString() {
        int i = this.o;
        String string = i != 0 ? Integer.toString(i - 1) : "null";
        String str = this.q;
        boolean z = this.a;
        float f = this.b;
        String str2 = this.c;
        boolean z2 = this.d;
        boolean z3 = this.e;
        float f2 = this.f;
        String strValueOf = String.valueOf(this.g);
        String strValueOf2 = String.valueOf(this.h);
        String strValueOf3 = String.valueOf(this.i);
        String strValueOf4 = String.valueOf(this.j);
        int i2 = this.p;
        String string2 = i2 != 0 ? Integer.toString(i2 - 1) : "null";
        String strValueOf5 = String.valueOf(this.k);
        String strValueOf6 = String.valueOf(this.l);
        String strValueOf7 = String.valueOf(this.m);
        boolean z4 = this.n;
        int length = string.length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(str2).length();
        int length4 = String.valueOf(strValueOf).length();
        int length5 = String.valueOf(strValueOf2).length();
        int length6 = String.valueOf(strValueOf3).length();
        int length7 = String.valueOf(strValueOf4).length();
        StringBuilder sb = new StringBuilder(length + 347 + length2 + length3 + length4 + length5 + length6 + length7 + string2.length() + String.valueOf(strValueOf5).length() + String.valueOf(strValueOf6).length() + String.valueOf(strValueOf7).length());
        sb.append("DecorateAtTimeCaptureRequestData{mode=");
        sb.append(string);
        sb.append(", filename=");
        sb.append(str);
        sb.append(", frontFacing=");
        sb.append(z);
        sb.append(", zoom=");
        sb.append(f);
        sb.append(", flashSetting=");
        sb.append(str2);
        sb.append(", gridLinesOn=");
        sb.append(z2);
        sb.append(", selfieMirrorOn=");
        sb.append(z3);
        sb.append(", timerSeconds=");
        sb.append(f2);
        sb.append(", volumeButtonShutter=");
        sb.append(strValueOf);
        sb.append(", activeSensorSize=");
        sb.append(strValueOf2);
        sb.append(", isSelfieFlashOn=");
        sb.append(strValueOf3);
        sb.append(", rawMode=");
        sb.append(strValueOf4);
        sb.append(", afLockState=");
        sb.append(string2);
        sb.append(", dualEvStats=");
        sb.append(strValueOf5);
        sb.append(", manualWhiteBalanceStats=");
        sb.append(strValueOf6);
        sb.append(", frequentFaceMetadata=");
        sb.append(strValueOf7);
        sb.append(", isPrivateStorage=");
        sb.append(z4);
        sb.append("}");
        return sb.toString();
    }
}
