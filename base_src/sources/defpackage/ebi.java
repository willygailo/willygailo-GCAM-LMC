package defpackage;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.hardware.HardwareBuffer;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.util.DisplayMetrics;
import android.util.Range;
import com.Fix.IsoTime;
import com.Fix.Pref;
import com.Helper;
import com.SDE.LensValue;
import com.custom.Astro;
import com.custom.OneShot;
import com.google.googlex.gcam.AeResults;
import com.google.googlex.gcam.AeShotParams;
import com.google.googlex.gcam.AndroidJniUtils;
import com.google.googlex.gcam.AwbInfo;
import com.google.googlex.gcam.BuildPayloadBurstSpecOptions;
import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.ClientShotMetadata;
import com.google.googlex.gcam.DebugParams;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.FrameMetadataKey;
import com.google.googlex.gcam.Gcam;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.GenerateRgbImageOptions;
import com.google.googlex.gcam.GyroSample;
import com.google.googlex.gcam.GyroSampleVector;
import com.google.googlex.gcam.ImageSaverParams;
import com.google.googlex.gcam.InitParams;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.NormalizedRect;
import com.google.googlex.gcam.PhysicalStabilityParams;
import com.google.googlex.gcam.PostviewParams;
import com.google.googlex.gcam.RawWriteView;
import com.google.googlex.gcam.ShotCallbacks;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.ShotParams;
import com.google.googlex.gcam.SpatialGainMap;
import com.google.googlex.gcam.StaticMetadata;
import com.google.googlex.gcam.ThreadPoolConfig;
import com.google.googlex.gcam.Tuning;
import com.google.googlex.gcam.ViewfinderProcessingOptions;
import com.google.googlex.gcam.ViewfinderResults;
import com.google.googlex.gcam.base.function.IntByteArrayConsumer;
import com.google.googlex.gcam.base.function.IntConsumer;
import com.google.googlex.gcam.base.function.IntFloatConsumer;
import com.google.googlex.gcam.base.function.IntLongConsumer;
import com.google.googlex.gcam.base.function.IntStringConsumer;
import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;
import com.google.googlex.gcam.hdrplus.BaseFrameCallback;
import com.google.googlex.gcam.hdrplus.EncodedBlobCallback;
import com.google.googlex.gcam.hdrplus.HdrPlusInterface;
import com.google.googlex.gcam.hdrplus.MutableMergedRawCallback;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes3.dex */
final class ebi implements ebe {
    private String A;
    private final iio B;
    private final dei C;
    private final djs D;
    private final eah E;
    private final dzy F;
    private final eam G;
    private final ebd H;
    private final lco I;
    private final lis J;
    private final ghb K;
    private final eaw L;
    private final Executor M;
    private final hkr N;
    private final hgl O;
    private final lzi P;
    private final egi Q;
    private final nvb R;
    public final ljf d;
    public final ViewfinderProcessingOptions e;
    public final BuildPayloadBurstSpecOptions f;
    private final String h;
    private final String i;
    private final Map j;
    private final Gcam k;
    private final HdrPlusInterface l = new HdrPlusInterface();
    private final ead m;
    private final eca n;
    private final ddf o;
    private final lco p;
    private final ecb q;
    private final DisplayMetrics r;
    private final pkr s;
    private final pko t;
    private final lvp u;
    private final lig v;
    private final qkg w;
    private final lap x;
    private final ghf y;
    private final qkg z;
    private static final ouj g = ouj.h("com/google/android/apps/camera/hdrplus/HdrPlusSessionImpl");
    public static final lig b = lig.h(1920, 1080);
    public static final lig c = lig.h(1920, 1440);

    public ebi(DisplayMetrics displayMetrics, ead eadVar, eca ecaVar, pkr pkrVar, pko pkoVar, lvp lvpVar, gfy gfyVar, gsf gsfVar, final Gcam gcam, ViewfinderProcessingOptions viewfinderProcessingOptions, BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions, qkg qkgVar, final ddf ddfVar, lap lapVar, ghf ghfVar, ecb ecbVar, qkg qkgVar2, iio iioVar, dei deiVar, djs djsVar, eah eahVar, final dzy dzyVar, eam eamVar, dzd dzdVar, ebd ebdVar, lco lcoVar, lis lisVar, ljf ljfVar, ghb ghbVar, nvb nvbVar, eaw eawVar, Executor executor, hkr hkrVar, hgl hglVar, final int i, lzi lziVar, egi egiVar, byte[] bArr, byte[] bArr2) {
        this.r = displayMetrics;
        this.m = eadVar;
        this.n = ecaVar;
        this.s = pkrVar;
        this.t = pkoVar;
        this.u = lvpVar;
        this.k = gcam;
        this.p = gfyVar.b;
        this.o = ddfVar;
        this.x = lapVar;
        this.y = ghfVar;
        this.q = ecbVar;
        this.z = qkgVar2;
        this.B = iioVar;
        this.C = deiVar;
        this.D = djsVar;
        this.E = eahVar;
        this.F = dzyVar;
        this.I = lcoVar;
        this.G = eamVar;
        this.H = ebdVar;
        this.K = ghbVar;
        this.R = nvbVar;
        this.L = eawVar;
        this.M = executor;
        this.N = hkrVar;
        this.O = hglVar;
        this.P = lziVar;
        ViewfinderProcessingOptions viewfinderProcessingOptions2 = new ViewfinderProcessingOptions(GcamModuleJNI.new_ViewfinderProcessingOptions__SWIG_1(viewfinderProcessingOptions.a, viewfinderProcessingOptions));
        this.e = viewfinderProcessingOptions2;
        this.f = new BuildPayloadBurstSpecOptions(buildPayloadBurstSpecOptions);
        this.v = gsfVar.b;
        this.w = qkgVar;
        this.A = null;
        this.d = ljfVar;
        this.J = lisVar.a("HdrPlusSession");
        this.h = GcamModuleJNI.kRequestCameraSecondaryTele_get();
        this.i = GcamModuleJNI.kRequestCameraSecondaryWide_get();
        this.Q = egiVar;
        gcam.d(viewfinderProcessingOptions2);
        oon oonVar = new oon();
        for (int i2 = 0; i2 < GcamModuleJNI.Gcam_GetNumCameras(gcam.a, gcam); i2++) {
            Integer numValueOf = Integer.valueOf(i2);
            Tuning tuningC = gcam.c(i2);
            long jTuning_physical_stability_params_get = GcamModuleJNI.Tuning_physical_stability_params_get(tuningC.a, tuningC);
            oonVar.e(numValueOf, jTuning_physical_stability_params_get == 0 ? null : new PhysicalStabilityParams(jTuning_physical_stability_params_get));
        }
        this.j = oonVar.c();
        ReentrantReadWriteLock.WriteLock writeLock = dzdVar.a.writeLock();
        writeLock.lock();
        try {
            dzdVar.b = ecbVar;
            writeLock.unlock();
            if (!ddfVar.k(ddm.aa) || ecbVar == ecb.LONG_EXPOSURE) {
                return;
            }
            lapVar.c(eamVar.a().a(new lij() { // from class: ebf
                @Override // defpackage.lij
                public final void fB(Object obj) {
                    ebi ebiVar = this.a;
                    int i3 = i;
                    dzy dzyVar2 = dzyVar;
                    Gcam gcam2 = gcam;
                    ddf ddfVar2 = ddfVar;
                    Boolean bool = (Boolean) obj;
                    ViewfinderProcessingOptions viewfinderProcessingOptions3 = ebiVar.e;
                    if (true != bool.booleanValue()) {
                        i3 = 0;
                    }
                    viewfinderProcessingOptions3.b(i3);
                    ebiVar.e.c(bool.booleanValue());
                    ebiVar.e.d(dzyVar2.e());
                    gcam2.d(ebiVar.e);
                    ebiVar.f.b(bool.booleanValue() ? -1.0f : ((Float) ddfVar2.g(ddm.N).e(Float.valueOf(-1.0f))).floatValue());
                }
            }, executor));
        } catch (Throwable th) {
            writeLock.unlock();
            throw th;
        }
    }

    private final int D(int i) {
        if (this.P.l || this.k.f()) {
            Gcam gcam = this.k;
            int iGcam_FindFirstCamera = GcamModuleJNI.Gcam_FindFirstCamera(gcam.a, gcam, i);
            if (iGcam_FindFirstCamera >= 0) {
                return iGcam_FindFirstCamera;
            }
        }
        Integer num = (Integer) this.u.l(CameraCharacteristics.LENS_FACING);
        num.getClass();
        return (num.intValue() - 1) * (-1);
    }

