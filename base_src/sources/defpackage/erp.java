package defpackage;

import android.graphics.Bitmap;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.lasagna.LasagnaCallbacks;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class erp implements LasagnaCallbacks, esj {
    public static final ouj a = ouj.h("com/google/android/apps/camera/lasagna/MotionBlurProcessingSession");
    public final erk b;
    public final epm c;
    public final int d;
    public final esk e;
    public final ljf f;
    public final pih g;
    public final pih h;
    public final hsa i;
    public edd j;
    public final gof k;
    public pih l;
    public Runnable m;
    public esh n;
    public boolean o = false;
    public final fjx p = new fjx();
    private final pjl q;
    private final Executor r;

    public erp(pjl pjlVar, erk erkVar, Executor executor, ljf ljfVar, gog gogVar, epm epmVar, esk eskVar, pih pihVar, pih pihVar2) {
        this.q = pjlVar;
        this.b = erkVar;
        this.r = executor;
        this.f = ljfVar;
        this.k = gogVar.c;
        this.c = epmVar;
        this.e = eskVar;
        this.g = pihVar;
        this.h = pihVar2;
        this.d = gogVar.b.h().a;
        this.i = gogVar.b;
    }

    @Override // com.google.googlex.gcam.lasagna.LasagnaCallbacks
    public final synchronized void a(final int i, int i2, final String str, ojc ojcVar) {
        this.o = true;
        Runnable runnable = this.m;
        if (runnable != null) {
            runnable.run();
        }
        this.h.o(true);
        if (i2 == 0) {
            ovd ovdVar = ovl.a;
            pih pihVar = this.l;
            if (pihVar != null) {
                pihVar.o(Boolean.TRUE);
            }
            fjx fjxVar = this.p;
            poy poyVar = fjxVar.a;
            if (poyVar.c) {
                poyVar.m();
                poyVar.c = false;
            }
            pdb pdbVar = (pdb) poyVar.b;
            pdb pdbVar2 = pdb.v;
            pdbVar.a |= 2;
            pdbVar.c = true;
            if (ojcVar.g()) {
                plp plpVar = (plp) ojcVar.c();
                ppj ppjVar = plpVar.i;
                if (!ppjVar.isEmpty()) {
                    poy poyVar2 = fjxVar.a;
                    float fAbs = Math.abs(((Float) ohh.t(ppjVar)).floatValue());
                    if (poyVar2.c) {
                        poyVar2.m();
                        poyVar2.c = false;
                    }
                    pdb pdbVar3 = (pdb) poyVar2.b;
                    pdbVar3.a |= 32;
                    pdbVar3.f = fAbs;
                }
                if ((plpVar.a & 128) != 0) {
                    poy poyVar3 = fjxVar.a;
                    float f = plpVar.f;
                    if (poyVar3.c) {
                        poyVar3.m();
                        poyVar3.c = false;
                    }
                    pdb pdbVar4 = (pdb) poyVar3.b;
                    pdbVar4.a |= 64;
                    pdbVar4.g = f;
                }
                if ((plpVar.a & 256) != 0) {
                    poy poyVar4 = fjxVar.a;
                    float f2 = plpVar.g;
                    if (poyVar4.c) {
                        poyVar4.m();
                        poyVar4.c = false;
                    }
                    pdb pdbVar5 = (pdb) poyVar4.b;
                    pdbVar5.a |= 128;
                    pdbVar5.h = f2;
                }
                if ((plpVar.a & 16) != 0) {
                    poy poyVar5 = fjxVar.a;
                    int i3 = plpVar.d;
                    if (poyVar5.c) {
                        poyVar5.m();
                        poyVar5.c = false;
                    }
                    pdb pdbVar6 = (pdb) poyVar5.b;
                    pdbVar6.a |= 512;
                    pdbVar6.j = i3;
                }
                if ((plpVar.a & 32) != 0) {
                    poy poyVar6 = fjxVar.a;
                    int i4 = plpVar.e;
                    if (poyVar6.c) {
                        poyVar6.m();
                        poyVar6.c = false;
                    }
                    pdb pdbVar7 = (pdb) poyVar6.b;
                    pdbVar7.a |= 1024;
                    pdbVar7.k = i4;
                }
                if ((plpVar.a & 512) != 0) {
                    poy poyVar7 = fjxVar.a;
                    int i5 = plpVar.h;
                    if (poyVar7.c) {
                        poyVar7.m();
                        poyVar7.c = false;
                    }
                    pdb pdbVar8 = (pdb) poyVar7.b;
                    pdbVar8.a |= 2048;
                    pdbVar8.l = i5;
                }
                if ((plpVar.a & 2048) != 0) {
                    poy poyVar8 = fjxVar.a;
                    boolean z = plpVar.j;
                    if (poyVar8.c) {
                        poyVar8.m();
                        poyVar8.c = false;
                    }
                    pdb pdbVar9 = (pdb) poyVar8.b;
                    pdbVar9.a |= 4096;
                    pdbVar9.m = z;
                }
                if ((plpVar.a & 8) != 0) {
                    poy poyVar9 = fjxVar.a;
                    int i6 = plpVar.c;
                    if (poyVar9.c) {
                        poyVar9.m();
                        poyVar9.c = false;
                    }
                    pdb pdbVar10 = (pdb) poyVar9.b;
                    pdbVar10.a |= 8192;
                    pdbVar10.n = i6;
                }
                if ((plpVar.a & 131072) != 0) {
                    poy poyVar10 = fjxVar.a;
                    pln plnVar = plpVar.k;
                    if (plnVar == null) {
                        plnVar = pln.g;
                    }
                    pbi pbiVarL = fjx.l(plnVar);
                    if (poyVar10.c) {
                        poyVar10.m();
                        poyVar10.c = false;
                    }
                    pdb pdbVar11 = (pdb) poyVar10.b;
                    pbiVarL.getClass();
                    pdbVar11.p = pbiVarL;
                    pdbVar11.a |= 32768;
                }
                if ((plpVar.a & 262144) != 0) {
                    poy poyVar11 = fjxVar.a;
                    pln plnVar2 = plpVar.l;
                    if (plnVar2 == null) {
                        plnVar2 = pln.g;
                    }
                    pbi pbiVarL2 = fjx.l(plnVar2);
                    if (poyVar11.c) {
                        poyVar11.m();
                        poyVar11.c = false;
                    }
                    pdb pdbVar12 = (pdb) poyVar11.b;
                    pbiVarL2.getClass();
                    pdbVar12.q = pbiVarL2;
                    pdbVar12.a |= 65536;
                }
                if ((plpVar.a & 524288) != 0) {
                    poy poyVar12 = fjxVar.a;
                    pln plnVar3 = plpVar.m;
                    if (plnVar3 == null) {
                        plnVar3 = pln.g;
                    }
                    pbi pbiVarL3 = fjx.l(plnVar3);
                    if (poyVar12.c) {
                        poyVar12.m();
                        poyVar12.c = false;
                    }
                    pdb pdbVar13 = (pdb) poyVar12.b;
                    pbiVarL3.getClass();
                    pdbVar13.r = pbiVarL3;
                    pdbVar13.a = 131072 | pdbVar13.a;
                }
                if ((plpVar.a & 1048576) != 0) {
                    poy poyVar13 = fjxVar.a;
                    pln plnVar4 = plpVar.n;
                    if (plnVar4 == null) {
                        plnVar4 = pln.g;
                    }
                    pbi pbiVarL4 = fjx.l(plnVar4);
                    if (poyVar13.c) {
                        poyVar13.m();
                        poyVar13.c = false;
                    }
                    pdb pdbVar14 = (pdb) poyVar13.b;
                    pbiVarL4.getClass();
                    pdbVar14.s = pbiVarL4;
                    pdbVar14.a = 262144 | pdbVar14.a;
                }
                if ((plpVar.a & 2097152) != 0) {
                    poy poyVar14 = fjxVar.a;
                    pln plnVar5 = plpVar.o;
                    if (plnVar5 == null) {
                        plnVar5 = pln.g;
                    }
                    pbi pbiVarL5 = fjx.l(plnVar5);
                    if (poyVar14.c) {
                        poyVar14.m();
                        poyVar14.c = false;
                    }
                    pdb pdbVar15 = (pdb) poyVar14.b;
                    pbiVarL5.getClass();
                    pdbVar15.t = pbiVarL5;
                    pdbVar15.a |= 524288;
                }
                if ((plpVar.a & 4194304) != 0) {
                    poy poyVar15 = fjxVar.a;
                    plm plmVar = plpVar.p;
                    if (plmVar == null) {
                        plmVar = plm.c;
                    }
                    poy poyVarM = ozx.d.m();
                    double d = plmVar.a;
                    if (poyVarM.c) {
                        poyVarM.m();
                        poyVarM.c = false;
                    }
                    ozx ozxVar = (ozx) poyVarM.b;
                    int i7 = ozxVar.a | 1;
                    ozxVar.a = i7;
                    ozxVar.b = d;
                    int i8 = plmVar.b;
                    ozxVar.a = i7 | 2;
                    ozxVar.c = i8;
                    ozx ozxVar2 = (ozx) poyVarM.j();
                    if (poyVar15.c) {
                        poyVar15.m();
                        poyVar15.c = false;
                    }
                    pdb pdbVar16 = (pdb) poyVar15.b;
                    ozxVar2.getClass();
                    pdbVar16.u = ozxVar2;
                    pdbVar16.a |= 1048576;
                }
            }
            this.b.b(i, true);
        } else {
            ((oug) ((oug) a.c().g(ovl.a, "LasagnaProcSession")).G(1446)).t("[shot-%s] Final error status [%s]. ", i, str);
            if (i2 != 10) {
                this.r.execute(new Runnable() { // from class: erm
                    @Override // java.lang.Runnable
                    public final void run() {
                        esh eshVar;
                        edd eddVar;
                        jgu jguVarA;
                        ojc ojcVarI;
                        erp erpVar = this.a;
                        int i9 = i;
                        String str2 = str;
                        ovd ovdVar2 = ovl.a;
                        ojc ojcVarA = oit.a(plo.class, str2.toUpperCase(Locale.ROOT));
                        if (ojcVarA.g()) {
                            String.format(Locale.ROOT, "Received failure signal %d (%s) for shot %d", Integer.valueOf(((plo) ojcVarA.c()).f), ((plo) ojcVarA.c()).name(), Integer.valueOf(i9));
                        }
                        if (ojcVarA.g() && (eshVar = erpVar.n) != null && (eddVar = erpVar.j) != null) {
                            plo ploVar = (plo) ojcVarA.c();
                            ((oug) ((oug) erw.a.c().g(ovl.a, "LasagnaProcessor")).G(1471)).w("onLasagnaFailureSignal %s for shot %d", ploVar, eddVar.a());
                            erw erwVar = (erw) eshVar;
                            if (erwVar.f.g()) {
                                eqy eqyVar = (eqy) erwVar.f.c();
                                jgu jguVar = (jgu) eqyVar.a.get(ploVar);
                                if (jguVar != null) {
                                    ojcVarI = ojc.i(jguVar);
                                } else {
                                    switch (ploVar.ordinal()) {
                                        case 1:
                                            jguVarA = eqyVar.a(eqyVar.k.getString(R.string.phone_moved_fast_chip));
                                            break;
                                        case 2:
                                            jguVarA = eqyVar.a(eqyVar.k.getString(R.string.subject_moved_fast_chip));
                                            break;
                                        case 3:
                                        default:
                                            jguVarA = null;
                                            break;
                                        case 4:
                                            jguVarA = eqyVar.a(eqyVar.k.getString(R.string.not_enough_motion_chip));
                                            break;
                                    }
                                    if (jguVarA != null) {
                                        eqyVar.a.put(ploVar, jguVarA);
                                        ojcVarI = ojc.i(jguVarA);
                                    } else {
                                        ojcVarI = oih.a;
                                    }
                                }
                                if (ojcVarI.g()) {
                                    eqyVar.g((jgu) ojcVarI.c());
                                }
                            }
                        }
                        fjx fjxVar2 = erpVar.p;
                        poy poyVar16 = fjxVar2.a;
                        if (poyVar16.c) {
                            poyVar16.m();
                            poyVar16.c = false;
                        }
                        pdb pdbVar17 = (pdb) poyVar16.b;
                        pdb pdbVar18 = pdb.v;
                        pdbVar17.a = 2 | pdbVar17.a;
                        pdbVar17.c = false;
                        if (ojcVarA.g()) {
                            poy poyVar17 = fjxVar2.a;
                            int i10 = ((plo) ojcVarA.c()).f;
                            if (poyVar17.c) {
                                poyVar17.m();
                                poyVar17.c = false;
                            }
                            pdb pdbVar19 = (pdb) poyVar17.b;
                            pdbVar19.a |= 4;
                            pdbVar19.d = i10;
                        } else {
                            poy poyVar18 = fjxVar2.a;
                            if (poyVar18.c) {
                                poyVar18.m();
                                poyVar18.c = false;
                            }
                            pdb pdbVar20 = (pdb) poyVar18.b;
                            pdbVar20.a |= 4;
                            pdbVar20.d = 0;
                        }
                        erpVar.c();
                        boolean zEndsWith = str2.endsWith(plo.TOO_EARLY_FOR_HDR_PLUS_RESULT.name());
                        erpVar.b.a(i9, zEndsWith);
                        pih pihVar2 = erpVar.l;
                        if (pihVar2 == null || pihVar2.isDone()) {
                            return;
                        }
                        erpVar.l.a(zEndsWith ? new dma(str2) : new IllegalStateException(str2));
                    }
                });
            }
        }
        ((iik) this.i.k()).t = this.p.k();
    }

    @Override // com.google.googlex.gcam.lasagna.LasagnaCallbacks
    public final void b(int i, long j, int i2, String str, ShotMetadata shotMetadata) {
        ojc ojcVarI;
        edd eddVar;
        int i3;
        edt edtVar;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[4];
        objArr[0] = Long.valueOf(j);
        int i4 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        objArr[1] = Integer.valueOf(i4);
        objArr[2] = plk.c(i2);
        objArr[3] = str;
        String.format(locale, "Got image!!! allocationId = %d, outputType=%d (%s), description=%s)", objArr);
        ovd ovdVar = ovl.a;
        this.f.e("Lasagna#onImage");
        ojc ojcVarA = this.q.a(j);
        if (ojcVarA.g()) {
            this.f.e("settingResult");
            InterleavedImageU8 interleavedImageU8 = (InterleavedImageU8) ojcVarA.c();
            interleavedImageU8.b();
            interleavedImageU8.a();
            GcamModuleJNI.InterleavedImageU8_channels(interleavedImageU8.a, interleavedImageU8);
            ojcVarI = ojc.i(new esg(interleavedImageU8, i2, shotMetadata));
            this.f.f();
        } else {
            ojcVarI = oih.a;
        }
        esh eshVar = this.n;
        if (eshVar != null && (eddVar = this.j) != null) {
            eddVar.a();
            erw erwVar = (erw) eshVar;
            erv ervVar = (erv) erwVar.d.get(eddVar);
            if (ervVar == null) {
                if (ojcVarI.g()) {
                    ((esg) ojcVarI.c()).close();
                }
                throw new IllegalStateException("Shot hasn't been started yet");
            }
            if (ojcVarI.g()) {
                ojcVarI.c();
                esg esgVar = (esg) ojcVarI.c();
                ervVar.c.a();
                int i5 = esgVar.d;
                if (i5 == 5) {
                    InterleavedImageU8 interleavedImageU9 = esgVar.a;
                    try {
                        ((erw) eshVar).c.e("updateThumbnail");
                        ervVar.c.a();
                        ((erw) eshVar).c.e("convert");
                        Bitmap bitmapA = ((erw) eshVar).e.a(interleavedImageU9);
                        ((erw) eshVar).c.f();
                        ((erw) eshVar).o(ervVar, bitmapA, ervVar.g == esn.LANDSCAPE);
                        erwVar.c.f();
                        esgVar.close();
                    } catch (Throwable th) {
                        erwVar.c.f();
                        throw th;
                    }
                } else {
                    edu eduVar = erwVar.b;
                    InterleavedImageU8 interleavedImageU10 = esgVar.a;
                    hgk hgkVar = esgVar.c;
                    int i6 = i5 - 1;
                    switch (i6) {
                        case 1:
                            i3 = 0;
                            break;
                        default:
                            i3 = 100;
                            break;
                    }
                    switch (i6) {
                        case 1:
                            edtVar = edt.ORIGINAL;
                            break;
                        default:
                            edtVar = edt.PRIMARY;
                            break;
                    }
                    plk.af(eduVar.a(msq.a(interleavedImageU10), hgkVar, i3, 0, eduVar.g.k(ddl.bf), edtVar, ervVar.c.c.b, ervVar.a, esgVar.b, oih.a), new ert(erwVar, esgVar, ervVar), pgr.INSTANCE);
                }
            } else {
                ((oug) ((oug) erw.a.c().g(ovl.a, "LasagnaProcessor")).G((char) 1473)).r("Lasagna result %s was received, but ignored because it was invalid.", plk.c(i2));
                ervVar.e.arrive();
            }
        }
        this.f.f();
    }

    public final void c() {
        this.h.o(false);
        esk eskVar = this.e;
        if (eskVar != null) {
            ovd ovdVar = ovl.a;
            eskVar.c(this.d);
        }
        gof gofVar = this.k;
        if (gofVar != null) {
            gofVar.f();
        }
    }

    @Override // defpackage.esj
    public final synchronized void d(final boolean z) {
        this.h.o(true);
        if (this.o) {
            ovd ovdVar = ovl.a;
            return;
        }
        final String str = true != z ? "endShot" : "abortShot";
        if (str.length() != 0) {
            "Enqueuing ".concat(str);
        } else {
            new String("Enqueuing ");
        }
        ovd ovdVar2 = ovl.a;
        if (this.b.e(this.d, str.length() != 0 ? "onPslDone: ".concat(str) : new String("onPslDone: "), new Runnable() { // from class: ero
            @Override // java.lang.Runnable
            public final void run() {
                erp erpVar = this.a;
                String str2 = str;
                boolean z2 = z;
                if (erpVar.o) {
                    ((oug) ((oug) erp.a.c().g(ovl.a, "LasagnaProcSession")).G((char) 1441)).r("Shot already done, ignoring %s.", str2);
                    return;
                }
                ovd ovdVar3 = ovl.a;
                try {
                    erpVar.f.e(str2);
                    if (z2) {
                        erpVar.c.a(erpVar.d);
                    } else {
                        erpVar.c.c(erpVar.d);
                    }
                } finally {
                    erpVar.f.f();
                }
            }
        }) != 1) {
            ((oug) ((oug) a.c().g(ovl.a, "LasagnaProcSession")).G((char) 1449)).r("Couldn't post %s", str);
        }
    }

    @Override // defpackage.esj
    public final synchronized void e(final plj pljVar) {
        if (this.o) {
            long jC = pljVar.b.c();
            StringBuilder sb = new StringBuilder(53);
            sb.append("Received frame for inactive shot ");
            sb.append(jC);
            sb.toString();
            ovd ovdVar = ovl.a;
            pljVar.d.run();
            return;
        }
        long jC2 = pljVar.b.c();
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Enqueuing PSL frame ");
        sb2.append(jC2);
        sb2.toString();
        ovd ovdVar2 = ovl.a;
        final long jC3 = pljVar.b.c();
        if (this.b.f(this.d, "onPslFrame", new Runnable() { // from class: ern
            @Override // java.lang.Runnable
            public final void run() {
                erp erpVar = this.a;
                long j = jC3;
                plj pljVar2 = pljVar;
                if (erpVar.o) {
                    StringBuilder sb3 = new StringBuilder(39);
                    sb3.append("Ignoring PSL frame ");
                    sb3.append(j);
                    sb3.toString();
                    ovd ovdVar3 = ovl.a;
                    pljVar2.d.run();
                    return;
                }
                StringBuilder sb4 = new StringBuilder(41);
                sb4.append("Submitting PSL frame ");
                sb4.append(j);
                sb4.toString();
                ovd ovdVar4 = ovl.a;
                erpVar.f.e("processPslFrame");
                erpVar.c.g(erpVar.d, pljVar2);
                erpVar.f.f();
            }
        }, new Runnable() { // from class: erl
            @Override // java.lang.Runnable
            public final void run() {
                long j = jC3;
                plj pljVar2 = pljVar;
                ((oug) ((oug) erp.a.c().g(ovl.a, "LasagnaProcSession")).G(1444)).q("Couldn't submit frame %s.", j);
                pljVar2.d.run();
            }
        }) != 1) {
            ((oug) ((oug) a.c().g(ovl.a, "LasagnaProcSession")).G((char) 1450)).o("Couldn't post PSL frame");
        }
    }

    @Override // com.google.googlex.gcam.lasagna.LasagnaCallbacks
    public final /* synthetic */ void onFinalStatusNative(int i, int i2, String str, byte[] bArr) {
        plk.$default$onFinalStatusNative(this, i, i2, str, bArr);
    }

    @Override // com.google.googlex.gcam.lasagna.LasagnaCallbacks
    public final /* synthetic */ void onImageNative(int i, long j, int i2, String str, long j2) {
        plk.$default$onImageNative(this, i, j, i2, str, j2);
    }

    @Override // com.google.googlex.gcam.lasagna.LasagnaCallbacks
    public final void onProgress(int i, float f) {
        StringBuilder sb = new StringBuilder(36);
        sb.append("Processing progress: ");
        sb.append(f);
        sb.toString();
        ovd ovdVar = ovl.a;
        edd eddVar = this.j;
        if (eddVar != null) {
            eddVar.c.d.a(esl.u, f);
        } else {
            ((oug) ((oug) a.c().g(ovl.a, "LasagnaProcSession")).G((char) 1448)).o("Shot has been aborted.");
        }
    }

    @Override // com.google.googlex.gcam.lasagna.LasagnaCallbacks
    public final void onPslRequest(int i, boolean z, float f, float f2) {
        String.format("onPslRequest / isNeeded = %s, duration = %s, frameRate = %s", Boolean.valueOf(z), Float.valueOf(f), Float.valueOf(f2));
        ovd ovdVar = ovl.a;
        if (!z || this.e == null) {
            this.h.o(true);
            c();
            return;
        }
        try {
            long millis = (long) (TimeUnit.SECONDS.toMillis(1L) * f);
            gof gofVar = this.k;
            if (gofVar != null) {
                gofVar.d().f(millis);
                gof gofVar2 = this.k;
                gofVar2.getClass();
                gofVar2.d().g();
                gof gofVar3 = this.k;
                gofVar3.getClass();
                gofVar3.d().fB(null);
            }
            this.i.Q(millis);
            this.e.d(f, f2, ((Long) this.g.get()).longValue());
            fjx fjxVar = this.p;
            poy poyVar = fjxVar.a;
            if (poyVar.c) {
                poyVar.m();
                poyVar.c = false;
            }
            pdb pdbVar = (pdb) poyVar.b;
            pdb pdbVar2 = pdb.v;
            pdbVar.a |= 16;
            pdbVar.e = f;
            poy poyVar2 = fjxVar.a;
            if (poyVar2.c) {
                poyVar2.m();
                poyVar2.c = false;
            }
            pdb pdbVar3 = (pdb) poyVar2.b;
            pdbVar3.a |= 256;
            pdbVar3.i = f2;
        } catch (InterruptedException | ExecutionException e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            c();
        }
    }
}
