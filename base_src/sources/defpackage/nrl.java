package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nrl {
    public final prl a;
    private final ohh b;

    public nrl(mdf mdfVar, ohh ohhVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        mdfVar.getClass();
        prl prlVarB = psf.b(mdfVar.a());
        prlVarB.getClass();
        this.b = ohhVar;
        this.a = prlVarB;
    }

    public static /* synthetic */ nna e(nrl nrlVar, Collection collection, Collection collection2, int i, int i2) {
        if ((i2 & 1) != 0) {
            collection = qkx.a;
        }
        if ((i2 & 2) != 0) {
            collection2 = qkx.a;
        }
        if ((i2 & 4) != 0) {
            i = 3;
        }
        return nrlVar.b(collection, collection2, i, null);
    }

    public final nna b(Collection collection, Collection collection2, int i, Throwable th) {
        collection.getClass();
        collection2.getClass();
        if (i != 0) {
            return new nna(this.b, this.a, collection, collection2, i, th, null, null, null, null);
        }
        throw null;
    }

    public final nna c(int i, Throwable th, nnj nnjVar, npe npeVar) {
        List listQ = nnjVar == null ? null : qmd.q(nnjVar);
        if (listQ == null) {
            listQ = qkx.a;
        }
        List listQ2 = npeVar != null ? qmd.q(npeVar) : null;
        if (listQ2 == null) {
            listQ2 = qkx.a;
        }
        return b(listQ, listQ2, i, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nrl)) {
            return false;
        }
        nrl nrlVar = (nrl) obj;
        return qno.c(this.b, nrlVar.b) && qno.c(this.a, nrlVar.a);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        prl prlVar = this.a;
        int iB = prlVar.aD;
        if (iB == 0) {
            iB = pqu.a.b(prlVar).b(prlVar);
            prlVar.aD = iB;
        }
        return iHashCode + iB;
    }

    public final String toString() {
        return "F250LogEventStarter(f250LogAction=" + this.b + ", logEpochTimestamp=" + this.a + ')';
    }
}
