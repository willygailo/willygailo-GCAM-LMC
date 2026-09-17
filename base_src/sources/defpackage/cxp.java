package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class cxp extends aiy {
    public cxp(aii aiiVar) {
        super(aiiVar);
    }

    @Override // defpackage.aiy
    public final String d() {
        return "UPDATE FatalErrorCounts SET failuresBeforeRebootDuringOpen = 0 , failuresAfterRebootDuringOpen = 0 WHERE cameraId = ?";
    }
}
