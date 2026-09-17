package defpackage;

import com.google.android.apps.camera.bottombar.R;

/* JADX INFO: loaded from: classes2.dex */
public final class nma {
    public final ojc a;
    public final oom b;
    public final oom c;
    public final ojc d;
    public final ojc e;
    public final ojc f;
    public final ojc g;
    private final oom h;

    public nma() {
    }

    public nma(ojc ojcVar, oom oomVar, oom oomVar2, ojc ojcVar2, ojc ojcVar3, ojc ojcVar4, oom oomVar3, ojc ojcVar5) {
        this.a = ojcVar;
        this.b = oomVar;
        this.c = oomVar2;
        this.d = ojcVar2;
        this.e = ojcVar3;
        this.f = ojcVar4;
        this.h = oomVar3;
        this.g = ojcVar5;
    }

    public static nlz a() {
        return new nlz(null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nma) {
            nma nmaVar = (nma) obj;
            if (this.a.equals(nmaVar.a) && obr.an(this.b, nmaVar.b) && obr.an(this.c, nmaVar.c) && this.d.equals(nmaVar.d) && this.e.equals(nmaVar.e) && this.f.equals(nmaVar.f) && obr.an(this.h, nmaVar.h) && this.g.equals(nmaVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.c);
        String strValueOf4 = String.valueOf(this.d);
        String strValueOf5 = String.valueOf(this.e);
        String strValueOf6 = String.valueOf(this.f);
        String strValueOf7 = String.valueOf(this.h);
        String strValueOf8 = String.valueOf(this.g);
        int length = String.valueOf(strValueOf).length();
        int length2 = String.valueOf(strValueOf2).length();
        int length3 = String.valueOf(strValueOf3).length();
        int length4 = String.valueOf(strValueOf4).length();
        int length5 = String.valueOf(strValueOf5).length();
        int length6 = String.valueOf(strValueOf6).length();
        int length7 = String.valueOf(strValueOf7).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_tooltipForegroundColor + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(strValueOf8).length());
        sb.append("Contact{name=");
        sb.append(strValueOf);
        sb.append(", emailAddresses=");
        sb.append(strValueOf2);
        sb.append(", phoneNumbers=");
        sb.append(strValueOf3);
        sb.append(", postalAddress=");
        sb.append(strValueOf4);
        sb.append(", website=");
        sb.append(strValueOf5);
        sb.append(", notes=");
        sb.append(strValueOf6);
        sb.append(", allPossibleNames=");
        sb.append(strValueOf7);
        sb.append(", organization=");
        sb.append(strValueOf8);
        sb.append("}");
        return sb.toString();
    }
}
