package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dui implements duo {
    public final dup a;
    public final qkg b;
    public final qkg c;
    public final qkg d;
    public final qkg e;
    public final qkg f;
    public final qkg g;
    public final qkg h;
    public final qkg i;
    private final qkg j;
    private final qkg k;
    private final qkg l;
    private final qkg m;
    private final qkg n;
    private final qkg o;
    private final qkg p;
    private final qkg q;

    public dui(dup dupVar) {
        this.a = dupVar;
        duq duqVar = new duq(dupVar);
        this.j = duqVar;
        dut dutVar = new dut(dupVar);
        this.k = dutVar;
        dus dusVar = new dus(dupVar);
        this.l = dusVar;
        dur durVar = new dur(dupVar);
        this.m = durVar;
        duu duuVar = new duu(dupVar);
        this.n = duuVar;
        duv duvVar = new duv(dupVar);
        this.o = duvVar;
        bno bnoVar = new bno((qkg) dutVar, (qkg) dusVar, (qkg) durVar, (qkg) duuVar, (qkg) duvVar, 15, (short[][][]) null);
        this.p = bnoVar;
        qkg qkgVarB = pyr.b(bnoVar);
        this.q = qkgVarB;
        this.b = pyr.b(new bno((qkg) duqVar, (qkg) dutVar, qkgVarB, (qkg) duuVar, (qkg) dusVar, 16, (int[][][]) null));
        this.c = pyr.b(new dvd(duqVar, qkgVarB, 1));
        this.d = pyr.b(new bno(duqVar, dutVar, qkgVarB, duuVar, dusVar, 19, (byte[]) null, (byte[]) null));
        this.e = pyr.b(new dvd(duqVar, qkgVarB, 3));
        this.f = pyr.b(new bno(duqVar, dutVar, qkgVarB, duuVar, dusVar, 17, (boolean[][][]) null));
        this.g = pyr.b(new dvd(duqVar, qkgVarB, 0));
        this.h = pyr.b(new bno(duqVar, dutVar, qkgVarB, duuVar, dusVar, 18, (float[][][]) null));
        this.i = pyr.b(new dvd(duqVar, qkgVarB, 2));
    }
}
