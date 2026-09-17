package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fjz {
    public final hsr a;
    public final pcw b;
    public final Float c;

    public fjz() {
    }

    public fjz(hsr hsrVar, pcw pcwVar, Float f) {
        this.a = hsrVar;
        this.b = pcwVar;
        this.c = f;
    }

    public static fjy a() {
        return new fjy();
    }

    public final boolean equals(Object obj) {
        pcw pcwVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fjz)) {
            return false;
        }
        fjz fjzVar = (fjz) obj;
        if (this.a.equals(fjzVar.a) && ((pcwVar = this.b) != null ? pcwVar.equals(fjzVar.b) : fjzVar.b == null)) {
            Float f = this.c;
            Float f2 = fjzVar.c;
            if (f != null ? f.equals(f2) : f2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iB;
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        pcw pcwVar = this.b;
        if (pcwVar == null) {
            iB = 0;
        } else {
            iB = pcwVar.aD;
            if (iB == 0) {
                iB = pqu.a.b(pcwVar).b(pcwVar);
                pcwVar.aD = iB;
            }
        }
        int i = (iHashCode ^ iB) * 1000003;
        Float f = this.c;
        return i ^ (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.c);
        int length = String.valueOf(strValueOf).length();
        StringBuilder sb = new StringBuilder(length + 64 + String.valueOf(strValueOf2).length() + String.valueOf(strValueOf3).length());
        sb.append("CaptureStartStats{sessionType=");
        sb.append(strValueOf);
        sb.append(", microvideoMetaData=");
        sb.append(strValueOf2);
        sb.append(", zoomValue=");
        sb.append(strValueOf3);
        sb.append("}");
        return sb.toString();
    }
}
