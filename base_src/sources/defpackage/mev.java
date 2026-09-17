package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mev {
    private final Long a;
    private final int b;

    public mev() {
    }

    public mev(Long l, int i) {
        this.a = l;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mev) {
            mev mevVar = (mev) obj;
            if (this.a.equals(mevVar.a) && this.b == mevVar.b) {
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
        String string = Integer.toString(plk.ap(this.b));
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 54 + string.length());
        sb.append("VerificationFailureKey{protoId=");
        sb.append(strValueOf);
        sb.append(", verificationFailure=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
