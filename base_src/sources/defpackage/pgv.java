package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class pgv implements pgj {
    final /* synthetic */ pgy a;
    final /* synthetic */ pgj b;

    public pgv(pgy pgyVar, pgj pgjVar) {
        this.a = pgyVar;
        this.b = pgjVar;
    }

    @Override // defpackage.pgj
    public final pht a() {
        return !this.a.compareAndSet(pgx.NOT_RUN, pgx.STARTED) ? plk.T() : this.b.a();
    }

    public final String toString() {
        return this.b.toString();
    }
}
