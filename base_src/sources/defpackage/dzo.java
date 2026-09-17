package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class dzo implements eby {
    final /* synthetic */ gog a;
    final /* synthetic */ dzr b;

    public dzo(dzr dzrVar, gog gogVar) {
        this.b = dzrVar;
        this.a = gogVar;
    }

    private final void d() {
        this.a.c.f();
        this.a.a.f.close();
        if (this.b.b.c()) {
            ((gfj) this.b.b.b()).f(this.a.b.h());
        }
    }

    @Override // defpackage.eby
    public final void b(iin iinVar, dzx dzxVar) {
        this.b.i.e("ShotStatus-ShotCompleted");
        if (iinVar != null) {
            this.a.b.k().c(new fkd(dzxVar, Long.valueOf(iinVar.a), Integer.valueOf(iinVar.b)));
        } else {
            this.a.b.k().c(new fkd(dzxVar, null, null));
        }
        this.b.i.f();
    }

    @Override // defpackage.eby
    public final void c(edd eddVar, ebr ebrVar) {
        this.b.j.c("Shot threw an error:", ebrVar);
        d();
    }

    @Override // defpackage.eby
    public final void s(edd eddVar) {
        this.b.j.b("Shot aborted.");
        d();
    }
}
