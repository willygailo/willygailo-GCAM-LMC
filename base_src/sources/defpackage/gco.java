package defpackage;

import android.hardware.HardwareBuffer;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthResult;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils;
import com.google.android.apps.camera.moments.MomentsUtils;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.LockedHardwareBuffer;
import com.google.googlex.gcam.RawWriteView;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.YuvWriteView;
import com.google.googlex.gcam.image.ImageUtils;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class gco implements gcn {
    private final lis a;
    private final ojc b;
    private final pyn c;
    private final long d;
    private final DynamicDepthUtils e;
    private final pko f = new pko();
    private final ojc g;
    private final hkr h;

    public gco(lis lisVar, ojc ojcVar, pyn pynVar, long j, DynamicDepthUtils dynamicDepthUtils, ojc ojcVar2, hkr hkrVar) {
        this.a = lisVar.a(gco.class.getSimpleName());
        this.b = ojcVar;
        this.c = pynVar;
        this.d = j;
        this.e = dynamicDepthUtils;
        this.g = ojcVar2;
        this.h = hkrVar;
    }

    private final mad c(dot dotVar, mad madVar, gcm gcmVar) {
        long jNanoTime = System.nanoTime();
        try {
            dor dorVar = (dor) dotVar.a(new dos(madVar, gcmVar.a, (lzv) ((phq) gcmVar.c).b, ojc.h(this.h.d(((lxi) madVar).a)))).get();
            long jConvert = TimeUnit.MILLISECONDS.convert(System.nanoTime() - jNanoTime, TimeUnit.NANOSECONDS);
            lis lisVar = this.a;
            StringBuilder sb = new StringBuilder(73);
            sb.append("Post-processing - image transformer finished. Took ");
            sb.append(jConvert);
            sb.append("ms");
            lisVar.b(sb.toString());
            return dorVar.a();
        } catch (InterruptedException | ExecutionException e) {
            this.a.i("Couldn't apply post-processing", e);
            return madVar;
        }
    }

    private final mad d(HardwareBuffer hardwareBuffer, long j, ShotMetadata shotMetadata) {
        if (!this.b.g()) {
            return new lxi(hardwareBuffer, j);
        }
        HardwareBuffer hardwareBufferAllocateHardwareBuffer = MomentsUtils.allocateHardwareBuffer(hardwareBuffer.getWidth(), hardwareBuffer.getHeight(), hardwareBuffer.getFormat(), 1, this.d | 768);
        if (hardwareBufferAllocateHardwareBuffer == null) {
            this.a.d("Unable to allocate output buffer for rectiface, return image without warping.");
            return new lxi(hardwareBuffer, j);
        }
        if (((hli) this.b.c()).e(hardwareBuffer, hardwareBufferAllocateHardwareBuffer, shotMetadata)) {
            hardwareBuffer.close();
            return new lxi(hardwareBufferAllocateHardwareBuffer, j);
        }
        hardwareBufferAllocateHardwareBuffer.close();
        return new lxi(hardwareBuffer, j);
    }

    @Override // defpackage.gcn
    public final mad a(gcm gcmVar, YuvWriteView yuvWriteView, mad madVar, ShotMetadata shotMetadata) {
        ojc ojcVarI;
        HardwareBuffer hardwareBuffer;
        long jLongValue = gcmVar.b.longValue();
        if (!gcmVar.d) {
            ojcVarI = oih.a;
        } else if (!this.g.g()) {
            this.a.f("Fast bokeh controller is absent, skipping blur.");
            ojcVarI = oih.a;
        } else if (madVar.i()) {
            this.a.f("No PD data, skipping blur.");
            ojcVarI = oih.a;
        } else {
            ojc ojcVarA = this.f.a(madVar);
            if (ojcVarA.g()) {
                if (this.e.c((RawWriteView) ojcVarA.c(), yuvWriteView, new DynamicDepthResult(lig.h(yuvWriteView.c(), yuvWriteView.b()), lic.CLOCKWISE_0.ordinal(), false, false, null), shotMetadata)) {
                    InterleavedImageU8 interleavedImageU8 = (InterleavedImageU8) ((gfm) this.g.c()).a().first;
                    HardwareBuffer hardwareBufferCreate = HardwareBuffer.create(interleavedImageU8.b(), interleavedImageU8.a(), 3, 1, 51L);
                    LockedHardwareBuffer lockedHardwareBufferC = LockedHardwareBuffer.c(hardwareBufferCreate, 51L);
                    try {
                        ImageUtils.a(interleavedImageU8.c(), lockedHardwareBufferC.b());
                        lockedHardwareBufferC.close();
                        ojcVarI = ojc.i(hardwareBufferCreate);
                    } catch (Throwable th) {
                        try {
                            lockedHardwareBufferC.close();
                            throw th;
                        } catch (Throwable th2) {
                            throw th;
                        }
                    }
                } else {
                    this.a.h("Failed to create depth map, skipping blur.");
                    ojcVarI = oih.a;
                }
            } else {
                this.a.h("Unable to get RawWriteView from PD, skipping blur.");
                ojcVarI = oih.a;
            }
        }
        if (ojcVarI.g()) {
            hardwareBuffer = (HardwareBuffer) ojcVarI.c();
        } else {
            edo edoVar = new edo(yuvWriteView, madVar.d());
            int iC = edoVar.c();
            int iB = edoVar.b();
            HardwareBuffer hardwareBufferCreate2 = HardwareBuffer.create(iC, iB, 35, 1, 307L);
            mac macVar = (mac) edoVar.a.get(0);
            mac macVar2 = (mac) edoVar.a.get(1);
            mac macVar3 = (mac) edoVar.a.get(2);
            MomentsUtils.yuv2hwyuv(iC, iB, macVar.getBuffer(), macVar.getRowStride(), macVar.getPixelStride(), macVar2.getBuffer(), macVar2.getRowStride(), macVar2.getPixelStride(), macVar3.getBuffer(), macVar3.getRowStride(), macVar3.getPixelStride(), hardwareBufferCreate2);
            hardwareBuffer = hardwareBufferCreate2;
        }
        return c((dot) this.c.get(), d(hardwareBuffer, jLongValue, shotMetadata), gcmVar);
    }

    @Override // defpackage.gcn
    public final mad b(gcm gcmVar, HardwareBuffer hardwareBuffer, ShotMetadata shotMetadata) {
        return c((dot) this.c.get(), d(hardwareBuffer, gcmVar.b.longValue(), shotMetadata), gcmVar);
    }
}
