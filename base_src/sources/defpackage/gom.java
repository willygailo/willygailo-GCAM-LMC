package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gom implements goy {
    private final lco a;
    private final lis b;
    private final lco c;
    private final lco d;

    public gom(lir lirVar, lco lcoVar) {
        this.a = lcoVar;
        this.b = lirVar.a("ImgCptrSwitch");
        this.c = lcg.c(lcv.j(lcoVar, new brr(5)));
        this.d = lcg.c(lcv.j(lcoVar, new brr(6)));
    }

    @Override // defpackage.goy
    public final lco a() {
        return this.c;
    }

    @Override // defpackage.goy
    public final lco b() {
        return this.d;
    }

    @Override // defpackage.goy
    public final void c(gox goxVar, gog gogVar) {
        goy goyVar = (goy) this.a.fA();
        lis lisVar = this.b;
        String strValueOf = String.valueOf(goyVar.toString());
        lisVar.b(strValueOf.length() != 0 ? "Running command: ".concat(strValueOf) : new String("Running command: "));
        goyVar.c(goxVar, gogVar);
    }

    public final String toString() {
        ojb ojbVarAZ = obr.aZ(this);
        ojbVarAZ.a(this.a);
        return ojbVarAZ.toString();
    }
}
