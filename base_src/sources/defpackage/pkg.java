package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pkg {
    public final lic a;

    public pkg() {
    }

    public pkg(lic licVar) {
        this.a = licVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pkg) {
            return this.a.equals(((pkg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 33);
        sb.append("SeeDarkShotParams{imageRotation=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
