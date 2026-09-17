package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gkp implements gmu {
    public final lis a;
    public final glc b;
    public final brg c;
    public final jtx d;
    public final pyn e;
    public final lco g;
    public final hkr h;
    public final gln j;
    private final glg k;
    private final hoh l;
    public int i = 1;
    public final Object f = new Object();

    public gkp(lir lirVar, glc glcVar, glg glgVar, brg brgVar, gln glnVar, jtx jtxVar, pyn pynVar, lco lcoVar, hoh hohVar, hkr hkrVar) {
        this.b = glcVar;
        this.k = glgVar;
        this.c = brgVar;
        this.j = glnVar;
        this.d = jtxVar;
        this.a = lirVar.a("FsnRprcssngIS");
        this.e = pynVar;
        this.g = lcoVar;
        this.l = hohVar;
        this.h = hkrVar;
    }

    @Override // defpackage.gmu
    public final gmt a(gog gogVar) {
        return new gko(this, this.k, gogVar.b, gogVar.a, this.l);
    }

    @Override // defpackage.gmu
    public final gmt b(gog gogVar) {
        return new gko(this, this.k, gogVar.b, gogVar.a, this.l);
    }
}
