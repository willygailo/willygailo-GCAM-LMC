package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class cxo extends ahz {
    public cxo(aii aiiVar) {
        super(aiiVar);
    }

    @Override // defpackage.ahz
    public final /* bridge */ /* synthetic */ void c(ake akeVar, Object obj) {
        cxl cxlVar = (cxl) obj;
        String str = cxlVar.a;
        if (str == null) {
            akeVar.f(1);
        } else {
            akeVar.g(1, str);
        }
        akeVar.e(2, cxlVar.b);
        akeVar.e(3, cxlVar.c);
        akeVar.e(4, cxlVar.d);
        akeVar.e(5, cxlVar.e);
        akeVar.e(6, cxlVar.f);
        akeVar.e(7, cxlVar.g);
        String str2 = cxlVar.a;
        if (str2 == null) {
            akeVar.f(8);
        } else {
            akeVar.g(8, str2);
        }
    }

    @Override // defpackage.aiy
    public final String d() {
        return "UPDATE OR ABORT `FatalErrorCounts` SET `cameraId` = ?,`failuresBeforeRebootDuringOpen` = ?,`failuresAfterRebootDuringOpen` = ?,`failuresBeforeRebootDuringSession` = ?,`failuresAfterRebootDuringSession` = ?,`lastFatalErrorTimestamp` = ?,`rebootCount` = ? WHERE `cameraId` = ?";
    }
}
