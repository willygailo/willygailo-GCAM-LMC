package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class arc extends aiy {
    public arc(aii aiiVar) {
        super(aiiVar);
    }

    @Override // defpackage.aiy
    public final String d() {
        return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
    }
}
