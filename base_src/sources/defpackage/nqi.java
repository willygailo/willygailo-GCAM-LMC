package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nqi {
    public final nqh a;
    public final List b;

    public nqi() {
        new nqh(null, null, null, null, null, 0L, null, null, null, null, null, null, false, null, null, null, null, null, null, 0L, 1048575);
        throw null;
    }

    public nqi(nqh nqhVar, List list) {
        nqhVar.getClass();
        list.getClass();
        this.a = nqhVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nqi)) {
            return false;
        }
        nqi nqiVar = (nqi) obj;
        return qno.c(this.a, nqiVar.a) && qno.c(this.b, nqiVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ResourceWithAnnotachments(resource=" + this.a + ", annotachments=" + this.b + ')';
    }
}
