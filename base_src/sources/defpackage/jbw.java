package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jbw {
    public final jbv a;
    public final jbt b;
    public final jcd c;

    public jbw() {
    }

    public jbw(jbv jbvVar, jbt jbtVar, jcd jcdVar) {
        if (jbvVar == null) {
            throw new NullPointerException("Null layoutConstants");
        }
        this.a = jbvVar;
        if (jbtVar == null) {
            throw new NullPointerException("Null boxes");
        }
        this.b = jbtVar;
        this.c = jcdVar;
    }

    public static jbw a(jbv jbvVar, jbt jbtVar, jcd jcdVar) {
        return new jbw(jbvVar, jbtVar, jcdVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jbw) {
            jbw jbwVar = (jbw) obj;
            if (this.a.equals(jbwVar.a) && this.b.equals(jbwVar.b)) {
                jcd jcdVar = this.c;
                jcd jcdVar2 = jbwVar.c;
                if (jcdVar != null ? jcdVar.equals(jcdVar2) : jcdVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        jcd jcdVar = this.c;
        return iHashCode ^ (jcdVar == null ? 0 : jcdVar.hashCode());
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.c);
        int length = String.valueOf(strValueOf).length();
        StringBuilder sb = new StringBuilder(length + 61 + String.valueOf(strValueOf2).length() + String.valueOf(strValueOf3).length());
        sb.append("CameraLayoutHolder{layoutConstants=");
        sb.append(strValueOf);
        sb.append(", boxes=");
        sb.append(strValueOf2);
        sb.append(", viewfinderSpec=");
        sb.append(strValueOf3);
        sb.append("}");
        return sb.toString();
    }
}
