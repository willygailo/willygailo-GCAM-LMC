package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
final class cyk {
    public final long a;
    public final String b;
    public final Runnable c;
    public final Drawable d;
    public final Runnable e;
    public final ojc f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;

    public cyk() {
    }

    public cyk(long j, String str, Runnable runnable, Drawable drawable, Runnable runnable2, int i, int i2, ojc ojcVar, int i3, int i4) {
        this.a = j;
        this.b = str;
        this.c = runnable;
        this.d = drawable;
        this.e = runnable2;
        this.i = i;
        this.j = i2;
        this.f = ojcVar;
        this.g = i3;
        this.h = i4;
    }

    static cyj a() {
        cyj cyjVar = new cyj(null);
        cyjVar.f = 1;
        cyjVar.d(bvf.d);
        cyjVar.b(0);
        cyjVar.c(0);
        cyjVar.b = bvf.e;
        return cyjVar;
    }

    public final boolean equals(Object obj) {
        String str;
        Runnable runnable;
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cyk)) {
            return false;
        }
        cyk cykVar = (cyk) obj;
        if (this.a == cykVar.a && ((str = this.b) != null ? str.equals(cykVar.b) : cykVar.b == null) && ((runnable = this.c) != null ? runnable.equals(cykVar.c) : cykVar.c == null) && ((drawable = this.d) != null ? drawable.equals(cykVar.d) : cykVar.d == null) && this.e.equals(cykVar.e)) {
            int i = this.i;
            int i2 = cykVar.i;
            if (i == 0) {
                throw null;
            }
            if (i == i2) {
                int i3 = this.j;
                int i4 = cykVar.j;
                if (i3 == 0) {
                    throw null;
                }
                if (i3 == i4 && this.f.equals(cykVar.f) && this.g == cykVar.g && this.h == cykVar.h) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        String str = this.b;
        int iHashCode = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Runnable runnable = this.c;
        int iHashCode2 = (iHashCode ^ (runnable == null ? 0 : runnable.hashCode())) * 1000003;
        Drawable drawable = this.d;
        int iHashCode3 = (((iHashCode2 ^ (drawable != null ? drawable.hashCode() : 0)) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i2 = this.i;
        if (i2 == 0) {
            throw null;
        }
        int i3 = (iHashCode3 ^ i2) * 1000003;
        int i4 = this.j;
        if (i4 != 0) {
            return this.h ^ ((((((i3 ^ i4) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g) * 1000003);
        }
        throw null;
    }

    public final String toString() {
        String str;
        long j = this.a;
        String str2 = this.b;
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(this.d);
        String strValueOf3 = String.valueOf(this.e);
        String str3 = "null";
        switch (this.i) {
            case 1:
                str = "LAUNCH_LENS";
                break;
            case 2:
                str = "INTENT";
                break;
            case 3:
                str = "DISMISS";
                break;
            default:
                str = "null";
                break;
        }
        switch (this.j) {
            case 1:
                str3 = "UNKNOWN";
                break;
            case 2:
                str3 = "BARCODE";
                break;
            case 3:
                str3 = "SCAN_DOCUMENT";
                break;
        }
        String strValueOf4 = String.valueOf(this.f);
        int i = this.g;
        int i2 = this.h;
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(strValueOf).length();
        int length3 = String.valueOf(strValueOf2).length();
        int length4 = String.valueOf(strValueOf3).length();
        int length5 = str.length();
        StringBuilder sb = new StringBuilder(length + 211 + length2 + length3 + length4 + length5 + str3.length() + String.valueOf(strValueOf4).length());
        sb.append("CameraVisionKitChipResult{id=");
        sb.append(j);
        sb.append(", text=");
        sb.append(str2);
        sb.append(", chipClickAction=");
        sb.append(strValueOf);
        sb.append(", icon=");
        sb.append(strValueOf2);
        sb.append(", dismissClickAction=");
        sb.append(strValueOf3);
        sb.append(", actionType=");
        sb.append(str);
        sb.append(", resultType=");
        sb.append(str3);
        sb.append(", detectedDocumentData=");
        sb.append(strValueOf4);
        sb.append(", barcodeValueFormat=");
        sb.append(i);
        sb.append(", barcodeFormat=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
