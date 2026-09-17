package defpackage;

import com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class boe implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final /* synthetic */ int e;

    public boe(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i) {
        this.e = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
    }

    public boe(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, byte[] bArr) {
        this.e = i;
        this.d = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
        this.c = qkgVar4;
    }

    public boe(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, byte[] bArr, byte[] bArr2) {
        this.e = i;
        this.b = qkgVar;
        this.d = qkgVar2;
        this.a = qkgVar3;
        this.c = qkgVar4;
    }

    public boe(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, char[] cArr) {
        this.e = i;
        this.a = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
        this.d = qkgVar4;
    }

    public boe(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, char[] cArr, byte[] bArr) {
        this.e = i;
        this.b = qkgVar;
        this.d = qkgVar2;
        this.a = qkgVar3;
        this.c = qkgVar4;
    }

    public boe(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, float[] fArr) {
        this.e = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
    }

    public boe(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, int[] iArr) {
        this.e = i;
        this.d = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
        this.c = qkgVar4;
    }

    public boe(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, short[] sArr) {
        this.e = i;
        this.c = qkgVar;
        this.a = qkgVar2;
        this.d = qkgVar3;
        this.b = qkgVar4;
    }

    public boe(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, boolean[] zArr) {
        this.e = i;
        this.a = qkgVar;
        this.d = qkgVar2;
        this.c = qkgVar3;
        this.b = qkgVar4;
    }

    public boe(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, byte[][] bArr) {
        this.e = i;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.d = qkgVar3;
        this.a = qkgVar4;
    }

    public boe(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, char[][] cArr) {
        this.e = i;
        this.d = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.a = qkgVar4;
    }

    public boe(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, float[][] fArr) {
        this.e = i;
        this.d = qkgVar;
        this.a = qkgVar2;
        this.b = qkgVar3;
        this.c = qkgVar4;
    }

    public boe(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, int[][] iArr) {
        this.e = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
    }

    public boe(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, short[][] sArr) {
        this.e = i;
        this.a = qkgVar;
        this.d = qkgVar2;
        this.c = qkgVar3;
        this.b = qkgVar4;
    }

    public boe(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, boolean[][] zArr) {
        this.e = i;
        this.c = qkgVar;
        this.d = qkgVar2;
        this.b = qkgVar3;
        this.a = qkgVar4;
    }

    public boe(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, byte[][][] bArr) {
        this.e = i;
        this.d = qkgVar;
        this.c = qkgVar2;
        this.a = qkgVar3;
        this.b = qkgVar4;
    }

    public boe(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, char[][][] cArr) {
        this.e = i;
        this.a = qkgVar;
        this.d = qkgVar2;
        this.b = qkgVar3;
        this.c = qkgVar4;
    }

    public boe(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, float[][][] fArr) {
        this.e = i;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.a = qkgVar3;
        this.d = qkgVar4;
    }

    public boe(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, int[][][] iArr) {
        this.e = i;
        this.c = qkgVar;
        this.d = qkgVar2;
        this.b = qkgVar3;
        this.a = qkgVar4;
    }

    public boe(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, short[][][] sArr) {
        this.e = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.d = qkgVar3;
        this.c = qkgVar4;
    }

    public boe(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, boolean[][][] zArr) {
        this.e = i;
        this.d = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
        this.c = qkgVar4;
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.e) {
            case 0:
                return new bod((bmv) this.a.get(), (lda) this.b.get(), (lda) this.c.get(), (ddf) this.d.get());
            case 1:
                return new bmt((lar) this.d.get(), ((duw) this.b).get(), (ddf) this.a.get(), (iud) this.c.get());
            case 2:
                final bqg bqgVar = ((etg) this.a).get();
                final pih pihVar = (pih) this.c.get();
                final qkg qkgVar = this.b;
                final qkg qkgVar2 = this.d;
                return new iho() { // from class: bru
                    @Override // java.lang.Runnable
                    public final void run() {
                        pih pihVar2 = pihVar;
                        qkg qkgVar3 = qkgVar2;
                        bqg bqgVar2 = bqgVar;
                        qkg qkgVar4 = qkgVar;
                        pihVar2.o((bro) qkgVar3.get());
                        lap lapVarI = bqgVar2.i();
                        lco lcoVar = (lco) qkgVar4.get();
                        final bro broVar = (bro) qkgVar3.get();
                        broVar.getClass();
                        lapVarI.c(lcoVar.a(new lij() { // from class: brv
                            @Override // defpackage.lij
                            public final void fB(Object obj) {
                                broVar.e((cwi) obj);
                            }
                        }, pgr.INSTANCE));
                    }
                };
            case 3:
                bsc bscVar = (bsc) this.c.get();
                bsk bskVar = (bsk) this.a.get();
                ddf ddfVar = (ddf) this.d.get();
                qkg qkgVar3 = this.b;
                ddi ddiVar = dcs.a;
                ddfVar.c();
                Object objI = ((Boolean) ((lda) qkgVar3.get()).fA()).booleanValue() ? ope.I(bscVar, bskVar) : orx.a;
                qmd.ae(objI);
                return objI;
            case 4:
                htp htpVar = ((huh) this.d).get();
                return new bst(htpVar, (ddf) this.a.get(), (lda) this.c.get());
            case 5:
                return new bth((lwf) this.a.get(), (ljf) this.d.get(), (dkm) this.c.get(), (ddf) this.b.get());
            case 6:
                return new btj(this.b, (lar) this.a.get(), ((etj) this.c).get(), (ljf) this.d.get());
            case 7:
                final pht phtVar = ((etu) this.b).get();
                final ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.c.get();
                final bxy bxyVar = (bxy) this.d.get();
                final ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.a.get();
                return new iho() { // from class: bxz
                    @Override // java.lang.Runnable
                    public final void run() {
                        pht phtVar2 = phtVar;
                        final bxy bxyVar2 = bxyVar;
                        final ScheduledExecutorService scheduledExecutorService3 = scheduledExecutorService;
                        final ScheduledExecutorService scheduledExecutorService4 = scheduledExecutorService2;
                        mip.ca(phtVar2, new lht() { // from class: bya
                            @Override // defpackage.lht
                            public final void a(Object obj) {
                                bxy bxyVar3 = bxyVar2;
                                ScheduledExecutorService scheduledExecutorService5 = scheduledExecutorService3;
                                ScheduledExecutorService scheduledExecutorService6 = scheduledExecutorService4;
                                new bxv(bxyVar3, scheduledExecutorService5, 2).a();
                                new bxv(bxyVar3, scheduledExecutorService6, 1).a();
                            }
                        }, pgr.INSTANCE);
                    }
                };
            case 8:
                boolean zBooleanValue = ((bpk) this.d).a().booleanValue();
                boolean zBooleanValue2 = ((bpk) this.b).a().booleanValue();
                pyn pynVarA = pyr.a(this.c);
                pyn pynVarA2 = pyr.a(this.a);
                opc opcVarD = ope.D();
                if (zBooleanValue) {
                    opcVarD.d((dbg) pynVarA.get());
                }
                if (zBooleanValue2) {
                    opcVarD.d((dbg) pynVarA2.get());
                }
                ope opeVarF = opcVarD.f();
                qmd.ae(opeVarF);
                return opeVarF;
            case 9:
                jtx jtxVar = (jtx) this.a.get();
                Executor executor = (Executor) this.d.get();
                ((emp) this.c).a();
                return new cdp(jtxVar, executor, (ddf) this.b.get(), null, null);
            case 10:
                return new cgs((cfi) this.b.get(), (cka) this.a.get(), (ckh) this.c.get(), (ljf) this.d.get());
            case 11:
                lco lcoVar = (lco) this.c.get();
                gvb gvbVar = (gvb) this.d.get();
                return new ckg(lcoVar, gvbVar, (ddf) this.a.get());
            case 12:
                return new ckn((ikm) this.d.get(), (cib) this.a.get(), (jfn) this.b.get(), (lar) this.c.get());
            case 13:
                return new coh((col) this.d.get(), (col) this.c.get(), (cok) this.a.get(), (coi) this.b.get(), null);
            case 14:
                cpn cpnVar = ((cpo) this.a).get();
                return new cpp(cpnVar, (ddf) this.c.get());
            case 15:
                final ckd ckdVar = ((coo) this.b).get();
                final qkg qkgVar4 = this.a;
                final qkg qkgVar5 = this.d;
                final lap lapVar = (lap) this.c.get();
                return new bvv() { // from class: csj
                    @Override // defpackage.bvv
                    public final /* synthetic */ String c() {
                        return aas.g(this);
                    }

                    @Override // defpackage.bvv
                    public final pht fz() {
                        ckd ckdVar2 = ckdVar;
                        qkg qkgVar6 = qkgVar4;
                        lap lapVar2 = lapVar;
                        qkg qkgVar7 = qkgVar5;
                        if (ckdVar2.C) {
                            final csw cswVar = (csw) qkgVar6.get();
                            synchronized (cswVar.b) {
                                cswVar.c = mip.bM("cc-frame-qual-scorer");
                            }
                            cswVar.a.c(new lie() { // from class: csr
                                @Override // defpackage.lie, java.lang.AutoCloseable
                                public final void close() {
                                    csw cswVar2 = cswVar;
                                    synchronized (cswVar2.b) {
                                        ExecutorService executorService = cswVar2.c;
                                        if (executorService != null) {
                                            executorService.shutdown();
                                            cswVar2.c = null;
                                        }
                                    }
                                }
                            });
                            lapVar2.c(((ctb) qkgVar7.get()).a((csw) qkgVar6.get()));
                        }
                        return plk.V(true);
                    }
                };
            case 16:
                return new ctn(((emd) this.c).get(), (iqn) this.d.get(), (lce) this.b.get(), (lda) this.a.get());
            case 17:
                jng jngVar = (jng) this.d.get();
                cuz cuzVar = ((cva) this.b).get();
                ojc ojcVar = ((fzo) this.a).get();
                return new cvi(jngVar, cuzVar, ojcVar);
            case 18:
                return new cye(((cwu) this.b).get(), (CameraFatalErrorTrackerDatabase) this.c.get(), ((bxs) this.a).a(), (ddf) this.d.get());
            case 19:
                return new cyl((ddf) this.b.get(), ((bpk) this.d).a().booleanValue(), ((bpk) this.a).a().booleanValue(), ((cyi) this.c).get(), null, null, null, null);
            default:
                final qkg qkgVar6 = this.b;
                final hyc hycVar = (hyc) this.d.get();
                final lar larVar = (lar) this.a.get();
                Object objH = ((cyl) this.c.get()).i() ? ope.H(new iho() { // from class: cyq
                    @Override // java.lang.Runnable
                    public final void run() {
                        hyc hycVar2 = hycVar;
                        qkg qkgVar7 = qkgVar6;
                        lar larVar2 = larVar;
                        iat iatVar = (iat) qkgVar7.get();
                        iau iauVarA = iav.a();
                        iauVarA.a = "CameraVisionKit";
                        iauVarA.b(ope.H(lwd.BACK));
                        iauVarA.c(ope.H(jrl.PHOTO));
                        iauVarA.c = ojc.i(larVar2);
                        hycVar2.a(iatVar, iauVarA.a());
                    }
                }) : orx.a;
                qmd.ae(objH);
                return objH;
        }
    }
}
