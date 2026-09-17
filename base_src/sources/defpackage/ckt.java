package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ckt {
    public final cle a;
    public final int b;

    public ckt() {
    }

    public ckt(cle cleVar, int i) {
        this.a = cleVar;
        this.b = i;
    }

    public static cks a() {
        return new cks();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ckt) {
            ckt cktVar = (ckt) obj;
            if (this.a.equals(cktVar.a) && this.b == cktVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        int i = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 67);
        sb.append("CamcorderPendingVideoFile{outputVideo=");
        sb.append(strValueOf);
        sb.append(", pendingVideoId=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
