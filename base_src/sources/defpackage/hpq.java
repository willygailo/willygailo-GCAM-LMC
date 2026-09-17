package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class hpq implements phh {
    final /* synthetic */ hps a;

    public hpq(hps hpsVar) {
        this.a = hpsVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        this.a.X();
    }

    @Override // defpackage.phh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (Boolean.TRUE.equals((Boolean) obj)) {
            this.a.n = true;
        } else {
            this.a.X();
        }
    }
}
