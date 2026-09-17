package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cdo {
    public final lmr a;
    public final lnx b;

    public cdo() {
    }

    public cdo(lmr lmrVar, lnx lnxVar) {
        this.a = lmrVar;
        this.b = lnxVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cdo) {
            cdo cdoVar = (cdo) obj;
            if (this.a.equals(cdoVar.a) && this.b.equals(cdoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 29 + String.valueOf(strValueOf2).length());
        sb.append("FrameFeature{frame=");
        sb.append(strValueOf);
        sb.append(", stream=");
        sb.append(strValueOf2);
        sb.append("}");
        return sb.toString();
    }
}
