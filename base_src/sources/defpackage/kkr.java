package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kkr {
    public final Object a;
    public final String b;

    public kkr(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kkr)) {
            return false;
        }
        kkr kkrVar = (kkr) obj;
        return this.a == kkrVar.a && this.b.equals(kkrVar.b);
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 31) + this.b.hashCode();
    }
}
