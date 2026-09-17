package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class llc {
    public final boolean a;

    public llc() {
    }

    public llc(boolean z) {
        this.a = z;
    }

    public static llc a(boolean z) {
        return new llc(z);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof llc) && this.a == ((llc) obj).a;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ 1000;
    }

    public final String toString() {
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(76);
        sb.append("Config{closeImmediately=");
        sb.append(z);
        sb.append(", foregroundTimeoutMillis=1000}");
        return sb.toString();
    }
}
