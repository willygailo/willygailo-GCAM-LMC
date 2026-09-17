package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class npk {
    public final prl a;
    public final prl b;
    public final prl c;
    public final nmr d;
    public final nnr e;
    public final double f;

    public npk() {
        this(null, null, null, null, null, 0.0d, 63);
    }

    public npk(prl prlVar, prl prlVar2, prl prlVar3, nmr nmrVar, nnr nnrVar, double d) {
        prlVar.getClass();
        nmrVar.getClass();
        nnrVar.getClass();
        this.a = prlVar;
        this.b = prlVar2;
        this.c = prlVar3;
        this.d = nmrVar;
        this.e = nnrVar;
        this.f = d;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ npk(prl prlVar, prl prlVar2, prl prlVar3, nmr nmrVar, nnr nnrVar, double d, int i) {
        if ((i & 1) != 0) {
            prl prlVar4 = prl.c;
            throw null;
        }
        prl prlVar5 = (i & 2) != 0 ? null : prlVar2;
        prl prlVar6 = (i & 4) != 0 ? null : prlVar3;
        if ((i & 8) != 0) {
            nmr nmrVar2 = nmr.UNKNOWN_AIRLOCK_FILE_STATE;
            throw null;
        }
        if ((i & 16) == 0) {
            this(prlVar, prlVar5, prlVar6, nmrVar, nnrVar, (i & 32) != 0 ? 0.0d : d);
        } else {
            nnr nnrVar2 = nnr.UNKNOWN_UPLOAD_STATE;
            throw null;
        }
    }

    public static /* synthetic */ npk a(npk npkVar, prl prlVar, prl prlVar2, nmr nmrVar, nnr nnrVar, double d, int i) {
        prl prlVar3 = (i & 1) != 0 ? npkVar.a : null;
        if ((i & 2) != 0) {
            prlVar = npkVar.b;
        }
        prl prlVar4 = prlVar;
        if ((i & 4) != 0) {
            prlVar2 = npkVar.c;
        }
        prl prlVar5 = prlVar2;
        if ((i & 8) != 0) {
            nmrVar = npkVar.d;
        }
        nmr nmrVar2 = nmrVar;
        if ((i & 16) != 0) {
            nnrVar = npkVar.e;
        }
        nnr nnrVar2 = nnrVar;
        if ((i & 32) != 0) {
            d = npkVar.f;
        }
        prlVar3.getClass();
        nmrVar2.getClass();
        nnrVar2.getClass();
        return new npk(prlVar3, prlVar4, prlVar5, nmrVar2, nnrVar2, d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof npk)) {
            return false;
        }
        npk npkVar = (npk) obj;
        return qno.c(this.a, npkVar.a) && qno.c(this.b, npkVar.b) && qno.c(this.c, npkVar.c) && this.d == npkVar.d && this.e == npkVar.e && qno.c(Double.valueOf(this.f), Double.valueOf(npkVar.f));
    }

    public final int hashCode() {
        int iB;
        prl prlVar = this.a;
        int iB2 = prlVar.aD;
        if (iB2 == 0) {
            iB2 = pqu.a.b(prlVar).b(prlVar);
            prlVar.aD = iB2;
        }
        int i = iB2 * 31;
        prl prlVar2 = this.b;
        int iB3 = 0;
        if (prlVar2 == null) {
            iB = 0;
        } else {
            iB = prlVar2.aD;
            if (iB == 0) {
                iB = pqu.a.b(prlVar2).b(prlVar2);
                prlVar2.aD = iB;
            }
        }
        int i2 = (i + iB) * 31;
        prl prlVar3 = this.c;
        if (prlVar3 != null && (iB3 = prlVar3.aD) == 0) {
            iB3 = pqu.a.b(prlVar3).b(prlVar3);
            prlVar3.aD = iB3;
        }
        int iHashCode = this.d.hashCode();
        int iHashCode2 = this.e.hashCode();
        long jDoubleToLongBits = Double.doubleToLongBits(this.f);
        return ((((((i2 + iB3) * 31) + iHashCode) * 31) + iHashCode2) * 31) + ((int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits));
    }

    public final String toString() {
        return "EmbeddedStatus(addedToAirlockEpochTimestamp=" + this.a + ", uploadToF250RequestedEpochTimestamp=" + this.b + ", uploadToF250CompletedEpochTimestamp=" + this.c + ", airlockFileState=" + this.d + ", uploadState=" + this.e + ", uploadProgressPercent=" + this.f + ')';
    }
}
