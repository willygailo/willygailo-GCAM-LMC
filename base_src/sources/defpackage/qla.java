package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qla {
    public final int a;
    public final Object b;

    public qla(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qla)) {
            return false;
        }
        qla qlaVar = (qla) obj;
        return this.a == qlaVar.a && qno.c(this.b, qlaVar.b);
    }

    public final int hashCode() {
        int i = this.a * 31;
        Object obj = this.b;
        return i + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return "IndexedValue(index=" + this.a + ", value=" + this.b + ")";
    }
}
