package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class lyc implements lym {
    private long a = 0;

    @Override // defpackage.lym
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        this.a += ((Long) obj).longValue();
    }

    @Override // defpackage.lym
    public final void b(lyr lyrVar, Object[] objArr) {
        long j = this.a;
        lyv lyvVar = lyrVar.a;
        lyvVar.getClass();
        lye lyeVarA = lye.a(objArr);
        Object lytVar = (lyw) lyvVar.b.get(lyeVarA);
        if (lytVar == null) {
            lytVar = new lyt();
            lyvVar.b.put(lyeVarA, lytVar);
        }
        ((lyt) lytVar).a += j;
    }
}
