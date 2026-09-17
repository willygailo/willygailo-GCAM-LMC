package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fwc implements gfu {
    public final lap a;
    public final fvx b;
    public final ghx c;
    private final gfu d;

    public fwc(gfu gfuVar, lap lapVar, fvx fvxVar, ghx ghxVar) {
        gfuVar.getClass();
        fvxVar.getClass();
        ghxVar.getClass();
        this.d = gfuVar;
        this.a = lapVar;
        this.b = fvxVar;
        this.c = ghxVar;
    }

    @Override // defpackage.bmq
    public final bpt a(bnh bnhVar) {
        return this.d.a(bnhVar);
    }

    public final lco b() {
        return this.d.h().a;
    }

    @Override // defpackage.gfu
    public final lie c(lmo lmoVar) {
        return this.d.c(lmoVar);
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
        this.a.close();
    }

    @Override // defpackage.gfu
    public final ojc d() {
        return this.d.d();
    }

    @Override // defpackage.gfu
    public final pht e() {
        return this.d.e();
    }

    @Override // defpackage.gfu
    public final pht f(gfs gfsVar, hsa hsaVar) {
        return this.d.f(gfsVar, hsaVar);
    }

    @Override // defpackage.gfu
    public final boolean g() {
        return this.a.a();
    }

    @Override // defpackage.gfu
    public final hdi h() {
        return this.d.h();
    }

    @Override // defpackage.gfu
    public final lap i() {
        return this.d.i();
    }
}
