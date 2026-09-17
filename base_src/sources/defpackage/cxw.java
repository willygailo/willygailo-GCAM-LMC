package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class cxw extends aiy {
    public cxw(aii aiiVar) {
        super(aiiVar);
    }

    @Override // defpackage.aiy
    public final String d() {
        return "UPDATE HardwareHelpDialogCounts SET rebootCount = rebootCount+1 WHERE reason=? AND impressionsBeforeReboot > ?";
    }
}
