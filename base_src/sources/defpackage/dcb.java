package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dcb {
    public final int a;
    public final iax b;

    public dcb() {
    }

    public dcb(int i, iax iaxVar) {
        this.a = i;
        this.b = iaxVar;
    }

    public static dca a() {
        dca dcaVar = new dca();
        dcaVar.a = 5;
        return dcaVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dcb) {
            dcb dcbVar = (dcb) obj;
            if (this.a == dcbVar.a && this.b.equals(dcbVar.b)) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 59);
        sb.append("Options{successiveSamplesRequired=");
        sb.append(i);
        sb.append(", suggestion=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
