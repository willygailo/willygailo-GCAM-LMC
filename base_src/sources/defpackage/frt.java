package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class frt implements mlk {
    public final foa a;
    private final mlk b;

    public frt(mlk mlkVar, foa foaVar) {
        this.b = mlkVar;
        this.a = foaVar;
    }

    @Override // defpackage.mlk
    public final mln a() {
        return new frs(this, this.b.a());
    }

    @Override // defpackage.mlk
    public final pht b() {
        return this.b.b();
    }

    @Override // defpackage.mlk
    public final void c() {
        this.b.c();
    }

    @Override // defpackage.mlk
    public final void d() {
        this.b.d();
    }
}
