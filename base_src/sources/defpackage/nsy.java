package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class nsy {
    public final nrl a;
    public final nqh b;
    public final npe c;
    public final qoj d;
    private final nrm e;

    public nsy(nrl nrlVar, nqh nqhVar, npe npeVar, qoj qojVar, nrm nrmVar) {
        npeVar.getClass();
        this.a = nrlVar;
        this.b = nqhVar;
        this.c = npeVar;
        this.d = qojVar;
        this.e = nrmVar;
    }

    public static /* synthetic */ nsy a(nsy nsyVar, nqh nqhVar, npe npeVar, int i) {
        nrl nrlVar = (i & 1) != 0 ? nsyVar.a : null;
        if ((i & 2) != 0) {
            nqhVar = nsyVar.b;
        }
        nqh nqhVar2 = nqhVar;
        qoj qojVar = nsyVar.d;
        nrm nrmVar = nsyVar.e;
        nrlVar.getClass();
        nqhVar2.getClass();
        npeVar.getClass();
        return new nsy(nrlVar, nqhVar2, npeVar, qojVar, nrmVar);
    }

    public final void b(int i, Throwable th) {
        this.e.a(this.a.c(i, th, this.b, this.c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsy)) {
            return false;
        }
        nsy nsyVar = (nsy) obj;
        return qno.c(this.a, nsyVar.a) && qno.c(this.b, nsyVar.b) && qno.c(this.c, nsyVar.c) && qno.c(this.d, nsyVar.d) && qno.c(this.e, nsyVar.e);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "AttachmentItem(logStarter=" + this.a + ", resource=" + this.b + ", attachment=" + this.c + ", otherAnnotachments=" + this.d + ", f250Logger=" + this.e + ')';
    }
}
