package defpackage;

import android.content.Context;
import com.google.android.apps.camera.bottombar.BottomBarController;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class gvl implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;
    private final qkg f;
    private final /* synthetic */ int g;

    public gvl(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i) {
        this.g = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
        this.f = qkgVar6;
    }

    public gvl(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, byte[] bArr) {
        this.g = i;
        this.b = qkgVar;
        this.d = qkgVar2;
        this.a = qkgVar3;
        this.e = qkgVar4;
        this.c = qkgVar5;
        this.f = qkgVar6;
    }

    public gvl(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, byte[] bArr, byte[] bArr2) {
        this.g = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.f = qkgVar5;
        this.e = qkgVar6;
    }

    public gvl(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, char[] cArr) {
        this.g = i;
        this.a = qkgVar;
        this.f = qkgVar2;
        this.b = qkgVar3;
        this.c = qkgVar4;
        this.e = qkgVar5;
        this.d = qkgVar6;
    }

    public gvl(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, char[] cArr, byte[] bArr) {
        this.g = i;
        this.a = qkgVar;
        this.e = qkgVar2;
        this.d = qkgVar3;
        this.c = qkgVar4;
        this.b = qkgVar5;
        this.f = qkgVar6;
    }

    public gvl(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, float[] fArr) {
        this.g = i;
        this.a = qkgVar;
        this.f = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
        this.b = qkgVar6;
    }

    public gvl(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, int[] iArr) {
        this.g = i;
        this.b = qkgVar;
        this.f = qkgVar2;
        this.a = qkgVar3;
        this.c = qkgVar4;
        this.e = qkgVar5;
        this.d = qkgVar6;
    }

    public gvl(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, short[] sArr) {
        this.g = i;
        this.a = qkgVar;
        this.d = qkgVar2;
        this.c = qkgVar3;
        this.f = qkgVar4;
        this.e = qkgVar5;
        this.b = qkgVar6;
    }

    public gvl(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, boolean[] zArr) {
        this.g = i;
        this.a = qkgVar;
        this.f = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
        this.b = qkgVar6;
    }

    public gvl(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, byte[][] bArr) {
        this.g = i;
        this.a = qkgVar;
        this.d = qkgVar2;
        this.c = qkgVar3;
        this.e = qkgVar4;
        this.b = qkgVar5;
        this.f = qkgVar6;
    }

    public gvl(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, char[][] cArr) {
        this.g = i;
        this.f = qkgVar;
        this.e = qkgVar2;
        this.a = qkgVar3;
        this.d = qkgVar4;
        this.c = qkgVar5;
        this.b = qkgVar6;
    }

    public gvl(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, float[][] fArr) {
        this.g = i;
        this.c = qkgVar;
        this.a = qkgVar2;
        this.e = qkgVar3;
        this.b = qkgVar4;
        this.d = qkgVar5;
        this.f = qkgVar6;
    }

    public gvl(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, int[][] iArr) {
        this.g = i;
        this.c = qkgVar;
        this.a = qkgVar2;
        this.e = qkgVar3;
        this.b = qkgVar4;
        this.f = qkgVar5;
        this.d = qkgVar6;
    }

    public gvl(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, short[][] sArr) {
        this.g = i;
        this.d = qkgVar;
        this.c = qkgVar2;
        this.f = qkgVar3;
        this.b = qkgVar4;
        this.a = qkgVar5;
        this.e = qkgVar6;
    }

    public gvl(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, boolean[][] zArr) {
        this.g = i;
        this.c = qkgVar;
        this.a = qkgVar2;
        this.e = qkgVar3;
        this.b = qkgVar4;
        this.f = qkgVar5;
        this.d = qkgVar6;
    }

    public gvl(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, byte[][][] bArr) {
        this.g = i;
        this.d = qkgVar;
        this.a = qkgVar2;
        this.b = qkgVar3;
        this.f = qkgVar4;
        this.c = qkgVar5;
        this.e = qkgVar6;
    }

    public gvl(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, char[][][] cArr) {
        this.g = i;
        this.d = qkgVar;
        this.a = qkgVar2;
        this.f = qkgVar3;
        this.c = qkgVar4;
        this.e = qkgVar5;
        this.b = qkgVar6;
    }

    public gvl(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, float[][][] fArr) {
        this.g = i;
        this.a = qkgVar;
        this.f = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
        this.b = qkgVar6;
    }

    public gvl(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, int[][][] iArr) {
        this.g = i;
        this.b = qkgVar;
        this.f = qkgVar2;
        this.c = qkgVar3;
        this.a = qkgVar4;
        this.d = qkgVar5;
        this.e = qkgVar6;
    }

    public gvl(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, short[][][] sArr) {
        this.g = i;
        this.b = qkgVar;
        this.f = qkgVar2;
        this.d = qkgVar3;
        this.a = qkgVar4;
        this.c = qkgVar5;
        this.e = qkgVar6;
    }

    public gvl(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, boolean[][][] zArr) {
        this.g = i;
        this.d = qkgVar;
        this.e = qkgVar2;
        this.a = qkgVar3;
        this.c = qkgVar4;
        this.f = qkgVar5;
        this.b = qkgVar6;
    }

    public static gvl a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6) {
        return new gvl(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, 1, (byte[]) null);
    }

    public static gvl b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6) {
        return new gvl(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, 2, (char[]) null);
    }

    public static gvl c(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6) {
        return new gvl(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, 4, (int[]) null);
    }

    public static gvl d(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6) {
        return new gvl(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, 5, (boolean[]) null);
    }

    public static gvl e(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6) {
        return new gvl(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, 6, (float[]) null);
    }

    public static gvl f(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6) {
        return new gvl(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, 17, (boolean[][][]) null);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        lmv lmvVarB;
        hen henVarA;
        switch (this.g) {
            case 0:
                return new gvk(((emp) this.a).a(), (Executor) this.b.get(), (ljf) this.c.get(), ((fhq) this.d).get(), (bus) this.e.get(), (lar) this.f.get());
            case 1:
                lap lapVar = (lap) this.b.get();
                mbg mbgVar = ((gzb) this.d).get();
                lnc lncVar = (lnc) this.a.get();
                ojc ojcVar = (ojc) this.e.get();
                qkg qkgVar = this.c;
                Set set = ((pyw) this.f).get();
                if (ojcVar.g()) {
                    lmvVarB = lncVar.r(lncVar.u((lnx) ojcVar.c(), set), 1);
                } else if (((Map) qkgVar.get()).size() == 1) {
                    lmvVarB = lncVar.r(lncVar.u((lnx) ((Map) qkgVar.get()).values().iterator().next(), set), 1);
                } else {
                    obr.aR(!((Map) qkgVar.get()).isEmpty(), "Not enough RAW streams have been configured.");
                    lmvVarB = mbgVar.b(1);
                }
                lapVar.c(lmvVarB);
                return lmvVarB;
            case 2:
                final jrl jrlVar = ((giv) this.a).get();
                final ddf ddfVar = (ddf) this.f.get();
                lvp lvpVar = ((gjp) this.b).get();
                final eam eamVar = (eam) this.c.get();
                final ojz ojzVar = (ojz) this.e.get();
                final lco lcoVarA = ((gqz) this.d).a();
                return (((Integer) ddfVar.a(ddm.c).e(0)).intValue() <= 0 || lvpVar.k() != lwd.BACK) ? fob.c : new ojz() { // from class: gwc
                    @Override // defpackage.ojz
                    public final Object a() {
                        lco lcoVar = lcoVarA;
                        ddf ddfVar2 = ddfVar;
                        eam eamVar2 = eamVar;
                        jrl jrlVar2 = jrlVar;
                        ojz ojzVar2 = ojzVar;
                        hte hteVar = (hte) lcoVar.fA();
                        return Boolean.valueOf((jrlVar2 == jrl.LONG_EXPOSURE || (ddfVar2.k(ddm.aa) && ddfVar2.k(ddm.ah) && ((Boolean) eamVar2.a().fA()).booleanValue())) && !(hteVar != null && hteVar != hte.ON && hteVar != hte.ON_LOCKED) && ((Boolean) ojzVar2.a()).booleanValue());
                    }
                };
            case 3:
                ddf ddfVar2 = (ddf) this.a.get();
                lnc lncVar2 = (lnc) this.d.get();
                Map map = (Map) this.c.get();
                ojc ojcVar2 = (ojc) this.f.get();
                ojc ojcVar3 = (ojc) this.e.get();
                qkg qkgVar2 = this.b;
                lnx lnxVar = (lnx) map.get(hdr.RAW_WIDE);
                lnx lnxVar2 = (lnx) map.get(hdr.RAW_TELE);
                if (!ddfVar2.k(ddx.w) || lnxVar == null || lnxVar2 == null) {
                    return oih.a;
                }
                return fvq.q(lncVar2, ope.I(lnxVar, lnxVar2), ddfVar2.k(ddm.am) ? ojcVar3 : oih.a, ojcVar2, oih.a, qkgVar2);
            case 4:
                final lar larVar = (lar) this.b.get();
                lap lapVar2 = (lap) this.f.get();
                lnc lncVar3 = (lnc) this.a.get();
                final ojc ojcVar4 = (ojc) this.c.get();
                final pht phtVar = ((gje) this.e).get();
                final ojc ojcVarA = ((gjb) this.d).a();
                if (!ojcVar4.g()) {
                    return bwb.a;
                }
                if (!ojcVarA.g()) {
                    lapVar2.c(lncVar3.p(lncVar3.s((lnx) ojcVar4.c())));
                }
                return aas.f(new bvv() { // from class: hdc
                    @Override // defpackage.bvv
                    public final /* synthetic */ String c() {
                        return aas.g(this);
                    }

                    @Override // defpackage.bvv
                    public final pht fz() {
                        pht phtVar2 = phtVar;
                        final ojc ojcVar5 = ojcVarA;
                        final ojc ojcVar6 = ojcVar4;
                        return pfj.i(pgb.h(phtVar2, new oiu() { // from class: hdd
                            @Override // defpackage.oiu
                            public final Object a(Object obj) {
                                ojc ojcVar7 = ojcVar5;
                                ojc ojcVar8 = ojcVar6;
                                jnj jnjVar = (jnj) obj;
                                if (!jnjVar.a.isValid()) {
                                    return false;
                                }
                                if (ojcVar7.g()) {
                                    ((jwx) ojcVar7.c()).d(jnjVar.a, jnjVar.b, jnjVar.c);
                                } else {
                                    ((lnx) ojcVar8.c()).d(jnjVar.a);
                                }
                                return true;
                            }
                        }, larVar), Throwable.class, ewp.d, pgr.INSTANCE);
                    }
                }, "pckvf");
            case 5:
                ghx ghxVar = ((gjo) this.a).get();
                gfw gfwVar = (gfw) this.f.get();
                jth jthVar = (jth) this.c.get();
                jrl jrlVar2 = ((giv) this.d).get();
                ojc ojcVarB = ((fsr) this.e).b();
                ddf ddfVar3 = (ddf) this.b.get();
                obr.aF(ghxVar.L());
                if (jthVar.f().size() == 2 && ddfVar3.k(ddl.T)) {
                    return oih.a;
                }
                lvp lvpVarC = jthVar.c();
                lvpVarC.i();
                lvpVarC.r();
                return ojc.i(fvq.i(lvpVarC, gfwVar, jrlVar2, ddfVar3, ojcVarB));
            case 6:
                ghx ghxVar2 = ((gjo) this.a).get();
                gfw gfwVar2 = (gfw) this.f.get();
                jth jthVar2 = (jth) this.c.get();
                jrl jrlVar3 = ((giv) this.d).get();
                ojc ojcVarB2 = ((fsr) this.e).b();
                ddf ddfVar4 = (ddf) this.b.get();
                obr.aF(ghxVar2.L());
                if (!ddfVar4.k(ddl.T)) {
                    return oih.a;
                }
                lvp lvpVarE = jthVar2.e();
                lvpVarE.i();
                lvpVarE.r();
                return ojc.i(fvq.i(lvpVarE, gfwVar2, jrlVar3, ddfVar4, ojcVarB2));
            case 7:
                lnc lncVar4 = (lnc) this.a.get();
                qkg qkgVar3 = this.d;
                qkg qkgVar4 = this.c;
                qkg qkgVar5 = this.e;
                ojc ojcVar5 = (ojc) this.b.get();
                qkg qkgVar6 = this.f;
                fob fobVar = fob.d;
                long nanos = TimeUnit.SECONDS.toNanos(5L);
                if (ojcVar5.g()) {
                    henVarA = ((gzg) qkgVar3).get().a(nanos, lncVar4.r((lqd) ojcVar5.c(), 6), fobVar, 2);
                } else {
                    obr.aF(((Map) qkgVar6.get()).size() > 1);
                    henVarA = ((gyv) qkgVar4).get().a(nanos, 6, fobVar);
                }
                henVarA.f().n(((hmn) qkgVar5).get());
                return henVarA;
            case 8:
                return new hsh(((mbm) this.f).get(), (ljf) this.e.get(), ((liq) this.a).get(), (ddf) this.d.get(), (huf) this.c.get(), (mcc) this.b.get(), dug.a());
            case 9:
                ih ihVar = ((emi) this.d).get();
                img imgVar = (img) this.c.get();
                ojz ojzVar2 = ((jbz) this.f).get();
                ddf ddfVar5 = (ddf) this.b.get();
                return new ibb(ihVar, imgVar, ojzVar2, ddfVar5, ((emh) this.e).get());
            case 10:
                return new igb((ihg) this.c.get(), ((gqf) this.a).b().booleanValue(), true, (lda) this.e.get(), (huf) this.f.get(), ((bwq) this.b).a(), ((etg) this.d).get());
            case 11:
                return new igb((ihg) this.c.get(), ((bpk) this.a).a().booleanValue(), false, (lda) this.e.get(), (huf) this.f.get(), ((bwq) this.b).a(), ((etg) this.d).get());
            case 12:
                ojc ojcVarA2 = ((hlj) this.c).a();
                return new igw(ojcVarA2, (ckg) this.e.get(), (ihn) this.b.get(), ((etg) this.d).get(), (ddf) this.f.get());
            case 13:
                return new ihg((ius) this.d.get(), ((emd) this.a).get(), (jts) this.b.get(), ((bwq) this.f).a(), (ScheduledExecutorService) this.c.get(), (hug) this.e.get());
            case 14:
                return new ioa((cvo) this.d.get(), (lda) this.a.get(), ((evg) this.f).get(), (iqn) this.c.get(), (ljf) this.e.get(), (coh) this.b.get());
            case 15:
                return new ita((lda) this.b.get(), (lda) this.f.get(), (lda) this.d.get(), (elw) this.a.get(), (gtg) this.c.get(), (fjs) this.e.get());
            case 16:
                return new itp((imt) this.b.get(), (Executor) this.f.get(), ((ing) this.c).a(), (Executor) this.a.get(), (Executor) this.d.get(), (ljf) this.e.get());
            case 17:
                Boolean bool = (Boolean) this.d.get();
                final qkg qkgVar7 = this.e;
                final qkg qkgVar8 = this.a;
                final qkg qkgVar9 = this.c;
                final qkg qkgVar10 = this.f;
                final lap lapVar3 = (lap) this.b.get();
                Object objH = !bool.booleanValue() ? orx.a : ope.H(new Runnable() { // from class: its
                    @Override // java.lang.Runnable
                    public final void run() {
                        lap lapVar4 = lapVar3;
                        qkg qkgVar11 = qkgVar9;
                        qkg qkgVar12 = qkgVar7;
                        qkg qkgVar13 = qkgVar10;
                        qkg qkgVar14 = qkgVar8;
                        lapVar4.c(((itw) ((hlj) qkgVar11).a().c()).d(ojc.i((fpo) qkgVar12.get()), (ojc) qkgVar13.get()));
                        ((fpo) qkgVar12.get()).g(new gbw(qkgVar11, 2), (Executor) qkgVar14.get());
                    }
                });
                qmd.ae(objH);
                return objH;
            case 18:
                return new ius(((emd) this.a).get(), (lar) this.f.get(), (gvb) this.c.get(), ((etj) this.d).get(), (fjs) this.e.get(), (ddf) this.b.get());
            case 19:
                Context contextA = ((emp) this.b).a();
                BottomBarController bottomBarController = (BottomBarController) this.a.get();
                hpl hplVar = (hpl) this.c.get();
                fhv fhvVar = ((etf) this.d).get();
                lar larVar2 = (lar) this.f.get();
                jak jakVar = new jak(contextA, bottomBarController, hplVar, (fjs) this.e.get());
                enl.f(larVar2, fhvVar, jakVar);
                return jakVar;
            default:
                return new jdk(((emd) this.a).get(), (hug) this.e.get(), ((jda) this.d).get(), (lar) this.c.get(), ((bwq) this.b).a(), (ddf) this.f.get());
        }
    }
}
