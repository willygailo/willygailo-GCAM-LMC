package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class anu extends ajd {
    public anu() {
        super(3, 4);
    }

    @Override // defpackage.ajd
    public final void a(ajy ajyVar) {
        ajyVar.g("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
    }
}
