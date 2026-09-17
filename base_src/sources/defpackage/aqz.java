package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class aqz extends aiy {
    public aqz(aii aiiVar) {
        super(aiiVar);
    }

    @Override // defpackage.aiy
    public final String d() {
        return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
    }
}
