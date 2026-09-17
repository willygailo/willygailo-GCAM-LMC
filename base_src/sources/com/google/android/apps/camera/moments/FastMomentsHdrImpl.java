package com.google.android.apps.camera.moments;

import android.hardware.HardwareBuffer;
import android.os.SystemClock;
import com.google.android.apps.camera.bottombar.R;
import com.google.android.apps.camera.moments.FastMomentsHdrImpl;
import com.google.googlex.gcam.AeShotParams;
import com.google.googlex.gcam.Gcam;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.NormalizedRect;
import com.google.googlex.gcam.RawWriteView;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.WeightedNormalizedRectVector;
import com.google.googlex.gcam.YuvImage;
import defpackage.bxy;
import defpackage.enl;
import defpackage.geo;
import defpackage.gep;
import defpackage.geq;
import defpackage.ger;
import defpackage.hcg;
import defpackage.lis;
import defpackage.lmr;
import defpackage.mad;
import defpackage.obr;
import defpackage.pko;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class FastMomentsHdrImpl implements geq {
    public final lis a;
    public final long b;
    public final Gcam c;
    public final pko d;
    private final Executor e;
    private final bxy f;

    public FastMomentsHdrImpl(lis lisVar, Gcam gcam, Executor executor, pko pkoVar, bxy bxyVar) {
        this.a = lisVar.a("FastMomentsHdr");
        this.c = gcam;
        this.e = executor;
        this.d = pkoVar;
        this.f = bxyVar;
        enl.b();
        this.b = createImpl();
    }

    private static native long createImpl();

    private static native void releaseImpl(long j);

    @Override // defpackage.geq
    public final void a() {
        this.e.execute(this.f.a(new Runnable() { // from class: gav
            @Override // java.lang.Runnable
            public final void run() {
                FastMomentsHdrImpl fastMomentsHdrImpl = this.a;
                fastMomentsHdrImpl.initializeProcessingQueueNative(fastMomentsHdrImpl.b, Gcam.a(fastMomentsHdrImpl.c));
            }
        }));
    }

    @Override // defpackage.geq
    public final void b(final mad madVar, final ger gerVar, final gep gepVar, final geo geoVar) {
        obr.aL(madVar.a() == 37, "Wrong format for input ImageProxy. Got %s, expected RAW10 (%s)", madVar.a(), 37);
        final HardwareBuffer hardwareBufferF = madVar.f();
        hardwareBufferF.getClass();
        obr.aG(gepVar.a.a % 4 == 0, "Only multiple of 4 widths are supported!");
        obr.aG(gepVar.a.b % 2 == 0, "Only multiple of 2 heights are supported!");
        final NormalizedRect normalizedRectA = gerVar.c.a();
        final ShotMetadata shotMetadata = gerVar.a;
        this.e.execute(new Runnable() { // from class: gaw
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                HardwareBuffer hardwareBuffer;
                AeShotParams aeShotParams;
                ger gerVar2;
                gep gepVar2;
                HardwareBuffer hardwareBufferProcessRaw10ToYuvHardwareBufferNative;
                FastMomentsHdrImpl fastMomentsHdrImpl = this.a;
                mad madVar2 = madVar;
                ger gerVar3 = gerVar;
                NormalizedRect normalizedRect = normalizedRectA;
                ShotMetadata shotMetadata2 = shotMetadata;
                gep gepVar3 = gepVar;
                HardwareBuffer hardwareBuffer2 = hardwareBufferF;
                geo geoVar2 = geoVar;
                try {
                    long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    RawWriteView rawWriteViewB = fastMomentsHdrImpl.d.b(madVar2);
                    AeShotParams aeShotParams2 = gerVar3.c;
                    AeShotParams aeShotParams3 = new AeShotParams(GcamModuleJNI.new_AeShotParams__SWIG_1(aeShotParams2.a, aeShotParams2), true);
                    aeShotParams3.h(false);
                    long j = aeShotParams3.a;
                    long jA = NormalizedRect.a(normalizedRect);
                    long jC = ShotMetadata.c(shotMetadata2);
                    lis lisVar = fastMomentsHdrImpl.a;
                    long jA2 = aeShotParams3.c().a();
                    String hexString = Long.toHexString(j);
                    WeightedNormalizedRectVector weightedNormalizedRectVectorC = aeShotParams3.c();
                    String hexString2 = Long.toHexString(weightedNormalizedRectVectorC == null ? 0L : weightedNormalizedRectVectorC.a);
                    StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + R.styleable.AppCompatTheme_tooltipFrameBackground + String.valueOf(hexString2).length());
                    sb.append("Processing moments HDR with ");
                    sb.append(jA2);
                    sb.append(" metering areas, shot params ptr=0x");
                    sb.append(hexString);
                    sb.append(", weighted_metering_areas ptr=0x");
                    sb.append(hexString2);
                    lisVar.b(sb.toString());
                    int i = gepVar3.d;
                    try {
                        if (i == 3) {
                            long j2 = fastMomentsHdrImpl.b;
                            long jA3 = Gcam.a(fastMomentsHdrImpl.c);
                            int i2 = gerVar3.b;
                            long jC2 = RawWriteView.c(rawWriteViewB);
                            lig ligVar = gepVar3.a;
                            aeShotParams = aeShotParams3;
                            hardwareBuffer = hardwareBuffer2;
                            long jProcessRaw10ToYuvImageNative = fastMomentsHdrImpl.processRaw10ToYuvImageNative(j2, jA3, i2, hardwareBuffer2, jC2, j, jA, ligVar.a, ligVar.b, jC, gepVar3.b);
                            long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
                            lis lisVar2 = fastMomentsHdrImpl.a;
                            long jConvert = TimeUnit.MILLISECONDS.convert(jElapsedRealtimeNanos2 - jElapsedRealtimeNanos, TimeUnit.NANOSECONDS);
                            StringBuilder sb2 = new StringBuilder(53);
                            sb2.append("processRaw10ToYuv, total time: ");
                            sb2.append(jConvert);
                            sb2.append("ms");
                            lisVar2.b(sb2.toString());
                            if (jProcessRaw10ToYuvImageNative == 0) {
                                geoVar2.a(new RuntimeException("Error processing raw10 to Yuv image"));
                            } else {
                                geoVar2.c(new YuvImage(jProcessRaw10ToYuvImageNative), gerVar3.a);
                            }
                        } else {
                            aeShotParams = aeShotParams3;
                            hardwareBuffer = hardwareBuffer2;
                            if (i == 1) {
                                long j3 = fastMomentsHdrImpl.b;
                                long jA4 = Gcam.a(fastMomentsHdrImpl.c);
                                int i3 = gerVar3.b;
                                long j4 = gepVar3.c;
                                long jC3 = RawWriteView.c(rawWriteViewB);
                                lig ligVar2 = gepVar3.a;
                                hardwareBufferProcessRaw10ToYuvHardwareBufferNative = fastMomentsHdrImpl.processRaw10ToRgbaHardwareBufferNative(j3, jA4, i3, j4, hardwareBuffer, jC3, j, jA, ligVar2.a, ligVar2.b, jC, gepVar3.b);
                                gerVar2 = gerVar3;
                                gepVar2 = gepVar3;
                            } else {
                                long j5 = fastMomentsHdrImpl.b;
                                long jA5 = Gcam.a(fastMomentsHdrImpl.c);
                                int i4 = gerVar3.b;
                                long j6 = gepVar3.c;
                                long jC4 = RawWriteView.c(rawWriteViewB);
                                lig ligVar3 = gepVar3.a;
                                gerVar2 = gerVar3;
                                gepVar2 = gepVar3;
                                hardwareBufferProcessRaw10ToYuvHardwareBufferNative = fastMomentsHdrImpl.processRaw10ToYuvHardwareBufferNative(j5, jA5, i4, j6, hardwareBuffer, jC4, j, jA, ligVar3.a, ligVar3.b, jC, gepVar3.b);
                            }
                            long jElapsedRealtimeNanos3 = SystemClock.elapsedRealtimeNanos();
                            lis lisVar3 = fastMomentsHdrImpl.a;
                            long jConvert2 = TimeUnit.MILLISECONDS.convert(jElapsedRealtimeNanos3 - jElapsedRealtimeNanos, TimeUnit.NANOSECONDS);
                            StringBuilder sb3 = new StringBuilder(64);
                            sb3.append("processRaw10ToHardwareBuffer, total time: ");
                            sb3.append(jConvert2);
                            sb3.append("ms");
                            lisVar3.b(sb3.toString());
                            if (hardwareBufferProcessRaw10ToYuvHardwareBufferNative == null) {
                                geoVar2.a(new RuntimeException("Error processing raw10 to HardwareBuffer"));
                            } else if (gepVar2.d == 1) {
                                r15.b(hardwareBufferProcessRaw10ToYuvHardwareBufferNative, gerVar2.a);
                            } else {
                                r15.d(hardwareBufferProcessRaw10ToYuvHardwareBufferNative, gerVar2.a);
                            }
                        }
                        aeShotParams.toString();
                        hardwareBuffer.close();
                    } catch (Throwable th) {
                        th = th;
                        hardwareBuffer.close();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    hardwareBuffer = hardwareBuffer2;
                }
            }
        });
    }

    @Override // defpackage.geq
    public final boolean c(lmr lmrVar, hcg hcgVar) {
        mad madVarE = hcgVar.a(lmrVar).e();
        try {
            if (madVarE == null) {
                this.a.d("No RAW10 image found in frame. Can't use FastMomentsHdr");
                return false;
            }
            HardwareBuffer hardwareBufferF = madVarE.f();
            boolean z = hardwareBufferF != null;
            if (hardwareBufferF != null) {
                hardwareBufferF.close();
            }
            madVarE.close();
            return z;
        } catch (Throwable th) {
            if (madVarE != null) {
                try {
                    madVarE.close();
                } catch (Throwable th2) {
                }
            }
            throw th;
        }
    }

    public final void finalize() {
        long j = this.b;
        if (j != 0) {
            releaseImpl(j);
        }
    }

    public native void initializeProcessingQueueNative(long j, long j2);

    public native HardwareBuffer processRaw10ToRgbaHardwareBufferNative(long j, long j2, int i, long j3, HardwareBuffer hardwareBuffer, long j4, long j5, long j6, int i2, int i3, long j7, int i4);

    public native HardwareBuffer processRaw10ToYuvHardwareBufferNative(long j, long j2, int i, long j3, HardwareBuffer hardwareBuffer, long j4, long j5, long j6, int i2, int i3, long j7, int i4);

    public native long processRaw10ToYuvImageNative(long j, long j2, int i, HardwareBuffer hardwareBuffer, long j3, long j4, long j5, int i2, int i3, long j6, int i4);
}
