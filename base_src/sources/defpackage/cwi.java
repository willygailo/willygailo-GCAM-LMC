package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cwi {
    public final ghx a;

    public cwi() {
    }

    public cwi(ghx ghxVar) {
        this.a = ghxVar;
    }

    public final lwd a() {
        return this.a.k();
    }

    public final boolean b() {
        return a() == lwd.FRONT;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cwi) {
            return this.a.equals(((cwi) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 36);
        sb.append("CameraFacingChange{characteristics=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
