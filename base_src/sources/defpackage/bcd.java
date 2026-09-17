package defpackage;

import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bcd implements azp {
    private final Object b;
    private final int c;
    private final int d;
    private final Class e;
    private final Class f;
    private final azp g;
    private final Map h;
    private final azt i;
    private int j;

    public bcd(Object obj, azp azpVar, int i, int i2, Map map, Class cls, Class cls2, azt aztVar) {
        aae.s(obj);
        this.b = obj;
        aae.w(azpVar, "Signature must not be null");
        this.g = azpVar;
        this.c = i;
        this.d = i2;
        aae.s(map);
        this.h = map;
        aae.w(cls, "Resource class must not be null");
        this.e = cls;
        this.f = cls2;
        aae.s(aztVar);
        this.i = aztVar;
    }

    @Override // defpackage.azp
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.azp
    public final boolean equals(Object obj) {
        if (obj instanceof bcd) {
            bcd bcdVar = (bcd) obj;
            if (this.b.equals(bcdVar.b) && this.g.equals(bcdVar.g) && this.d == bcdVar.d && this.c == bcdVar.c && this.h.equals(bcdVar.h) && this.e.equals(bcdVar.e) && this.f.equals(bcdVar.f) && this.i.equals(bcdVar.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.azp
    public final int hashCode() {
        int i = this.j;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.b.hashCode();
        this.j = iHashCode;
        int iHashCode2 = (((((iHashCode * 31) + this.g.hashCode()) * 31) + this.c) * 31) + this.d;
        this.j = iHashCode2;
        int iHashCode3 = (iHashCode2 * 31) + this.h.hashCode();
        this.j = iHashCode3;
        int iHashCode4 = (iHashCode3 * 31) + this.e.hashCode();
        this.j = iHashCode4;
        int iHashCode5 = (iHashCode4 * 31) + this.f.hashCode();
        this.j = iHashCode5;
        int iHashCode6 = (iHashCode5 * 31) + this.i.hashCode();
        this.j = iHashCode6;
        return iHashCode6;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        int i = this.c;
        int i2 = this.d;
        String strValueOf2 = String.valueOf(this.e);
        String strValueOf3 = String.valueOf(this.f);
        String strValueOf4 = String.valueOf(this.g);
        int i3 = this.j;
        String strValueOf5 = String.valueOf(this.h);
        String strValueOf6 = String.valueOf(this.i);
        int length = String.valueOf(strValueOf).length();
        int length2 = String.valueOf(strValueOf2).length();
        int length3 = String.valueOf(strValueOf3).length();
        int length4 = String.valueOf(strValueOf4).length();
        StringBuilder sb = new StringBuilder(length + 151 + length2 + length3 + length4 + String.valueOf(strValueOf5).length() + String.valueOf(strValueOf6).length());
        sb.append("EngineKey{model=");
        sb.append(strValueOf);
        sb.append(", width=");
        sb.append(i);
        sb.append(", height=");
        sb.append(i2);
        sb.append(", resourceClass=");
        sb.append(strValueOf2);
        sb.append(", transcodeClass=");
        sb.append(strValueOf3);
        sb.append(", signature=");
        sb.append(strValueOf4);
        sb.append(", hashCode=");
        sb.append(i3);
        sb.append(", transformations=");
        sb.append(strValueOf5);
        sb.append(", options=");
        sb.append(strValueOf6);
        sb.append('}');
        return sb.toString();
    }
}
