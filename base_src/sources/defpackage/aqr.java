package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aqr {
    public String a;
    public int b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqr)) {
            return false;
        }
        aqr aqrVar = (aqr) obj;
        if (this.b != aqrVar.b) {
            return false;
        }
        return this.a.equals(aqrVar.a);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        int i = this.b;
        gg.g(i);
        return (iHashCode * 31) + i;
    }
}
