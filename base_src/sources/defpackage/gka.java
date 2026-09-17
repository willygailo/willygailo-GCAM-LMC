package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class gka implements gmt {
    final /* synthetic */ gkb a;
    private final gmt b;

    public gka(gkb gkbVar, gmt gmtVar) {
        this.a = gkbVar;
        this.b = gmtVar;
    }

    @Override // defpackage.gmt
    public final void a(mad madVar, pht phtVar) {
        if (this.a.a.contains(Integer.valueOf(madVar.a()))) {
            this.b.a(madVar, phtVar);
        } else {
            madVar.close();
        }
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
