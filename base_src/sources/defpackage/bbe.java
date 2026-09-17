package defpackage;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
final class bbe implements azp {
    private final azp b;
    private final azp c;

    public bbe(azp azpVar, azp azpVar2) {
        this.b = azpVar;
        this.c = azpVar2;
    }

    @Override // defpackage.azp
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
        this.c.a(messageDigest);
    }

    @Override // defpackage.azp
    public final boolean equals(Object obj) {
        if (obj instanceof bbe) {
            bbe bbeVar = (bbe) obj;
            if (this.b.equals(bbeVar.b) && this.c.equals(bbeVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.azp
    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        String strValueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 36 + String.valueOf(strValueOf2).length());
        sb.append("DataCacheKey{sourceKey=");
        sb.append(strValueOf);
        sb.append(", signature=");
        sb.append(strValueOf2);
        sb.append('}');
        return sb.toString();
    }
}
