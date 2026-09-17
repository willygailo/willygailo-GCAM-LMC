package defpackage;

import android.util.Size;

/* JADX INFO: loaded from: classes2.dex */
public final class jbv {
    public static final jbv a;
    public final Size b;
    public final Size c;
    public final Size d;
    public final Integer e;
    public final boolean f;
    public final boolean g;
    public final jrz h;
    public final jrl i;
    public final jce j;

    static {
        jbu jbuVar = new jbu();
        jbuVar.c(false);
        jbuVar.d();
        jbuVar.e(jrl.UNINITIALIZED);
        jbuVar.f(jrz.PORTRAIT);
        jbuVar.b(jce.PHONE_LAYOUT);
        a = jbuVar.a();
    }

    public jbv() {
    }

    public jbv(Size size, Size size2, Size size3, Integer num, boolean z, boolean z2, jrz jrzVar, jrl jrlVar, jce jceVar) {
        this.b = size;
        this.c = size2;
        this.d = size3;
        this.e = num;
        this.f = z;
        this.g = dep.sh.k(dcy.cd);
        this.h = jrzVar;
        this.i = jrlVar;
        this.j = jceVar;
    }

    public final boolean a() {
        return (this.b == null || this.c == null || this.e == null) ? false : true;
    }

    public final jbu b() {
        return new jbu(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jbv)) {
            return false;
        }
        jbv jbvVar = (jbv) obj;
        Size size = this.b;
        if (size != null ? size.equals(jbvVar.b) : jbvVar.b == null) {
            Size size2 = this.c;
            if (size2 != null ? size2.equals(jbvVar.c) : jbvVar.c == null) {
                Size size3 = this.d;
                if (size3 != null ? size3.equals(jbvVar.d) : jbvVar.d == null) {
                    Integer num = this.e;
                    if (num != null ? num.equals(jbvVar.e) : jbvVar.e == null) {
                        if (this.f == jbvVar.f && this.g == jbvVar.g && this.h.equals(jbvVar.h) && this.i.equals(jbvVar.i) && this.j.equals(jbvVar.j)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Size size = this.b;
        int iHashCode = ((size == null ? 0 : size.hashCode()) ^ 1000003) * 1000003;
        Size size2 = this.c;
        int iHashCode2 = (iHashCode ^ (size2 == null ? 0 : size2.hashCode())) * 1000003;
        Size size3 = this.d;
        int iHashCode3 = (iHashCode2 ^ (size3 == null ? 0 : size3.hashCode())) * 1000003;
        Integer num = this.e;
        return ((((((((((iHashCode3 ^ (num != null ? num.hashCode() : 0)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true == this.g ? 1231 : 1237)) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        String strValueOf2 = String.valueOf(this.c);
        String strValueOf3 = String.valueOf(this.d);
        String strValueOf4 = String.valueOf(this.e);
        boolean z = this.f;
        boolean z2 = this.g;
        String strValueOf5 = String.valueOf(this.h);
        String strValueOf6 = String.valueOf(this.i);
        String strValueOf7 = String.valueOf(this.j);
        int length = String.valueOf(strValueOf).length();
        int length2 = String.valueOf(strValueOf2).length();
        int length3 = String.valueOf(strValueOf3).length();
        int length4 = String.valueOf(strValueOf4).length();
        int length5 = String.valueOf(strValueOf5).length();
        StringBuilder sb = new StringBuilder(length + 171 + length2 + length3 + length4 + length5 + String.valueOf(strValueOf6).length() + String.valueOf(strValueOf7).length());
        sb.append("CameraLayoutConstants{windowSize=");
        sb.append(strValueOf);
        sb.append(", previewSize=");
        sb.append(strValueOf2);
        sb.append(", orientedPreviewSize=");
        sb.append(strValueOf3);
        sb.append(", sensorOrientationDegree=");
        sb.append(strValueOf4);
        sb.append(", isPreviewMaximized=");
        sb.append(z);
        sb.append(", hasCutout=");
        sb.append(z2);
        sb.append(", orientation=");
        sb.append(strValueOf5);
        sb.append(", mode=");
        sb.append(strValueOf6);
        sb.append(", decision=");
        sb.append(strValueOf7);
        sb.append("}");
        return sb.toString();
    }
}
