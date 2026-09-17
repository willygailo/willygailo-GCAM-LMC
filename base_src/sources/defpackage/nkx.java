package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nkx {
    public final pqm a;
    public final pos b;

    public nkx() {
    }

    public nkx(pqm pqmVar, pos posVar) {
        if (pqmVar == null) {
            throw new NullPointerException("Null defaultValue");
        }
        this.a = pqmVar;
        if (posVar == null) {
            throw new NullPointerException("Null extensionRegistryLite");
        }
        this.b = posVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nkx) {
            nkx nkxVar = (nkx) obj;
            if (this.a.equals(nkxVar.a) && this.b.equals(nkxVar.b)) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 54 + String.valueOf(strValueOf2).length());
        sb.append("ProtoSerializer{defaultValue=");
        sb.append(strValueOf);
        sb.append(", extensionRegistryLite=");
        sb.append(strValueOf2);
        sb.append("}");
        return sb.toString();
    }
}
