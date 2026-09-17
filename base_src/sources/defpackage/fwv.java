package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fwv implements fxh {
    private final fix a;
    private final hpu b;
    private final gvb c;
    private final hpe d;
    private final lco e;
    private final lda f;
    private final lco g;
    private final huf h;
    private final hql i;
    private final hsh j;
    private final hsr k;
    private final hbq l;
    private final ojc m;
    private hsa n;
    private ijp o;
    private final kme p;
    private final meh q;

    public fwv(fix fixVar, kme kmeVar, hpu hpuVar, gvb gvbVar, hpe hpeVar, lda ldaVar, lda ldaVar2, lco lcoVar, huf hufVar, meh mehVar, hql hqlVar, hsh hshVar, hbq hbqVar, ojc ojcVar, hsr hsrVar, byte[] bArr, byte[] bArr2) {
        this.a = fixVar;
        this.p = kmeVar;
        this.b = hpuVar;
        this.c = gvbVar;
        this.d = hpeVar;
        this.e = ldaVar;
        this.f = ldaVar2;
        this.g = lcoVar;
        this.h = hufVar;
        this.q = mehVar;
        this.i = hqlVar;
        this.j = hshVar;
        this.k = hsrVar;
        this.l = hbqVar;
        this.m = ojcVar;
    }

    @Override // defpackage.fxh
    public final void b() {
        hsa hsaVar = this.n;
        hsaVar.getClass();
        hsaVar.S(null);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [hpr, java.lang.Object] */
    @Override // defpackage.fxh
    public final pht c(fwc fwcVar, gft gftVar, boolean z, ijp ijpVar) {
        hsg hsgVarA;
        this.o = ijpVar;
        fvx fvxVar = fwcVar.b;
        long jCurrentTimeMillis = System.currentTimeMillis();
        hsr hsrVar = hsr.UNKNOWN;
        switch (this.k.ordinal()) {
            case 10:
                hsgVarA = this.j.a(jCurrentTimeMillis, dxh.PORTRAIT, "PORTRAIT");
                break;
            case 16:
                hsh hshVar = this.j;
                hsgVarA = hshVar.a(jCurrentTimeMillis, hshVar.a.b(dei.DOGFOOD) ? dxh.DOGFOOD_ONLY : dxh.MOTION_BLUR, "MOTION");
                break;
            default:
                hsgVarA = this.j.d(jCurrentTimeMillis);
                break;
        }
        meh mehVar = this.q;
        hsr hsrVar2 = this.k;
        String strA = this.p.a(jCurrentTimeMillis);
        bww bwwVarC = this.a.c();
        ojc ojcVarI = ojc.i(this.o);
        ?? r7 = mehVar.b.get();
        hhl hhlVar = (hhl) mehVar.c.get();
        hhlVar.getClass();
        ljf ljfVar = (ljf) mehVar.a.get();
        ljfVar.getClass();
        strA.getClass();
        hqq hqqVar = new hqq(r7, hhlVar, ljfVar, hsrVar2, strA, bwwVarC, hsgVarA, ojcVarI);
        lig ligVar = fvxVar.d.a;
        lig ligVarD = fvq.F(this.c.j()) ? ligVar.d() : ligVar.e();
        this.b.e(hqqVar);
        this.i.a(hqqVar);
        hqqVar.P(ligVarD);
        this.n = hqqVar;
        gfs gfsVar = new gfs(this.c.c().e, gftVar, this.d.a, fwcVar.c.k(), fwcVar.c.N(), lcz.a(false), false, false);
        ghx ghxVar = fwcVar.c;
        boolean z2 = ((Integer) this.h.c(htu.c)).intValue() != jbp.OFF.e;
        boolean z3 = ghxVar.k() == lwd.FRONT;
        hun hunVar = z3 ? htu.i : htu.j;
        ojc ojcVarI2 = this.m.g() ? ojc.i(((hcl) this.m.c()).c()) : oih.a;
        iij iijVarK = hqqVar.k();
        fka fkaVarA = fkb.a();
        fkaVarA.c = mip.eN(this.k);
        String strS = hqqVar.s();
        String str = mbs.JPEG.j;
        StringBuilder sb = new StringBuilder(strS.length() + 1 + String.valueOf(str).length());
        sb.append(strS);
        sb.append(".");
        sb.append(str);
        fkaVarA.d(sb.toString());
        fkaVarA.g(z3);
        fkaVarA.n(((Float) this.g.fA()).floatValue());
        fkaVarA.e((String) this.h.c(hunVar));
        fkaVarA.h(z2);
        fkaVarA.l(((Boolean) this.f.fA()).booleanValue());
        fkaVarA.m(((hti) this.e.fA()).g);
        fkaVarA.a = Boolean.valueOf(z);
        fkaVarA.b(ghxVar.h());
        fkaVarA.j((Boolean) this.h.c(htu.k));
        fkaVarA.k(false);
        fkaVarA.l(((Boolean) this.f.fA()).booleanValue());
        fkaVarA.i(hqqVar.j() == hss.MARS_STORE);
        fkaVarA.c(this.l.d());
        fkaVarA.b = ojcVarI2;
        ((iik) iijVarK).w = fkaVarA.a();
        return fwcVar.f(gfsVar, hqqVar);
    }

    @Override // defpackage.fxh
    public final pht d(gfu gfuVar, fvx fvxVar, gft gftVar, ghx ghxVar, boolean z, boolean z2, ijp ijpVar) {
        throw null;
    }
}
