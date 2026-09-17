package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class cxn extends aia {
    public cxn(aii aiiVar) {
        super(aiiVar);
    }

    @Override // defpackage.aia
    public final /* bridge */ /* synthetic */ void b(ake akeVar, Object obj) {
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
    }

    @Override // defpackage.aiy
    public final String d() {
        return "INSERT OR IGNORE INTO `FatalErrorCounts` (`cameraId`,`failuresBeforeRebootDuringOpen`,`failuresAfterRebootDuringOpen`,`failuresBeforeRebootDuringSession`,`failuresAfterRebootDuringSession`,`lastFatalErrorTimestamp`,`rebootCount`) VALUES (?,?,?,?,?,?,?)";
    }
}
