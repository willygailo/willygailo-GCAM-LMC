package defpackage;

import android.content.Intent;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class cso implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final /* synthetic */ int d;

    public cso(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i) {
        this.d = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    public cso(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, byte[] bArr) {
        this.d = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
    }

    public cso(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, char[] cArr) {
        this.d = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
    }

    public cso(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, float[] fArr) {
        this.d = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
    }

    public cso(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, int[] iArr) {
        this.d = i;
        this.a = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
    }

    public cso(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, short[] sArr) {
        this.d = i;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.a = qkgVar3;
    }

    public cso(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, boolean[] zArr) {
        this.d = i;
        this.c = qkgVar;
        this.a = qkgVar2;
        this.b = qkgVar3;
    }

    public cso(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, byte[][] bArr) {
        this.d = i;
        this.a = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
    }

    public cso(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, char[][] cArr) {
        this.d = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
    }

    public cso(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, float[][] fArr) {
        this.d = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
    }

    public cso(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, int[][] iArr) {
        this.d = i;
        this.c = qkgVar;
        this.a = qkgVar2;
        this.b = qkgVar3;
    }

    public cso(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, short[][] sArr) {
        this.d = i;
        this.a = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
    }

    public cso(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, boolean[][] zArr) {
        this.d = i;
        this.a = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
    }

    public cso(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, byte[][][] bArr) {
        this.d = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
    }

    public cso(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, char[][][] cArr) {
        this.d = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
    }

    public cso(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, int[][][] iArr) {
        this.d = i;
        this.c = qkgVar;
        this.a = qkgVar2;
        this.b = qkgVar3;
    }

    public cso(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, short[][][] sArr) {
        this.d = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
    }

    public cso(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, boolean[][][] zArr) {
        this.d = i;
        this.a = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
    }

    public static cso a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new cso(qkgVar, qkgVar2, qkgVar3, 4, (short[]) null);
    }

    public static cso b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new cso(qkgVar, qkgVar2, qkgVar3, 7);
    }

    public static cso c(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new cso(qkgVar, qkgVar2, qkgVar3, 8, (float[]) null);
    }

    public static cso d(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new cso(qkgVar, qkgVar2, qkgVar3, 17, (char[][][]) null);
    }

    public static cso e(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new cso(qkgVar, qkgVar2, qkgVar3, 18, (short[][][]) null);
    }

    public static cso f(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new cso(qkgVar, qkgVar2, qkgVar3, 19, (int[][][]) null);
    }

    public static cso g(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new cso(qkgVar, qkgVar2, qkgVar3, 20, (boolean[][][]) null);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.d) {
            case 0:
                ((cop) this.a).get();
                try {
                    return gsf.a(((csn) this.b).get(), ((coo) this.c).get().e.c(), 35);
                } catch (gse e) {
                    throw new RuntimeException(e);
                }
            case 1:
                return new dyx((lxb) this.a.get(), (dzb) this.c.get(), (dyz) this.b.get(), 12, 1, 1);
            case 2:
                return new csq((imt) this.c.get(), ((ing) this.b).a(), (lar) this.a.get());
            case 3:
                return new csy(this.b, (ScheduledExecutorService) this.a.get(), (ddf) this.c.get());
            case 4:
                return new cwf((lar) this.b.get(), ((etf) this.c).get(), ((eme) this.a).get());
            case 5:
                final qkg qkgVar = this.a;
                cyl cylVar = (cyl) this.c.get();
                final Intent intent = ((emj) this.b).get();
                return cylVar.i() ? mip.eR(new Runnable() { // from class: cyr
                    @Override // java.lang.Runnable
                    public final void run() {
                        qkg qkgVar2 = qkgVar;
                        final Intent intent2 = intent;
                        final czl czlVar = (czl) qkgVar2.get();
                        czlVar.k.execute(czlVar.x.a(new Runnable() { // from class: czc
                            @Override // java.lang.Runnable
                            public final void run() {
                                final czl czlVar2 = czlVar;
                                Intent intent3 = intent2;
                                lap lapVar = czlVar2.j;
                                final hzi hziVar = czlVar2.s;
                                hziVar.g = czlVar2;
                                final lie lieVarA = hziVar.c.a(hziVar);
                                lapVar.c(new lie() { // from class: hzc
                                    @Override // defpackage.lie, java.lang.AutoCloseable
                                    public final void close() {
                                        hzi hziVar2 = hziVar;
                                        lieVarA.close();
                                        hziVar2.g = hzi.b;
                                    }
                                });
                                czlVar2.b.c();
                                czlVar2.j.c(czlVar2.b.a(czlVar2));
                                czlVar2.j.c(new lie() { // from class: czi
                                    @Override // defpackage.lie, java.lang.AutoCloseable
                                    public final void close() {
                                        czlVar2.b.b();
                                    }
                                });
                                czlVar2.j.c(czlVar2.u.a(new lij() { // from class: czj
                                    @Override // defpackage.lij
                                    public final void fB(Object obj) {
                                        czl czlVar3 = czlVar2;
                                        if (((Boolean) obj).booleanValue()) {
                                            czlVar3.v = true;
                                            czlVar3.h();
                                        } else {
                                            czlVar3.v = false;
                                            czlVar3.g();
                                        }
                                    }
                                }, czlVar2.k));
                                czlVar2.g = true;
                                if (bqe.m(intent3) || bqe.d(intent3) != jrl.PHOTO) {
                                    return;
                                }
                                czlVar2.h = true;
                                czlVar2.h();
                            }
                        }));
                    }
                }) : bqi.g;
            case 6:
                return new cza((cyl) this.c.get(), (dac) this.a.get(), (ljf) this.b.get(), dug.a());
            case 7:
                final dbe dbeVar = (dbe) this.a.get();
                final dbd dbdVar = (dbd) this.b.get();
                final lap lapVar = (lap) this.c.get();
                return ope.H(aas.d(new Runnable() { // from class: dar
                    @Override // java.lang.Runnable
                    public final void run() {
                        final dbe dbeVar2 = dbeVar;
                        dbd dbdVar2 = dbdVar;
                        lap lapVar2 = lapVar;
                        dbeVar2.c(dbdVar2);
                        dbeVar2.getClass();
                        lapVar2.c(new lie() { // from class: daq
                            @Override // defpackage.lie, java.lang.AutoCloseable
                            public final void close() {
                                dbeVar2.b();
                            }
                        });
                    }
                }, "coach"));
            case 8:
                return new dbd(((gjo) this.b).get(), (dvp) this.a.get(), ((fub) this.c).get());
            case 9:
                return new dbw(((emd) this.a).get(), (ius) this.c.get(), (ddf) this.b.get());
            case 10:
                return new dbx((dbe) this.c.get(), (fjs) this.b.get(), (ddf) this.a.get());
            case 11:
                qkg qkgVar2 = this.a;
                final hrx hrxVar = (hrx) this.b.get();
                bqg bqgVar = ((etg) this.c).get();
                final dff dffVar = (dff) qkgVar2.get();
                hrxVar.a(dffVar);
                bqgVar.i().c(new lie() { // from class: dfh
                    @Override // defpackage.lie, java.lang.AutoCloseable
                    public final void close() {
                        hrxVar.i(dffVar);
                    }
                });
                qmd.ae(dffVar);
                return dffVar;
            case 12:
                return new dfr(((emm) this.a).get(), ((ikv) this.c).get(), (ddf) this.b.get());
            case 13:
                return new dga(((emd) this.c).get(), (dfl) this.a.get(), lzg.c(), (dfr) this.b.get());
            case 14:
                ddf ddfVar = (ddf) this.a.get();
                ((fhq) this.c).get();
                return new dgi(ddfVar);
            case 15:
                ddf ddfVar2 = (ddf) this.b.get();
                ((fsr) this.a).b();
                lzi lziVar = (lzi) this.c.get();
                ddi ddiVar = ddl.a;
                ddfVar2.d();
                return new DynamicDepthUtils(lziVar);
            case 16:
                lda ldaVar = (lda) this.c.get();
                pyn pynVarA = pyr.a(this.b);
                ljf ljfVar = (ljf) this.a.get();
                if (!((Boolean) ldaVar.fA()).booleanValue()) {
                    return bqi.e;
                }
                Runnable runnableC = ljfVar.c("ddcWarmup", new doa(pynVarA, 1));
                runnableC.getClass();
                return new dks(runnableC, 0);
            case 17:
                boolean zBooleanValue = ((Boolean) this.c.get()).booleanValue();
                lap lapVar2 = (lap) this.b.get();
                qkg qkgVar3 = this.a;
                if (!zBooleanValue) {
                    return new dok();
                }
                dnn dnnVar = ((dno) qkgVar3).get();
                lapVar2.c(dnnVar);
                return dnnVar;
            case 18:
                boolean zBooleanValue2 = ((Boolean) this.c.get()).booleanValue();
                lap lapVar3 = (lap) this.b.get();
                qkg qkgVar4 = this.a;
                if (!zBooleanValue2) {
                    return new dok();
                }
                doi doiVar = ((doj) qkgVar4).get();
                lapVar3.c(doiVar);
                return doiVar;
            case 19:
                final pyn pynVarA2 = pyr.a(this.c);
                final pyn pynVarA3 = pyr.a(this.a);
                final ljf ljfVar2 = (ljf) this.b.get();
                return new bvv() { // from class: dnx
                    @Override // defpackage.bvv
                    public final /* synthetic */ String c() {
                        return aas.g(this);
                    }

                    @Override // defpackage.bvv
                    public final pht fz() {
                        ljf ljfVar3 = ljfVar2;
                        pyn pynVar = pynVarA2;
                        pyn pynVar2 = pynVarA3;
                        pynVar.getClass();
                        ljfVar3.d("CpuFaceBeautificationStartup", new doa(pynVar, 0));
                        pynVar2.getClass();
                        ljfVar3.d("GpuFaceBeautificationStartup", new doa(pynVar2, 0));
                        return plk.V(true);
                    }
                };
            default:
                return aas.e(((ljf) this.b.get()).c("FaceBeautificationCM.Startup", new dsw(this.a, 1)), (Executor) this.c.get(), "facebtf");
        }
    }
}
