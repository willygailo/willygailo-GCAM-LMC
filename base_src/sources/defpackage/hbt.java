package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hbt {
    public final boolean a;
    public final boolean b;

    public hbt() {
    }

    public hbt(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hbt) {
            hbt hbtVar = (hbt) obj;
            if (this.a == hbtVar.a && this.b == hbtVar.b) {
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
        StringBuilder sb = new StringBuilder(55);
        sb.append("DualEvTrigger{hdrNetEnabled=");
        sb.append(z);
        sb.append(", modeSupported=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
