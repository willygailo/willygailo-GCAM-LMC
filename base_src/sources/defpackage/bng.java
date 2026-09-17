package defpackage;

import com.google.android.apps.camera.jni.federatedphoto.ModeSuggestionClient;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class bng implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final /* synthetic */ int d;

    public bng(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i) {
        this.d = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    public bng(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, byte[] bArr) {
        this.d = i;
        this.c = qkgVar;
        this.a = qkgVar2;
        this.b = qkgVar3;
    }

    public bng(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, char[] cArr) {
        this.d = i;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.a = qkgVar3;
    }

    public bng(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, float[] fArr) {
        this.d = i;
        this.a = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
    }

    public bng(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, int[] iArr) {
        this.d = i;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.a = qkgVar3;
    }

    public bng(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, short[] sArr) {
        this.d = i;
        this.c = qkgVar;
        this.a = qkgVar2;
        this.b = qkgVar3;
    }

    public bng(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, boolean[] zArr) {
        this.d = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
    }

    public bng(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, byte[][] bArr) {
        this.d = i;
        this.c = qkgVar;
        this.a = qkgVar2;
        this.b = qkgVar3;
    }

    public bng(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, char[][] cArr) {
        this.d = i;
        this.c = qkgVar;
        this.a = qkgVar2;
        this.b = qkgVar3;
    }

    public bng(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, float[][] fArr) {
        this.d = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
    }

    public bng(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, int[][] iArr) {
        this.d = i;
        this.a = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
    }

    public bng(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, short[][] sArr) {
        this.d = i;
        this.c = qkgVar;
        this.a = qkgVar2;
        this.b = qkgVar3;
    }

    public bng(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, boolean[][] zArr) {
        this.d = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
    }

    public bng(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, byte[][][] bArr) {
        this.d = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
    }

    public bng(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, char[][][] cArr) {
        this.d = i;
        this.c = qkgVar;
        this.a = qkgVar2;
        this.b = qkgVar3;
    }

    public bng(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, short[][][] sArr) {
        this.d = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
    }

    public static bng a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new bng(qkgVar, qkgVar2, qkgVar3, 1, (byte[]) null);
    }

    public static bng b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new bng(qkgVar, qkgVar2, qkgVar3, 10, (char[][]) null);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        final int i = 0;
        switch (this.d) {
            case 0:
                return !((ddf) this.a.get()).k(dde.c) ? ((bom) this.b).get() : ((bnd) this.c).get();
            case 1:
                return ((gjo) this.c).get().E() ? ((boc) this.a).get() : ((bog) this.b).get();
            case 2:
                lar larVar = (lar) this.b.get();
                fhv fhvVar = ((etj) this.c).get();
                bqh bqhVar = (bqh) this.a.get();
                enl.f(larVar, fhvVar, bqhVar);
                return mip.eR(new bqj(bqhVar, 0));
            case 3:
                return new bqm((dkl) this.c.get(), ((lvr) this.a).get(), (Executor) this.b.get());
            case 4:
                return new brm(this.b, this.c, this.a);
            case 5:
                ddf ddfVar = (ddf) this.a.get();
                lar larVar2 = (lar) this.b.get();
                bse bseVar = (bse) this.c.get();
                ddi ddiVar = dcs.a;
                ddfVar.c();
                return new bsg(larVar2, bseVar);
            case 6:
                qkg qkgVar = this.c;
                ddf ddfVar2 = (ddf) this.b.get();
                bui buiVar = (bui) this.a.get();
                ddi ddiVar2 = dcs.a;
                ddfVar2.c();
                Set set = ((pyw) qkgVar).get();
                if (set.size() <= 0) {
                    return new brt();
                }
                final brs brsVar = new brs(set, buiVar.b);
                for (bsb bsbVar : brsVar.a) {
                    final int i2 = 1;
                    brsVar.b.c(lcv.k(bsbVar.b().a(), new Runnable() { // from class: brq
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    brsVar.k();
                                    break;
                                default:
                                    brsVar.k();
                                    break;
                            }
                        }
                    }, pgr.INSTANCE));
                    brsVar.b.c(lcv.k(bsbVar.b().b(), new Runnable() { // from class: brq
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i) {
                                case 0:
                                    brsVar.k();
                                    break;
                                default:
                                    brsVar.k();
                                    break;
                            }
                        }
                    }, pgr.INSTANCE));
                }
                return brsVar;
            case 7:
                return new bsc((pht) this.a.get(), (gib) this.b.get(), this.c);
            case 8:
                return new bta(((btc) this.a).get(), ((emn) this.c).get(), (fjs) this.b.get());
            case 9:
                return new btk((bqm) this.c.get(), (pih) this.a.get(), ((liq) this.b).get());
            case 10:
                return new bxf((ScheduledExecutorService) this.c.get(), (pih) this.a.get(), ((etg) this.b).get());
            case 11:
                return new cae(((etg) this.c).get(), (lco) this.a.get(), (lar) this.b.get());
            case 12:
                boolean zBooleanValue = ((bpk) this.a).a().booleanValue();
                final hyc hycVar = (hyc) this.b.get();
                final cas casVar = (cas) this.c.get();
                return !zBooleanValue ? bqi.c : new iho() { // from class: cay
                    @Override // java.lang.Runnable
                    public final void run() {
                        final cas casVar2 = casVar;
                        hyc hycVar2 = hycVar;
                        casVar2.e.execute(new Runnable() { // from class: caq
                            @Override // java.lang.Runnable
                            public final void run() {
                                cas casVar3 = casVar2;
                                casVar3.k.e(casVar3);
                            }
                        });
                        iau iauVarA = iav.a();
                        iauVarA.a = "BeholderExampleGenerator";
                        iauVarA.c(ope.K(jrl.PHOTO, jrl.PORTRAIT, jrl.LONG_EXPOSURE, jrl.IMAX));
                        iauVarA.b(ope.I(lwd.BACK, lwd.FRONT));
                        hycVar2.a(casVar2, iauVarA.a());
                    }
                };
            case 13:
                return !((bpk) this.a).a().booleanValue() ? ((cdx) this.b).get() : ((cdv) this.c).get();
            case 14:
                boolean zBooleanValue2 = ((bpk) this.c).a().booleanValue();
                final hyc hycVar2 = (hyc) this.b.get();
                final cea ceaVar = (cea) this.a.get();
                return !zBooleanValue2 ? bqi.d : new iho() { // from class: caz
                    @Override // java.lang.Runnable
                    public final void run() {
                        cea ceaVar2 = ceaVar;
                        hyc hycVar3 = hycVar2;
                        ceaVar2.a = new ModeSuggestionClient();
                        ceaVar2.b = new cdj();
                        ceaVar2.c = new cdi();
                        iau iauVarA = iav.a();
                        iauVarA.a = "BrellaSmartsProcessor";
                        iauVarA.c(ope.I(jrl.PHOTO, jrl.LONG_EXPOSURE));
                        iauVarA.b(ope.H(lwd.BACK));
                        hycVar3.a(ceaVar2, iauVarA.a());
                    }
                };
            case 15:
                return new cde((Executor) this.b.get(), ((bwn) this.a).a(), ((cbk) this.c).get());
            case 16:
                cdp cdpVar = (cdp) this.b.get();
                dqv dqvVarA = ((dsa) this.a).a();
                drp drpVarB = dru.b((dsz) this.c.get());
                drpVarB.c = dqvVarA;
                drpVarB.b(cdpVar);
                return drpVarB.a();
            case 17:
                return new cea((ddf) this.a.get(), ((evv) this.b).a(), ((cbg) this.c).get());
            case 18:
                return new cef(((emp) this.a).a(), ((bwn) this.b).a(), (cdf) this.c.get());
            case 19:
                return new cfi(((cjq) this.c).get(), ((cnb) this.a).get(), (cnd) this.b.get());
            default:
                return new cfj(pyr.a(this.b), pyr.a(this.a), (cib) this.c.get());
        }
    }
}
