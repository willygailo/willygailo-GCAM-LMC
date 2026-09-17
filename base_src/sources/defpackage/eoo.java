package defpackage;

import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.googlex.gcam.Gcam;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class eoo implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;
    private final qkg f;
    private final qkg g;
    private final qkg h;
    private final qkg i;
    private final /* synthetic */ int j;

    public eoo(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, int i) {
        this.j = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
        this.f = qkgVar6;
        this.g = qkgVar7;
        this.h = qkgVar8;
        this.i = qkgVar9;
    }

    public eoo(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, int i, byte[] bArr) {
        this.j = i;
        this.f = qkgVar;
        this.d = qkgVar2;
        this.e = qkgVar3;
        this.i = qkgVar4;
        this.h = qkgVar5;
        this.a = qkgVar6;
        this.b = qkgVar7;
        this.c = qkgVar8;
        this.g = qkgVar9;
    }

    public eoo(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, int i, char[] cArr) {
        this.j = i;
        this.e = qkgVar;
        this.g = qkgVar2;
        this.c = qkgVar3;
        this.a = qkgVar4;
        this.b = qkgVar5;
        this.f = qkgVar6;
        this.h = qkgVar7;
        this.d = qkgVar8;
        this.i = qkgVar9;
    }

    public eoo(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, int i, float[] fArr) {
        this.j = i;
        this.b = qkgVar;
        this.d = qkgVar2;
        this.g = qkgVar3;
        this.h = qkgVar4;
        this.f = qkgVar5;
        this.e = qkgVar6;
        this.i = qkgVar7;
        this.a = qkgVar8;
        this.c = qkgVar9;
    }

    public eoo(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, int i, int[] iArr) {
        this.j = i;
        this.h = qkgVar;
        this.e = qkgVar2;
        this.i = qkgVar3;
        this.f = qkgVar4;
        this.a = qkgVar5;
        this.b = qkgVar6;
        this.g = qkgVar7;
        this.c = qkgVar8;
        this.d = qkgVar9;
    }

    public eoo(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, int i, short[] sArr) {
        this.j = i;
        this.f = qkgVar;
        this.e = qkgVar2;
        this.b = qkgVar3;
        this.d = qkgVar4;
        this.g = qkgVar5;
        this.i = qkgVar6;
        this.a = qkgVar7;
        this.h = qkgVar8;
        this.c = qkgVar9;
    }

    public eoo(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, int i, boolean[] zArr) {
        this.j = i;
        this.b = qkgVar;
        this.d = qkgVar2;
        this.g = qkgVar3;
        this.h = qkgVar4;
        this.f = qkgVar5;
        this.e = qkgVar6;
        this.i = qkgVar7;
        this.a = qkgVar8;
        this.c = qkgVar9;
    }

    public eoo(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, int i, byte[][] bArr) {
        this.j = i;
        this.f = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
        this.c = qkgVar4;
        this.i = qkgVar5;
        this.e = qkgVar6;
        this.g = qkgVar7;
        this.d = qkgVar8;
        this.h = qkgVar9;
    }

    public eoo(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, int i, char[][] cArr) {
        this.j = i;
        this.d = qkgVar;
        this.f = qkgVar2;
        this.g = qkgVar3;
        this.a = qkgVar4;
        this.e = qkgVar5;
        this.c = qkgVar6;
        this.h = qkgVar7;
        this.i = qkgVar8;
        this.b = qkgVar9;
    }

    public eoo(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, int i, float[][] fArr) {
        this.j = i;
        this.e = qkgVar;
        this.a = qkgVar2;
        this.g = qkgVar3;
        this.b = qkgVar4;
        this.f = qkgVar5;
        this.d = qkgVar6;
        this.c = qkgVar7;
        this.h = qkgVar8;
        this.i = qkgVar9;
    }

    public eoo(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, int i, int[][] iArr) {
        this.j = i;
        this.i = qkgVar;
        this.f = qkgVar2;
        this.d = qkgVar3;
        this.g = qkgVar4;
        this.e = qkgVar5;
        this.c = qkgVar6;
        this.a = qkgVar7;
        this.b = qkgVar8;
        this.h = qkgVar9;
    }

    public eoo(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, int i, short[][] sArr) {
        this.j = i;
        this.a = qkgVar;
        this.f = qkgVar2;
        this.c = qkgVar3;
        this.h = qkgVar4;
        this.b = qkgVar5;
        this.i = qkgVar6;
        this.g = qkgVar7;
        this.d = qkgVar8;
        this.e = qkgVar9;
    }

    public eoo(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, int i, boolean[][] zArr) {
        this.j = i;
        this.h = qkgVar;
        this.g = qkgVar2;
        this.e = qkgVar3;
        this.f = qkgVar4;
        this.a = qkgVar5;
        this.d = qkgVar6;
        this.c = qkgVar7;
        this.b = qkgVar8;
        this.i = qkgVar9;
    }

    public eoo(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, int i, byte[][][] bArr) {
        this.j = i;
        this.d = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
        this.g = qkgVar4;
        this.i = qkgVar5;
        this.h = qkgVar6;
        this.e = qkgVar7;
        this.c = qkgVar8;
        this.f = qkgVar9;
    }

    public static eoo a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9) {
        return new eoo(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, qkgVar8, qkgVar9, 2, (char[]) null);
    }

    public static eoo b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9) {
        return new eoo(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, qkgVar8, qkgVar9, 4, (int[]) null);
    }

    public static eoo c(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9) {
        return new eoo(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, qkgVar8, qkgVar9, 5, (boolean[]) null);
    }

    public static eoo d(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9) {
        return new eoo(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, qkgVar8, qkgVar9, 6, (float[]) null);
    }

    public static eoo e(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9) {
        return new eoo(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, qkgVar8, qkgVar9, 7, (byte[][]) null);
    }

    public static eoo f(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9) {
        return new eoo(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, qkgVar8, qkgVar9, 9, (short[][]) null);
    }

    public static eoo g(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9) {
        return new eoo(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, qkgVar8, qkgVar9, 10, (int[][]) null);
    }

    public static eoo h(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9) {
        return new eoo(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, qkgVar8, qkgVar9, 11, (boolean[][]) null);
    }

    public static eoo i(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9) {
        return new eoo(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, qkgVar8, qkgVar9, 12, (float[][]) null);
    }

    public static eoo j(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9) {
        return new eoo(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, qkgVar8, qkgVar9, 13, (byte[][][]) null);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        String str;
        gdp geaVar;
        switch (this.j) {
            case 0:
                ddf ddfVar = (ddf) this.a.get();
                pyn pynVarA = pyr.a(this.b);
                nvb nvbVar = (nvb) this.c.get();
                ghx ghxVar = ((gjo) this.d).get();
                Executor executor = (Executor) this.e.get();
                eos eosVar = ((eou) this.f).get();
                ljf ljfVar = (ljf) this.g.get();
                fmb fmbVar = ((fmc) this.h).get();
                return new eon(ddfVar, pynVarA, nvbVar, ghxVar, executor, eosVar, ljfVar, fmbVar, null, null);
            case 1:
                return new cts(((etg) this.f).get(), (BottomBarController) this.d.get(), (elw) this.e.get(), (ddf) this.i.get(), (epj) this.h.get(), (lar) this.a.get(), (jfn) this.b.get(), (jlb) this.c.get(), ((emh) this.g).get());
            case 2:
                jtx jtxVar = (jtx) this.e.get();
                fpo fpoVar = (fpo) this.g.get();
                frm frmVar = (frm) this.c.get();
                fqx fqxVar = (fqx) this.a.get();
                fqy fqyVar = (fqy) this.b.get();
                ojc ojcVar = (ojc) this.f.get();
                return new frr(jtxVar, fpoVar, frmVar, fqxVar, fqyVar, ojcVar, ((frz) this.d).get(), (ddf) this.i.get(), null, null);
            case 3:
                return new gac((btt) this.f.get(), ((cff) this.e).get(), ((emf) this.b).get(), (BottomBarController) this.d.get(), this.g, (ckh) this.i.get(), (Executor) this.a.get(), ((cog) this.h).get(), (dib) this.c.get());
            case 4:
                Gcam gcam = (Gcam) this.h.get();
                ddf ddfVar2 = (ddf) this.e.get();
                lvp lvpVar = ((gjp) this.i).get();
                lvq lvqVar = ((lhr) this.f).get();
                ebe ebeVar = (ebe) this.a.get();
                fix fixVar = (fix) this.b.get();
                ghf ghfVar = (ghf) this.g.get();
                gsf gsfVar = ((gsi) this.c).get();
                return new gaz(gcam, ddfVar2, lvpVar, lvqVar, ebeVar, fixVar, ghfVar, gsfVar);
            case 5:
                MediaFormat mediaFormat = (MediaFormat) this.b.get();
                Handler handler = (Handler) this.d.get();
                lap lapVar = (lap) this.g.get();
                pko pkoVar = (pko) this.h.get();
                lvp lvpVar2 = ((gjp) this.f).get();
                jtx jtxVar2 = (jtx) this.e.get();
                ddf ddfVar3 = (ddf) this.i.get();
                lis lisVar = ((liq) this.a).get();
                hoh hohVar = ((hoi) this.c).get();
                mpi mpiVarH = jtxVar2.h("mts-long");
                final mrg mrgVarA = mrg.a(mpiVarH);
                hhr hhrVar = new hhr(pkoVar, mrgVarA);
                lapVar.c(new lie() { // from class: gby
                    @Override // defpackage.lie, java.lang.AutoCloseable
                    public final void close() {
                        mrgVarA.close();
                    }
                });
                gdz gdzVar = new gdz(mediaFormat, handler, hhrVar, lvpVar2, mpiVarH, ddfVar3, lisVar, hohVar);
                lapVar.c(gdzVar);
                return gdzVar;
            case 6:
                MediaFormat mediaFormat2 = (MediaFormat) this.b.get();
                Handler handler2 = (Handler) this.d.get();
                lap lapVar2 = (lap) this.g.get();
                pko pkoVar2 = (pko) this.h.get();
                lvp lvpVar3 = ((gjp) this.f).get();
                jtx jtxVar3 = (jtx) this.e.get();
                ddf ddfVar4 = (ddf) this.i.get();
                lis lisVar2 = ((liq) this.a).get();
                hoh hohVar2 = ((hoi) this.c).get();
                if (fvq.d(ddfVar4)) {
                    ddg ddgVar = dds.a;
                    ddfVar4.d();
                    str = "-fi";
                } else {
                    str = "-v1";
                }
                mpi mpiVarH2 = jtxVar3.h(str.length() != 0 ? "mts-top".concat(str) : new String("mts-top"));
                if (fvq.d(ddfVar4)) {
                    ddg ddgVar2 = dds.a;
                    ddfVar4.d();
                    geaVar = new gea(mediaFormat2, mpiVarH2, hohVar2, lvpVar3);
                } else {
                    final mrg mrgVarA2 = mrg.a(mpiVarH2);
                    gdz gdzVar2 = new gdz(mediaFormat2, handler2, new hhr(pkoVar2, mrgVarA2), lvpVar3, mpiVarH2, ddfVar4, lisVar2, hohVar2);
                    lapVar2.c(new lie() { // from class: gby
                        @Override // defpackage.lie, java.lang.AutoCloseable
                        public final void close() {
                            mrgVarA2.close();
                        }
                    });
                    geaVar = gdzVar2;
                }
                gei geiVar = new gei(geaVar);
                lapVar2.c(geiVar);
                return geiVar;
            case 7:
                return new goo(((gjo) this.f).get(), pyr.a(this.b), pyr.a(this.a), pyr.a(this.c), (Executor) this.i.get(), ((dgb) this.e).get(), (ljf) this.g.get(), (jug) this.d.get(), (ddf) this.h.get());
            case 8:
                lnc lncVar = (lnc) this.d.get();
                qkg qkgVar = this.f;
                qkg qkgVar2 = this.g;
                long jLongValue = ((efx) this.a).get().longValue();
                ojc ojcVar2 = (ojc) this.e.get();
                qkg qkgVar3 = this.c;
                qkg qkgVar4 = this.h;
                ead eadVar = (ead) this.i.get();
                eax eaxVar = (eax) this.b.get();
                if (ojcVar2.g()) {
                    return ((gzg) qkgVar).get().a(jLongValue, lncVar.r((lqd) ojcVar2.c(), eadVar.c), eaxVar, 2);
                }
                if (((ojc) qkgVar4.get()).g()) {
                    return ((gzg) qkgVar).get().a(jLongValue, lncVar.r((lqd) ((ojc) qkgVar4.get()).c(), eadVar.c), eaxVar, 2);
                }
                if (((Map) qkgVar3.get()).size() == 1) {
                    return ((gzg) qkgVar).get().a(jLongValue, lncVar.r((lqd) ((Map) qkgVar3.get()).values().iterator().next(), eadVar.c), eaxVar, 2);
                }
                obr.aF(((Map) qkgVar3.get()).size() > 1);
                return ((gyv) qkgVar2).get().a(jLongValue, eadVar.c, eaxVar);
            case 9:
                lir lirVar = ((dgb) this.a).get();
                lco lcoVar = (lco) this.f.get();
                haz hazVar = ((hba) this.c).get();
                gzq gzqVar = ((gzr) this.h).get();
                ojc ojcVar3 = (ojc) this.b.get();
                goy goyVar = (goy) this.i.get();
                gxl gxlVar = (gxl) this.g.get();
                gvr gvrVar = (gvr) this.d.get();
                ddf ddfVar5 = (ddf) this.e.get();
                ope opeVarN = fcy.n(ddfVar5.k(ddl.ao));
                gov govVar = new gov(goyVar, 5, false);
                gov govVar2 = new gov(gzqVar.a(gvrVar, gxlVar), 6, true);
                gov govVar3 = new gov(hazVar.a(opeVarN, govVar), 7, false);
                gov govVar4 = ojcVar3.g() ? new gov(((gzz) ojcVar3.c()).a(gzqVar.a(gvrVar, new gxp(ddfVar5))), 5, false) : null;
                gov govVar5 = govVar4 == null ? govVar2 : govVar4;
                return new gom(lirVar, new gol(lcoVar, govVar3, govVar2, govVar5, govVar2, govVar3, govVar5));
            case 10:
                ddf ddfVar6 = (ddf) this.i.get();
                qkg qkgVar5 = this.f;
                qkg qkgVar6 = this.d;
                qkg qkgVar7 = this.g;
                gqy gqyVar = (gqy) this.e.get();
                goy goyVarB = (goy) this.c.get();
                goo gooVar = (goo) this.a.get();
                hae haeVar = (hae) this.b.get();
                if (ddfVar6.k(ddl.aS)) {
                    meh mehVar = ((gys) qkgVar6).get();
                    lqd lqdVar = (lqd) qkgVar7.get();
                    gqn gqnVar = new gqn(gqyVar);
                    lnc lncVar2 = (lnc) mehVar.c.get();
                    lncVar2.getClass();
                    lap lapVar3 = (lap) mehVar.a.get();
                    lapVar3.getClass();
                    Executor executor2 = (Executor) mehVar.b.get();
                    executor2.getClass();
                    lqdVar.getClass();
                    goyVarB = ((gyj) qkgVar5).get().b(new gyr(lncVar2, lapVar3, executor2, lqdVar, gqnVar), goyVarB);
                }
                return gooVar.a(haeVar.a(fvq.D(goyVarB)));
            case 11:
                lco lcoVar2 = (lco) this.h.get();
                lco lcoVar3 = (lco) this.g.get();
                lvp lvpVar4 = ((gjp) this.e).get();
                lhs lhsVar = ((gsh) this.f).get();
                lzi lziVar = (lzi) this.a.get();
                cvo cvoVar = ((giw) this.d).get();
                lap lapVar4 = (lap) this.c.get();
                ddf ddfVar7 = (ddf) this.b.get();
                lvq lvqVar2 = ((lhr) this.i).get();
                final gsn gsnVar = lziVar.f() ? new gsn(lcoVar2, lcoVar3, lvpVar4, ddfVar7, lvqVar2) : new gsn(lcoVar2, lcoVar3, lvpVar4, lhsVar, ddfVar7, lvqVar2);
                lapVar4.c(cvoVar.a(new lij() { // from class: gsk
                    @Override // defpackage.lij
                    public final void fB(Object obj) {
                        gsnVar.f(((cwi) obj).a());
                    }
                }, pgr.INSTANCE));
                return gsnVar;
            case 12:
                lap lapVar5 = (lap) this.e.get();
                qkg qkgVar8 = this.a;
                qkg qkgVar9 = this.g;
                qkg qkgVar10 = this.b;
                ojc ojcVar4 = (ojc) this.f.get();
                final ojc ojcVar5 = (ojc) this.d.get();
                final ojc ojcVarA = ((hlj) this.c).a();
                qkg qkgVar11 = this.h;
                ghx ghxVar2 = ((gjo) this.i).get();
                if (!ghxVar2.E()) {
                    return ((gwy) qkgVar10).get();
                }
                if (ghxVar2.k() != lwd.BACK || !ojcVar4.g() || !ojcVar5.g() || !ojcVarA.g()) {
                    return ((gwt) qkgVar8).get();
                }
                lapVar5.c(((itw) ojcVarA.c()).d(oih.a, (ojc) qkgVar11.get()));
                ((lmv) ojcVar4.c()).k(new lmu() { // from class: gvu
                    @Override // defpackage.lmu
                    public final void a(lrr lrrVar) {
                        final ojc ojcVar6 = ojcVar5;
                        final ojc ojcVar7 = ojcVarA;
                        mip.bj(lrrVar, new lnn() { // from class: gvv
                            @Override // defpackage.lnn
                            public final void a(lmr lmrVar) {
                                ojc ojcVar8 = ojcVar6;
                                ojc ojcVar9 = ojcVar7;
                                mad madVarD = lmrVar.d((lnx) ojcVar8.c());
                                if (madVarD != null) {
                                    ((itw) ojcVar9.c()).f(madVarD);
                                }
                                lmrVar.close();
                            }
                        });
                    }
                });
                gxi gxiVar = ((gxj) qkgVar9).get();
                lapVar5.c(gxiVar);
                return gxiVar;
            default:
                return new hkq((hki) this.d.get(), (hkr) this.b.get(), (dvp) this.a.get(), (fpo) this.g.get(), (lda) this.i.get(), (ddf) this.h.get(), this.e, (imf) this.c.get(), (dqa) this.f.get());
        }
    }
}
