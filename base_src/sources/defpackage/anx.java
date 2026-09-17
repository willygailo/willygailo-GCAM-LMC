package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class anx extends ajd {
    public anx() {
        super(7, 8);
    }

    @Override // defpackage.ajd
    public final void a(ajy ajyVar) {
        ajyVar.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
    }
}
