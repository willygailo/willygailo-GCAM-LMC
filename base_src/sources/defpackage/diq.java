package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class diq extends aiy {
    public diq(aii aiiVar) {
        super(aiiVar);
    }

    @Override // defpackage.aiy
    public final String d() {
        return "UPDATE shots SET most_recent_event_millis = ? WHERE shot_id = ?";
    }
}
