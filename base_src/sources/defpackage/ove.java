package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ove implements out {
    private final out a;
    private final Object b;

    public ove(out outVar, Object obj) {
        oxh.x(outVar, "log site key");
        this.a = outVar;
        oxh.x(obj, "log site qualifier");
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ove)) {
            return false;
        }
        ove oveVar = (ove) obj;
        return this.a.equals(oveVar.a) && this.b.equals(oveVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 50 + String.valueOf(strValueOf2).length());
        sb.append("SpecializedLogSiteKey{ delegate='");
        sb.append(strValueOf);
        sb.append("', qualifier='");
        sb.append(strValueOf2);
        sb.append("' }");
        return sb.toString();
    }
}
