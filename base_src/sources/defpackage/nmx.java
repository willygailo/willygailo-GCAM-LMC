package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nmx extends ohh {
    private final pop a;

    public nmx(pop popVar) {
        this.a = popVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nmx) && qno.c(this.a, ((nmx) obj).a);
    }

    public final int hashCode() {
        pop popVar = this.a;
        int i = popVar.aD;
        if (i != 0) {
            return i;
        }
        int iB = pqu.a.b(popVar).b(popVar);
        popVar.aD = iB;
        return iB;
    }

    public final String toString() {
        return "F250Expiry(expiration=" + this.a + ')';
    }
}
