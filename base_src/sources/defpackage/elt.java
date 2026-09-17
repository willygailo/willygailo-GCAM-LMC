package defpackage;

import android.app.ActivityManager;
import android.hardware.camera2.CaptureRequest;
import android.media.MediaFormat;
import android.util.DisplayMetrics;
import com.google.android.apps.camera.moments.FastMomentsHdrImpl;
import com.google.googlex.gcam.Gcam;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class elt implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;
    private final /* synthetic */ int f;

    public elt(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i) {
        this.f = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
    }

    public elt(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, byte[] bArr) {
        this.f = i;
        this.e = qkgVar;
        this.a = qkgVar2;
        this.d = qkgVar3;
        this.b = qkgVar4;
        this.c = qkgVar5;
    }

    public elt(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, byte[] bArr, byte[] bArr2) {
        this.f = i;
        this.d = qkgVar;
        this.b = qkgVar2;
        this.e = qkgVar3;
        this.a = qkgVar4;
        this.c = qkgVar5;
    }

    public elt(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, char[] cArr) {
        this.f = i;
        this.e = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.a = qkgVar4;
        this.d = qkgVar5;
    }

    public elt(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, char[] cArr, byte[] bArr) {
        this.f = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.d = qkgVar3;
        this.a = qkgVar4;
        this.e = qkgVar5;
    }

    public elt(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, float[] fArr) {
        this.f = i;
        this.d = qkgVar;
        this.e = qkgVar2;
        this.b = qkgVar3;
        this.a = qkgVar4;
        this.c = qkgVar5;
    }

    public elt(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, int[] iArr) {
        this.f = i;
        this.e = qkgVar;
        this.c = qkgVar2;
        this.a = qkgVar3;
        this.b = qkgVar4;
        this.d = qkgVar5;
    }

    public elt(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, short[] sArr) {
        this.f = i;
        this.d = qkgVar;
        this.c = qkgVar2;
        this.e = qkgVar3;
        this.b = qkgVar4;
        this.a = qkgVar5;
    }

    public elt(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, boolean[] zArr) {
        this.f = i;
        this.e = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.a = qkgVar5;
    }

    public elt(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, byte[][] bArr) {
        this.f = i;
        this.e = qkgVar;
        this.d = qkgVar2;
        this.c = qkgVar3;
        this.b = qkgVar4;
        this.a = qkgVar5;
    }

    public elt(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, char[][] cArr) {
        this.f = i;
        this.d = qkgVar;
        this.e = qkgVar2;
        this.b = qkgVar3;
        this.c = qkgVar4;
        this.a = qkgVar5;
    }

    public elt(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, float[][] fArr) {
        this.f = i;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.d = qkgVar3;
        this.e = qkgVar4;
        this.a = qkgVar5;
    }

    public elt(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, int[][] iArr) {
        this.f = i;
        this.d = qkgVar;
        this.a = qkgVar2;
        this.e = qkgVar3;
        this.c = qkgVar4;
        this.b = qkgVar5;
    }

    public elt(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, short[][] sArr) {
        this.f = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.e = qkgVar3;
        this.c = qkgVar4;
        this.d = qkgVar5;
    }

    public elt(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, boolean[][] zArr) {
        this.f = i;
        this.e = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.a = qkgVar5;
    }

    public elt(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, byte[][][] bArr) {
        this.f = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.e = qkgVar3;
        this.c = qkgVar4;
        this.d = qkgVar5;
    }

    public elt(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, char[][][] cArr) {
        this.f = i;
        this.a = qkgVar;
        this.d = qkgVar2;
        this.c = qkgVar3;
        this.b = qkgVar4;
        this.e = qkgVar5;
    }

    public elt(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, float[][][] fArr) {
        this.f = i;
        this.a = qkgVar;
        this.e = qkgVar2;
        this.d = qkgVar3;
        this.b = qkgVar4;
        this.c = qkgVar5;
    }

    public elt(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, int[][][] iArr) {
        this.f = i;
        this.c = qkgVar;
        this.a = qkgVar2;
        this.d = qkgVar3;
        this.e = qkgVar4;
        this.b = qkgVar5;
    }

    public elt(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, short[][][] sArr) {
        this.f = i;
        this.c = qkgVar;
        this.d = qkgVar2;
        this.e = qkgVar3;
        this.a = qkgVar4;
        this.b = qkgVar5;
    }

    public elt(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, boolean[][][] zArr) {
        this.f = i;
        this.d = qkgVar;
        this.e = qkgVar2;
        this.b = qkgVar3;
        this.c = qkgVar4;
        this.a = qkgVar5;
    }

    public static elt a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5) {
        return new elt(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, 7, (byte[][]) null);
    }

    public static elt b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5) {
        return new elt(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, 8, (char[][]) null);
    }

    public static elt c(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5) {
        return new elt(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, 13, (byte[][][]) null);
    }

    public static elt d(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5) {
        return new elt(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, 14, (char[][][]) null);
    }

    public static elt e(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6) {
        return new elt(qkgVar, qkgVar2, qkgVar4, qkgVar5, qkgVar6, 15, (short[][][]) null);
    }

    public static elt f(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5) {
        return new elt(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, 16, (int[][][]) null);
    }

    public static elt g(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5) {
        return new elt(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, 18, (float[][][]) null);
    }

    public static elt h(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5) {
        return new elt(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, 19, (byte[]) null, (byte[]) null);
    }

    public static elt i(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5) {
        return new elt(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, 20, (char[]) null, (byte[]) null);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        Object objH;
        Object objI;
        final int i = 0;
        final int i2 = 1;
        switch (this.f) {
            case 0:
                final els elsVar = new els((lar) this.a.get(), efb.b(), ((etj) this.b).get(), (lzb) this.c.get());
                qkg qkgVar = this.d;
                ojz ojzVar = ((jbz) this.e).get();
                elsVar.e = new lyy() { // from class: elq
                    @Override // defpackage.lyy
                    public final void h(lic licVar) {
                        els elsVar2 = elsVar;
                        synchronized (els.a) {
                            for (elv elvVar : (elv[]) elsVar2.d.toArray(new elv[0])) {
                                if (!elvVar.o() && !elvVar.equals(elsVar2.j)) {
                                    elsVar2.g(elvVar);
                                }
                            }
                            elv elvVar2 = elsVar2.j;
                            if (elvVar2 != null && !elvVar2.o()) {
                                elsVar2.g(elsVar2.j);
                            }
                        }
                    }
                };
                elsVar.l.b(elsVar.e);
                elsVar.b.execute(new elr(elsVar, 1));
                elsVar.f = ojzVar;
                ((jnw) qkgVar).get().c.e(elsVar);
                return elsVar;
            case 1:
                ddf ddfVar = (ddf) this.e.get();
                final hyc hycVar = (hyc) this.a.get();
                boolean zBooleanValue = ((bpk) this.d).a().booleanValue();
                final pyn pynVarA = pyr.a(this.b);
                final pyn pynVarA2 = pyr.a(this.c);
                if (ddfVar.k(dcv.b)) {
                    final iau iauVarA = iav.a();
                    iauVarA.c(ope.H(jrl.PHOTO));
                    iauVarA.b(ope.H(lwd.BACK));
                    if (zBooleanValue) {
                        iauVarA.a = "BrellaSmartsImax";
                        objH = ope.H(new iho() { // from class: ekz
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i2) {
                                    case 0:
                                        hycVar.a((iat) pynVarA2.get(), iauVarA.a());
                                        break;
                                    default:
                                        hycVar.a((iat) pynVarA2.get(), iauVarA.a());
                                        break;
                                }
                            }
                        });
                    } else {
                        iauVarA.a = "Imax";
                        objH = ope.H(new iho() { // from class: ekz
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i) {
                                    case 0:
                                        hycVar.a((iat) pynVarA.get(), iauVarA.a());
                                        break;
                                    default:
                                        hycVar.a((iat) pynVarA.get(), iauVarA.a());
                                        break;
                                }
                            }
                        });
                    }
                } else {
                    objH = orx.a;
                }
                qmd.ae(objH);
                return objH;
            case 2:
                fhv fhvVar = ((etf) this.e).get();
                lar larVar = (lar) this.b.get();
                pyn pynVarA3 = pyr.a(this.c);
                pyn pynVarA4 = pyr.a(this.a);
                if (((eoa) this.d.get()).a()) {
                    final eoc eocVar = (eoc) pynVarA3.get();
                    eocVar.getClass();
                    objI = ope.I(new iho() { // from class: eny
                        @Override // java.lang.Runnable
                        public final void run() {
                            eoc eocVar2 = eocVar;
                            if (eocVar2.a()) {
                                eoc.b(eocVar2.a);
                            }
                        }
                    }, new jnp(larVar, fhvVar, pynVarA4, 1));
                } else {
                    objI = orx.a;
                }
                qmd.ae(objI);
                return objI;
            case 3:
                return new eqa((hcg) this.d.get(), ((pks) this.c).get(), ((cjc) this.e).a(), ((ese) this.b).get(), (lap) this.a.get());
            case 4:
                return new erb((lda) this.e.get(), (ddf) this.c.get(), new jdu(), ((pyw) this.a).get(), (jdy) this.b.get(), ((etg) this.d).get());
            case 5:
                jrl jrlVar = ((jrj) this.e).get();
                final pyn pynVarA5 = pyr.a(this.b);
                pyn pynVarA6 = pyr.a(this.c);
                final phv phvVar = (phv) this.d.get();
                final ljf ljfVar = (ljf) this.a.get();
                if (jrlVar != jrl.PHOTO && jrlVar != jrl.IMAGE_INTENT) {
                    return bwb.a;
                }
                if (jrlVar != jrl.PHOTO) {
                    pynVarA5 = pynVarA6;
                }
                return new bvv() { // from class: ewf
                    @Override // defpackage.bvv
                    public final /* synthetic */ String c() {
                        return aas.g(this);
                    }

                    @Override // defpackage.bvv
                    public final pht fz() {
                        phv phvVar2 = phvVar;
                        final ljf ljfVar2 = ljfVar;
                        final pyn pynVar = pynVarA5;
                        return phvVar2.submit(new Callable() { // from class: ewh
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                ljf ljfVar3 = ljfVar2;
                                pyn pynVar2 = pynVar;
                                ljfVar3.e("PhotoModeStartup");
                                ljfVar3.e("get");
                                iho ihoVar = (iho) pynVar2.get();
                                ljfVar3.g("run");
                                ihoVar.run();
                                ljfVar3.f();
                                ljfVar3.f();
                                return Boolean.TRUE;
                            }
                        });
                    }
                };
            case 6:
                pyn pynVarA7 = pyr.a(this.d);
                pyn pynVarA8 = pyr.a(this.e);
                pyn pynVarA9 = pyr.a(this.b);
                pyr.a(this.a);
                ddf ddfVar2 = (ddf) this.c.get();
                ArrayList arrayList = new ArrayList();
                ddi ddiVar = ddl.a;
                ddfVar2.b();
                arrayList.add((fjt) pynVarA7.get());
                if (ddfVar2.k(ddl.ar)) {
                    arrayList.add((fjt) pynVarA8.get());
                }
                if (ddfVar2.k(ddl.aq)) {
                    arrayList.add((fjt) pynVarA9.get());
                }
                ddfVar2.b();
                return new fjd(arrayList);
            case 7:
                ddf ddfVar3 = (ddf) this.e.get();
                MediaFormat mediaFormatB = eyi.b();
                ojc ojcVar = (ojc) this.d.get();
                ojc ojcVar2 = (ojc) this.c.get();
                return new fpz(ddfVar3, mediaFormatB, ojcVar, ojcVar2, (Executor) this.a.get());
            case 8:
                gxm gxmVar = ((djc) this.d).get();
                nez nezVar = ((gjf) this.e).get();
                final qkg qkgVar2 = this.b;
                final qkg qkgVar3 = this.c;
                final ljf ljfVar2 = (ljf) this.a.get();
                try {
                    ljfVar2.e("MICRO_GyroModule#providesShutdownTasks");
                    Object objH2 = (gxmVar.c() && nezVar.a) ? ope.H(new gnl() { // from class: fst
                        @Override // defpackage.gnl, java.lang.Runnable
                        public final void run() {
                            ljf ljfVar3 = ljfVar2;
                            qkg qkgVar4 = qkgVar3;
                            qkg qkgVar5 = qkgVar2;
                            ljfVar3.e("MICRO_GyroModule#stopGyroCapture");
                            ((dvp) qkgVar4.get()).e((dvq) qkgVar5.get());
                            ljfVar3.f();
                        }
                    }) : orx.a;
                    ljfVar2.f();
                    qmd.ae(objH2);
                    return objH2;
                } catch (Throwable th) {
                    ljfVar2.f();
                    throw th;
                }
            case 9:
                return new ftr((lzb) this.b.get(), ((ena) this.a).get(), (jug) this.e.get(), (dsz) this.c.get(), (dsz) this.d.get());
            case 10:
                return new fvn((ius) this.d.get(), (huj) this.a.get(), (DisplayMetrics) this.e.get(), ((emd) this.c).get(), (ddf) this.b.get());
            case 11:
                fxk fxkVar = (fxk) this.e.get();
                qkg qkgVar4 = this.b;
                ddf ddfVar4 = (ddf) this.c.get();
                khx khxVar = (khx) this.d.get();
                lje ljeVar = new lje((ljf) this.a.get(), "PhotoSphereModule#providePhotoSphereAgent");
                try {
                    Object objI2 = (!ddfVar4.k(ddw.b) || khxVar.l().getSensorList(4).size() <= 0 || fmm.a((ActivityManager) khx.m(khxVar.a, "activity"))) ? oih.a : ojc.i(new fxj(fxkVar, qkgVar4));
                    ljeVar.close();
                    return objI2;
                } catch (Throwable th2) {
                    try {
                        ljeVar.close();
                        break;
                    } catch (Throwable th3) {
                    }
                    throw th2;
                }
            case 12:
                return new FastMomentsHdrImpl(((liq) this.b).get(), (Gcam) this.c.get(), (Executor) this.d.get(), (pko) this.e.get(), (bxy) this.a.get());
            case 13:
                return new gcg(((gcd) this.b).get(), ((cbe) this.a).a().intValue(), ((cbe) this.e).a().intValue(), ((cbe) this.c).a().intValue(), ((gfb) this.d).b().intValue());
            case 14:
                hko hkoVar = (hko) this.a.get();
                return new gdm(hkoVar, ((djc) this.c).get(), ((liq) this.b).get(), (ddf) this.e.get(), null);
            case 15:
                lap lapVar = (lap) this.c.get();
                lap lapVar2 = (lap) this.d.get();
                final gib gibVar = new gib(((dgb) this.e).get(), (ljf) this.a.get(), (lar) this.b.get());
                lapVar.c(new lie() { // from class: gic
                    @Override // defpackage.lie, java.lang.AutoCloseable
                    public final void close() {
                        switch (i2) {
                            case 0:
                                gib gibVar2 = gibVar;
                                synchronized (gibVar2.c) {
                                    phv phvVar2 = gibVar2.d;
                                    if (phvVar2 != null) {
                                        phvVar2.shutdownNow();
                                    }
                                    gibVar2.d = null;
                                    gibVar2.e = true;
                                    break;
                                }
                                return;
                            default:
                                gib gibVar3 = gibVar;
                                synchronized (gibVar3.c) {
                                    phv phvVar3 = gibVar3.d;
                                    if (phvVar3 != null) {
                                        phvVar3.shutdown();
                                    }
                                    gibVar3.e = true;
                                    break;
                                }
                                return;
                        }
                    }
                });
                lapVar2.c(new lie() { // from class: gic
                    @Override // defpackage.lie, java.lang.AutoCloseable
                    public final void close() {
                        switch (i) {
                            case 0:
                                gib gibVar2 = gibVar;
                                synchronized (gibVar2.c) {
                                    phv phvVar2 = gibVar2.d;
                                    if (phvVar2 != null) {
                                        phvVar2.shutdownNow();
                                    }
                                    gibVar2.d = null;
                                    gibVar2.e = true;
                                    break;
                                }
                                return;
                            default:
                                gib gibVar3 = gibVar;
                                synchronized (gibVar3.c) {
                                    phv phvVar3 = gibVar3.d;
                                    if (phvVar3 != null) {
                                        phvVar3.shutdown();
                                    }
                                    gibVar3.e = true;
                                    break;
                                }
                                return;
                        }
                    }
                });
                return gibVar;
            case 16:
                lir lirVar = ((dgb) this.c).get();
                final ljf ljfVar3 = (ljf) this.a.get();
                final Executor executor = (Executor) this.d.get();
                final pih pihVar = (pih) this.e.get();
                final qkg qkgVar5 = this.b;
                lirVar.a("PictureTakerModule").b("RootImageCommand requested");
                return aas.d(new Runnable() { // from class: gpg
                    @Override // java.lang.Runnable
                    public final void run() {
                        executor.execute(ljfVar3.c("PictureTaker", new gpf(pihVar, qkgVar5, 0)));
                    }
                }, "taker");
            case 17:
                ddf ddfVar5 = (ddf) this.d.get();
                htp htpVar = ((huh) this.e).get();
                final huf hufVar = (huf) this.b.get();
                final gqy gqyVar = (gqy) this.c.get();
                final imf imfVar = (imf) this.a.get();
                if (!ddfVar5.k(ddu.r)) {
                    return lcz.a(Boolean.FALSE);
                }
                lda ldaVarA = htpVar.a("pref_camera_raw_output_key", false);
                gqyVar.a(new cjx(ldaVarA, 3), pgr.INSTANCE);
                ldaVarA.a(new lij() { // from class: gqo
                    @Override // defpackage.lij
                    public final void fB(Object obj) {
                        gqy gqyVar2 = gqyVar;
                        if (((Boolean) obj).booleanValue() && ((gqx) gqyVar2.fA()).equals(gqx.OFF)) {
                            gqyVar2.fB(gqx.AUTO);
                        }
                    }
                }, pgr.INSTANCE);
                lda ldaVarB = lcz.b(ldaVarA, new oiu() { // from class: gqq
                    @Override // defpackage.oiu
                    public final Object a(Object obj) {
                        imf imfVar2 = imfVar;
                        boolean z = false;
                        if (Boolean.TRUE.equals((Boolean) obj) && !((Boolean) imfVar2.a().fA()).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                }, eto.k);
                return ddfVar5.k(ddl.bp) ? lcz.b(ldaVarB, new oiu() { // from class: gqp
                    @Override // defpackage.oiu
                    public final Object a(Object obj) {
                        huf hufVar2 = hufVar;
                        boolean z = false;
                        if (Boolean.TRUE.equals((Boolean) obj) && !((Boolean) hufVar2.c(htu.ab)).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                }, eto.l) : ldaVarB;
            case 18:
                lap lapVar3 = (lap) this.a.get();
                ebe ebeVar = (ebe) this.e.get();
                final ecb ecbVar = (ecb) this.b.get();
                final eam eamVar = (eam) this.c.get();
                grb grbVar = new grb(ebeVar, new ojz() { // from class: grj
                    @Override // defpackage.ojz
                    public final Object a() {
                        ecb ecbVar2 = ecbVar;
                        eam eamVar2 = eamVar;
                        boolean z = true;
                        if (ecbVar2 != ecb.LONG_EXPOSURE && !((Boolean) eamVar2.a().fA()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                });
                lapVar3.c(grbVar);
                return grbVar;
            case 19:
                qkg qkgVar6 = this.d;
                ddf ddfVar6 = (ddf) this.b.get();
                qkg qkgVar7 = this.e;
                final qkg qkgVar8 = this.a;
                lvp lvpVar = ((gjp) this.c).get();
                ddi ddiVar2 = ddl.a;
                ddfVar6.b();
                lco lcoVarJ = (gsn.g(lvpVar, ddfVar6) && ((lzh) qkgVar6.get()).g) ? lcv.j((lco) qkgVar7.get(), new oiu() { // from class: gsl
                    @Override // defpackage.oiu
                    public final Object a(Object obj) {
                        return fcy.k(mip.be(CaptureRequest.SCALER_CROP_REGION, ((gsm) obj).b), mip.be(CaptureRequest.CONTROL_ZOOM_RATIO, (Float) ((lco) qkgVar8.get()).fA()));
                    }
                }) : lcv.j((lco) qkgVar7.get(), eto.n);
                qmd.ae(lcoVarJ);
                return lcoVarJ;
            default:
                ddf ddfVar7 = (ddf) this.c.get();
                lap lapVar4 = (lap) this.b.get();
                lnc lncVar = (lnc) this.d.get();
                ojc ojcVar3 = (ojc) this.a.get();
                ead eadVar = (ead) this.e.get();
                if (!ojcVar3.g()) {
                    return oih.a;
                }
                lmv lmvVarR = lncVar.r(lncVar.u((lnx) ojcVar3.c(), orx.a), ddfVar7.k(ddm.am) ? eadVar.c : 2);
                lapVar4.c(lmvVarR);
                return ojc.i(lmvVarR);
        }
    }
}
