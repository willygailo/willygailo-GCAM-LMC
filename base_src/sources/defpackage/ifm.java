package defpackage;

import android.content.pm.ResolveInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class ifm {
    public final ResolveInfo a;
    public final boolean b;
    public final boolean c;

    public ifm() {
    }

    public ifm(ResolveInfo resolveInfo, boolean z, boolean z2) {
        this.a = resolveInfo;
        this.b = z;
        this.c = z2;
    }

    public static ifl a() {
        return new ifl();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ifm) {
            ifm ifmVar = (ifm) obj;
            if (this.a.equals(ifmVar.a) && this.b == ifmVar.b && this.c == ifmVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        boolean z = this.b;
        boolean z2 = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 67);
        sb.append("SocialQueryingResult{resolveInfo=");
        sb.append(strValueOf);
        sb.append(", selected=");
        sb.append(z);
        sb.append(", supported=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
