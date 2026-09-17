package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class pin extends phs {
    final /* synthetic */ pip a;
    private final pgj b;

    public pin(pip pipVar, pgj pgjVar) {
        this.a = pipVar;
        pgjVar.getClass();
        this.b = pgjVar;
    }

    @Override // defpackage.phs
    public final /* bridge */ /* synthetic */ Object a() {
        pht phtVarA = this.b.a();
        phtVarA.getClass();
        return phtVarA;
    }

    @Override // defpackage.phs
    public final String b() {
        return this.b.toString();
    }

    @Override // defpackage.phs
    public final void d(Throwable th) {
        this.a.a(th);
    }

    @Override // defpackage.phs
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        this.a.e((pht) obj);
    }

    @Override // defpackage.phs
    public final boolean g() {
        return this.a.isDone();
    }
}
