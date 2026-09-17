package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class npa extends ahz {
    public npa(aii aiiVar) {
        super(aiiVar);
    }

    @Override // defpackage.ahz
    public final /* bridge */ /* synthetic */ void c(ake akeVar, Object obj) {
        npe npeVar = (npe) obj;
        akeVar.e(1, npeVar.a);
        akeVar.e(2, npy.e(npeVar.b));
        String strS = npy.s(npeVar.j);
        if (strS == null) {
            akeVar.f(3);
        } else {
            akeVar.g(3, strS);
        }
        String str = npeVar.c;
        if (str == null) {
            akeVar.f(4);
        } else {
            akeVar.g(4, str);
        }
        akeVar.e(5, npeVar.d);
        String str2 = npeVar.e;
        if (str2 == null) {
            akeVar.f(6);
        } else {
            akeVar.g(6, str2);
        }
        String str3 = npeVar.f;
        if (str3 == null) {
            akeVar.f(7);
        } else {
            akeVar.g(7, str3);
        }
        String str4 = npeVar.g;
        if (str4 == null) {
            akeVar.f(8);
        } else {
            akeVar.g(8, str4);
        }
        akeVar.e(9, npeVar.i);
        npk npkVar = npeVar.h;
        Long lP = npy.p(npkVar.a);
        if (lP == null) {
            akeVar.f(10);
        } else {
            akeVar.e(10, lP.longValue());
        }
        Long lP2 = npy.p(npkVar.b);
        if (lP2 == null) {
            akeVar.f(11);
        } else {
            akeVar.e(11, lP2.longValue());
        }
        Long lP3 = npy.p(npkVar.c);
        if (lP3 == null) {
            akeVar.f(12);
        } else {
            akeVar.e(12, lP3.longValue());
        }
        akeVar.e(13, npy.a(npkVar.d));
        akeVar.e(14, npy.r(npkVar.e));
        akeVar.d(15, npkVar.f);
        akeVar.e(16, npeVar.i);
    }

    @Override // defpackage.aiy
    public final String d() {
        return "UPDATE OR ABORT `AnnotachmentEntity` SET `resourceOnDeviceId` = ?,`isAttachment` = ?,`id` = ?,`contentType` = ?,`onDeviceSize` = ?,`uploadTransferHandle` = ?,`blobstoreId` = ?,`contentHash` = ?,`onDeviceId` = ?,`status_addedToAirlockEpochTimestamp` = ?,`status_uploadToF250RequestedEpochTimestamp` = ?,`status_uploadToF250CompletedEpochTimestamp` = ?,`status_airlockFileState` = ?,`status_uploadState` = ?,`status_uploadProgressPercent` = ? WHERE `onDeviceId` = ?";
    }
}
