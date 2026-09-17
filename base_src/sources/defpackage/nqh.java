package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nqh implements nnj {
    public final String a;
    public final String b;
    public final List c;
    public final prl d;
    public final pop e;
    public final long f;
    public final String g;
    public final String h;
    public final pop i;
    public final pop j;
    public final pop k;
    public final boolean l;
    public final List m;
    public final String n;
    public final String o;
    public final pti p;
    public final plu q;
    public final npk r;
    public final long s;
    public final nmz t;
    private final qkj u;

    public nqh() {
        this(null, null, null, null, null, 0L, null, null, null, null, null, null, false, null, null, null, null, null, null, 0L, 1048575);
    }

    public nqh(String str, String str2, List list, prl prlVar, pop popVar, long j, String str3, String str4, nmz nmzVar, pop popVar2, pop popVar3, pop popVar4, boolean z, List list2, String str5, String str6, pti ptiVar, plu pluVar, npk npkVar, long j2) {
        list.getClass();
        list2.getClass();
        npkVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = prlVar;
        this.e = popVar;
        this.f = j;
        this.g = str3;
        this.h = str4;
        this.t = nmzVar;
        this.i = popVar2;
        this.j = popVar3;
        this.k = popVar4;
        this.l = z;
        this.m = list2;
        this.n = str5;
        this.o = str6;
        this.p = ptiVar;
        this.q = pluVar;
        this.r = npkVar;
        this.s = j2;
        this.u = qmd.N(new nqg(this, 1));
        qmd.N(new nqg(this, 0));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ nqh(String str, String str2, List list, prl prlVar, pop popVar, long j, String str3, String str4, nmz nmzVar, pop popVar2, pop popVar3, pop popVar4, boolean z, List list2, String str5, String str6, pti ptiVar, plu pluVar, npk npkVar, long j2, int i) {
        String str7 = 1 == (i & 1) ? null : str;
        String str8 = (i & 2) != 0 ? null : str2;
        if ((i & 4) != 0) {
            throw null;
        }
        prl prlVar2 = (i & 8) != 0 ? null : prlVar;
        pop popVar5 = (i & 16) != 0 ? null : popVar;
        long j3 = (i & 32) != 0 ? 0L : j;
        String str9 = (i & 64) != 0 ? null : str3;
        String str10 = (i & 128) != 0 ? null : str4;
        nmz nmzVar2 = (i & 256) != 0 ? null : nmzVar;
        pop popVar6 = (i & 512) != 0 ? null : popVar2;
        pop popVar7 = (i & 1024) != 0 ? null : popVar3;
        pop popVar8 = (i & 2048) != 0 ? null : popVar4;
        boolean z2 = ((i & 4096) == 0) & z;
        if ((i & 8192) != 0) {
            throw null;
        }
        this(str7, str8, list, prlVar2, popVar5, j3, str9, str10, nmzVar2, popVar6, popVar7, popVar8, z2, list2, (i & 16384) != 0 ? null : str5, (32768 & i) != 0 ? null : str6, (65536 & i) != 0 ? null : ptiVar, (131072 & i) != 0 ? null : pluVar, (262144 & i) != 0 ? new npk(null, null, null, null, null, 0.0d, 63) : npkVar, (i & 524288) != 0 ? 0L : j2);
    }

    public static /* synthetic */ nqh d(nqh nqhVar, nmz nmzVar, String str, npk npkVar, int i) {
        String str2 = (i & 1) != 0 ? nqhVar.a : null;
        String str3 = (i & 2) != 0 ? nqhVar.b : null;
        List list = (i & 4) != 0 ? nqhVar.c : null;
        prl prlVar = (i & 8) != 0 ? nqhVar.d : null;
        pop popVar = (i & 16) != 0 ? nqhVar.e : null;
        long j = (i & 32) != 0 ? nqhVar.f : 0L;
        String str4 = (i & 64) != 0 ? nqhVar.g : null;
        String str5 = (i & 128) != 0 ? nqhVar.h : null;
        nmz nmzVar2 = (i & 256) != 0 ? nqhVar.t : nmzVar;
        pop popVar2 = (i & 512) != 0 ? nqhVar.i : null;
        pop popVar3 = (i & 1024) != 0 ? nqhVar.j : null;
        pop popVar4 = (i & 2048) != 0 ? nqhVar.k : null;
        boolean z = (i & 4096) != 0 ? nqhVar.l : false;
        List list2 = (i & 8192) != 0 ? nqhVar.m : null;
        String str6 = (i & 16384) != 0 ? nqhVar.n : null;
        String str7 = (32768 & i) != 0 ? nqhVar.o : str;
        pti ptiVar = (65536 & i) != 0 ? nqhVar.p : null;
        plu pluVar = (131072 & i) != 0 ? nqhVar.q : null;
        npk npkVar2 = (i & 262144) != 0 ? nqhVar.r : npkVar;
        long j2 = nqhVar.s;
        list.getClass();
        list2.getClass();
        npkVar2.getClass();
        return new nqh(str2, str3, list, prlVar, popVar, j, str4, str5, nmzVar2, popVar2, popVar3, popVar4, z, list2, str6, str7, ptiVar, pluVar, npkVar2, j2);
    }

    @Override // defpackage.nnj
    public final void a() {
    }

    @Override // defpackage.nnj
    public final /* synthetic */ void b() {
    }

    public final plv c() {
        return (plv) this.u.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nqh)) {
            return false;
        }
        nqh nqhVar = (nqh) obj;
        return qno.c(this.a, nqhVar.a) && qno.c(this.b, nqhVar.b) && qno.c(this.c, nqhVar.c) && qno.c(this.d, nqhVar.d) && qno.c(this.e, nqhVar.e) && this.f == nqhVar.f && qno.c(this.g, nqhVar.g) && qno.c(this.h, nqhVar.h) && qno.c(this.t, nqhVar.t) && qno.c(this.i, nqhVar.i) && qno.c(this.j, nqhVar.j) && qno.c(this.k, nqhVar.k) && this.l == nqhVar.l && qno.c(this.m, nqhVar.m) && qno.c(this.n, nqhVar.n) && qno.c(this.o, nqhVar.o) && qno.c(this.p, nqhVar.p) && qno.c(this.q, nqhVar.q) && qno.c(this.r, nqhVar.r) && this.s == nqhVar.s;
    }

    public final int hashCode() {
        int iB;
        int iB2;
        int iB3;
        int iB4;
        int iB5;
        int iB6;
        String str = this.a;
        int iB7 = 0;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.c.hashCode()) * 31;
        prl prlVar = this.d;
        if (prlVar == null) {
            iB = 0;
        } else {
            iB = prlVar.aD;
            if (iB == 0) {
                iB = pqu.a.b(prlVar).b(prlVar);
                prlVar.aD = iB;
            }
        }
        int i = (iHashCode2 + iB) * 31;
        pop popVar = this.e;
        if (popVar == null) {
            iB2 = 0;
        } else {
            iB2 = popVar.aD;
            if (iB2 == 0) {
                iB2 = pqu.a.b(popVar).b(popVar);
                popVar.aD = iB2;
            }
        }
        int iY = (((i + iB2) * 31) + obr.y(this.f)) * 31;
        String str3 = this.g;
        int iHashCode3 = (iY + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        nmz nmzVar = this.t;
        int iHashCode5 = (iHashCode4 + (nmzVar == null ? 0 : nmzVar.hashCode())) * 31;
        pop popVar2 = this.i;
        if (popVar2 == null) {
            iB3 = 0;
        } else {
            iB3 = popVar2.aD;
            if (iB3 == 0) {
                iB3 = pqu.a.b(popVar2).b(popVar2);
                popVar2.aD = iB3;
            }
        }
        int i2 = (iHashCode5 + iB3) * 31;
        pop popVar3 = this.j;
        if (popVar3 == null) {
            iB4 = 0;
        } else {
            iB4 = popVar3.aD;
            if (iB4 == 0) {
                iB4 = pqu.a.b(popVar3).b(popVar3);
                popVar3.aD = iB4;
            }
        }
        int i3 = (i2 + iB4) * 31;
        pop popVar4 = this.k;
        if (popVar4 == null) {
            iB5 = 0;
        } else {
            iB5 = popVar4.aD;
            if (iB5 == 0) {
                iB5 = pqu.a.b(popVar4).b(popVar4);
                popVar4.aD = iB5;
            }
        }
        int iHashCode6 = (((((i3 + iB5) * 31) + (this.l ? 1 : 0)) * 31) + this.m.hashCode()) * 31;
        String str5 = this.n;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.o;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        pti ptiVar = this.p;
        if (ptiVar == null) {
            iB6 = 0;
        } else {
            iB6 = ptiVar.aD;
            if (iB6 == 0) {
                iB6 = pqu.a.b(ptiVar).b(ptiVar);
                ptiVar.aD = iB6;
            }
        }
        int i4 = (iHashCode8 + iB6) * 31;
        plu pluVar = this.q;
        if (pluVar != null && (iB7 = pluVar.aD) == 0) {
            iB7 = pqu.a.b(pluVar).b(pluVar);
            pluVar.aD = iB7;
        }
        return ((((i4 + iB7) * 31) + this.r.hashCode()) * 31) + obr.y(this.s);
    }

    public final String toString() {
        return "ResourceEntity(title=" + ((Object) this.a) + ", experienceId=" + ((Object) this.b) + ", queryableTags=" + this.c + ", queryableEpochTimestamp=" + this.d + ", queryableDuration=" + this.e + ", approximateTotalSize=" + this.f + ", namespaceId=" + ((Object) this.g) + ", partitionId=" + ((Object) this.h) + ", f250ResourceId=" + this.t + ", f250AutoUploadDelay=" + this.i + ", airlockExpiration=" + this.j + ", f250Expiration=" + this.k + ", deleteAirlockFilesOnceUploaded=" + this.l + ", nonSignedInDataOwners=" + this.m + ", overridenObfuscatedGaiaId=" + ((Object) this.n) + ", uploadTransferHandle=" + ((Object) this.o) + ", relations=" + this.p + ", indexTokens=" + this.q + ", status=" + this.r + ", onDeviceId=" + this.s + ')';
    }
}
