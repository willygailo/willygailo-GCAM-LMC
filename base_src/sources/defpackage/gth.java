package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class gth implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final /* synthetic */ int d;

    public gth(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i) {
        this.d = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    public gth(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, byte[] bArr) {
        this.d = i;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.a = qkgVar3;
    }

    public gth(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, char[] cArr) {
        this.d = i;
        this.a = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
    }

    public gth(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, float[] fArr) {
        this.d = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
    }

    public gth(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, int[] iArr) {
        this.d = i;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.a = qkgVar3;
    }

    public gth(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, short[] sArr) {
        this.d = i;
        this.a = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
    }

    public gth(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, boolean[] zArr) {
        this.d = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
    }

    public gth(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, byte[][] bArr) {
        this.d = i;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.a = qkgVar3;
    }

    public gth(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, char[][] cArr) {
        this.d = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
    }

    public gth(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, float[][] fArr) {
        this.d = i;
        this.c = qkgVar;
        this.a = qkgVar2;
        this.b = qkgVar3;
    }

    public gth(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, int[][] iArr) {
        this.d = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
    }

    public gth(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, short[][] sArr) {
        this.d = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
    }

    public gth(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, boolean[][] zArr) {
        this.d = i;
        this.a = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
    }

    public gth(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, byte[][][] bArr) {
        this.d = i;
        this.c = qkgVar;
        this.a = qkgVar2;
        this.b = qkgVar3;
    }

    public static gth a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new gth(qkgVar, qkgVar2, qkgVar3, 1, (byte[]) null);
    }

    public static gth b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new gth(qkgVar, qkgVar2, qkgVar3, 4, (short[]) null);
    }

    public static gth c(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new gth(qkgVar, qkgVar2, qkgVar3, 5, (int[]) null);
    }

    public static gth d(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new gth(qkgVar, qkgVar2, qkgVar3, 6);
    }

    public static gth e(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new gth(qkgVar, qkgVar2, qkgVar3, 7, (boolean[]) null);
    }

    public static gth f(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new gth(qkgVar, qkgVar2, qkgVar3, 8);
    }

    public static gth g(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new gth(qkgVar, qkgVar2, qkgVar3, 9);
    }

    public static gth h(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new gth(qkgVar, qkgVar2, qkgVar3, 12, (byte[][]) null);
    }

    public static gth i(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new gth(qkgVar, qkgVar2, qkgVar3, 13, (char[][]) null);
    }

    public static gth j(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new gth(qkgVar, qkgVar2, qkgVar3, 14, (short[][]) null);
    }

    public static gth k(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new gth(qkgVar, qkgVar2, qkgVar3, 15, (int[][]) null);
    }

    public static gth l(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new gth(qkgVar, qkgVar2, qkgVar3, 16);
    }

    public static gth m(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new gth(qkgVar, qkgVar2, qkgVar3, 17);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        Object objH;
        switch (this.d) {
            case 0:
                return new gsp((ddf) this.a.get(), (lco) this.b.get(), ((pyw) this.c).get());
            case 1:
                return ((ddf) this.b.get()).k(ddl.aS) ? ((gyj) this.a).get().a(1) : ((has) this.c).get();
            case 2:
                return new lzb(((emp) this.a).a(), (lar) this.c.get(), ((liq) this.b).get());
            case 3:
                fhv fhvVar = ((etj) this.a).get();
                lar larVar = (lar) this.b.get();
                gve gveVar = ((gvf) this.c).get();
                enl.f(larVar, fhvVar, gveVar);
                return gveVar;
            case 4:
                lnc lncVar = (lnc) this.a.get();
                qkg qkgVar = this.c;
                ojc ojcVarA = ((cjc) this.b).a();
                if (ojcVarA.g()) {
                    dvy dvyVar = (dvy) ojcVarA.c();
                    dwh dwhVar = (dwh) qkgVar.get();
                    hax haxVar = dvyVar.a;
                    ghb ghbVar = (ghb) haxVar.b.get();
                    ghbVar.getClass();
                    dwm dwmVar = (dwm) haxVar.a.get();
                    dwmVar.getClass();
                    ((dju) haxVar.d.get()).getClass();
                    ((ddf) haxVar.c.get()).getClass();
                    lncVar.getClass();
                    dwhVar.getClass();
                    objH = ope.H(new gvs(ghbVar, dwmVar, lncVar, dwhVar));
                } else {
                    objH = orx.a;
                }
                qmd.ae(objH);
                return objH;
            case 5:
                return new dyx((lxb) this.b.get(), (dzb) this.a.get(), (dyz) this.c.get(), 1, 2, 2);
            case 6:
                final lnc lncVar2 = (lnc) this.a.get();
                final lap lapVar = (lap) this.b.get();
                final ojc ojcVarA2 = ((cjc) this.c).a();
                return aas.d(new Runnable() { // from class: gvy
                    @Override // java.lang.Runnable
                    public final void run() {
                        ojc ojcVar = ojcVarA2;
                        lap lapVar2 = lapVar;
                        final lnc lncVar3 = lncVar2;
                        if (ojcVar.g()) {
                            final hcl hclVar = (hcl) ojcVar.c();
                            lapVar2.c(hclVar.b().a(new lij() { // from class: gwb
                                @Override // defpackage.lij
                                public final void fB(Object obj) {
                                    lncVar3.i(hclVar.d((hck) obj));
                                }
                            }, pgr.INSTANCE));
                        }
                    }
                }, "mawb");
            case 7:
                final ojc ojcVar = (ojc) this.c.get();
                Map map = (Map) this.b.get();
                final hcs hcsVar = (hcs) this.a.get();
                final ojc ojcVarH = ojc.h((lnx) map.get(hdr.RAW_WIDE));
                return new ojz() { // from class: gwd
                    @Override // defpackage.ojz
                    public final Object a() {
                        ojc ojcVar2 = ojcVar;
                        hcs hcsVar2 = hcsVar;
                        ojc ojcVar3 = ojcVarH;
                        boolean z = true;
                        if ((!ojcVar2.g() || !((lqd) hcsVar2.a()).c.contains(ojcVar2.c())) && (!ojcVar3.g() || !((lqd) hcsVar2.a()).c.contains(ojcVar3.c()))) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                };
            case 8:
                final gfy gfyVar = (gfy) this.a.get();
                final lnc lncVar3 = (lnc) this.b.get();
                final lap lapVar2 = (lap) this.c.get();
                return aas.d(new Runnable() { // from class: gwf
                    @Override // java.lang.Runnable
                    public final void run() {
                        lapVar2.c(gfyVar.e.a(new cme(lncVar3, 7), pgr.INSTANCE));
                    }
                }, "3aaerest");
            case 9:
                final lnc lncVar4 = (lnc) this.a.get();
                final lap lapVar3 = (lap) this.b.get();
                final hlv hlvVar = (hlv) this.c.get();
                return aas.d(new Runnable() { // from class: gwe
                    @Override // java.lang.Runnable
                    public final void run() {
                        final hlv hlvVar2 = hlvVar;
                        lnc lncVar5 = lncVar4;
                        lap lapVar4 = lapVar3;
                        if (!hlvVar2.a || kdd.g == null) {
                            return;
                        }
                        final boa boaVar = new boa(hlvVar2, lncVar5);
                        hlvVar2.a(boaVar);
                        lapVar4.c(new lie() { // from class: gvw
                            @Override // defpackage.lie, java.lang.AutoCloseable
                            public final void close() {
                                hlvVar2.b(boaVar);
                            }
                        });
                    }
                }, "watdep");
            case 10:
                return new dyx((lxb) this.b.get(), (dzb) this.a.get(), (dyz) this.c.get(), 1, 2, 2);
            case 11:
                Object objH2 = (((ddf) this.c.get()).k(dde.d) && ((gjo) this.a).get().k() == lwd.BACK) ? ope.H((bnr) this.b.get()) : orx.a;
                qmd.ae(objH2);
                return objH2;
            case 12:
                return new gzu((ddf) this.b.get(), ((pks) this.c).get(), ((gjp) this.a).get());
            case 13:
                Object objH3 = ((lzh) this.b.get()).f ? ope.H(new hbw((lce) this.a.get(), (Executor) this.c.get())) : orx.a;
                qmd.ae(objH3);
                return objH3;
            case 14:
                Map map2 = (Map) this.b.get();
                lco lcoVar = (lco) this.a.get();
                lap lapVar4 = (lap) this.c.get();
                obr.aR(map2.containsKey(hdr.RAW_WIDE), "Wide stream not present");
                final hcr hcrVar = new hcr(map2, lcoVar);
                lapVar4.c(new lie() { // from class: hcp
                    @Override // defpackage.lie, java.lang.AutoCloseable
                    public final void close() {
                        hcrVar.a.close();
                    }
                });
                return hcrVar;
            case 15:
                lnx lnxVarB = ((lnc) this.a.get()).b().b((lnz) this.c.get());
                return lnxVarB == null ? oih.a : ojc.i(lnxVarB);
            case 16:
                ghx ghxVarB = ((gjo) this.a).get();
                lwf lwfVar = (lwf) this.b.get();
                ddf ddfVar = (ddf) this.c.get();
                if (ghxVarB.L() && fvq.l(ghxVarB.k(), ddfVar)) {
                    ghxVarB.i();
                    ghxVarB = fvq.B(ghxVarB, lwfVar);
                }
                ghxVarB.i();
                return ghxVarB;
            case 17:
                return fvq.m(((lvp) this.a.get()).i(), ((gsi) this.c).get().a, ((gfw) this.b.get()).a);
            case 18:
                return new hfa((lnc) this.a.get(), (Map) this.c.get(), (ojc) this.b.get());
            case 19:
                return new hff(((emn) this.c).get(), (ScheduledExecutorService) this.a.get(), (fvv) this.b.get());
            default:
                Object objH4 = (((ddf) this.c.get()).k(dcv.b) && ((bpk) this.a).a().booleanValue()) ? ope.H((cbm) pyr.a(this.b).get()) : orx.a;
                qmd.ae(objH4);
                return objH4;
        }
    }
}
