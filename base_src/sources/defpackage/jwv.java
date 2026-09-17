package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jwv {
    public final jwu a;
    public final lco b;
    public final jwt c;

    public jwv() {
    }

    public jwv(jwu jwuVar, lco lcoVar, jwt jwtVar) {
        if (jwuVar == null) {
            throw new NullPointerException("Null effectFactory");
        }
        this.a = jwuVar;
        if (lcoVar == null) {
            throw new NullPointerException("Null activation");
        }
        this.b = lcoVar;
        if (jwtVar == null) {
            throw new NullPointerException("Null order");
        }
        this.c = jwtVar;
    }

    public static jwv a(jwu jwuVar, lco lcoVar, jwt jwtVar) {
        return new jwv(jwuVar, lcoVar, jwtVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jwv) {
            jwv jwvVar = (jwv) obj;
            if (this.a.equals(jwvVar.a) && this.b.equals(jwvVar.b) && this.c.equals(jwvVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.c);
        int length = String.valueOf(strValueOf).length();
        StringBuilder sb = new StringBuilder(length + 60 + String.valueOf(strValueOf2).length() + String.valueOf(strValueOf3).length());
        sb.append("ViewfinderEffectElement{effectFactory=");
        sb.append(strValueOf);
        sb.append(", activation=");
        sb.append(strValueOf2);
        sb.append(", order=");
        sb.append(strValueOf3);
        sb.append("}");
        return sb.toString();
    }
}
