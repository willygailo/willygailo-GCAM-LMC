package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class nqc extends ahz {
    public nqc(aii aiiVar) {
        super(aiiVar);
    }

    @Override // defpackage.ahz
    public final /* bridge */ /* synthetic */ void c(ake akeVar, Object obj) {
        nqh nqhVar = (nqh) obj;
        String str = nqhVar.a;
        if (str == null) {
            akeVar.f(1);
        } else {
            akeVar.g(1, str);
        }
        String str2 = nqhVar.b;
        if (str2 == null) {
            akeVar.f(2);
        } else {
            akeVar.g(2, str2);
        }
        String strO = npy.o(nqhVar.c);
        if (strO == null) {
            akeVar.f(3);
        } else {
            akeVar.g(3, strO);
        }
        Long lP = npy.p(nqhVar.d);
        if (lP == null) {
            akeVar.f(4);
        } else {
            akeVar.e(4, lP.longValue());
        }
        Long lD = npy.d(nqhVar.e);
        if (lD == null) {
            akeVar.f(5);
        } else {
            akeVar.e(5, lD.longValue());
        }
        akeVar.e(6, nqhVar.f);
        String str3 = nqhVar.g;
        if (str3 == null) {
            akeVar.f(7);
        } else {
            akeVar.g(7, str3);
        }
        String str4 = nqhVar.h;
        if (str4 == null) {
            akeVar.f(8);
        } else {
            akeVar.g(8, str4);
        }
        String strT = npy.t(nqhVar.t);
        if (strT == null) {
            akeVar.f(9);
        } else {
            akeVar.g(9, strT);
        }
        Long lD2 = npy.d(nqhVar.i);
        if (lD2 == null) {
            akeVar.f(10);
        } else {
            akeVar.e(10, lD2.longValue());
        }
        Long lD3 = npy.d(nqhVar.j);
        if (lD3 == null) {
            akeVar.f(11);
        } else {
            akeVar.e(11, lD3.longValue());
        }
        Long lD4 = npy.d(nqhVar.k);
        if (lD4 == null) {
            akeVar.f(12);
        } else {
            akeVar.e(12, lD4.longValue());
        }
        akeVar.e(13, nqhVar.l ? 1L : 0L);
        akeVar.g(14, npy.f(nqhVar.m));
        String str5 = nqhVar.n;
        if (str5 == null) {
            akeVar.f(15);
        } else {
            akeVar.g(15, str5);
        }
        String str6 = nqhVar.o;
        if (str6 == null) {
            akeVar.f(16);
        } else {
            akeVar.g(16, str6);
        }
        byte[] bArrL = npy.l(nqhVar.p);
        if (bArrL == null) {
            akeVar.f(17);
        } else {
            akeVar.c(17, bArrL);
        }
        byte[] bArrG = npy.g(nqhVar.q);
        if (bArrG == null) {
            akeVar.f(18);
        } else {
            akeVar.c(18, bArrG);
        }
        akeVar.e(19, nqhVar.s);
        npk npkVar = nqhVar.r;
        Long lP2 = npy.p(npkVar.a);
        if (lP2 == null) {
            akeVar.f(20);
        } else {
            akeVar.e(20, lP2.longValue());
        }
        Long lP3 = npy.p(npkVar.b);
        if (lP3 == null) {
            akeVar.f(21);
        } else {
            akeVar.e(21, lP3.longValue());
        }
        Long lP4 = npy.p(npkVar.c);
        if (lP4 == null) {
            akeVar.f(22);
        } else {
            akeVar.e(22, lP4.longValue());
        }
        akeVar.e(23, npy.a(npkVar.d));
        akeVar.e(24, npy.r(npkVar.e));
        akeVar.d(25, npkVar.f);
        akeVar.e(26, nqhVar.s);
    }

    @Override // defpackage.aiy
    public final String d() {
        return "UPDATE OR ABORT `ResourceEntity` SET `title` = ?,`experienceId` = ?,`queryableTags` = ?,`queryableEpochTimestamp` = ?,`queryableDuration` = ?,`approximateTotalSize` = ?,`namespaceId` = ?,`partitionId` = ?,`f250ResourceId` = ?,`f250AutoUploadDelay` = ?,`airlockExpiration` = ?,`f250Expiration` = ?,`deleteAirlockFilesOnceUploaded` = ?,`nonSignedInDataOwners` = ?,`overridenObfuscatedGaiaId` = ?,`uploadTransferHandle` = ?,`relations` = ?,`indexTokens` = ?,`onDeviceId` = ?,`status_addedToAirlockEpochTimestamp` = ?,`status_uploadToF250RequestedEpochTimestamp` = ?,`status_uploadToF250CompletedEpochTimestamp` = ?,`status_airlockFileState` = ?,`status_uploadState` = ?,`status_uploadProgressPercent` = ? WHERE `onDeviceId` = ?";
    }
}
