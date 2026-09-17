package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mlq {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public mlq() {
    }

    public mlq(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public static mlp a() {
        return new mlp();
    }

    public static void b(ast astVar, String str) {
        atx atxVar = new atx();
        atxVar.x(true);
        astVar.d("http://ns.google.com/photos/1.0/container/", str, null, atxVar);
    }

    public static Object c(Object obj) {
        return obj == null ? "0" : obj;
    }

    public static String d(ast astVar, String str, String str2) {
        String strH = gh.h("http://ns.google.com/photos/1.0/container/", "Item");
        String strH2 = gh.h("http://ns.google.com/photos/1.0/container/item/", str2);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(strH).length() + String.valueOf(strH2).length());
        sb.append(str);
        sb.append(strH);
        sb.append(strH2);
        atz atzVarA = astVar.a("http://ns.google.com/photos/1.0/container/", sb.toString());
        if (atzVarA == null) {
            return null;
        }
        return ((ath) atzVarA).a.toString();
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            throw new ass(str.length() != 0 ? "Missing value for ".concat(str) : new String("Missing value for "), 5);
        }
    }

    public static void f(ast astVar, String str, String str2, String str3) {
        String strValueOf = String.valueOf(str);
        String strValueOf2 = String.valueOf(gh.h("http://ns.google.com/photos/1.0/container/item/", str2));
        astVar.c("http://ns.google.com/photos/1.0/container/", strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf), str3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mlq) {
            mlq mlqVar = (mlq) obj;
            if (this.a.equals(mlqVar.a) && this.b.equals(mlqVar.b) && this.c == mlqVar.c && this.d == mlqVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        int i = this.c;
        int i2 = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 85 + String.valueOf(str2).length());
        sb.append("MicroVideoXmpContainerItem{mime=");
        sb.append(str);
        sb.append(", semantic=");
        sb.append(str2);
        sb.append(", length=");
        sb.append(i);
        sb.append(", padding=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
