package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class ara extends aiy {
    public ara(aii aiiVar) {
        super(aiiVar);
    }

    @Override // defpackage.aiy
    public final String d() {
        return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
    }
}
