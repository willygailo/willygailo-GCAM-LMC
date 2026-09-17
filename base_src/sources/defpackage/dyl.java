package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class dyl implements lxa {
    final /* synthetic */ lxa a;
    final /* synthetic */ dym b;

    public dyl(dym dymVar, lxa lxaVar) {
        this.b = dymVar;
        this.a = lxaVar;
    }

    @Override // defpackage.lxa
    public final String a() {
        return this.a.a();
    }

    @Override // defpackage.lxa
    public final void b(long j, long j2, lwz lwzVar) {
        this.a.b(j, j2, lwzVar);
    }

    @Override // defpackage.lxa, defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        synchronized (this.b) {
            this.b.a.remove(this);
        }
    }
}