    /* JADX WARN: Code duplicated, block: B:153:0x0516  */
    /* JADX WARN: Code duplicated, block: B:157:0x0540 A[Catch: IOException -> 0x0514, TryCatch #1 {IOException -> 0x0514, blocks: (B:138:0x04d6, B:140:0x04dc, B:142:0x04e2, B:144:0x04ec, B:146:0x04f1, B:148:0x0505, B:150:0x050f, B:158:0x054e, B:149:0x050a, B:145:0x04ef, B:154:0x0518, B:156:0x051e, B:157:0x0540), top: B:216:0x04d6 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x0574 A[Catch: IOException -> 0x0579, TRY_LEAVE, TryCatch #0 {IOException -> 0x0579, blocks: (B:159:0x055a, B:161:0x0574), top: B:214:0x055a }] */
    /* JADX WARN: Code duplicated, block: B:170:0x0593  */
    /* JADX WARN: Code duplicated, block: B:172:0x0598  */
    /* JADX WARN: Code duplicated, block: B:175:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:176:0x05af  */
    /* JADX WARN: Code duplicated, block: B:178:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:179:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:181:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:182:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:185:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:186:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:189:0x061c  */
    /* JADX WARN: Code duplicated, block: B:191:0x0624  */
    /* JADX WARN: Code duplicated, block: B:193:0x0630  */
    /* JADX WARN: Code duplicated, block: B:195:0x0636  */
    /* JADX WARN: Code duplicated, block: B:201:0x0667  */
    /* JADX WARN: Code duplicated, block: B:202:0x0669  */
    /* JADX WARN: Code duplicated, block: B:205:0x0675  */
    /* JADX WARN: Code duplicated, block: B:206:0x0677  */
    /* JADX WARN: Code duplicated, block: B:218:0x0644 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private final edd E(int i, hsp hspVar, gog gogVar, PostviewParams postviewParams, gqt gqtVar, lzv lzvVar, boolean z, int i2, int i3, boolean z2, int i4, boolean z3, ojc ojcVar) {
        DebugParams debugParams;
        int i5;
        long j;
        int iGcam_StartShotCapture;
        final eah eahVar;
        final nle nleVar;
        boolean z4;
        boolean z5;
        String strC;
        hsa hsaVar;
        this.J.b("startShotCapture()");
        edf edfVarG = this.R.g(hspVar);
        float fA = this.s.a(((Integer) ((lce) this.p).d).intValue());
        int iD = brg.d(gogVar.a.a, this.u, this.o);
        hsa hsaVar2 = gogVar.b;
        ojc ojcVarN = hsaVar2 != null ? hsaVar2.n() : oih.a;
        boolean zG = edfVarG.b().g();
        ecb ecbVar = ((Boolean) this.G.a().fA()).booleanValue() ? ecb.LONG_EXPOSURE : null;
        this.d.e("shotParams");
        this.d.e("create");
        ShotParams shotParamsG = G(fA, iD, gqtVar, i, z, zG, z3, ojcVarN, ecbVar, z2, ojcVar.g());
        this.d.g("setWb");
        GcamModuleJNI.ShotParams_wb_mode_set(shotParamsG.a, shotParamsG, this.y.fA() == ghe.AUTO ? 0 : 1);
        this.d.g("setSuffix");
        String strConcat = true != z ? "n" : "z";
        ecb ecbVar2 = ecb.REGULAR;
        gqt gqtVar2 = gqt.AUTO;
        switch (this.q) {
            case REGULAR:
                strConcat = strConcat.concat("d");
                break;
            case PORTRAIT:
                strConcat = strConcat.concat("p");
                break;
            case LONG_EXPOSURE:
                strConcat = strConcat.concat("l");
                break;
            case MOTION_BLUR:
                strConcat = strConcat.concat("m");
                break;
        }
        GcamModuleJNI.ShotParams_software_suffix_set(shotParamsG.a, shotParamsG, strConcat);
        this.d.g("setBfIndex");
        obr.aG(i3 >= -1, "Incorrect base frame override.");
        GcamModuleJNI.ShotParams_base_frame_override_index_set(shotParamsG.a, shotParamsG, i3);
        if (z) {
            obr.aG(true, "Incorrect base frame hint.");
            GcamModuleJNI.ShotParams_zsl_base_frame_index_hint_set(shotParamsG.a, shotParamsG, i2);
        }
        if (ecbVar == null) {
            ecbVar = this.q;
        }
        this.d.g("AwbInfo");
        AwbInfo awbInfoJ = this.s.j(lzvVar);
        GcamModuleJNI.ShotParams_previous_viewfinder_wb_set(shotParamsG.a, shotParamsG, AwbInfo.a(awbInfoJ), awbInfoJ);
        this.d.g("TeT");
        pkr pkrVar = this.s;
        if (lzvVar == null) {
            throw new IllegalArgumentException("source should not be null");
        }
        long jLongValue = ((Long) lzvVar.d(CaptureResult.SENSOR_EXPOSURE_TIME)).longValue();
        float[] fArrS = pkr.s(pkrVar.g(lzvVar), lzvVar);
        float fB = pkr.b(jLongValue) * fArrS[0] * fArrS[1];
        Integer num = (Integer) lzvVar.d(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
        float fIntValue = fB * (num != null ? num.intValue() / 100.0f : 1.0f);
        GcamModuleJNI.ShotParams_previous_viewfinder_tet_set(shotParamsG.a, shotParamsG, fIntValue);
        lis lisVar = this.J;
        StringBuilder sb = new StringBuilder(46);
        sb.append("takePicture - Viewfinder TET = ");
        sb.append(fIntValue);
        lisVar.g(sb.toString());
        this.d.g("wb");
        boolean z6 = (z || GcamModuleJNI.ShotParams_GcamAwbDesired(shotParamsG.a, shotParamsG) || ((Integer) this.o.a(ddm.b).e(0)).intValue() == 2) ? false : true;
        if (ojcVar.g()) {
            shotParamsG.c((AwbInfo) ojcVar.c());
        } else if (z6) {
            shotParamsG.c(awbInfoJ);
        }
        lig ligVar = this.v;
        if (this.q == ecb.PORTRAIT) {
            this.d.g("updateAndGetPhotoSize");
            ligVar = this.v;
            GcamModuleJNI.ShotParams_resampling_method_override_set(shotParamsG.a, shotParamsG, 0);
            shotParamsG.a().j(0);
            shotParamsG.a().i(0);
            if (this.k.b(i).b() == 0) {
                ojc ojcVarG = this.o.g(ddx.g);
                if (ojcVarG.g() && ((Float) ojcVarG.c()).equals(Float.valueOf(1.5172f))) {
                    shotParamsG.a().g(hgh.b);
                    if (lhs.b.k(lhs.h(this.v))) {
                        ligVar = hgh.c;
                    }
                } else {
                    shotParamsG.a().g(hgh.a);
                }
            }
        }
        this.d.g("updateAe");
        this.s.w(shotParamsG.a(), lzvVar, this.m.h, ligVar);
        if (z2 && (this.q == ecb.PORTRAIT || (this.q == ecb.REGULAR && this.o.k(ddm.ap)))) {
            this.d.g("disableCrop");
            shotParamsG.a().e(new NormalizedRect());
        }
        RectF rectF = (RectF) gogVar.a.j.f();
        if (rectF != null) {
            this.d.g("overrideMergedCrop");
            AeShotParams aeShotParamsA = shotParamsG.a();
            NormalizedRect normalizedRect = new NormalizedRect();
            normalizedRect.c(rectF.left);
            normalizedRect.e(rectF.top);
            normalizedRect.d(rectF.right);
            normalizedRect.f(rectF.bottom);
            aeShotParamsA.e(normalizedRect);
            aeShotParamsA.g(normalizedRect);
        }
        if (this.q == ecb.PORTRAIT) {
            this.d.g("expandMergedCrop");
            AeShotParams aeShotParamsA2 = shotParamsG.a();
            NormalizedRect normalizedRectB = aeShotParamsA2.b();
            if (!GcamModuleJNI.NormalizedRect_IsEmpty(normalizedRectB.a, normalizedRectB)) {
                NormalizedRect normalizedRectB2 = aeShotParamsA2.b();
                NormalizedRect normalizedRectA = aeShotParamsA2.a();
                aeShotParamsA2.g(new NormalizedRect(GcamModuleJNI.Union(NormalizedRect.a(normalizedRectB2), normalizedRectB2, NormalizedRect.a(normalizedRectA), normalizedRectA), true));
            }
        }
        this.d.f();
        this.d.g("createShot");
        final int i6 = 1;
        final edd eddVar = new edd(edfVarG, this.r, gogVar, this.n.a.a(), this.B, this.C, this.D, shotParamsG, ecbVar, lzvVar);
        this.d.g("createShotCallbacks");
        ShotCallbacks shotCallbacks = new ShotCallbacks();
        if (eddVar.m.i().g()) {
            eddVar.f.setProgressCallback(shotCallbacks.a, new IntFloatConsumer() { // from class: ecv
                @Override // com.google.googlex.gcam.base.function.IntFloatConsumer
                public final void accept(int i7, float f) {
                    edd eddVar2 = eddVar;
                    obr.aQ(eddVar2.m.i().g());
                    ((ebv) eddVar2.m.i().c()).a(f);
                }
            });
        }
        pkz pkzVar = eddVar.g;
        final edc edcVar = eddVar.r;
        HdrPlusInterface hdrPlusInterface = pkzVar.a;
        long j2 = shotCallbacks.a;
        edcVar.getClass();
        IntByteArrayConsumer intByteArrayConsumer = new IntByteArrayConsumer() { // from class: pkt
            @Override // com.google.googlex.gcam.base.function.IntByteArrayConsumer
            public final void accept(int i7, byte[] bArr) {
                pli pliVar;
                edc edcVar2 = edcVar;
                obr.aQ(edcVar2.f.q == 1);
                edcVar2.f.q = 2;
                try {
                    pliVar = (pli) ppd.s(pli.B, bArr, pos.b());
                } catch (ppp e) {
                    ((oug) ((oug) ((oug) edd.a.c()).h(e)).G((char) 1057)).o("Error deserializing shot log data");
                    pliVar = pli.B;
                }
                int iE = plk.e(pliVar.n);
                int i8 = iE != 0 ? iE : 2;
                dzx dzxVar = new dzx(pliVar, edcVar2.a);
                edf edfVar = edcVar2.b;
                if ((edfVar.n().g() || edfVar.k().g() || edfVar.l().g() || edfVar.c().g()) && edcVar2.a == 1 && i8 != 3) {
                    ((oug) ((oug) edd.a.b()).G((char) 1055)).o("Hexagon failed");
                }
                for (int i9 = 0; i9 < pliVar.d.size(); i9++) {
                    if (pliVar.d.d(i9) == 1.0f) {
                        ((oug) ((oug) edd.a.b()).G((char) 1056)).o("Black frame detected");
                        if (edcVar2.c == dei.RELEASE) {
                            break;
                        }
                        edcVar2.d.a("Black frame detected! Please immediately take and file a bug report.");
                        break;
                    }
                }
                iin iinVarB = edcVar2.e.b();
                if (edcVar2.b.m().g()) {
                    ((eby) edcVar2.b.m().c()).b(iinVarB, dzxVar);
                }
            }
        };
        edcVar.getClass();
        IntStringConsumer intStringConsumer = new IntStringConsumer() { // from class: pkv
            @Override // com.google.googlex.gcam.base.function.IntStringConsumer
            public final void accept(int i7, String str) {
                edc edcVar2 = edcVar;
                ((oug) ((oug) edd.a.b()).G(1058)).t("HDR+ pipeline reported error for shotId %d: %s", i7, str);
                obr.aQ(edcVar2.f.q == 1);
                edcVar2.f.q = 3;
                if (edcVar2.b.m().g()) {
                    ((eby) edcVar2.b.m().c()).c(edcVar2.f, new ebr(str));
                }
            }
        };
        edcVar.getClass();
        hdrPlusInterface.setShotStatusCallbacks(j2, intByteArrayConsumer, intStringConsumer, new IntConsumer() { // from class: pku
            @Override // com.google.googlex.gcam.base.function.IntConsumer
            public final void accept(int i7) {
                edc edcVar2 = edcVar;
                obr.aQ(edcVar2.f.q == 1);
                edcVar2.f.q = 4;
                if (edcVar2.b.m().g()) {
                    ((eby) edcVar2.b.m().c()).s(edcVar2.f);
                }
            }
        });
        if (eddVar.m.a().g()) {
            eddVar.f.setBaseFrameCallback(shotCallbacks.a, new BaseFrameCallback() { // from class: ecx
                @Override // com.google.googlex.gcam.hdrplus.BaseFrameCallback
                public final void onBaseFrameSelected(int i7, int i8, long j3) {
                    edd eddVar2 = eddVar;
                    obr.aQ(eddVar2.q == 1);
                    obr.aL(i8 < eddVar2.e.size(), "Base frame index %s >= payload timestamps size %s", i8, eddVar2.e.size());
                    obr.aL(i8 < eddVar2.d.size(), "Base frame index %s >= payload metadata size %s", i8, eddVar2.d.size());
                    obr.aR(((Long) eddVar2.e.get(i8)).longValue() == j3, "Base frame timestamps don't match");
                    ((ebn) eddVar2.m.a().c()).a(eddVar2, i8, j3, (lzv) eddVar2.d.get(i8));
                }
            });
        }
        InterleavedU8ClientAllocator interleavedU8ClientAllocator = eddVar.h;
        if (interleavedU8ClientAllocator != null || eddVar.i != null) {
            if (interleavedU8ClientAllocator != null) {
                eddVar.f.setPostviewRgbAllocator(shotCallbacks.a, interleavedU8ClientAllocator);
            } else {
                pjr pjrVar = eddVar.i;
                if (pjrVar != null) {
                    eddVar.f.setPostviewYuvAllocator(shotCallbacks.a, pjrVar);
                }
            }
            eddVar.g.a.setPostviewCallback(shotCallbacks.a, pkz.a(new pky() { // from class: ecz
                @Override // defpackage.pky
                public final void a(int i7, long j3, ShotMetadata shotMetadata, int i8) {
                    boolean z7;
                    boolean z8 = false;
                    switch (i6) {
                        case 0:
                            edd eddVar2 = eddVar;
                            obr.aQ(eddVar2.q == 1);
                            if (i8 == 3) {
                                z7 = true;
                            } else if (i8 == 5) {
                                z7 = true;
                                i8 = 5;
                            } else {
                                z7 = false;
                            }
                            boolean z9 = i8 == 1 || i8 == 2;
                            boolean z10 = z7 || z9;
                            obr.aG(z10, "Final image callback only supports GcamPixelFormat.{kRgb, kRgba, kNv12, or kNv21}");
                            if (z7) {
                                if (eddVar2.m.k().g() || eddVar2.m.l().g()) {
                                    z8 = true;
                                }
                                obr.aR(z8, "Got RGB image with no downstream callback present.");
                            }
                            if (z9) {
                                obr.aR(eddVar2.m.n().g(), "Got YUV image with no downstream callback present.");
                            }
                            if (!z7) {
                                if (z9) {
                                    ((ebz) eddVar2.m.n().c()).a(eddVar2.k.a(), shotMetadata);
                                }
                            } else if (eddVar2.m.k().g()) {
                                pjp pjpVar = (pjp) eddVar2.j;
                                ebx ebxVar = (ebx) eddVar2.m.k().c();
                                obr.aR(pjpVar.b, "doneWriting() must be called before getImage.");
                                ebxVar.a(pjpVar.a, shotMetadata);
                            } else if (eddVar2.m.l().g()) {
                                ((ebq) eddVar2.m.l().c()).a(((pjn) eddVar2.j).a(), shotMetadata);
                            }
                            break;
                        default:
                            edd eddVar3 = eddVar;
                            obr.aQ(eddVar3.q == 1);
                            obr.aF(i7 != GcamModuleJNI.kInvalidShotId_get());
                            obr.aF(j3 != GcamModuleJNI.kInvalidAllocationId_get());
                            if (eddVar3.m.g().g()) {
                                pjm pjmVar = (pjm) eddVar3.h;
                                if (pjmVar.a != null && pjmVar.b == null) {
                                    z8 = true;
                                }
                                obr.aR(z8, "doneWriting() must be called before getImage.");
                                ((ebo) eddVar3.m.g().c()).r(eddVar3, pjmVar.a, shotMetadata);
                            } else if (eddVar3.m.f().g()) {
                                ((ebq) eddVar3.m.f().c()).a(((pjn) eddVar3.h).a(), shotMetadata);
                            } else if (eddVar3.m.h().g()) {
                                ((ebz) eddVar3.m.h().c()).a(eddVar3.i.a(), shotMetadata);
                            }
                            break;
                    }
                }
            }));
        }
        InterleavedU8ClientAllocator interleavedU8ClientAllocator2 = eddVar.j;
        if (interleavedU8ClientAllocator2 != null || eddVar.k != null) {
            if (interleavedU8ClientAllocator2 != null) {
                eddVar.f.setFinalImageRgbAllocator(shotCallbacks.a, interleavedU8ClientAllocator2);
            }
            pjr pjrVar2 = eddVar.k;
            if (pjrVar2 != null) {
                eddVar.f.setFinalImageYuvAllocator(shotCallbacks.a, pjrVar2);
            }
            final int i7 = 0;
            eddVar.g.a.setFinalImageCallback(shotCallbacks.a, pkz.a(new pky() { // from class: ecz
                @Override // defpackage.pky
                public final void a(int i8, long j3, ShotMetadata shotMetadata, int i9) {
                    boolean z7;
                    boolean z8 = false;
                    switch (i7) {
                        case 0:
                            edd eddVar2 = eddVar;
                            obr.aQ(eddVar2.q == 1);
                            if (i9 == 3) {
                                z7 = true;
                            } else if (i9 == 5) {
                                z7 = true;
                                i9 = 5;
                            } else {
                                z7 = false;
                            }
                            boolean z9 = i9 == 1 || i9 == 2;
                            boolean z10 = z7 || z9;
                            obr.aG(z10, "Final image callback only supports GcamPixelFormat.{kRgb, kRgba, kNv12, or kNv21}");
                            if (z7) {
                                if (eddVar2.m.k().g() || eddVar2.m.l().g()) {
                                    z8 = true;
                                }
                                obr.aR(z8, "Got RGB image with no downstream callback present.");
                            }
                            if (z9) {
                                obr.aR(eddVar2.m.n().g(), "Got YUV image with no downstream callback present.");
                            }
                            if (!z7) {
                                if (z9) {
                                    ((ebz) eddVar2.m.n().c()).a(eddVar2.k.a(), shotMetadata);
                                }
                            } else if (eddVar2.m.k().g()) {
                                pjp pjpVar = (pjp) eddVar2.j;
                                ebx ebxVar = (ebx) eddVar2.m.k().c();
                                obr.aR(pjpVar.b, "doneWriting() must be called before getImage.");
                                ebxVar.a(pjpVar.a, shotMetadata);
                            } else if (eddVar2.m.l().g()) {
                                ((ebq) eddVar2.m.l().c()).a(((pjn) eddVar2.j).a(), shotMetadata);
                            }
                            break;
                        default:
                            edd eddVar3 = eddVar;
                            obr.aQ(eddVar3.q == 1);
                            obr.aF(i8 != GcamModuleJNI.kInvalidShotId_get());
                            obr.aF(j3 != GcamModuleJNI.kInvalidAllocationId_get());
                            if (eddVar3.m.g().g()) {
                                pjm pjmVar = (pjm) eddVar3.h;
                                if (pjmVar.a != null && pjmVar.b == null) {
                                    z8 = true;
                                }
                                obr.aR(z8, "doneWriting() must be called before getImage.");
                                ((ebo) eddVar3.m.g().c()).r(eddVar3, pjmVar.a, shotMetadata);
                            } else if (eddVar3.m.f().g()) {
                                ((ebq) eddVar3.m.f().c()).a(((pjn) eddVar3.h).a(), shotMetadata);
                            } else if (eddVar3.m.h().g()) {
                                ((ebz) eddVar3.m.h().c()).a(eddVar3.i.a(), shotMetadata);
                            }
                            break;
                    }
                }
            }));
        }
        if (eddVar.m.b().g()) {
            eddVar.f.setMergedDngCallback(shotCallbacks.a, HdrPlusInterface.a(new EncodedBlobCallback() { // from class: ecy
                @Override // com.google.googlex.gcam.hdrplus.EncodedBlobCallback
                public final void onDataAvailable(int i8, ByteBuffer byteBuffer, int i9, int i10) {
                    switch (i6) {
                        case 0:
                            edd eddVar2 = eddVar;
                            byteBuffer.capacity();
                            obr.aQ(eddVar2.q == 1);
                            ((ebs) eddVar2.m.c().c()).a(new ece(byteBuffer, i9, i10));
                            break;
                        default:
                            edd eddVar3 = eddVar;
                            byteBuffer.capacity();
                            obr.aQ(eddVar3.q == 1);
                            ((ebp) eddVar3.m.b().c()).a(new dzf(byteBuffer));
                            break;
                    }
                }
            }, true));
        }
        if (eddVar.m.j().g()) {
            final pjq pjqVar = new pjq();
            eddVar.f.setMergedRawImageAllocator(shotCallbacks.a, pjqVar);
            eddVar.g.a.setMergedRawImageCallback(shotCallbacks.a, pkz.a(new pky() { // from class: eda
                @Override // defpackage.pky
                public final void a(int i8, long j3, ShotMetadata shotMetadata, int i9) {
                    edd eddVar2 = eddVar;
                    pjq pjqVar2 = pjqVar;
                    obr.aQ(eddVar2.q == 1);
                    obr.aR(eddVar2.m.j().g(), "Got merged RAW callback but no callback present");
                    if (j3 == GcamModuleJNI.kInvalidAllocationId_get()) {
                        ((ebw) eddVar2.m.j().c()).b(new ebr(mip.bp("MergeRaw failed (shotId = %d)", Integer.valueOf(i8))));
                    } else {
                        obr.aR(pjqVar2.b, "doneWriting() must be called before getImage.");
                        ((ebw) eddVar2.m.j().c()).a(eddVar2, pjqVar2.a, shotMetadata);
                    }
                }
            }));
        }
        if (eddVar.m.d().g()) {
            pkz pkzVar2 = eddVar.g;
            final edb edbVar = new edb(eddVar);
            pkzVar2.a.setMutableMergedRawCallback(shotCallbacks.a, new MutableMergedRawCallback() { // from class: pkx
                @Override // com.google.googlex.gcam.hdrplus.MutableMergedRawCallback
                public final void onImageView(int i8, long j3, long j4) {
                    edb edbVar2 = edbVar;
                    ShotMetadata shotMetadata = new ShotMetadata(j4);
                    edd eddVar2 = edbVar2.a;
                    obr.aQ(eddVar2.q == 1);
                    obr.aR(eddVar2.m.d().g(), "Got mutable merged RAW callback but no callback present");
                    ((ebt) eddVar2.m.d().c()).j(eddVar2, j3, shotMetadata);
                }
            });
        }
        if (eddVar.m.e().g()) {
            eddVar.f.setMergedPdAllocator(shotCallbacks.a, eddVar.l);
            eddVar.f.setMergedPdCallback(shotCallbacks.a, new IntLongConsumer() { // from class: ecw
                @Override // com.google.googlex.gcam.base.function.IntLongConsumer
                public final void accept(int i8, long j3) {
                    edd eddVar2 = eddVar;
                    obr.aQ(eddVar2.q == 1);
                    obr.aR(eddVar2.m.e().g(), "Got PD with no callback present");
                    if (j3 == GcamModuleJNI.kInvalidAllocationId_get()) {
                        ((oug) ((oug) edd.a.c()).G(1068)).p("MergePD failed (shotId = %d)", i8);
                        ((ebu) eddVar2.m.e().c()).b(new ebr(mip.bp("MergePD failed (shotId = %d)", Integer.valueOf(i8))));
                    } else {
                        pjo pjoVar = eddVar2.l;
                        obr.aR(pjoVar.b, "doneWriting() must be called before getImage.");
                        ((ebu) eddVar2.m.e().c()).a(pjoVar.a);
                    }
                }
            });
        }
        if (eddVar.m.c().g()) {
            final int i8 = 0;
            eddVar.f.setJpegCallback(shotCallbacks.a, HdrPlusInterface.a(new EncodedBlobCallback() { // from class: ecy
                @Override // com.google.googlex.gcam.hdrplus.EncodedBlobCallback
                public final void onDataAvailable(int i9, ByteBuffer byteBuffer, int i10, int i11) {
                    switch (i8) {
                        case 0:
                            edd eddVar2 = eddVar;
                            byteBuffer.capacity();
                            obr.aQ(eddVar2.q == 1);
                            ((ebs) eddVar2.m.c().c()).a(new ece(byteBuffer, i10, i11));
                            break;
                        default:
                            edd eddVar3 = eddVar;
                            byteBuffer.capacity();
                            obr.aQ(eddVar3.q == 1);
                            ((ebp) eddVar3.m.b().c()).a(new dzf(byteBuffer));
                            break;
                    }
                }
            }, false));
        }
        if (this.F.e()) {
            this.d.g("slowRawSetup");
            ojc ojcVarB = ((fsr) this.w).b();
            if (ojcVarB.g()) {
                ImageSaverParams imageSaverParams = new ImageSaverParams(GcamModuleJNI.new_ImageSaverParams(), true);
                hsa hsaVar3 = gogVar.b;
                long jD = hsaVar3 != null ? hsaVar3.d() : System.currentTimeMillis();
                if (((File) ojcVarB.c()).getFreeSpace() <= 1073741824) {
                    this.D.a("Cache has less than 1GB free. Slowraw data may be silently deleted.");
                }
                if (z2) {
                    try {
                        if (this.q == ecb.PORTRAIT || this.q == ecb.REGULAR) {
                            String str = this.o.k(ddl.T) ? this.i : this.h;
                            dzy dzyVar = this.F;
                            File file = (File) ojcVarB.c();
                            String strValueOf = String.valueOf(str);
                            strC = dzyVar.c(file, jD, strValueOf.length() != 0 ? "camera_".concat(strValueOf) : new String("camera_"));
                        } else if (z2 || this.q != ecb.LONG_EXPOSURE) {
                            strC = this.F.c((File) ojcVarB.c(), jD, "");
                        } else {
                            dzy dzyVar2 = this.F;
                            File file2 = (File) ojcVarB.c();
                            StringBuilder sb2 = new StringBuilder(25);
                            sb2.append("camera_kepler_");
                            sb2.append(i4);
                            strC = dzyVar2.c(file2, jD, sb2.toString());
                        }
                        this.A = strC;
                        GcamModuleJNI.ImageSaverParams_dest_folder_set(imageSaverParams.a, imageSaverParams, strC);
                        debugParams = new DebugParams();
                        try {
                            GcamModuleJNI.DebugParams_save_bitmask_set(debugParams.a, debugParams, dzy.a);
                            GcamModuleJNI.DebugParams_image_saver_params_set(debugParams.a, debugParams, imageSaverParams.a, imageSaverParams);
                            hsaVar = gogVar.b;
                            if (hsaVar != null) {
                                hsaVar.M(debugParams);
                            }
                        } catch (IOException e) {
                            e = e;
                            ((oug) ((oug) ((oug) g.b()).h(e)).G((char) 1045)).o("Failed to create Gcam debug data folder!");
                            String localizedMessage = e.getLocalizedMessage();
                            this.D.a(localizedMessage != null ? localizedMessage : "Failed to create Gcam debug data folder!");
                        }
                    } catch (IOException e2) {
                        e = e2;
                        debugParams = null;
                        ((oug) ((oug) ((oug) g.b()).h(e)).G((char) 1045)).o("Failed to create Gcam debug data folder!");
                        String localizedMessage2 = e.getLocalizedMessage();
                        this.D.a(localizedMessage2 != null ? localizedMessage2 : "Failed to create Gcam debug data folder!");
                        this.d.g("getPrimaryOutputFormat");
                        if (edfVarG.k().g()) {
                            i5 = 3;
                        } else if (edfVarG.l().g()) {
                            i5 = 5;
                        } else if (edfVarG.n().g()) {
                            i5 = 1;
                        } else {
                            edfVarG.c().g();
                            i5 = 0;
                        }
                        this.d.g("Gcam::StartShotCapture");
                        Gcam gcam = this.k;
                        long j3 = gcam.a;
                        long j4 = shotParamsG.a;
                        long j5 = shotCallbacks.a;
                        long j6 = postviewParams.a;
                        if (debugParams == null) {
                            j = 0;
                        } else {
                            j = debugParams.a;
                        }
                        iGcam_StartShotCapture = GcamModuleJNI.Gcam_StartShotCapture(j3, gcam, i, j4, shotParamsG, j5, shotCallbacks, i5, j6, postviewParams, j, debugParams);
                        this.d.f();
                        if (iGcam_StartShotCapture == GcamModuleJNI.kInvalidShotId_get()) {
                            if (this.C == dei.RELEASE) {
                                throw new IllegalArgumentException("Gcam::StartShotCapture() returned an invalid shot id.");
                            }
                            ((oug) ((oug) g.b()).G((char) 1044)).o("Gcam::StartShotCapture() returned an invalid shot id.");
                            return null;
                        }
                        lap lapVar = gogVar.a.f;
                        eahVar = this.E;
                        nleVar = new nle(iGcam_StartShotCapture);
                        synchronized (eahVar.a) {
                            eahVar.b.add(nleVar);
                            final byte[] bArr = null;
                            final byte[] bArr2 = null;
                            final byte[] bArr3 = null;
                            lapVar.c(new lie(nleVar, bArr, bArr2, bArr3) { // from class: eaf
                                public final /* synthetic */ nle b;

