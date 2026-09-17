package defpackage;

import android.app.admin.DevicePolicyManager;
import android.os.Handler;
import com.google.android.apps.camera.bottombar.BottomBarController;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes.dex */
public final class btq implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;
    private final qkg f;
    private final qkg g;
    private final qkg h;
    private final /* synthetic */ int i;

    public btq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, int i) {
        this.i = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
        this.f = qkgVar6;
        this.g = qkgVar7;
        this.h = qkgVar8;
    }

    public btq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, int i, byte[] bArr) {
        this.i = i;
        this.g = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
        this.a = qkgVar4;
        this.h = qkgVar5;
        this.d = qkgVar6;
        this.f = qkgVar7;
        this.e = qkgVar8;
    }

    public btq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, int i, char[] cArr) {
        this.i = i;
        this.h = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.f = qkgVar4;
        this.e = qkgVar5;
        this.g = qkgVar6;
        this.a = qkgVar7;
        this.d = qkgVar8;
    }

    public btq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, int i, float[] fArr) {
        this.i = i;
        this.d = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.f = qkgVar4;
        this.a = qkgVar5;
        this.h = qkgVar6;
        this.e = qkgVar7;
        this.g = qkgVar8;
    }

    public btq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, int i, int[] iArr) {
        this.i = i;
        this.h = qkgVar;
        this.e = qkgVar2;
        this.f = qkgVar3;
        this.a = qkgVar4;
        this.d = qkgVar5;
        this.c = qkgVar6;
        this.b = qkgVar7;
        this.g = qkgVar8;
    }

    public btq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, int i, short[] sArr) {
        this.i = i;
        this.h = qkgVar;
        this.d = qkgVar2;
        this.a = qkgVar3;
        this.b = qkgVar4;
        this.c = qkgVar5;
        this.f = qkgVar6;
        this.g = qkgVar7;
        this.e = qkgVar8;
    }

    public btq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, int i, boolean[] zArr) {
        this.i = i;
        this.h = qkgVar;
        this.f = qkgVar2;
        this.b = qkgVar3;
        this.d = qkgVar4;
        this.g = qkgVar5;
        this.e = qkgVar6;
        this.c = qkgVar7;
        this.a = qkgVar8;
    }

    public btq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, int i, byte[][] bArr) {
        this.i = i;
        this.a = qkgVar;
        this.g = qkgVar2;
        this.c = qkgVar3;
        this.b = qkgVar4;
        this.h = qkgVar5;
        this.e = qkgVar6;
        this.d = qkgVar7;
        this.f = qkgVar8;
    }

    public btq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, int i, char[][] cArr) {
        this.i = i;
        this.h = qkgVar;
        this.g = qkgVar2;
        this.f = qkgVar3;
        this.e = qkgVar4;
        this.b = qkgVar5;
        this.d = qkgVar6;
        this.a = qkgVar7;
        this.c = qkgVar8;
    }

    public btq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, int i, float[][] fArr) {
        this.i = i;
        this.e = qkgVar;
        this.h = qkgVar2;
        this.g = qkgVar3;
        this.b = qkgVar4;
        this.a = qkgVar5;
        this.d = qkgVar6;
        this.f = qkgVar7;
        this.c = qkgVar8;
    }

    public btq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, int i, int[][] iArr) {
        this.i = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.g = qkgVar3;
        this.h = qkgVar4;
        this.e = qkgVar5;
        this.c = qkgVar6;
        this.d = qkgVar7;
        this.f = qkgVar8;
    }

    public btq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, int i, short[][] sArr) {
        this.i = i;
        this.e = qkgVar;
        this.g = qkgVar2;
        this.a = qkgVar3;
        this.f = qkgVar4;
        this.b = qkgVar5;
        this.h = qkgVar6;
        this.d = qkgVar7;
        this.c = qkgVar8;
    }

    public btq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, int i, boolean[][] zArr) {
        this.i = i;
        this.h = qkgVar;
        this.d = qkgVar2;
        this.a = qkgVar3;
        this.e = qkgVar4;
        this.b = qkgVar5;
        this.f = qkgVar6;
        this.g = qkgVar7;
        this.c = qkgVar8;
    }

    public btq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, int i, byte[][][] bArr) {
        this.i = i;
        this.a = qkgVar;
        this.h = qkgVar2;
        this.e = qkgVar3;
        this.b = qkgVar4;
        this.g = qkgVar5;
        this.c = qkgVar6;
        this.f = qkgVar7;
        this.d = qkgVar8;
    }

    public btq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, int i, char[][][] cArr) {
        this.i = i;
        this.b = qkgVar;
        this.d = qkgVar2;
        this.h = qkgVar3;
        this.e = qkgVar4;
        this.g = qkgVar5;
        this.f = qkgVar6;
        this.c = qkgVar7;
        this.a = qkgVar8;
    }

    public btq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, int i, short[][][] sArr) {
        this.i = i;
        this.d = qkgVar;
        this.h = qkgVar2;
        this.f = qkgVar3;
        this.e = qkgVar4;
        this.c = qkgVar5;
        this.a = qkgVar6;
        this.b = qkgVar7;
        this.g = qkgVar8;
    }

    public static btq a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8) {
        return new btq(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, qkgVar8, 5, (boolean[]) null);
    }

    public static btq b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8) {
        return new btq(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, qkgVar8, 9, (short[][]) null);
    }

    public static btq c(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8) {
        return new btq(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, qkgVar8, 10, (int[][]) null);
    }

    public static btq d(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8) {
        return new btq(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, qkgVar8, 11, (boolean[][]) null);
    }

    public static btq e(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9) {
        return new btq(qkgVar, qkgVar2, qkgVar4, qkgVar5, qkgVar6, qkgVar7, qkgVar8, qkgVar9, 12, (float[][]) null);
    }

    public static btq f(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8) {
        return new btq(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, qkgVar8, 13, (byte[][][]) null);
    }

    public static btq g(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8) {
        return new btq(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, qkgVar8, 14, (char[][][]) null);
    }

    public static btq h(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8) {
        return new btq(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, qkgVar8, 15, (short[][][]) null);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        Object objUnmodifiableSet;
        switch (this.i) {
            case 0:
                Handler handlerB = efb.b();
                btl btlVar = (btl) this.a.get();
                lkd lkdVar = (lkd) this.b.get();
                lvq lvqVar = ((lhr) this.c).get();
                dkc dkcVar = dkb.a;
                khx khxVar = (khx) this.d.get();
                Executor executor = (Executor) this.e.get();
                Semaphore semaphore = (Semaphore) this.f.get();
                pih pihVar = (pih) this.g.get();
                bqg bqgVar = ((etg) this.h).get();
                btp btpVar = new btp(handlerB, btlVar, lkdVar, lvqVar, dkcVar, (DevicePolicyManager) khx.m(khxVar.a, "device_policy"), executor, semaphore);
                bqgVar.i().c(btlVar);
                pihVar.o(btpVar);
                return btpVar;
            case 1:
                return new bnr(((liq) this.g).get(), (lap) this.c.get(), ((gjo) this.b).get(), (dyx) this.a.get(), (lda) this.h.get(), (lda) this.d.get(), (fjs) this.f.get(), (ddf) this.e.get());
            case 2:
                return new cij(((etg) this.h).get(), (ddf) this.b.get(), (cib) this.c.get(), ((cjf) this.f).get(), ((hlj) this.e).a(), ((hlj) this.g).a(), ((hlj) this.a).a(), ((cjc) this.d).a());
            case 3:
                return new cra((BottomBarController) this.h.get(), (ddf) this.d.get(), (jlb) this.a.get(), (jfn) this.b.get(), (jjp) this.c.get(), ((csc) this.f).get(), ((cjc) this.g).a(), (gtg) this.e.get());
            case 4:
                return new crg((BottomBarController) this.h.get(), (jlb) this.e.get(), ((iwi) this.f).get(), ((emg) this.a).get(), (jak) this.d.get(), (jdy) this.c.get(), (jfn) this.b.get(), ((csc) this.g).get(), null, null);
            case 5:
                return new cvo((lwf) this.h.get(), (lar) this.f.get(), (cwc) this.b.get(), (cwl) this.d.get(), (cxz) this.g.get(), ((cwd) this.e).get(), (dlt) this.c.get(), ((emj) this.a).get(), null, null, null);
            case 6:
                return new gzf(this.d, this.b, this.c, this.f, this.a, this.h, this.e, this.g, (char[]) null);
            case 7:
                return new flq((jlb) this.a.get(), (jje) this.g.get(), (gtg) this.c.get(), (jgq) this.b.get(), (BottomBarController) this.h.get(), (gvb) this.e.get(), (eam) this.d.get(), ((iwi) this.f).get());
            case 8:
                return new fnc(((jnw) this.h).get(), ((emn) this.g).get(), (huj) this.f.get(), (elw) this.e.get(), (ScheduledExecutorService) this.b.get(), (hpu) this.d.get(), ((hlj) this.a).a(), (ddf) this.c.get());
            case 9:
                return new gzf(this.e, pyv.b(this.g), pyv.b(this.a), pyv.b(this.f), pyv.b(this.b), this.h, this.d, this.c, (byte[]) null);
            case 10:
                return new fql((lig) this.b.get(), (jth) this.a.get(), (dvp) this.g.get(), ((gjp) this.h).get(), (lxb) this.e.get(), (ddf) this.c.get(), (lzi) this.d.get(), (ljf) this.f.get());
            case 11:
                boolean zBooleanValue = ((Boolean) this.h.get()).booleanValue();
                final Executor executor2 = (Executor) this.d.get();
                qkg qkgVar = this.a;
                gdj gdjVar = (gdj) this.e.get();
                final qkg qkgVar2 = this.b;
                final qkg qkgVar3 = this.f;
                hko hkoVar = (hko) this.g.get();
                ddf ddfVar = (ddf) this.c.get();
                HashSet hashSet = new HashSet();
                if (ddfVar != null) {
                    ddi ddiVar = ddr.a;
                }
                if (zBooleanValue) {
                    hkoVar.e();
                    hashSet.add(new Runnable() { // from class: gca
                        @Override // java.lang.Runnable
                        public final void run() {
                            qkg qkgVar4 = qkgVar3;
                            qkg qkgVar5 = qkgVar2;
                            ((fpo) qkgVar4.get()).g(new gbw(qkgVar5, 0), executor2);
                        }
                    });
                    ddg ddgVar = dds.a;
                    ddfVar.c();
                    final gdp gdpVar = (gdp) qkgVar.get();
                    gdjVar.getClass();
                    hashSet.add(new gcs(gdjVar, 1));
                    gdpVar.getClass();
                    hashSet.add(new Runnable() { // from class: gbz
                        @Override // java.lang.Runnable
                        public final void run() {
                            gdpVar.b();
                        }
                    });
                    objUnmodifiableSet = Collections.unmodifiableSet(hashSet);
                } else {
                    objUnmodifiableSet = orx.a;
                }
                qmd.ae(objUnmodifiableSet);
                return objUnmodifiableSet;
            case 12:
                return new gcl((ebe) this.e.get(), (lvp) this.h.get(), ((liq) this.g).get(), (ddf) this.b.get(), ((gce) this.a).get(), (Executor) this.d.get(), (nvb) this.f.get(), (hcg) this.c.get(), null, null);
            case 13:
                dvp dvpVar = (dvp) this.a.get();
                lvp lvpVar = ((gjp) this.h).get();
                ((liq) this.e).get();
                return new gdo(dvpVar, lvpVar, (ddf) this.b.get(), (fus) this.g.get(), (eam) this.c.get(), (imf) this.f.get(), (dqa) this.d.get());
            case 14:
                return new gml(new gkb(new gkg(((dgb) this.b).get(), ((brh) this.d).get(), (hia) this.h.get(), ((gsi) this.e).get(), ((hir) this.c).get(), (gmu) this.g.get(), (ljf) this.a.get()), ope.H(35)), (gmm) this.f.get());
            default:
                lnc lncVar = (lnc) this.d.get();
                qkg qkgVar4 = this.h;
                qkg qkgVar5 = this.f;
                long jLongValue = ((efx) this.e).get().longValue();
                ojc ojcVar = (ojc) this.c.get();
                qkg qkgVar6 = this.a;
                ead eadVar = (ead) this.b.get();
                eax eaxVar = (eax) this.g.get();
                if (ojcVar.g()) {
                    return ((gzg) qkgVar4).get().a(jLongValue, lncVar.r((lqd) ojcVar.c(), eadVar.c), eaxVar, 2);
                }
                obr.aF(((Map) qkgVar6.get()).size() > 1);
                return ((gyv) qkgVar5).get().a(jLongValue, eadVar.c, eaxVar);
        }
    }
}
