package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class haf implements goy {
    private final goy a;
    private final ely b;
    private final ely c;
    private final hen d;

    public haf(goy goyVar, ely elyVar, ely elyVar2, hen henVar) {
        this.b = elyVar;
        this.a = goyVar;
        this.c = elyVar2;
        this.d = henVar;
    }

    private static gew d(hen henVar) {
        return new had(henVar, 0);
    }

    @Override // defpackage.goy
    public final lco a() {
        return this.a.a();
    }

    @Override // defpackage.goy
    public final lco b() {
        return this.a.b();
    }

    @Override // defpackage.goy
    public final void c(gox goxVar, gog gogVar) {
        if (!this.b.c() || !this.c.c()) {
            this.a.c(goxVar, gogVar);
            return;
        }
        ((ges) this.b.b()).k(d(this.d), gogVar);
        if (gogVar.b.i() == hsr.LONG_SHOT) {
            ((gez) this.c.b()).e(gogVar.b.h());
        } else {
            ((gez) this.c.b()).f(gogVar.b.h());
        }
        this.a.c(goxVar, gogVar);
        ((ges) this.b.b()).i(d(this.d), gogVar);
    }

    public final String toString() {
        ojb ojbVarAZ = obr.aZ(this);
        ojbVarAZ.b("delegate", this.a);
        return ojbVarAZ.toString();
    }
}
