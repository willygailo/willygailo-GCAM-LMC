package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class anw extends ajd {
    public anw() {
        super(6, 7);
    }

    @Override // defpackage.ajd
    public final void a(ajy ajyVar) {
        ajyVar.g("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
    }
}
