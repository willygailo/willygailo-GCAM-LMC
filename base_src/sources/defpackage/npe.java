package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class npe {
    public final long a;
    public final nmt b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;
    public final String g;
    public final npk h;
    public final long i;
    public final nmz j;

    public npe() {
        nmt nmtVar = nmt.ANNOTATION;
        throw null;
    }

    public npe(long j, nmt nmtVar, nmz nmzVar, String str, long j2, String str2, String str3, String str4, npk npkVar, long j3) {
        nmtVar.getClass();
        npkVar.getClass();
        this.a = j;
        this.b = nmtVar;
        this.j = nmzVar;
        this.c = str;
        this.d = j2;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = npkVar;
        this.i = j3;
    }

    public static /* synthetic */ npe a(npe npeVar, String str, String str2, npk npkVar, int i) {
        long j = (i & 1) != 0 ? npeVar.a : 0L;
        nmt nmtVar = (i & 2) != 0 ? npeVar.b : null;
        nmz nmzVar = (i & 4) != 0 ? npeVar.j : null;
        String str3 = (i & 8) != 0 ? npeVar.c : null;
        long j2 = (i & 16) != 0 ? npeVar.d : 0L;
        String str4 = (i & 32) != 0 ? npeVar.e : str;
        String str5 = (i & 64) != 0 ? npeVar.f : str2;
        String str6 = (i & 128) != 0 ? npeVar.g : null;
        npk npkVar2 = (i & 256) != 0 ? npeVar.h : npkVar;
        long j3 = npeVar.i;
        nmtVar.getClass();
        npkVar2.getClass();
        return new npe(j, nmtVar, nmzVar, str3, j2, str4, str5, str6, npkVar2, j3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof npe)) {
            return false;
        }
        npe npeVar = (npe) obj;
        return this.a == npeVar.a && this.b == npeVar.b && qno.c(this.j, npeVar.j) && qno.c(this.c, npeVar.c) && this.d == npeVar.d && qno.c(this.e, npeVar.e) && qno.c(this.f, npeVar.f) && qno.c(this.g, npeVar.g) && qno.c(this.h, npeVar.h) && this.i == npeVar.i;
    }

    public final int hashCode() {
        int iAd = ((ohh.ad(this.a) * 31) + this.b.hashCode()) * 31;
        nmz nmzVar = this.j;
        int iHashCode = (iAd + (nmzVar == null ? 0 : nmzVar.hashCode())) * 31;
        String str = this.c;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + ohh.ad(this.d)) * 31;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        return ((((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.h.hashCode()) * 31) + ohh.ad(this.i);
    }

    public final String toString() {
        return "AnnotachmentEntity(resourceOnDeviceId=" + this.a + ", annotachmentType=" + this.b + ", id=" + this.j + ", contentType=" + ((Object) this.c) + ", onDeviceSize=" + this.d + ", uploadTransferHandle=" + ((Object) this.e) + ", blobstoreId=" + ((Object) this.f) + ", contentHash=" + ((Object) this.g) + ", status=" + this.h + ", onDeviceId=" + this.i + ')';
    }
}
