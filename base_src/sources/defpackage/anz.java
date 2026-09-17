package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class anz extends ajd {
    public anz() {
        super(11, 12);
    }

    @Override // defpackage.ajd
    public final void a(ajy ajyVar) {
        ajyVar.g("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
