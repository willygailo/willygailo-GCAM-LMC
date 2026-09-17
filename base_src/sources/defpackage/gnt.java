package defpackage;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class gnt {
    public final Float a;
    private final Pair b;

    public gnt() {
    }

    public gnt(Float f, Pair pair) {
        this.a = f;
        this.b = pair;
    }

    public static gnt a(Float f, Pair pair) {
        return new gnt(f, pair);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gnt)) {
            return false;
        }
        gnt gntVar = (gnt) obj;
        Float f = this.a;
        if (f != null ? f.equals(gntVar.a) : gntVar.a == null) {
            Pair pair = this.b;
            Pair pair2 = gntVar.b;
            if (pair != null ? pair.equals(pair2) : pair2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Float f = this.a;
        int iHashCode = ((f == null ? 0 : f.hashCode()) ^ 1000003) * 1000003;
        Pair pair = this.b;
        return iHashCode ^ (pair != null ? pair.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 48 + String.valueOf(strValueOf2).length());
        sb.append("FocusDistanceResult{focusDistance=");
        sb.append(strValueOf);
        sb.append(", focusRange=");
        sb.append(strValueOf2);
        sb.append("}");
        return sb.toString();
    }
}
