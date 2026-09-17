package defpackage;

import android.content.SharedPreferences;
import android.media.MediaFormat;
import android.os.Handler;
import j$.util.function.Supplier;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class bsr implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;
    private final qkg f;
    private final qkg g;
    private final qkg h;
    private final qkg i;
    private final qkg j;
    private final /* synthetic */ int k;

    public bsr(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, int i) {
        this.k = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
        this.f = qkgVar6;
        this.g = qkgVar7;
        this.h = qkgVar8;
        this.i = qkgVar9;
        this.j = qkgVar10;
    }

    public bsr(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, int i, byte[] bArr) {
        this.k = i;
        this.h = qkgVar;
        this.d = qkgVar2;
        this.c = qkgVar3;
        this.a = qkgVar4;
        this.j = qkgVar5;
        this.b = qkgVar6;
        this.e = qkgVar7;
        this.f = qkgVar8;
        this.g = qkgVar9;
        this.i = qkgVar10;
    }

    public bsr(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, int i, char[] cArr) {
        this.k = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.f = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
        this.j = qkgVar6;
        this.i = qkgVar7;
        this.g = qkgVar8;
        this.c = qkgVar9;
        this.h = qkgVar10;
    }

    public bsr(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, int i, float[] fArr) {
        this.k = i;
        this.a = qkgVar;
        this.i = qkgVar2;
        this.h = qkgVar3;
        this.f = qkgVar4;
        this.j = qkgVar5;
        this.d = qkgVar6;
        this.g = qkgVar7;
        this.c = qkgVar8;
        this.b = qkgVar9;
        this.e = qkgVar10;
    }

    public bsr(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, int i, int[] iArr) {
        this.k = i;
        this.d = qkgVar;
        this.i = qkgVar2;
        this.c = qkgVar3;
        this.g = qkgVar4;
        this.a = qkgVar5;
        this.b = qkgVar6;
        this.e = qkgVar7;
        this.h = qkgVar8;
        this.j = qkgVar9;
        this.f = qkgVar10;
    }

    public bsr(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, int i, short[] sArr) {
        this.k = i;
        this.g = qkgVar;
        this.c = qkgVar2;
        this.j = qkgVar3;
        this.i = qkgVar4;
        this.e = qkgVar5;
        this.a = qkgVar6;
        this.f = qkgVar7;
        this.h = qkgVar8;
        this.d = qkgVar9;
        this.b = qkgVar10;
    }

    public bsr(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, int i, boolean[] zArr) {
        this.k = i;
        this.a = qkgVar;
        this.h = qkgVar2;
        this.e = qkgVar3;
        this.f = qkgVar4;
        this.i = qkgVar5;
        this.c = qkgVar6;
        this.j = qkgVar7;
        this.d = qkgVar8;
        this.g = qkgVar9;
        this.b = qkgVar10;
    }

    public bsr(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, int i, byte[][] bArr) {
        this.k = i;
        this.f = qkgVar;
        this.i = qkgVar2;
        this.j = qkgVar3;
        this.b = qkgVar4;
        this.c = qkgVar5;
        this.g = qkgVar6;
        this.a = qkgVar7;
        this.e = qkgVar8;
        this.h = qkgVar9;
        this.d = qkgVar10;
    }

    public bsr(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, int i, char[][] cArr) {
        this.k = i;
        this.d = qkgVar;
        this.h = qkgVar2;
        this.e = qkgVar3;
        this.j = qkgVar4;
        this.b = qkgVar5;
        this.f = qkgVar6;
        this.g = qkgVar7;
        this.a = qkgVar8;
        this.i = qkgVar9;
        this.c = qkgVar10;
    }

    public bsr(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, int i, float[][] fArr) {
        this.k = i;
        this.i = qkgVar;
        this.h = qkgVar2;
        this.g = qkgVar3;
        this.a = qkgVar4;
        this.j = qkgVar5;
        this.f = qkgVar6;
        this.c = qkgVar7;
        this.e = qkgVar8;
        this.b = qkgVar9;
        this.d = qkgVar10;
    }

    public bsr(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, int i, int[][] iArr) {
        this.k = i;
        this.a = qkgVar;
        this.d = qkgVar2;
        this.i = qkgVar3;
        this.h = qkgVar4;
        this.e = qkgVar5;
        this.j = qkgVar6;
        this.g = qkgVar7;
        this.c = qkgVar8;
        this.b = qkgVar9;
        this.f = qkgVar10;
    }

    public bsr(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, int i, short[][] sArr) {
        this.k = i;
        this.b = qkgVar;
        this.g = qkgVar2;
        this.d = qkgVar3;
        this.j = qkgVar4;
        this.h = qkgVar5;
        this.f = qkgVar6;
        this.e = qkgVar7;
        this.a = qkgVar8;
        this.c = qkgVar9;
        this.i = qkgVar10;
    }

    public bsr(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, int i, boolean[][] zArr) {
        this.k = i;
        this.j = qkgVar;
        this.f = qkgVar2;
        this.i = qkgVar3;
        this.h = qkgVar4;
        this.g = qkgVar5;
        this.a = qkgVar6;
        this.d = qkgVar7;
        this.c = qkgVar8;
        this.b = qkgVar9;
        this.e = qkgVar10;
    }

    public static bsr a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11) {
        return new bsr(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar6, qkgVar7, qkgVar8, qkgVar9, qkgVar10, qkgVar11, 9, (short[][]) null);
    }

    public static bsr b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10) {
        return new bsr(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, qkgVar8, qkgVar9, qkgVar10, 10, (int[][]) null);
    }

    public static bsr c(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10) {
        return new bsr(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, qkgVar8, qkgVar9, qkgVar10, 11, (boolean[][]) null);
    }

    public static bsr d(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10) {
        return new bsr(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, qkgVar8, qkgVar9, qkgVar10, 12, (float[][]) null);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.k) {
            case 0:
                return new bsq((aar) this.a.get(), (bst) this.b.get(), ((bsv) this.c).get(), (aaq) this.d.get(), ((emn) this.e).get(), (fjs) this.f.get(), (ddf) this.g.get(), (bui) this.h.get(), ((lhr) this.i).get(), (huf) this.j.get(), null, null);
            case 1:
                return new bqz(((eme) this.h).get(), (brc) this.d.get(), ((etj) this.c).get(), (bqt) this.a.get(), (emb) this.j.get(), ((eti) this.b).get(), (lar) this.e.get(), ((bwq) this.f).a(), ((Boolean) this.g.get()).booleanValue(), (ddf) this.i.get(), null, null);
            case 2:
                return new cmy(((emf) this.b).get(), (jhh) this.a.get(), ((crz) this.f).get(), (cvo) this.d.get(), (imt) this.e.get(), ((ing) this.j).a(), (lar) this.i.get(), (huf) this.g.get(), (hug) this.c.get(), (ddf) this.h.get());
            case 3:
                return new cqq(((cjc) this.g).a(), (lda) this.c.get(), ((cpk) this.j).get(), (cvo) this.i.get(), (cqw) this.e.get(), (ddf) this.a.get(), ((iwi) this.f).get(), (lda) this.h.get(), ((etg) this.d).get(), ((cjc) this.b).a());
            case 4:
                return new dba(((evv) this.d).a(), (eiy) this.i.get(), (gvb) this.c.get(), (lda) this.g.get(), (ScheduledExecutorService) this.a.get(), (ddf) this.b.get(), (dbl) this.e.get(), (dbe) this.h.get(), (dch) this.j.get(), (fjs) this.f.get(), null);
            case 5:
                return new eam((ddf) this.a.get(), (lco) this.h.get(), (lco) this.e.get(), (lco) this.f.get(), (Supplier) this.i.get(), (hlv) this.c.get(), (huf) this.j.get(), (bui) this.d.get(), (lar) this.g.get(), (ead) this.b.get());
            case 6:
                return new ewe(((eth) this.a).get(), (pih) this.i.get(), pyr.a(this.h), (jng) this.f.get(), pyr.a(this.j), pyr.a(this.d), pyr.a(this.g), (lda) this.c.get(), (lar) this.b.get(), (ljf) this.e.get(), null, null);
            case 7:
                final hyc hycVar = (hyc) this.f.get();
                final fkh fkhVar = (fkh) this.i.get();
                final flb flbVar = (flb) this.j.get();
                final fkj fkjVar = (fkj) this.b.get();
                final fky fkyVar = (fky) this.c.get();
                final ddf ddfVar = (ddf) this.g.get();
                final boolean zBooleanValue = ((bpk) this.a).a().booleanValue();
                final bod bodVar = (bod) this.e.get();
                final lda ldaVar = (lda) this.h.get();
                final bqg bqgVar = ((etg) this.d).get();
                return new iho() { // from class: fkk
                    @Override // java.lang.Runnable
                    public final void run() {
                        ddf ddfVar2 = ddfVar;
                        hyc hycVar2 = hycVar;
                        fkh fkhVar2 = fkhVar;
                        boolean z = zBooleanValue;
                        fkj fkjVar2 = fkjVar;
                        flb flbVar2 = flbVar;
                        fky fkyVar2 = fkyVar;
                        bqg bqgVar2 = bqgVar;
                        lda ldaVar2 = ldaVar;
                        final bod bodVar2 = bodVar;
                        if (!ddfVar2.k(ddm.aa)) {
                            iau iauVarA = iav.a();
                            iauVarA.a = "Night";
                            iauVarA.c(ope.H(jrl.PHOTO));
                            iauVarA.b(ope.I(lwd.BACK, lwd.FRONT));
                            if (z) {
                                iau iauVarA2 = iav.a();
                                iauVarA2.a = "NightBack";
                                iauVarA2.c(ope.H(jrl.PHOTO));
                                iauVarA2.b(ope.H(lwd.BACK));
                                hycVar2.a(fkjVar2, iauVarA2.a());
                                iau iauVarA3 = iav.a();
                                iauVarA3.a = "NightFront";
                                iauVarA3.c(ope.H(jrl.PHOTO));
                                iauVarA3.b(ope.H(lwd.FRONT));
                                hycVar2.a(flbVar2, iauVarA3.a());
                            } else {
                                hycVar2.a(flbVar2, iauVarA.a());
                            }
                            if (ddfVar2.k(ddq.d)) {
                                iauVarA.c(ope.H(jrl.PHOTO));
                                iauVarA.b(ope.H(lwd.FRONT));
                                hycVar2.a(fkyVar2, iauVarA.a());
                            }
                        } else if (ddfVar2.k(ddm.A)) {
                            iau iauVarA4 = iav.a();
                            iauVarA4.a = "Astro";
                            iauVarA4.e(true);
                            iauVarA4.c(ope.H(jrl.PHOTO));
                            iauVarA4.b(ope.H(lwd.BACK));
                            hycVar2.a(fkhVar2, iauVarA4.a());
                        }
                        lap lapVarI = bqgVar2.i();
                        bodVar2.getClass();
                        lapVarI.c(ldaVar2.a(new lij() { // from class: fkl
                            @Override // defpackage.lij
                            public final void fB(Object obj) {
                                bod bodVar3 = bodVar2;
                                lar.a();
                                bodVar3.a = (jrl) obj;
                            }
                        }, mip.bS()));
                    }
                };
            case 8:
                return new fnf(((etg) this.d).get(), ((jnw) this.h).get(), ((emn) this.e).get(), (SharedPreferences) this.j.get(), (elw) this.b.get(), (huj) this.f.get(), ((fvl) this.g).get(), (ddf) this.a.get(), (ScheduledExecutorService) this.i.get(), (Handler) this.c.get());
            case 9:
                pyr.a(this.g);
                ((hqw) this.j).get();
                return new fcy(null);
            case 10:
                final qkg qkgVar = this.a;
                final lap lapVar = (lap) this.d.get();
                final ojc ojcVar = (ojc) this.i.get();
                gxm gxmVar = ((djc) this.h).get();
                nez nezVar = ((gjf) this.e).get();
                final qkg qkgVar2 = this.j;
                final qkg qkgVar3 = this.g;
                final qkg qkgVar4 = this.c;
                final Executor executor = (Executor) this.b.get();
                final ljf ljfVar = (ljf) this.f.get();
                Object objH = (gxmVar.c() && nezVar.a) ? ope.H(new Runnable() { // from class: fsx
                    @Override // java.lang.Runnable
                    public final void run() {
                        ljf ljfVar2 = ljfVar;
                        lap lapVar2 = lapVar;
                        qkg qkgVar5 = qkgVar;
                        qkg qkgVar6 = qkgVar4;
                        qkg qkgVar7 = qkgVar3;
                        qkg qkgVar8 = qkgVar2;
                        Executor executor2 = executor;
                        ojc ojcVar2 = ojcVar;
                        ljfVar2.e("MICRO_GyroModule#runGyroStartupTask");
                        lapVar2.c(new fsv(((ftz) qkgVar5.get()).a(), 0));
                        ((dvx) qkgVar6.get()).h("microvideo-metadata");
                        lapVar2.c(new fsw(qkgVar6, 0));
                        ((dvp) qkgVar7.get()).f((dvq) qkgVar8.get(), executor2);
                        if (ojcVar2.g()) {
                            ((fqi) ojcVar2.c()).e();
                            final fqi fqiVar = (fqi) ojcVar2.c();
                            lapVar2.c(new lie() { // from class: fsu
                                @Override // defpackage.lie, java.lang.AutoCloseable
                                public final void close() {
                                    fqiVar.f();
                                }
                            });
                        }
                        ljfVar2.f();
                    }
                }) : orx.a;
                qmd.ae(objH);
                return objH;
            case 11:
                dvp dvpVar = (dvp) this.j.get();
                List list = ((fvc) this.f).get();
                fun funVar = (fun) this.i.get();
                gxm gxmVar2 = ((djc) this.h).get();
                ddf ddfVar2 = (ddf) this.g.get();
                Executor executor2 = (Executor) this.a.get();
                ((emp) this.d).a();
                return new fva(dvpVar, list, funVar, gxmVar2, ddfVar2, executor2, (fus) this.c.get(), (hko) this.b.get(), (fvq) this.e.get(), null, null, null);
            default:
                return new gay((gaz) this.i.get(), (geq) this.h.get(), ((liq) this.g).get(), (ddf) this.a.get(), ((gce) this.j).get(), (MediaFormat) this.f.get(), (MediaFormat) this.c.get(), ((Long) this.e.get()).longValue(), (hcg) this.b.get(), (ojc) ((pyt) this.d).a);
        }
    }
}