                                @Override // defpackage.lie, java.lang.AutoCloseable
                                public final void close() {
                                    eah eahVar2 = this.a;
                                    nle nleVar2 = this.b;
                                    synchronized (eahVar2.a) {
                                        eahVar2.b.remove(nleVar2);
                                    }
                                }
                            });
                            if (iGcam_StartShotCapture != GcamModuleJNI.kInvalidShotId_get()) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            obr.aF(z4);
                            if (eddVar.b == GcamModuleJNI.kInvalidShotId_get()) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            obr.aQ(z5);
                            eddVar.b = iGcam_StartShotCapture;
                            return eddVar;
                        }
                    }
                } else {
                    if (z2) {
                        strC = this.F.c((File) ojcVarB.c(), jD, "");
                    } else {
                        strC = this.F.c((File) ojcVarB.c(), jD, "");
                    }
                    this.A = strC;
                    GcamModuleJNI.ImageSaverParams_dest_folder_set(imageSaverParams.a, imageSaverParams, strC);
                    debugParams = new DebugParams();
                    GcamModuleJNI.DebugParams_save_bitmask_set(debugParams.a, debugParams, dzy.a);
                    GcamModuleJNI.DebugParams_image_saver_params_set(debugParams.a, debugParams, imageSaverParams.a, imageSaverParams);
                    hsaVar = gogVar.b;
                    if (hsaVar != null) {
                        hsaVar.M(debugParams);
                    }
                }
            } else {
                debugParams = null;
            }
        } else {
            debugParams = null;
        }
        this.d.g("getPrimaryOutputFormat");
        if (edfVarG.k().g()) {
            i5 = 3;
        } else if (edfVarG.l().g()) {
            i5 = 5;
        } else if (edfVarG.n().g()) {
            i5 = 1;
        } else {
            edfVarG.c().g();
            i5 = 0;
        }
        this.d.g("Gcam::StartShotCapture");
        Gcam gcam2 = this.k;
        long j7 = gcam2.a;
        long j8 = shotParamsG.a;
        long j9 = shotCallbacks.a;
        long j10 = postviewParams.a;
        if (debugParams == null) {
            j = 0;
        } else {
            j = debugParams.a;
        }
        iGcam_StartShotCapture = GcamModuleJNI.Gcam_StartShotCapture(j7, gcam2, i, j8, shotParamsG, j9, shotCallbacks, i5, j10, postviewParams, j, debugParams);
        this.d.f();
        if (iGcam_StartShotCapture == GcamModuleJNI.kInvalidShotId_get()) {
            if (this.C == dei.RELEASE) {
                throw new IllegalArgumentException("Gcam::StartShotCapture() returned an invalid shot id.");
            }
            ((oug) ((oug) g.b()).G((char) 1044)).o("Gcam::StartShotCapture() returned an invalid shot id.");
            return null;
        }
        lap lapVar2 = gogVar.a.f;
        eahVar = this.E;
        nleVar = new nle(iGcam_StartShotCapture);
        synchronized (eahVar.a) {
            eahVar.b.add(nleVar);
        }
        final byte[] bArr4 = null;
        final byte[] bArr5 = null;
        final byte[] bArr6 = null;
        lapVar2.c(new lie(nleVar, bArr4, bArr5, bArr6) { // from class: eaf
            public final /* synthetic */ nle b;

            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                eah eahVar2 = this.a;
                nle nleVar2 = this.b;
                synchronized (eahVar2.a) {
                    eahVar2.b.remove(nleVar2);
                }
            }
        });
        if (iGcam_StartShotCapture != GcamModuleJNI.kInvalidShotId_get()) {
            z4 = true;
        } else {
            z4 = false;
        }
        obr.aF(z4);
        if (eddVar.b == GcamModuleJNI.kInvalidShotId_get()) {
            z5 = true;
        } else {
            z5 = false;
        }
        obr.aQ(z5);
        eddVar.b = iGcam_StartShotCapture;
        return eddVar;
    }

    private final AeShotParams F(float f, ecb ecbVar) {
        if (ecbVar == null) {
            ecbVar = this.q;
        }
        AeShotParams aeShotParams = new AeShotParams();
        aeShotParams.f(f);
        aeShotParams.j(this.v.a);
        aeShotParams.i(this.v.b);
        if (ecbVar == ecb.PORTRAIT) {
            aeShotParams.k(3);
        } else if (ecbVar == ecb.LONG_EXPOSURE) {
            aeShotParams.k(4);
        } else if (ecbVar == ecb.MOTION_BLUR) {
            aeShotParams.k(6);
        } else {
            if (ecbVar != ecb.REGULAR) {
                throw new IllegalStateException(String.format("Unknown HdrPlusType: %s.", ecbVar));
            }
            aeShotParams.k(1);
        }
        GcamModuleJNI.AeShotParams_spoofed_touch_rectangle_set(aeShotParams.a, aeShotParams, this.K.c());
        return aeShotParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v49, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v34, types: [boolean, int] */
    private final ShotParams G(float f, int i, gqt gqtVar, int i2, boolean z, boolean z2, boolean z3, ojc ojcVar, ecb ecbVar, boolean z4, boolean z5) {
        int i3;
        boolean z6;
        boolean zK;
        ecb ecbVar2 = ecbVar == null ? this.q : ecbVar;
        this.d.e("new");
        ShotParams shotParams = new ShotParams();
        this.d.g("setup");
        GcamModuleJNI.ShotParams_zsl_set(shotParams.a, shotParams, z);
        GcamModuleJNI.ShotParams_save_merged_dng_set(shotParams.a, shotParams, z2);
        GcamModuleJNI.ShotParams_compress_merged_dng_set(shotParams.a, shotParams, true);
        GcamModuleJNI.ShotParams_allow_base_frame_reuse_set(shotParams.a, shotParams, z3);
        shotParams.d(GcamModuleJNI.DegreesToImageRotation(i));
        shotParams.e(this.o.k(ddl.bf));
        if (((Integer) this.u.m(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE, 0)).intValue() == 1 && ojcVar.g() && ((ijp) ojcVar.c()).c() > 0 && ((ijp) ojcVar.c()).d() > 0) {
            GcamModuleJNI.ShotParams_shutter_press_down_timestamp_ns_set(shotParams.a, shotParams, ((ijp) ojcVar.c()).c());
            GcamModuleJNI.ShotParams_shutter_press_up_timestamp_ns_set(shotParams.a, shotParams, ((ijp) ojcVar.c()).d());
        }
        this.d.g("createAeShotParams");
        AeShotParams aeShotParamsF = F(f, ecbVar2);
        GcamModuleJNI.ShotParams_ae_set(shotParams.a, shotParams, aeShotParamsF.a, aeShotParamsF);
        this.d.g("portraitRelighting");
        shotParams.a().h(this.O.e(this.q == ecb.PORTRAIT));
        this.d.g("profile");
        ddf ddfVar = this.o;
        ddi ddiVar = ddm.a;
        ddfVar.c();
        this.o.b();
        if (!this.m.a.k(ddl.ax)) {
            GcamModuleJNI.ShotParams_icc_output_profile_override_set(shotParams.a, shotParams, 1);
        }
        this.d.g("flash");
        gqt gqtVar2 = gqt.AUTO;
        switch (gqtVar) {
            case AUTO:
                i3 = 0;
                break;
            case OFF:
            default:
                i3 = 2;
                break;
            case ON:
                i3 = 1;
                break;
        }
        GcamModuleJNI.ShotParams_flash_mode_set(shotParams.a, shotParams, i3);
        GcamModuleJNI.ShotParams_icc_output_profile_override_set(shotParams.a, shotParams, Pref.MenuValue("pref_p3_key") != 0 ? 2 : 1);
        this.d.g("tempBinning");
        GcamModuleJNI.ShotParams_allow_temporal_binning_set(shotParams.a, shotParams, ead.c(this.o) && ecbVar2 != ecb.LONG_EXPOSURE);
        this.d.g("wbSource");
        int i4 = new int[]{1, 2, 3}[((Integer) this.o.a(ddm.b).e(0)).intValue()];
        int i5 = i4 - 1;
        if (i4 == 0) {
            throw null;
        }
        switch (i5) {
            case 0:
                if (ecbVar2 != ecb.LONG_EXPOSURE || !z5) {
                }
                break;
        }
        shotParams.f(Pref.MenuValue("pref_awbrec_key"));
        this.d.g("sabre");
        this.o.b();
        boolean zK2 = this.o.k(ddm.P);
        this.o.b();
        boolean z7 = ((Float) this.I.fA()).floatValue() >= 1.2f && !zK2;
        if (ecbVar2 != ecb.LONG_EXPOSURE) {
            z6 = false;
        } else if (this.o.k(ddm.S)) {
            z6 = true;
        } else {
            this.G.q();
            z6 = false;
        }
        StaticMetadata staticMetadataB = this.k.b(i2);
        Range range = (Range) this.u.l(CameraCharacteristics.SENSOR_INFO_EXPOSURE_TIME_RANGE);
        float fLongValue = ((Long) range.getUpper()).longValue();
        float[] fArr = new float[2];
        fArr[0] = ((Long) range.getLower()).longValue();
        if (Helper.sFront == 0 && Helper.sModeNS != 0) {
            if (OneShot.OneShotState != 0) {
                fLongValue = IsoTime.OneShotTime();
            } else if (Astro.AstroState != 0) {
                fLongValue = IsoTime.AstroTime();
            }
        }
        fArr[1] = fLongValue;
        GcamModuleJNI.StaticMetadata_exposure_time_range_ms_set(staticMetadataB.a, staticMetadataB, fArr);
        int i6 = (ead.d(this.o) && this.q != ecb.PORTRAIT && (z7 || z6 || (staticMetadataB.b() == 4 && this.o.k(ddm.R)))) ? 1 : 0;
        this.o.b();
        this.o.k(ddm.Q);
        ?? merge = Helper.getMerge();
        GcamModuleJNI.ShotParams_merge_method_override_set(shotParams.a, shotParams, merge);
        GcamModuleJNI.ShotParams_allow_sabre_set(shotParams.a, shotParams, Helper.setSabre(i6));
        GcamModuleJNI.ShotParams_allow_spatial_rgb_set(shotParams.a, shotParams, zK2);
        this.d.g("shasta");
        switch (ecbVar2) {
            case REGULAR:
                zK = this.o.k(ddm.L);
                break;
            case PORTRAIT:
                zK = this.o.k(ddx.C);
                break;
            case LONG_EXPOSURE:
                zK = this.o.k(ddm.K);
                break;
            default:
                zK = false;
                break;
        }
        shotParams.g(zK);
        ojc ojcVarG = this.o.g(ddm.M);
        if (ojcVarG.g()) {
            GcamModuleJNI.ShotParams_shasta_factor_set(shotParams.a, shotParams, ((Float) ojcVarG.c()).floatValue());
        }
        this.o.d();
        GcamModuleJNI.ShotParams_shasta_force_set(shotParams.a, shotParams, merge);
        if (ecbVar2 == ecb.LONG_EXPOSURE) {
            this.d.g("nightSight");
            GcamModuleJNI.ShotParams_motion_ef_enabled_set(shotParams.a, shotParams, true);
            PhysicalStabilityParams physicalStabilityParamsM = m(i2);
            shotParams.h(GcamModuleJNI.PhysicalStabilityParams_max_handheld_shot_capture_time_ms_get(physicalStabilityParamsM.a, physicalStabilityParamsM));
            boolean z8 = this.m.g;
            this.G.m();
            Integer num = (Integer) this.u.l(CameraCharacteristics.LENS_FACING);
            num.getClass();
            if (num.intValue() == 1 && Helper.sModeNS != 0 && (OneShot.OneShotState != 0 || Astro.AstroState != 0)) {
                GcamModuleJNI.ShotParams_device_is_on_tripod_set(shotParams.a, shotParams, true);
                if (z4) {
                    GcamModuleJNI.ShotParams_downsample_by_2_before_merge_set(shotParams.a, shotParams, true);
                    lig ligVar = lhs.b.k(lhs.h(this.v)) ? b : c;
                    shotParams.a().j(ligVar.a);
                    shotParams.a().i(ligVar.b);
                }
                shotParams.g(merge);
                Iterator it = this.H.b.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        shotParams.h(Float.POSITIVE_INFINITY);
                    } else if (((Long) it.next()).longValue() >= ebd.a) {
                        shotParams.h(15000.0f);
                        GcamModuleJNI.ShotParams_tripod_max_exposure_time_ms_set(shotParams.a, shotParams, 1000.0f);
                    }
                }
            }
            ead eadVar = this.m;
            if (eadVar.a.a(ddm.c).g() && ((Integer) eadVar.a.a(ddm.c).c()).intValue() > 0) {
                this.d.g("psaf");
                GcamModuleJNI.ShotParams_psaf_frame_count_set(shotParams.a, shotParams, ((Integer) this.o.a(ddm.c).e(Integer.valueOf((int) merge))).intValue());
                ojc ojcVarG2 = this.o.g(ddm.G);
                if (ojcVarG2.g()) {
                    GcamModuleJNI.ShotParams_psaf_max_exposure_time_ms_set(shotParams.a, shotParams, ((Float) ojcVarG2.c()).floatValue());
                }
                ojc ojcVarG3 = this.o.g(ddm.H);
                if (ojcVarG3.g()) {
                    GcamModuleJNI.ShotParams_psaf_log_scene_brightness_threshold_override_set(shotParams.a, shotParams, ((Float) ojcVarG3.c()).floatValue());
                }
            }
        }
        this.d.g("finalize");
        GcamModuleJNI.ShotParams_optimize_sky_set(shotParams.a, shotParams, this.o.k(ddm.B));
        this.o.c();
        GcamModuleJNI.ShotParams_nonzsl_extended_base_frame_selection_set(shotParams.a, shotParams, true);
        GcamModuleJNI.ShotParams_rerun_face_detection_set(shotParams.a, shotParams, this.o.k(ddm.E));
        this.d.f();
        return shotParams;
    }

    private final void H() throws llv {
        if (this.x.a()) {
            throw new llv("Camera already closed");
        }
    }

    private final boolean I() {
        if (this.o.k(ddu.p)) {
            return true;
        }
        ddf ddfVar = this.o;
        ddi ddiVar = ddm.a;
        ddfVar.b();
        return false;
    }

    @Override // defpackage.ebe
    public final boolean A(lzv lzvVar) {
        lje ljeVar = new lje(this.d, "HdrPlusSession#lockFrameFromFutureBinning");
        try {
            FrameMetadataKey frameMetadataKeyN = this.s.n(lzvVar);
            if (frameMetadataKeyN == null) {
                ljeVar.close();
                return false;
            }
            Gcam gcam = this.k;
            boolean zGcam_LockFrameFromFutureBinning = GcamModuleJNI.Gcam_LockFrameFromFutureBinning(gcam.a, gcam, frameMetadataKeyN.a, frameMetadataKeyN);
            ljeVar.close();
            return zGcam_LockFrameFromFutureBinning;
        } catch (Throwable th) {
            try {
                ljeVar.close();
            } catch (Throwable th2) {
            }
            throw th;
        }
    }

    @Override // defpackage.ebe
    public final Bitmap B(mad madVar, lzv lzvVar, gqt gqtVar, ojc ojcVar, ojc ojcVar2, ojc ojcVar3, ojc ojcVar4) {
        int iA = a(lzvVar);
        StaticMetadata staticMetadataB = this.k.b(iA);
        ShotParams shotParamsG = G(this.s.a(((Integer) ((lce) this.p).d).intValue()), 0, gqtVar, iA, false, false, false, oih.a, (ecb) ((ojj) ojcVar4).a, false, false);
        this.s.w(shotParamsG.a(), lzvVar, this.m.h, (lig) ojcVar.e(this.v));
        ojj ojjVar = (ojj) ojcVar;
        shotParamsG.a().j(((lig) ojjVar.a).a);
        shotParamsG.a().i(((lig) ojjVar.a).b);
        FrameMetadata frameMetadataK = k(lzvVar, l(lzvVar));
        RawWriteView rawWriteViewB = this.t.b(madVar);
        SpatialGainMap spatialGainMapP = this.s.p(lzvVar);
        GenerateRgbImageOptions generateRgbImageOptions = new GenerateRgbImageOptions();
        GcamModuleJNI.GenerateRgbImageOptions_expected_number_of_frames_set(generateRgbImageOptions.a, generateRgbImageOptions, ((Integer) ((ojj) ojcVar2).a).intValue());
        GcamModuleJNI.GenerateRgbImageOptions_actual_number_of_frames_set(generateRgbImageOptions.a, generateRgbImageOptions, ((Integer) ((ojj) ojcVar3).a).intValue());
        ddf ddfVar = this.o;
        ddi ddiVar = ddm.a;
        ddfVar.b();
        GcamModuleJNI.GenerateRgbImageOptions_verbose_set(generateRgbImageOptions.a, generateRgbImageOptions, false);
        int iA2 = this.n.a.a();
        InitParams initParams = this.n.a;
        long jInitParams_finish_threads_get = GcamModuleJNI.InitParams_finish_threads_get(initParams.a, initParams);
        ThreadPoolConfig threadPoolConfig = jInitParams_finish_threads_get == 0 ? null : new ThreadPoolConfig(jInitParams_finish_threads_get, false);
        InterleavedImageU8 interleavedImageU8 = new InterleavedImageU8(GcamModuleJNI.Gcam_GenerateRgbImage(StaticMetadata.c(staticMetadataB), staticMetadataB, shotParamsG.a, shotParamsG, FrameMetadata.b(frameMetadataK), frameMetadataK, spatialGainMapP.a, spatialGainMapP, RawWriteView.c(rawWriteViewB), rawWriteViewB, iA2, ThreadPoolConfig.a(threadPoolConfig), threadPoolConfig, generateRgbImageOptions.a, generateRgbImageOptions));
        if (interleavedImageU8.f()) {
            return null;
        }
        return this.Q.a(interleavedImageU8);
    }

    @Override // defpackage.ebe
    public final boolean C(int i, lzv lzvVar, mad madVar, mad madVar2, lzv lzvVar2, mad madVar3) {
        this.d.e("LiveTemporalBinning");
        GyroSampleVector gyroSampleVectorL = l(lzvVar);
        this.d.e("metadata");
        FrameMetadata frameMetadataL = this.s.l(lzvVar, gyroSampleVectorL);
        SpatialGainMap spatialGainMapP = this.s.p(lzvVar);
        this.d.f();
        RawWriteView rawWriteViewB = this.t.b(madVar);
        RawWriteView rawWriteView = madVar2 == null ? new RawWriteView() : (RawWriteView) this.t.a(madVar2).e(new RawWriteView());
        eqn eqnVar = madVar2 != null ? new eqn(madVar2, 1) : null;
        FrameMetadata frameMetadata = (madVar3 == null || lzvVar2 == null) ? new FrameMetadata() : this.s.l(lzvVar2, gyroSampleVectorL);
        RawWriteView rawWriteViewB2 = madVar3 != null ? this.t.b(madVar3) : new RawWriteView();
        eqn eqnVar2 = madVar3 != null ? new eqn(madVar3, 1) : null;
        ddf ddfVar = this.o;
        ddi ddiVar = ddm.a;
        ddfVar.b();
        ead eadVar = this.m;
        boolean zTemporallyBinViewfinderFrame = this.l.temporallyBinViewfinderFrame(Gcam.a(this.k), i, FrameMetadata.b(frameMetadataL), spatialGainMapP.a, RawWriteView.c(rawWriteViewB), new eqn(madVar, 1), RawWriteView.c(rawWriteView), eqnVar, FrameMetadata.b(frameMetadata), RawWriteView.c(rawWriteViewB2), eqnVar2, false, !eadVar.a.a(ddm.o).g() ? -1 : ((Integer) eadVar.a.a(ddm.o).c()).intValue());
        this.d.f();
        return zTemporallyBinViewfinderFrame;
    }

    @Override // defpackage.ebe
    public final int a(lzv lzvVar) {
        pkr pkrVar = this.s;
        return D(pkr.d(pkrVar.a, pkrVar.b, lzvVar));
    }

    @Override // defpackage.ebe
    public final ead b() {
        return this.m;
    }

    @Override // defpackage.ebe
    public final ecc c(mad madVar, lzv lzvVar, lig ligVar) {
        madVar.getClass();
        obr.aQ(this.t.d(madVar.a()));
        RawWriteView rawWriteViewB = this.t.b(madVar);
        FrameMetadata frameMetadataK = k(lzvVar, l(lzvVar));
        SpatialGainMap spatialGainMapP = this.s.p(lzvVar);
        pkr pkrVar = this.s;
        Integer num = (Integer) lzvVar.d(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION);
        num.getClass();
        ecc eccVar = new ecc(rawWriteViewB, frameMetadataK, spatialGainMapP, F(pkrVar.a(num.intValue()), null), GcamModuleJNI.FrameMetadata_actual_exposure_time_ms_get(frameMetadataK.a, frameMetadataK) * GcamModuleJNI.FrameMetadata_actual_analog_gain_get(frameMetadataK.a, frameMetadataK) * GcamModuleJNI.FrameMetadata_applied_digital_gain_get(frameMetadataK.a, frameMetadataK) * GcamModuleJNI.FrameMetadata_post_raw_digital_gain_get(frameMetadataK.a, frameMetadataK));
        this.s.w(eccVar.d, lzvVar, this.m.h, ligVar);
        return eccVar;
    }

    @Override // defpackage.ebe
    public final edd d(int i, hsp hspVar, gog gogVar, PostviewParams postviewParams, gqt gqtVar, lzv lzvVar) {
        this.d.e("HdrPlus#StartMomentsShotCapture");
        try {
            return E(i, hspVar, gogVar, postviewParams, gqtVar, lzvVar, true, -1, -1, false, -1, true, oih.a);
        } finally {
            this.d.f();
        }
    }

    @Override // defpackage.ebe
    public final edd e(int i, gog gogVar, PostviewParams postviewParams, gqt gqtVar, lzv lzvVar) {
        return f(i, gogVar, postviewParams, gqtVar, lzvVar, -1, false, -1, oih.a);
    }

    @Override // defpackage.ebe
    public final edd f(int i, gog gogVar, PostviewParams postviewParams, gqt gqtVar, lzv lzvVar, int i2, boolean z, int i3, ojc ojcVar) {
        this.d.e("HdrPlus#StartShotCapture");
        try {
            hsp hspVarH = gogVar.b.h();
            if (!z) {
                this.L.g(hspVarH);
            }
            return E(i, hspVarH, gogVar, postviewParams, gqtVar, lzvVar, false, -1, i2, z, i3, false, ojcVar);
        } finally {
            this.d.f();
        }
    }

    @Override // defpackage.ebe
    public final edd g(int i, gog gogVar, PostviewParams postviewParams, gqt gqtVar, lzv lzvVar, int i2, int i3, boolean z) {
        this.d.e("HdrPlus#StartZslShotCapture");
        try {
            hsp hspVarH = gogVar.b.h();
            if (!z) {
                this.L.g(hspVarH);
            }
            return E(i, hspVarH, gogVar, postviewParams, gqtVar, lzvVar, true, i2, i3, z, true != z ? -1 : 1, false, oih.a);
        } finally {
            this.d.f();
        }
    }

    @Override // defpackage.ebe
    public final AeResults h(ecc eccVar) {
        AeShotParams aeShotParams = eccVar.d;
        RawWriteView rawWriteView = eccVar.a;
        FrameMetadata frameMetadata = eccVar.b;
        SpatialGainMap spatialGainMap = eccVar.c;
        int iD = D(frameMetadata.a());
        StaticMetadata staticMetadataB = this.k.b(iD);
        Tuning tuningC = this.k.c(iD);
        return new AeResults(GcamModuleJNI.Gcam_ComputeAeResults(StaticMetadata.c(staticMetadataB), staticMetadataB, tuningC.a, tuningC, aeShotParams.a, aeShotParams, rawWriteView.a, rawWriteView, FrameMetadata.b(frameMetadata), frameMetadata, spatialGainMap.a, spatialGainMap, false), true);
    }

    @Override // defpackage.ebe
    public final BurstSpec i(edd eddVar, mad madVar, lzv lzvVar) throws llv {
        this.J.b("buildAfBurstSpec()");
        H();
        ecc eccVarC = c(madVar, lzvVar, this.v);
        Gcam gcam = this.k;
        int iA = eddVar.a();
        RawWriteView rawWriteView = eccVarC.a;
        FrameMetadata frameMetadata = eccVarC.b;
        SpatialGainMap spatialGainMap = eccVarC.c;
        return new BurstSpec(GcamModuleJNI.Gcam_BuildAfBurstSpec(gcam.a, gcam, iA, rawWriteView.a, rawWriteView, FrameMetadata.b(frameMetadata), frameMetadata, spatialGainMap.a, spatialGainMap));
    }

    @Override // defpackage.ebe
    public final BurstSpec j(edd eddVar, mad madVar, lzv lzvVar, boolean z, Boolean bool) throws llv {
        int iIntValue;
        Float f;
        this.J.b("buildPayloadBurstSpec()");
        H();
        this.d.e("convertFrame");
        ecc eccVarC = c(madVar, lzvVar, this.v);
        this.d.g("setOptions");
        BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions = new BuildPayloadBurstSpecOptions(this.f);
        GcamModuleJNI.BuildPayloadBurstSpecOptions_shasta_zsl_set(buildPayloadBurstSpecOptions.a, buildPayloadBurstSpecOptions, z);
        ddf ddfVar = this.o;
        ddi ddiVar = ddm.a;
        ddfVar.f();
        GcamModuleJNI.BuildPayloadBurstSpecOptions_include_ultra_short_frame_set(buildPayloadBurstSpecOptions.a, buildPayloadBurstSpecOptions, false);
        if (bool != null) {
            buildPayloadBurstSpecOptions.c(bool.booleanValue());
        } else {
            buildPayloadBurstSpecOptions.c(this.o.k(ddm.as));
        }
        if (z) {
            ojc ojcVarG = this.o.g(ddm.N);
            GcamModuleJNI.BuildPayloadBurstSpecOptions_max_total_capture_time_ms_set(buildPayloadBurstSpecOptions.a, buildPayloadBurstSpecOptions, ojcVarG.g() ? Math.max(66.666664f, ((Float) ojcVarG.c()).floatValue()) : 66.666664f);
        }
        this.o.b();
        if (z && this.o.a(ddm.k).g()) {
            iIntValue = ((Integer) this.o.a(ddm.k).c()).intValue();
        } else {
            iIntValue = eddVar.o == ecb.LONG_EXPOSURE ? ((Integer) this.o.a(ddm.i).c()).intValue() : -1;
        }
        int iMenuValue = Pref.MenuValue(LensValue.SetLensValue1("pref_frames_hdr_key"));
        if (iMenuValue != 0) {
            iIntValue = iMenuValue;
        }
        GcamModuleJNI.BuildPayloadBurstSpecOptions_max_frame_count_set(buildPayloadBurstSpecOptions.a, buildPayloadBurstSpecOptions, iIntValue);
        if (eddVar.o == ecb.LONG_EXPOSURE && (f = (Float) this.o.g(ddm.C).f()) != null) {
            buildPayloadBurstSpecOptions.b(f.floatValue());
        }
        this.d.g("computeSpec");
        Gcam gcam = this.k;
        int iA = eddVar.a();
        RawWriteView rawWriteView = eccVarC.a;
        FrameMetadata frameMetadata = eccVarC.b;
        SpatialGainMap spatialGainMap = eccVarC.c;
        BurstSpec burstSpec = new BurstSpec(GcamModuleJNI.Gcam_BuildPayloadBurstSpec(gcam.a, gcam, iA, rawWriteView.a, rawWriteView, FrameMetadata.b(frameMetadata), frameMetadata, spatialGainMap.a, spatialGainMap, buildPayloadBurstSpecOptions.a, buildPayloadBurstSpecOptions));
        this.d.f();
        return burstSpec;
    }

    @Override // defpackage.ebe
    public final FrameMetadata k(lzv lzvVar, GyroSampleVector gyroSampleVector) {
        FrameMetadataKey frameMetadataKeyN;
        hkn hknVarD;
        Long l = (Long) lzvVar.d(CaptureResult.SENSOR_TIMESTAMP);
        HashMap map = null;
        if (l != null && (hknVarD = this.N.d(l.longValue())) != null && hknVarD.p.g() && ((hla) hknVarD.p.c()).a.length != 0) {
            map = new HashMap();
            for (hkz hkzVar : ((hla) hknVarD.p.c()).a) {
                if (hkzVar.c > 0.0f) {
                    map.put(Integer.valueOf((int) hkzVar.a), Float.valueOf(hkzVar.c));
                }
            }
        }
        if (this.o.k(ddm.W) && (frameMetadataKeyN = this.s.n(lzvVar)) != null) {
            FrameMetadata frameMetadata = new FrameMetadata();
            Gcam gcam = this.k;
            return !GcamModuleJNI.Gcam_OverrideFrameMetadata(gcam.a, gcam, frameMetadataKeyN.a, frameMetadataKeyN, FrameMetadata.b(frameMetadata), frameMetadata) ? this.s.m(lzvVar, gyroSampleVector, map) : frameMetadata;
        }
        return this.s.m(lzvVar, gyroSampleVector, map);
    }

    @Override // defpackage.ebe
    public final GyroSampleVector l(lzv lzvVar) {
        Long l = (Long) lzvVar.d(CaptureResult.SENSOR_TIMESTAMP);
        l.getClass();
        long jLongValue = l.longValue();
        Long l2 = (Long) lzvVar.d(CaptureResult.SENSOR_EXPOSURE_TIME);
        l2.getClass();
        long jLongValue2 = l2.longValue() + jLongValue + this.s.f(lzvVar);
        final GyroSampleVector gyroSampleVector = new GyroSampleVector();
        ojc ojcVar = (ojc) this.z.get();
        if (ojcVar.g()) {
            lxa lxaVar = (lxa) ojcVar.c();
            this.d.e("gyro");
            lxaVar.b((-5000000) + jLongValue, jLongValue2 + 5000000, new lwz() { // from class: ebg
                @Override // defpackage.lwz
                public final void a(List list) {
                    GyroSampleVector gyroSampleVector2 = gyroSampleVector;
                    lig ligVar = ebi.b;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        lxc lxcVar = (lxc) it.next();
                        GyroSample gyroSample = new GyroSample();
                        GcamModuleJNI.GyroSample_timestamp_ns_set(gyroSample.a, gyroSample, lxcVar.e);
                        GcamModuleJNI.GyroSample_x_set(gyroSample.a, gyroSample, lxcVar.f);
                        GcamModuleJNI.GyroSample_y_set(gyroSample.a, gyroSample, lxcVar.g);
                        GcamModuleJNI.GyroSample_z_set(gyroSample.a, gyroSample, lxcVar.h);
                        GcamModuleJNI.GyroSampleVector_add(gyroSampleVector2.a, gyroSampleVector2, gyroSample.a, gyroSample);
                    }
                }
            });
            this.d.f();
        }
        return gyroSampleVector;
    }

    @Override // defpackage.ebe
    public final PhysicalStabilityParams m(int i) {
        PhysicalStabilityParams physicalStabilityParams = (PhysicalStabilityParams) this.j.get(Integer.valueOf(i));
        physicalStabilityParams.getClass();
        return physicalStabilityParams;
    }

    @Override // defpackage.ebe
    public final ViewfinderResults n(int i) {
        Gcam gcam = this.k;
        return new ViewfinderResults(GcamModuleJNI.Gcam_GetLatestViewfinderResults(gcam.a, gcam, i));
    }

    @Override // defpackage.ebe
    public final void o(edd eddVar) {
        int iA = eddVar.a();
        ljf ljfVar = this.d;
        StringBuilder sb = new StringBuilder(21);
        sb.append("AbortShot-");
        sb.append(iA);
        ljfVar.e(sb.toString());
        Gcam gcam = this.k;
        GcamModuleJNI.Gcam_AbortShot(gcam.a, gcam, iA);
        this.d.f();
    }

    @Override // defpackage.ebe
    public final void p(edd eddVar, int i, lzv lzvVar, int i2, mad madVar, mad madVar2) {
        q(eddVar, i, lzvVar, i2, madVar, madVar2, oih.a);
    }

    @Override // defpackage.ebe
    public final void q(edd eddVar, int i, lzv lzvVar, int i2, mad madVar, mad madVar2, ojc ojcVar) {
        RawWriteView rawWriteView;
        long j;
        Runnable runnable;
        Runnable runnable2;
        RawWriteView rawWriteView2;
        eqn eqnVar;
        Runnable eqnVar2;
        Runnable runnable3;
        this.d.e("AddPayloadFrame");
        GyroSampleVector gyroSampleVectorL = l(lzvVar);
        this.d.e("metadata");
        FrameMetadata frameMetadata = new FrameMetadata();
        if (lzvVar != null) {
            frameMetadata = k(lzvVar, gyroSampleVectorL);
            GcamModuleJNI.FrameMetadata_burst_frame_type_set(frameMetadata.a, frameMetadata, i2);
            if (ojcVar.g()) {
                frameMetadata.g().c(((hkm) ojcVar.c()).b);
                frameMetadata.g().b(((hkm) ojcVar.c()).a);
                frameMetadata.g().f(((hkm) ojcVar.c()).b);
                frameMetadata.g().d(((hkm) ojcVar.c()).a);
            }
        }
        if (madVar != null && I()) {
            String str = this.A;
            str.getClass();
            synchronized (ear.b) {
                ear.a.add(new eaq(str, i, lzvVar));
            }
        }
        List list = eddVar.e;
        Long l = (Long) lzvVar.d(CaptureResult.SENSOR_TIMESTAMP);
        l.getClass();
        list.add(l);
        eddVar.d.add(lzvVar);
        SpatialGainMap spatialGainMapP = this.s.p(lzvVar);
        this.d.g("wrapImages");
        long aHardwareBufferPtr = 0;
        eqn eqnVar3 = null;
        if (madVar != null) {
            rawWriteView = this.t.b(madVar);
            HardwareBuffer hardwareBufferF = madVar.f();
            if (hardwareBufferF != null) {
                aHardwareBufferPtr = AndroidJniUtils.getAHardwareBufferPtr(hardwareBufferF);
                pkn pknVar = new pkn(madVar, hardwareBufferF);
                eqnVar2 = pknVar.e;
                runnable3 = pknVar.f;
            } else {
                eqnVar2 = new eqn(madVar, 1);
                runnable3 = null;
            }
            j = aHardwareBufferPtr;
            runnable = eqnVar2;
            runnable2 = runnable3;
        } else {
            rawWriteView = new RawWriteView();
            j = 0;
            runnable = null;
            runnable2 = null;
        }
        if (madVar2 != null) {
            ojc ojcVarA = this.t.a(madVar2);
            if (ojcVarA.g()) {
                rawWriteView2 = (RawWriteView) ojcVarA.c();
                eqnVar3 = new eqn(madVar2, 1);
            } else {
                rawWriteView2 = new RawWriteView();
            }
            eqnVar = eqnVar3;
        } else {
            rawWriteView2 = new RawWriteView();
            eqnVar = null;
        }
        this.d.g("addPayloadFrame()");
        if (!this.l.addPayloadFrame(Gcam.a(this.k), eddVar.a(), FrameMetadata.b(frameMetadata), spatialGainMapP.a, RawWriteView.c(rawWriteView), runnable, RawWriteView.c(rawWriteView2), eqnVar, j, runnable2)) {
            ((oug) ((oug) g.b()).G(1046)).s("addPayloadFrame for shot %d failed, closing input images at frame index %d.", eddVar.a(), i);
            if (madVar != null) {
                madVar.close();
            }
            if (madVar2 != null) {
                madVar2.close();
            }
        }
        this.d.f();
        this.d.f();
    }

    @Override // defpackage.ebe
    public final void r(int i, mad madVar, lzv lzvVar) {
        ecc eccVarC = c(madVar, lzvVar, this.v);
        this.l.addViewfinderFrame(Gcam.a(this.k), i, FrameMetadata.b(eccVarC.b), eccVarC.c.a, eccVarC.d.a, RawWriteView.c(eccVarC.a), new eqn(madVar, 1));
    }

    @Override // defpackage.ebe
    public final void s(edd eddVar) {
        t(eddVar, new BurstSpec());
    }

    @Override // defpackage.ebe
    public final void t(edd eddVar, BurstSpec burstSpec) {
        ljf ljfVar = this.d;
        int iA = eddVar.a();
        StringBuilder sb = new StringBuilder(30);
        sb.append("BeginPayloadFrames-");
        sb.append(iA);
        ljfVar.e(sb.toString());
        Gcam gcam = this.k;
        GcamModuleJNI.Gcam_BeginPayloadFrames(gcam.a, gcam, eddVar.a(), burstSpec.a, burstSpec);
        this.d.f();
    }

    @Override // defpackage.ebe
    public final void u(edd eddVar) {
        int iA = eddVar.a();
        Gcam gcam = this.k;
        GcamModuleJNI.Gcam_EndZslPayloadFrames(gcam.a, gcam, iA);
    }

    @Override // defpackage.ebe
    public final void v(int i) {
        Gcam gcam = this.k;
        GcamModuleJNI.Gcam_FlushTemporalBinning(gcam.a, gcam, i);
    }

    @Override // defpackage.ebe
    public final void w(int i) {
        Gcam gcam = this.k;
        GcamModuleJNI.Gcam_FlushViewfinder(gcam.a, gcam, i);
    }

    @Override // defpackage.ebe
    public final boolean x(lzv lzvVar) {
        lje ljeVar = new lje(this.d, "HdrPlusSession#claimFrameForTemporalBinning");
        try {
            FrameMetadataKey frameMetadataKeyN = this.s.n(lzvVar);
            if (frameMetadataKeyN == null) {
                ljeVar.close();
                return false;
            }
            Gcam gcam = this.k;
            boolean zGcam_ClaimFrameForBinning = GcamModuleJNI.Gcam_ClaimFrameForBinning(gcam.a, gcam, frameMetadataKeyN.a, frameMetadataKeyN);
            ljeVar.close();
            return zGcam_ClaimFrameForBinning;
        } catch (Throwable th) {
            try {
                ljeVar.close();
            } catch (Throwable th2) {
            }
            throw th;
        }
    }

    @Override // defpackage.ebe
    public final boolean y(edd eddVar) {
        int iA = eddVar.a();
        ljf ljfVar = this.d;
        StringBuilder sb = new StringBuilder(28);
        sb.append("EndPayloadFrames-");
        sb.append(iA);
        ljfVar.e(sb.toString());
        Gcam gcam = this.k;
        boolean zGcam_EndPayloadFrames = GcamModuleJNI.Gcam_EndPayloadFrames(gcam.a, gcam, iA, ClientShotMetadata.a(null), null);
        if (!zGcam_EndPayloadFrames) {
            this.J.d("EndPayloadFrames() failed.");
        }
        if (I()) {
            this.M.execute(new Runnable() { // from class: ebh
                @Override // java.lang.Runnable
                public final void run() {
                    oom oomVarJ;
                    ebi ebiVar = this.a;
                    ebiVar.d.e("writeDebugMetadata");
                    synchronized (ear.b) {
                        oomVarJ = oom.j(ear.a);
                        ear.a.clear();
                    }
                    int size = oomVarJ.size();
                    for (int i = 0; i < size; i++) {
                        eaq eaqVar = (eaq) oomVarJ.get(i);
                        String str = eaqVar.a;
                        int i2 = eaqVar.b;
                        lzr lzrVar = eaqVar.c;
                        StringBuilder sb2 = new StringBuilder(26);
                        sb2.append("  Result frame ");
                        sb2.append(i2);
                        String string = sb2.toString();
                        try {
                            FileWriter fileWriter = new FileWriter(new File(str, "payload_burst_actual_hal3.txt"), true);
                            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                            try {
                                try {
                                    List<CaptureResult.Key> listF = lzrVar.f();
                                    String strBp = mip.bp(string, new Object[0]);
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(strBp).length() + 1);
                                    sb3.append(strBp);
                                    sb3.append('\n');
                                    bufferedWriter.write(sb3.toString());
                                    for (CaptureResult.Key key : listF) {
                                        bufferedWriter.write(mip.bp("    %s\n", key.getName()));
                                        bufferedWriter.write(mip.bp("        %s\n", brd.a(lzrVar.d(key))));
                                    }
                                    try {
                                        bufferedWriter.close();
                                    } catch (IOException e) {
                                        ((oug) ((oug) ((oug) brd.a.b()).h(e)).G('5')).o("dumpMetadata - Failed to close writer.");
                                    }
                                } catch (Throwable th) {
                                    try {
                                        bufferedWriter.close();
                                    } catch (IOException e2) {
                                        ((oug) ((oug) ((oug) brd.a.b()).h(e2)).G('8')).o("dumpMetadata - Failed to close writer.");
                                    }
                                    throw th;
                                }
                            } catch (IOException e3) {
                                ((oug) ((oug) ((oug) brd.a.b()).h(e3)).G(54)).o("dumpMetadata - Failed to dump metadata");
                                try {
                                    bufferedWriter.close();
                                } catch (IOException e4) {
                                    ((oug) ((oug) ((oug) brd.a.b()).h(e4)).G('7')).o("dumpMetadata - Failed to close writer.");
                                }
                            }
                            fileWriter.close();
                        } catch (IOException e5) {
                            ((oug) ((oug) ((oug) brd.a.b()).h(e5)).G('9')).o("Could not write capture data to file.");
                        }
                    }
                    ebiVar.d.f();
                }
            });
        }
        this.d.f();
        return zGcam_EndPayloadFrames;
    }

    @Override // defpackage.ebe
    public final boolean z(edd eddVar) {
        int iA = eddVar.a();
        ljf ljfVar = this.d;
        StringBuilder sb = new StringBuilder(26);
        sb.append("EndShotCapture-");
        sb.append(iA);
        ljfVar.e(sb.toString());
        Gcam gcam = this.k;
        boolean zGcam_EndShotCapture = GcamModuleJNI.Gcam_EndShotCapture(gcam.a, gcam, iA);
        this.d.f();
        return zGcam_EndShotCapture;
    }
}
