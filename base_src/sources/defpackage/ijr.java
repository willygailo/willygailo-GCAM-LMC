package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ijr {
    public final boolean a;
    public final boolean b;

    public ijr() {
    }

    public ijr(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public static ijq a() {
        ijq ijqVar = new ijq();
        ijqVar.c(true);
        ijqVar.b(true);
        return ijqVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ijr) {
            ijr ijrVar = (ijr) obj;
            if (this.a == ijrVar.a && this.b == ijrVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true == this.b ? 1231 : 1237);
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        StringBuilder sb = new StringBuilder(68);
        sb.append("RecordOptions{logDurationFromStart=");
        sb.append(z);
        sb.append(", logDurationFromLast=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
