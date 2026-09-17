package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hck {
    public final int a;
    public final oom b;

    public hck() {
    }

    public hck(int i, oom oomVar) {
        this.a = i;
        if (oomVar == null) {
            throw new NullPointerException("Null manualWhiteBalanceFactors");
        }
        this.b = oomVar;
    }

    public static hck a(int i, oom oomVar) {
        return new hck(i, oomVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hck) {
            hck hckVar = (hck) obj;
            if (this.a == hckVar.a && obr.an(this.b, hckVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String strValueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 90);
        sb.append("ManualWhiteBalanceSettings{manualWhiteBalanceMode=");
        sb.append(i);
        sb.append(", manualWhiteBalanceFactors=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
