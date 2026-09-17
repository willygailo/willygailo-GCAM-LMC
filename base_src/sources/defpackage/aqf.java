package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aqf {
    public final String a;
    public final Long b;

    public aqf(String str, long j) {
        this.a = str;
        this.b = Long.valueOf(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqf)) {
            return false;
        }
        aqf aqfVar = (aqf) obj;
        if (this.a.equals(aqfVar.a)) {
            return this.b.equals(aqfVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}
