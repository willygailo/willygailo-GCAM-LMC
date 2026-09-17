package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class cyn {
    public final oor a;
    public final ojc b;

    public cyn() {
    }

    public cyn(oor oorVar, ojc ojcVar) {
        this.a = oorVar;
        this.b = ojcVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cyn) {
            cyn cynVar = (cyn) obj;
            if (this.a.equals(cynVar.a) && this.b.equals(cynVar.b)) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 75 + String.valueOf(strValueOf2).length());
        sb.append("CameraVisionKitDataResult{sceneDetectionResults=");
        sb.append(strValueOf);
        sb.append(", contentDetectionResults=");
        sb.append(strValueOf2);
        sb.append("}");
        return sb.toString();
    }
}
