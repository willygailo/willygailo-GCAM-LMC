package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class idm {
    public final ope a;
    public final ope b;
    private final String c;

    public idm() {
    }

    public idm(String str, ope opeVar, ope opeVar2) {
        this.c = str;
        this.a = opeVar;
        this.b = opeVar2;
    }

    public static idl a() {
        return new idl();
    }

    public static String c(String str) {
        String strValueOf = String.valueOf(str.replace('.', '_'));
        return strValueOf.length() != 0 ? "pref_social_app_".concat(strValueOf) : new String("pref_social_app_");
    }

    public final String b() {
        String str = this.c;
        str.getClass();
        return c(str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof idm) {
            idm idmVar = (idm) obj;
            if (this.c.equals(idmVar.c) && this.a.equals(idmVar.a) && this.b.equals(idmVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.c;
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 65 + String.valueOf(strValueOf).length() + String.valueOf(strValueOf2).length());
        sb.append("SocialApp{packageName=");
        sb.append(str);
        sb.append(", photoActivityNames=");
        sb.append(strValueOf);
        sb.append(", videoActivityNames=");
        sb.append(strValueOf2);
        sb.append("}");
        return sb.toString();
    }
}
