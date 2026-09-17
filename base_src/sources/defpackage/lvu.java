package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lvu {
    public final String a;
    public final Throwable b;

    public lvu() {
    }

    public lvu(String str, Throwable th) {
        this.a = str;
        this.b = th;
    }

    public static lvt a() {
        return new lvt();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lvu) {
            lvu lvuVar = (lvu) obj;
            if (this.a.equals(lvuVar.a)) {
                Throwable th = this.b;
                Throwable th2 = lvuVar.b;
                if (th != null ? th.equals(th2) : th2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Throwable th = this.b;
        return iHashCode ^ (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        String str = this.a;
        String strValueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(strValueOf).length());
        sb.append("CameraIdFailure{cameraId=");
        sb.append(str);
        sb.append(", exception=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
