package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class qkl implements Serializable {
    public final Object a;
    public final Object b;

    public qkl(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qkl)) {
            return false;
        }
        qkl qklVar = (qkl) obj;
        return qno.c(this.a, qklVar.a) && qno.c(this.b, qklVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return '(' + this.a + ", " + this.b + ')';
    }
}
