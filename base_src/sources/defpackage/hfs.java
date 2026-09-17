package defpackage;

import android.hardware.HardwareBuffer;
import android.util.Base64;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthResult;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedImageU16;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.InterleavedReadViewU16;
import com.google.googlex.gcam.PortraitOutputs;
import com.google.googlex.gcam.PortraitRequest;
import com.google.googlex.gcam.RawReadView;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.StringRawReadViewMap;
import com.google.googlex.gcam.base.function.LongConsumer;
import com.google.googlex.gcam.base.function.LongFloatConsumer;
import com.google.googlex.gcam.base.function.LongStringConsumer;
import com.google.googlex.gcam.creativecamera.portraitmode.PortraitImageCallback;
import com.google.googlex.gcam.creativecamera.portraitmode.PortraitOpaqueHandleCallback;
import com.google.googlex.gcam.creativecamera.portraitmode.PortraitProcessorInterface;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class hfs implements gjt {
    public pjl a;
    public DynamicDepthResult b = null;
    final /* synthetic */ long c;
    final /* synthetic */ boolean d;
    final /* synthetic */ PortraitRequest e;
    final /* synthetic */ RawReadView f;
    final /* synthetic */ ShotMetadata g;
    final /* synthetic */ RawReadView h;
    final /* synthetic */ ShotMetadata i;
    final /* synthetic */ InterleavedImageU16 j;
    final /* synthetic */ InterleavedImageU8 k;
    final /* synthetic */ hfw l;
    final /* synthetic */ ega m;

    public hfs(hfw hfwVar, long j, ega egaVar, boolean z, PortraitRequest portraitRequest, RawReadView rawReadView, ShotMetadata shotMetadata, RawReadView rawReadView2, ShotMetadata shotMetadata2, InterleavedImageU16 interleavedImageU16, InterleavedImageU8 interleavedImageU8) {
        this.l = hfwVar;
        this.c = j;
        this.m = egaVar;
        this.d = z;
        this.e = portraitRequest;
        this.f = rawReadView;
        this.g = shotMetadata;
        this.h = rawReadView2;
        this.i = shotMetadata2;
        this.j = interleavedImageU16;
        this.k = interleavedImageU8;
    }

    public static final PortraitOpaqueHandleCallback d(final hft hftVar) {
        return new PortraitOpaqueHandleCallback() { // from class: hfq
            @Override // com.google.googlex.gcam.creativecamera.portraitmode.PortraitOpaqueHandleCallback
            public final void onImage(long j, Object obj, int i, String str, String str2, String str3) {
                hft hftVar2 = hftVar;
                obr.aF(obj instanceof HardwareBuffer);
                hftVar2.a(j, msq.b((HardwareBuffer) obj), i, str2, str3);
            }
        };
    }

    @Override // defpackage.gjt
    public final pht a() {
        final pih pihVarF = pih.f();
        final pih pihVarF2 = pih.f();
        ouj oujVar = hfw.a;
        Executor executor = this.l.e;
        final ega egaVar = this.m;
        final boolean z = this.d;
        final PortraitRequest portraitRequest = this.e;
        final RawReadView rawReadView = this.f;
        final ShotMetadata shotMetadata = this.g;
        final RawReadView rawReadView2 = this.h;
        final ShotMetadata shotMetadata2 = this.i;
        final InterleavedImageU16 interleavedImageU16 = this.j;
        final InterleavedImageU8 interleavedImageU8 = this.k;
        final long j = this.c;
        executor.execute(new Runnable() { // from class: hfr
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [ega] */
            /* JADX WARN: Type inference failed for: r2v2 */
            /* JADX WARN: Type inference failed for: r2v3 */
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                final hfs hfsVar = this.a;
                final ?? r2 = egaVar;
                final pih pihVar = pihVarF;
                final boolean z2 = z;
                final pih pihVar2 = pihVarF2;
                PortraitRequest portraitRequest2 = portraitRequest;
                RawReadView rawReadView3 = rawReadView;
                ShotMetadata shotMetadata3 = shotMetadata;
                RawReadView rawReadView4 = rawReadView2;
                ShotMetadata shotMetadata4 = shotMetadata2;
                InterleavedImageU16 interleavedImageU17 = interleavedImageU16;
                InterleavedImageU8 interleavedImageU9 = interleavedImageU8;
                long j2 = j;
                try {
                    Object obj = hfsVar.l.g;
                    try {
                        synchronized (obj) {
                            try {
                                LongFloatConsumer longFloatConsumer = new LongFloatConsumer() { // from class: hfn
                                    @Override // com.google.googlex.gcam.base.function.LongFloatConsumer
                                    public final void accept(long j3, float f) {
                                        ega egaVar2 = r2;
                                        ouj oujVar2 = hfw.a;
                                        if (egaVar2 != null) {
                                            boolean z3 = false;
                                            if (f >= 0.0f && f <= 1.0f) {
                                                z3 = true;
                                            }
                                            obr.aF(z3);
                                            if (f == 0.0f) {
                                                egaVar2.c.c = System.currentTimeMillis();
                                            }
                                            egaVar2.a.a(ecn.a, f);
                                        }
                                    }
                                };
                                LongStringConsumer longStringConsumer = new LongStringConsumer() { // from class: hfo
                                    @Override // com.google.googlex.gcam.base.function.LongStringConsumer
                                    public final void accept(long j3, String str) {
                                        pdo pdoVar;
                                        ega egaVar2 = r2;
                                        try {
                                            pdoVar = (pdo) ppd.s(pdo.a, Base64.decode(str, 0), pos.b());
                                        } catch (ppp e) {
                                            ((oug) ((oug) hfw.a.c()).G((char) 2420)).r("Error deserializing native portrait logs: %s", e);
                                            pdoVar = pdo.a;
                                        }
                                        poy poyVar = egaVar2.c.g;
                                        if (poyVar.c) {
                                            poyVar.m();
                                            poyVar.c = false;
                                        }
                                        pdn pdnVar = (pdn) poyVar.b;
                                        pdn pdnVar2 = pdn.f;
                                        pdoVar.getClass();
                                        pdnVar.e = pdoVar;
                                        pdnVar.a |= 8;
                                    }
                                };
                                LongConsumer longConsumer = new LongConsumer() { // from class: hfm
                                    @Override // com.google.googlex.gcam.base.function.LongConsumer
                                    public final void accept(long j3) {
                                        pih pihVar3 = pihVar;
                                        ega egaVar2 = r2;
                                        ouj oujVar2 = hfw.a;
                                        pihVar3.o(true);
                                        if (egaVar2 != null) {
                                            poy poyVar = egaVar2.c.g;
                                            int iCurrentTimeMillis = (int) (System.currentTimeMillis() - egaVar2.c.c);
                                            if (poyVar.c) {
                                                poyVar.m();
                                                poyVar.c = false;
                                            }
                                            pdn pdnVar = (pdn) poyVar.b;
                                            pdn pdnVar2 = pdn.f;
                                            pdnVar.a |= 2;
                                            pdnVar.c = iCurrentTimeMillis;
                                            egaVar2.c.t = true;
                                            egaVar2.c.e(j3, oih.a);
                                        }
                                    }
                                };
                                try {
                                    hft hftVar = new hft() { // from class: hfl
                                        @Override // defpackage.hft
                                        public final void a(long j3, msq msqVar, int i, String str, String str2) {
                                            boolean z3 = z2;
                                            pih pihVar3 = pihVar2;
                                            ega egaVar2 = r2;
                                            ouj oujVar2 = hfw.a;
                                            obr.aF(GcamModuleJNI.IsRgb8(i));
                                            if (z3) {
                                                pihVar3.o(new hfv(msqVar, str, str2, j3, null));
                                                return;
                                            }
                                            if (egaVar2 != null) {
                                                hgj hgjVarA = hgk.a();
                                                hgjVarA.a = hfw.b(str);
                                                hgjVarA.b = hfw.b(str2);
                                                egaVar2.c.g(j3, msqVar, hgjVarA.a(), 0, edt.ORIGINAL, egaVar2.c.b.b(), oih.a);
                                            }
                                        }
                                    };
                                    hft hftVar2 = new hft() { // from class: hfj
                                        /* JADX WARN: Code duplicated, block: B:35:0x00b8  */
                                        /* JADX WARN: Code duplicated, block: B:43:0x00de  */
                                        @Override // defpackage.hft
                                        public final void a(long j3, msq msqVar, int i, String str, String str2) {
                                            hfv hfvVar;
                                            long j4;
                                            msq msqVar2;
                                            String str3;
                                            String str4;
                                            jtk jtkVarB;
                                            boolean z3;
                                            hfs hfsVar2 = hfsVar;
                                            ega egaVar2 = r2;
                                            boolean z4 = z2;
                                            pih pihVar3 = pihVar2;
                                            obr.aF(GcamModuleJNI.IsRgb8(i));
                                            ouj oujVar2 = hfw.a;
                                            if (egaVar2 != null) {
                                                if (z4) {
                                                    try {
                                                        hfvVar = (hfv) pihVar3.get();
                                                    } catch (InterruptedException e) {
                                                        hfvVar = null;
                                                    } catch (ExecutionException e2) {
                                                        hfvVar = null;
                                                    }
                                                } else {
                                                    hfvVar = null;
                                                }
                                                if (hfw.f(msqVar)) {
                                                    DynamicDepthResult dynamicDepthResult = hfsVar2.b;
                                                    if (dynamicDepthResult != null) {
                                                        dynamicDepthResult.close();
                                                        hfsVar2.b = null;
                                                    }
                                                    if (hfvVar != null) {
                                                        msq msqVar3 = hfvVar.d;
                                                        j4 = hfvVar.c;
                                                        str3 = hfvVar.a;
                                                        str4 = hfvVar.b;
                                                        msqVar2 = msqVar3;
                                                    }
                                                    hgj hgjVarA = hgk.a();
                                                    hgjVarA.a = hfw.b(str3);
                                                    hgjVarA.b = hfw.b(str4);
                                                    hgjVarA.c = ojc.h(hfsVar2.b);
                                                    hgk hgkVarA = hgjVarA.a();
                                                    jtkVarB = egaVar2.c.b.b();
                                                    if (msqVar2.b.g() || ((InterleavedImageU8) msqVar2.b.c()).b() <= 0 || ((InterleavedImageU8) msqVar2.b.c()).a() <= 0) {
                                                        z3 = false;
                                                    } else {
                                                        z3 = true;
                                                    }
                                                    boolean z5 = !msqVar2.a.g() && ((HardwareBuffer) msqVar2.a.c()).getWidth() > 0 && ((HardwareBuffer) msqVar2.a.c()).getHeight() > 0;
                                                    if (!z3 || z5) {
                                                        ouj oujVar3 = ege.b;
                                                        egaVar2.c.g(j4, msqVar2, hgkVarA, 100, edt.PRIMARY, jtkVarB, egaVar2.b);
                                                    } else {
                                                        ouj oujVar4 = ege.b;
                                                        egd egdVar = egaVar2.c;
                                                        jtkVarB.close();
                                                        egdVar.e(j4, oih.a);
                                                        return;
                                                    }
                                                }
                                                if (hfvVar != null) {
                                                    msq msqVar4 = hfvVar.d;
                                                    ojc ojcVar = msqVar4.b;
                                                    ojc ojcVar2 = msqVar4.a;
                                                    if (ojcVar.g()) {
                                                        ((InterleavedImageU8) ojcVar.c()).e();
                                                    }
                                                    if (ojcVar2.g()) {
                                                        ((HardwareBuffer) ojcVar2.c()).close();
                                                    }
                                                }
                                                j4 = j3;
                                                msqVar2 = msqVar;
                                                str3 = str;
                                                str4 = str2;
                                                hgj hgjVarA2 = hgk.a();
                                                hgjVarA2.a = hfw.b(str3);
                                                hgjVarA2.b = hfw.b(str4);
                                                hgjVarA2.c = ojc.h(hfsVar2.b);
                                                hgk hgkVarA2 = hgjVarA2.a();
                                                jtkVarB = egaVar2.c.b.b();
                                                if (msqVar2.b.g()) {
                                                    z3 = false;
                                                } else {
                                                    z3 = false;
                                                }
                                                if (msqVar2.a.g()) {
                                                }
                                                if (z3) {
                                                }
                                                ouj oujVar5 = ege.b;
                                                egaVar2.c.g(j4, msqVar2, hgkVarA2, 100, edt.PRIMARY, jtkVarB, egaVar2.b);
                                            }
                                        }
                                    };
                                    hfsVar.a = new pjl();
                                    PortraitOutputs portraitOutputs = new PortraitOutputs();
                                    hfsVar.l.j.setProgressCallback(portraitOutputs.a, longFloatConsumer);
                                    hfsVar.l.j.setUpsampledInputImageCallback(portraitOutputs.a, hfsVar.c(hftVar));
                                    if (portraitRequest2.d()) {
                                        hfsVar.l.j.setUpsampledInputHardwareBufferCallback(portraitOutputs.a, hfs.d(hftVar));
                                    }
                                    hfsVar.l.j.setImageCallback(portraitOutputs.a, hfsVar.c(hftVar2));
                                    if (portraitRequest2.d()) {
                                        hfsVar.l.j.setHardwareBufferCallback(portraitOutputs.a, hfs.d(hftVar2));
                                    }
                                    hfsVar.l.j.setLogCallback(portraitOutputs.a, longStringConsumer);
                                    hfsVar.l.j.setCompleteCallback(portraitOutputs.a, longConsumer);
                                    hfsVar.l.j.setRgbAllocator(portraitOutputs.a, hfsVar.a);
                                    if (hfsVar.l.f.k(ddx.m)) {
                                        final int i = 1;
                                        hft hftVar3 = new hft() { // from class: hfk
                                            @Override // defpackage.hft
                                            public final void a(long j3, msq msqVar, int i2, String str, String str2) {
                                                switch (i) {
                                                    case 0:
                                                        ega egaVar2 = r2;
                                                        ouj oujVar2 = hfw.a;
                                                        obr.aF(GcamModuleJNI.IsRgb8(i2));
                                                        if (egaVar2 != null) {
                                                            hgk hgkVarA = hfw.a(str, str2);
                                                            jtk jtkVarB = egaVar2.c.b.b();
                                                            egd egdVar = egaVar2.c;
                                                            int i3 = egdVar.e;
                                                            egdVar.e = i3 + 1;
                                                            egdVar.g(j3, msqVar, hgkVarA, i3, edt.DEBUG, jtkVarB, oih.a);
                                                        }
                                                        break;
                                                    default:
                                                        ega egaVar3 = r2;
                                                        ouj oujVar3 = hfw.a;
                                                        obr.aF(GcamModuleJNI.IsRgb8(i2));
                                                        if (egaVar3 != null && !hfw.f(msqVar)) {
                                                            hgk hgkVarA2 = hfw.a(str, str2);
                                                            jtk jtkVarB2 = egaVar3.c.b.b();
                                                            egd egdVar2 = egaVar3.c;
                                                            int i4 = egdVar2.e;
                                                            egdVar2.e = i4 + 1;
                                                            egdVar2.g(j3, msqVar, hgkVarA2, i4, edt.SECONDARY, jtkVarB2, oih.a);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        };
                                        hfsVar.l.j.setSecondaryImageCallback(portraitOutputs.a, hfsVar.c(hftVar3));
                                        if (portraitRequest2.d()) {
                                            hfsVar.l.j.setSecondaryHardwareBufferCallback(portraitOutputs.a, hfs.d(hftVar3));
                                        }
                                    }
                                    if (hfsVar.l.f.k(ddx.k)) {
                                        final int i2 = 0;
                                        hft hftVar4 = new hft() { // from class: hfk
                                            @Override // defpackage.hft
                                            public final void a(long j3, msq msqVar, int i3, String str, String str2) {
                                                switch (i2) {
                                                    case 0:
                                                        ega egaVar2 = r2;
                                                        ouj oujVar2 = hfw.a;
                                                        obr.aF(GcamModuleJNI.IsRgb8(i3));
                                                        if (egaVar2 != null) {
                                                            hgk hgkVarA = hfw.a(str, str2);
                                                            jtk jtkVarB = egaVar2.c.b.b();
                                                            egd egdVar = egaVar2.c;
                                                            int i4 = egdVar.e;
                                                            egdVar.e = i4 + 1;
                                                            egdVar.g(j3, msqVar, hgkVarA, i4, edt.DEBUG, jtkVarB, oih.a);
                                                        }
                                                        break;
                                                    default:
                                                        ega egaVar3 = r2;
                                                        ouj oujVar3 = hfw.a;
                                                        obr.aF(GcamModuleJNI.IsRgb8(i3));
                                                        if (egaVar3 != null && !hfw.f(msqVar)) {
                                                            hgk hgkVarA2 = hfw.a(str, str2);
                                                            jtk jtkVarB2 = egaVar3.c.b.b();
                                                            egd egdVar2 = egaVar3.c;
                                                            int i5 = egdVar2.e;
                                                            egdVar2.e = i5 + 1;
                                                            egdVar2.g(j3, msqVar, hgkVarA2, i5, edt.SECONDARY, jtkVarB2, oih.a);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        };
                                        hfsVar.l.j.setDebugRgbAllocator(portraitOutputs.a, hfsVar.a);
                                        hfsVar.l.j.setDebugImageCallback(portraitOutputs.a, hfsVar.c(hftVar4));
                                        if (portraitRequest2.d()) {
                                            hfsVar.l.j.setDebugHardwareBufferCallback(portraitOutputs.a, hfs.d(hftVar4));
                                        }
                                    }
                                    StringRawReadViewMap stringRawReadViewMap = new StringRawReadViewMap();
                                    if (rawReadView3 != null && !rawReadView3.b() && shotMetadata3 != null) {
                                        stringRawReadViewMap.b(hfw.b, rawReadView3);
                                        efy.a(hfw.b, portraitRequest2, shotMetadata3);
                                    }
                                    if (rawReadView4 != null && !rawReadView4.b() && shotMetadata4 != null) {
                                        String str = hfsVar.l.f.k(ddl.T) ? hfw.d : hfw.c;
                                        stringRawReadViewMap.b(str, rawReadView4);
                                        efy.a(str, portraitRequest2, shotMetadata4);
                                    }
                                    InterleavedReadViewU16 interleavedReadViewU16 = new InterleavedReadViewU16(GcamModuleJNI.InterleavedImageU16_read_view(interleavedImageU17.a, interleavedImageU17));
                                    pji pjiVar = new pji(GcamModuleJNI.new_PortraitDepthArguments(interleavedReadViewU16.a, interleavedReadViewU16, stringRawReadViewMap.a, stringRawReadViewMap));
                                    if (hfsVar.l.f.k(ddx.A)) {
                                        hfsVar.b = new DynamicDepthResult(interleavedImageU9.b(), interleavedImageU9.a(), portraitRequest2.c());
                                        GcamModuleJNI.PortraitOutputs_dynamic_depth_result_ptr_set(portraitOutputs.a, portraitOutputs, hfsVar.b.a);
                                    }
                                    hgm hgmVar = hfsVar.l.l;
                                    long jA = hgmVar != null ? hgmVar.a() : 0L;
                                    hgl hglVar = hfsVar.l.m;
                                    PortraitProcessorInterface portraitProcessorInterface = new PortraitProcessorInterface(jA, hglVar != null ? hglVar.a() : 0L);
                                    try {
                                        hfu hfuVar = new hfu(portraitOutputs, interleavedImageU9, pjiVar, portraitRequest2);
                                        HashMap map = hfsVar.l.i;
                                        Long lValueOf = Long.valueOf(j2);
                                        map.put(lValueOf, hfuVar);
                                        long j3 = hfuVar.a.a;
                                        InterleavedImageU8 interleavedImageU10 = hfuVar.b;
                                        long j4 = interleavedImageU10 == null ? 0L : interleavedImageU10.a;
                                        long j5 = hfuVar.c.a;
                                        PortraitRequest portraitRequest3 = hfuVar.d;
                                        try {
                                            portraitProcessorInterface.processImpl(portraitProcessorInterface.a, j2, j3, j4, j5, 0L, portraitRequest3 == null ? 0L : portraitRequest3.a, ((Integer) hfsVar.l.f.a(ddx.b).c()).intValue());
                                            hfsVar.l.i.remove(lValueOf);
                                            portraitProcessorInterface.close();
                                        } catch (Throwable th) {
                                            th = th;
                                            Throwable th2 = th;
                                            try {
                                                portraitProcessorInterface.close();
                                                throw th2;
                                            } catch (Throwable th3) {
                                                throw th2;
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    r2 = obj;
                                    try {
                                        throw th;
                                    } catch (Exception e) {
                                        e = e;
                                        ((oug) ((oug) ((oug) hfw.a.b()).h(e)).G((char) 2427)).o("Error processing the input image:");
                                        pihVar.a(e);
                                    }
                                }
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                    }
                } catch (Exception e2) {
                    e = e2;
                    pihVar = pihVar;
                }
            }
        });
        return pihVarF;
    }

    @Override // defpackage.gjt
    public final pht b() {
        return plk.V(false);
    }

    public final PortraitImageCallback c(final hft hftVar) {
        return new PortraitImageCallback() { // from class: hfp
            @Override // com.google.googlex.gcam.creativecamera.portraitmode.PortraitImageCallback
            public final void onImage(long j, long j2, int i, String str, String str2, String str3) {
                hftVar.a(j, msq.a((InterleavedImageU8) this.a.a.a(j2).c()), i, str2, str3);
            }
        };
    }
}
