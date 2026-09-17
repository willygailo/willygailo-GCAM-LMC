package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class azs {
    private static final azr e = new azq();
    public final Object a;
    public final azr b;
    public final String c;
    public volatile byte[] d;

    private azs(String str, Object obj, azr azrVar) {
        aae.u(str);
        this.c = str;
        this.a = obj;
        aae.s(azrVar);
        this.b = azrVar;
    }

    public static azs a(String str, Object obj, azr azrVar) {
        return new azs(str, obj, azrVar);
    }

    public static azs b(String str) {
        return new azs(str, null, e);
    }

    public static azs c(String str, Object obj) {
        return new azs(str, obj, e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof azs) {
            return this.c.equals(((azs) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        String str = this.c;
        StringBuilder sb = new StringBuilder(str.length() + 14);
        sb.append("Option{key='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }
}
