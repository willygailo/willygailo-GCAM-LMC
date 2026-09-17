package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class evi implements der {
    private final ewb a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;
    private final qkg f;
    private final qkg g;
    private final qkg h;
    private final qkg i;
    private final qkg j;
    private final qkg k;
    private final qkg l;
    private final qkg m;
    private final qkg n;

    public evi(ewb ewbVar, dev devVar) {
        this.a = ewbVar;
        dex dexVar = new dex(devVar);
        this.b = dexVar;
        dey deyVar = new dey(devVar);
        this.c = deyVar;
        dew dewVar = new dew(devVar);
        this.d = dewVar;
        dxc dxcVar = new dxc(dewVar);
        this.e = dxcVar;
        dxe dxeVar = new dxe(ewbVar.cC);
        this.f = dxeVar;
        dxg dxgVar = new dxg(deyVar, dewVar);
        this.g = dxgVar;
        dwy dwyVar = new dwy(ewbVar.cD, dxcVar, ewbVar.cC);
        this.h = dwyVar;
        dxb dxbVar = new dxb(dxcVar, dxeVar, dxgVar, dwyVar);
        this.i = dxbVar;
        des desVar = new des(deyVar);
        this.j = desVar;
        dug dugVar = new dug(10);
        this.k = dugVar;
        dug dugVar2 = new dug(9);
        this.l = dugVar2;
        dxw dxwVar = new dxw(ewbVar.cD, ewbVar.k, dugVar, dugVar2);
        this.m = dxwVar;
        this.n = pyr.b(new cax(dexVar, deyVar, dxbVar, desVar, dxwVar, dxcVar, ewbVar.k, 12, (float[][]) null));
    }

    @Override // defpackage.der
    public final det a() {
        return (det) this.n.get();
    }

    @Override // defpackage.der
    public final qiz b() {
        return (qiz) this.a.D.get();
    }
}
