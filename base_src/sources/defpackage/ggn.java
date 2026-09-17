package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ggn {
    public final hkc a;
    public final hkd b;
    public final float c;
    public final boolean d;
    public final ojc e;
    public final int f;

    public ggn(hkc hkcVar, hkd hkdVar, float f, boolean z, ojc ojcVar, int i) {
        this.a = hkcVar;
        this.b = hkdVar;
        this.c = f;
        this.d = z;
        this.e = ojcVar;
        this.f = i;
    }

    public static ggn a() {
        return new ggn(hkc.OFF, hkd.INACTIVE, 0.0f, false, oih.a, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ggn)) {
            return false;
        }
        ggn ggnVar = (ggn) obj;
        boolean z = this.a == ggnVar.a && this.b == ggnVar.b && this.c == ggnVar.c && this.d == ggnVar.d && this.f == ggnVar.f;
        if (this.e.g() && ggnVar.e.g()) {
            return z && ((ggm) this.e.c()).equals(ggnVar.e.c());
        }
        return z;
    }

    public final int hashCode() {
        return ((((((this.a.h + 527) * 31) + this.b.h) * 31) + Float.floatToIntBits(this.c)) * 31) + (this.d ? 1 : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        float f = this.c;
        boolean z = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 97 + String.valueOf(strValueOf2).length());
        sb.append("{controlAfMode=");
        sb.append(strValueOf);
        sb.append(", controlAfState=");
        sb.append(strValueOf2);
        sb.append(", lensFocusDistance=");
        sb.append(f);
        sb.append(", isSceneChangeDetected=");
        sb.append(z);
        sb.append('}');
        return sb.toString();
    }
}
