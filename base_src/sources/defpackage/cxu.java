package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class cxu extends aia {
    public cxu(aii aiiVar) {
        super(aiiVar);
    }

    @Override // defpackage.aia
    public final /* bridge */ /* synthetic */ void b(ake akeVar, Object obj) {
        cxs cxsVar = (cxs) obj;
        akeVar.e(1, cxsVar.a.ordinal());
        akeVar.e(2, cxsVar.b);
        akeVar.e(3, cxsVar.c);
        akeVar.e(4, cxsVar.d);
    }

    @Override // defpackage.aiy
    public final String d() {
        return "INSERT OR IGNORE INTO `HardwareHelpDialogCounts` (`reason`,`impressionsBeforeReboot`,`impressionsAfterReboot`,`rebootCount`) VALUES (?,?,?,?)";
    }
}
