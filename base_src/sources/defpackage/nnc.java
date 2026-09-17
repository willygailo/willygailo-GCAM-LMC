package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nnc extends ohh {
    public final oyj a;

    public nnc(oyj oyjVar) {
        oyjVar.getClass();
        this.a = oyjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nnc) && qno.c(this.a, ((nnc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NonSignedInDataOwner(userHashCode=" + this.a + ')';
    }
}
