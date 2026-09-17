package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gov implements goy {
    private final goy a;
    private final boolean b;
    private final int c;

    public gov(goy goyVar, int i, boolean z) {
        goyVar.getClass();
        this.a = goyVar;
        this.c = i;
        this.b = z;
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
        ((iik) gogVar.b.k()).c = this.b;
        gogVar.b.Y(this.c);
        this.a.c(goxVar, gogVar);
    }

    public final String toString() {
        ojb ojbVarAZ = obr.aZ(this);
        ojbVarAZ.b("delegate", this.a);
        return ojbVarAZ.toString();
    }
}
