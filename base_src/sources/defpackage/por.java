package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class por {
    private final Object a;
    private final int b;

    public por(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof por)) {
            return false;
        }
        por porVar = (por) obj;
        return this.a == porVar.a && this.b == porVar.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
