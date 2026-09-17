package com.google.android.apps.camera.rectiface.jni;

import android.graphics.Bitmap;
import android.hardware.HardwareBuffer;
import android.os.Build;
import com.google.android.apps.camera.rectiface.Rectiface$RectifaceProgressCallback;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.JpgEncodeOptions;
import com.google.googlex.gcam.LockedHardwareBuffer;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.image.ImageUtils;
import com.google.googlex.gcam.imageio.JpgHelper;
import defpackage.ddf;
import defpackage.ddl;
import defpackage.dds;
import defpackage.ddy;
import defpackage.hgl;
import defpackage.hgm;
import defpackage.hli;
import defpackage.hlr;
import defpackage.hls;
import defpackage.iij;
import defpackage.iik;
import defpackage.lda;
import defpackage.lie;
import defpackage.obr;
import defpackage.ojc;
import defpackage.oug;
import defpackage.ouj;
import defpackage.oxh;
import defpackage.pbg;
import defpackage.plk;
import defpackage.poy;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;

/* JADX INFO: loaded from: classes.dex */
public final class RectifaceImpl implements hli, lie {
    private static final ouj a = ouj.h("com/google/android/apps/camera/rectiface/jni/RectifaceImpl");
    private final ddf b;
    private long c = 0;
    private long d = 0;
    private boolean e = false;
    private int f;
    private final hgm g;
    private final hgl h;
    private final lda i;

    static {
        hls.a();
    }

    public RectifaceImpl(hgm hgmVar, hgl hglVar, lda ldaVar, ddf ddfVar) {
        this.g = hgmVar;
        this.h = hglVar;
        this.i = ldaVar;
        this.b = ddfVar;
    }

    private static native void copyRgbaToRgbImpl(long j, long j2, long j3, boolean z);

    private static native String correctFaceDistortionAHWBImpl(HardwareBuffer hardwareBuffer, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j5, Rectiface$RectifaceProgressCallback rectiface$RectifaceProgressCallback, long j6);

    private static native String correctFaceDistortionImpl(long j, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j6, Rectiface$RectifaceProgressCallback rectiface$RectifaceProgressCallback, long j7);

    private static native boolean correctLensDistortionAHWBZeroCopyImpl(HardwareBuffer hardwareBuffer, HardwareBuffer hardwareBuffer2, long j, long j2);

    private static native boolean correctLensDistortionImpl(Bitmap bitmap, long j);

    private static native long initializeLensCorrectionImpl(int i, int i2);

    private static native long initializeSegmenterImpl(long j, int i, String str, String str2, int i2);

    private final void l(HardwareBuffer hardwareBuffer, ShotMetadata shotMetadata, int i, String str) {
        LockedHardwareBuffer lockedHardwareBufferC = LockedHardwareBuffer.c(hardwareBuffer, 2L);
        try {
            InterleavedReadViewU8 interleavedReadViewU8A = lockedHardwareBufferC.a();
            InterleavedImageU8 interleavedImageU8 = new InterleavedImageU8(interleavedReadViewU8A.d(), interleavedReadViewU8A.c(), interleavedReadViewU8A.b());
            ImageUtils.a(interleavedReadViewU8A, interleavedImageU8.d());
            m(interleavedImageU8.c(), shotMetadata, i, str);
            lockedHardwareBufferC.close();
        } catch (Throwable th) {
            try {
                lockedHardwareBufferC.close();
            } catch (Throwable th2) {
            }
            throw th;
        }
    }

    private final void m(InterleavedReadViewU8 interleavedReadViewU8, ShotMetadata shotMetadata, int i, String str) {
        int iImageRotationToDegrees;
        String str2;
        try {
            if (this.b.k(ddl.bf)) {
                iImageRotationToDegrees = GcamModuleJNI.ImageRotationToDegrees(shotMetadata.b());
                plk.E(shotMetadata);
            } else {
                iImageRotationToDegrees = 0;
            }
            Path path = Paths.get("sdcard", "DCIM", "CAMERA", str);
            Files.createDirectories(path, new FileAttribute[0]);
            JpgEncodeOptions jpgEncodeOptions = new JpgEncodeOptions();
            GcamModuleJNI.JpgEncodeOptions_quality_set(jpgEncodeOptions.a, jpgEncodeOptions, 80);
            GcamModuleJNI.JpgEncodeOptions_shot_metadata_set(jpgEncodeOptions.a, jpgEncodeOptions, ShotMetadata.c(shotMetadata), shotMetadata);
            ojc ojcVarA = JpgHelper.a(interleavedReadViewU8, jpgEncodeOptions, iImageRotationToDegrees);
            switch (i - 1) {
                case 0:
                    str2 = "input";
                    break;
                default:
                    str2 = "output";
                    break;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5 + str2.length());
            sb.append(str);
            sb.append("_");
            sb.append(str2);
            sb.append(".jpg");
            FileOutputStream fileOutputStream = new FileOutputStream(Files.createFile(path.resolve(sb.toString()), new FileAttribute[0]).toFile());
            fileOutputStream.write((byte[]) ojcVarA.c());
            fileOutputStream.close();
        } catch (Exception e) {
        }
    }

    private static final void n(ShotMetadata shotMetadata) {
        shotMetadata.m(String.valueOf(shotMetadata.h()).concat("Skipped Rectiface since the module is not initialized."));
        ((oug) ((oug) a.c()).G((char) 2534)).r("%s", "Skipped Rectiface since the module is not initialized.");
    }

    private static native void releaseSegmenterImpl(long j);

    @Override // defpackage.hli
    public final hlr a() {
        RectifaceWarpfieldImpl rectifaceWarpfieldImpl = new RectifaceWarpfieldImpl();
        if (rectifaceWarpfieldImpl.b == 0) {
            rectifaceWarpfieldImpl.b = RectifaceWarpfieldImpl.initializeImpl();
        }
        ((oug) ((oug) RectifaceWarpfieldImpl.a.c()).G((char) 2539)).o("Ignored Rectiface warpfield re-initialization.");
        obr.aR(rectifaceWarpfieldImpl.b != 0, "Invalid rectiface warpfield.");
        return rectifaceWarpfieldImpl;
    }

    @Override // defpackage.hli
    public final InterleavedImageU8 b(HardwareBuffer hardwareBuffer) {
        obr.aG(hardwareBuffer.getFormat() == 1, "HardwareBuffer format unexpected.");
        LockedHardwareBuffer lockedHardwareBufferC = LockedHardwareBuffer.c(hardwareBuffer, 2L);
        try {
            InterleavedReadViewU8 interleavedReadViewU8A = lockedHardwareBufferC.a();
            obr.aF(interleavedReadViewU8A.b() == 4);
            InterleavedImageU8 interleavedImageU8 = new InterleavedImageU8(interleavedReadViewU8A.d(), interleavedReadViewU8A.c(), 3);
            InterleavedWriteViewU8 interleavedWriteViewU8D = interleavedImageU8.d();
            obr.aG(interleavedReadViewU8A.b() == 4, "Expect srcBuffer in RGBA8 format.");
            obr.aG(GcamModuleJNI.InterleavedWriteViewU8_channels(interleavedWriteViewU8D.a, interleavedWriteViewU8D) == 3, "Expect dstBuffer in RGB8 format.");
            obr.aF(interleavedReadViewU8A.d() == GcamModuleJNI.InterleavedWriteViewU8_width(interleavedWriteViewU8D.a, interleavedWriteViewU8D));
            obr.aF(interleavedReadViewU8A.c() == GcamModuleJNI.InterleavedWriteViewU8_height(interleavedWriteViewU8D.a, interleavedWriteViewU8D));
            copyRgbaToRgbImpl(interleavedReadViewU8A.a, InterleavedWriteViewU8.a(interleavedWriteViewU8D), this.c, this.e);
            lockedHardwareBufferC.close();
            hardwareBuffer.close();
            return interleavedImageU8;
        } catch (Throwable th) {
            try {
                lockedHardwareBufferC.close();
            } catch (Throwable th2) {
            }
            throw th;
        }
    }

    @Override // defpackage.hli
    public final void c(Bitmap bitmap, ShotMetadata shotMetadata) {
        bitmap.getClass();
        if (correctLensDistortionImpl(bitmap, ShotMetadata.c(shotMetadata))) {
            return;
        }
        ((oug) ((oug) a.b()).G((char) 2530)).o("Lens correction failed.");
    }

    @Override // java.lang.AutoCloseable, defpackage.lie
    public final void close() {
        this.e = false;
        long j = this.c;
        if (j != 0) {
            releaseSegmenterImpl(j);
            this.c = 0L;
        }
        long j2 = this.d;
        if (j2 != 0) {
            releaseSegmenterImpl(j2);
            this.d = 0L;
        }
    }

    @Override // defpackage.hli
    public final void d() {
        hgm hgmVar;
        if (this.c != 0 || (hgmVar = this.g) == null) {
            ((oug) ((oug) a.c()).G((char) 2531)).o("Ignored Rectiface (Segmenter) re-initialization.");
        } else {
            if (hgmVar.a() == 0 && f()) {
                ((oug) ((oug) a.c()).G((char) 2533)).o("Expected portrait segmenter to be initialized, but it wasn't. Initializing again.");
                this.g.b();
            }
            long jA = this.g.a();
            String str = Build.MANUFACTURER;
            str.getClass();
            String str2 = Build.DEVICE;
            str2.getClass();
            this.c = initializeSegmenterImpl(jA, 8, str, str2, 0);
            int i = (this.b.k(dds.S) && this.b.k(dds.q)) ? 1 : 0;
            this.f = i;
            this.d = initializeLensCorrectionImpl(8, i);
        }
        obr.aR(this.c != 0, "Invalid segmenter.");
        if (this.h.a() == 0 && i()) {
            ((oug) ((oug) a.c()).G((char) 2532)).o("Expected firefly to be initialized, but it wasn't. Initializing again.");
            this.h.d();
        }
        this.e = true;
    }

    @Override // defpackage.hli
    public final boolean e(HardwareBuffer hardwareBuffer, HardwareBuffer hardwareBuffer2, ShotMetadata shotMetadata) {
        if ((this.f != 1 || hardwareBuffer.getFormat() == 35) && (this.f != 0 || hardwareBuffer.getFormat() == 1)) {
            hardwareBuffer.getClass();
            return correctLensDistortionAHWBZeroCopyImpl(hardwareBuffer, hardwareBuffer2, ShotMetadata.c(shotMetadata), this.d);
        }
        ((oug) ((oug) a.c()).G((char) 2538)).o("Lens distortion correction skipped because of format mismatch.");
        return false;
    }

    @Override // defpackage.hli
    public final boolean f() {
        return this.b.k(ddy.i);
    }

    @Override // defpackage.hli
    public final void g(HardwareBuffer hardwareBuffer, ShotMetadata shotMetadata, boolean z, String str, hlr hlrVar, iij iijVar, Rectiface$RectifaceProgressCallback rectiface$RectifaceProgressCallback) {
        boolean z2;
        if (!this.e) {
            n(shotMetadata);
            return;
        }
        if (this.b.k(ddy.b)) {
            boolean z3 = !str.isEmpty() && this.b.k(ddy.h);
            Boolean boolValueOf = Boolean.valueOf(z3);
            if (boolValueOf.booleanValue()) {
                l(hardwareBuffer, shotMetadata, 1, str);
            }
            RectifaceOutput rectifaceOutput = new RectifaceOutput();
            long jC = ShotMetadata.c(shotMetadata);
            long j = this.c;
            long j2 = ((RectifaceWarpfieldImpl) hlrVar).b;
            long jA = this.h.a();
            boolean zK = k();
            boolean zJ = j(shotMetadata);
            boolean zK2 = this.b.k(ddy.e);
            boolean z4 = this.b.k(ddy.f) || z;
            boolean z5 = (!this.b.k(ddy.g) && f() && ((Boolean) this.i.fA()).booleanValue()) ? false : true;
            RectifaceOutput rectifaceOutput2 = rectifaceOutput;
            correctFaceDistortionAHWBImpl(hardwareBuffer, jC, j, j2, jA, zK, zJ, zK2, z4, z5, rectifaceOutput.a, rectiface$RectifaceProgressCallback, 0L);
            if (boolValueOf.booleanValue()) {
                l(hardwareBuffer, shotMetadata, 2, str);
            }
            if (iijVar != null) {
                poy poyVarM = pbg.i.m();
                int i = oxh.r()[rectifaceOutput2.i()];
                if (poyVarM.c) {
                    poyVarM.m();
                    z2 = false;
                    poyVarM.c = false;
                } else {
                    z2 = false;
                }
                pbg pbgVar = (pbg) poyVarM.b;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                pbgVar.b = i2;
                pbgVar.a |= 1;
                int iC = rectifaceOutput2.c();
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = z2;
                }
                pbg pbgVar2 = (pbg) poyVarM.b;
                pbgVar2.a = 2 | pbgVar2.a;
                pbgVar2.e = iC;
                int iF = rectifaceOutput2.f();
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = z2;
                }
                pbg pbgVar3 = (pbg) poyVarM.b;
                pbgVar3.a |= 16;
                pbgVar3.g = iF;
                int iH = rectifaceOutput2.h();
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = z2;
                }
                pbg pbgVar4 = (pbg) poyVarM.b;
                pbgVar4.a |= 8;
                pbgVar4.f = iH;
                int iG = rectifaceOutput2.g();
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = z2;
                }
                pbg pbgVar5 = (pbg) poyVarM.b;
                pbgVar5.a |= 64;
                pbgVar5.h = iG;
                if (rectifaceOutput2.e() > 0) {
                    for (int i3 = 0; i3 < rectifaceOutput2.e(); i3++) {
                        poyVarM.y(rectifaceOutput2.b(i3));
                    }
                }
                if (rectifaceOutput2.d() > 0) {
                    for (int i4 = 0; i4 < rectifaceOutput2.d(); i4++) {
                        poyVarM.x(rectifaceOutput2.a(i4));
                    }
                }
                ((iik) iijVar).q = (pbg) poyVarM.j();
            } else {
                rectifaceOutput2 = rectifaceOutput2;
            }
            rectifaceOutput2.j();
        }
    }

    @Override // defpackage.hli
    public final void h(InterleavedWriteViewU8 interleavedWriteViewU8, ShotMetadata shotMetadata, boolean z, String str, hlr hlrVar, iij iijVar, Rectiface$RectifaceProgressCallback rectiface$RectifaceProgressCallback) {
        if (!this.e) {
            n(shotMetadata);
            return;
        }
        if (this.b.k(ddy.b)) {
            boolean z2 = !str.isEmpty() && this.b.k(ddy.h);
            Boolean boolValueOf = Boolean.valueOf(z2);
            if (boolValueOf.booleanValue()) {
                m(interleavedWriteViewU8.b(), shotMetadata, 1, str);
            }
            RectifaceOutput rectifaceOutput = new RectifaceOutput();
            long jA = InterleavedWriteViewU8.a(interleavedWriteViewU8);
            long jC = ShotMetadata.c(shotMetadata);
            long j = this.c;
            long j2 = ((RectifaceWarpfieldImpl) hlrVar).b;
            long jA2 = this.h.a();
            boolean zK = k();
            boolean zJ = j(shotMetadata);
            boolean zK2 = this.b.k(ddy.e);
            boolean z3 = this.b.k(ddy.f) || z;
            boolean z4 = this.b.k(ddy.g) || !f();
            String strCorrectFaceDistortionImpl = correctFaceDistortionImpl(jA, jC, j, j2, jA2, zK, zJ, zK2, z3, z4, rectifaceOutput.a, rectiface$RectifaceProgressCallback, 0L);
            if (boolValueOf.booleanValue()) {
                m(interleavedWriteViewU8.b(), shotMetadata, 2, str);
            }
            String strValueOf = String.valueOf(shotMetadata.h());
            String strValueOf2 = String.valueOf(strCorrectFaceDistortionImpl);
            shotMetadata.m(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
            if (iijVar != null) {
                poy poyVarM = pbg.i.m();
                int i = oxh.r()[rectifaceOutput.i()];
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                pbg pbgVar = (pbg) poyVarM.b;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                pbgVar.b = i2;
                pbgVar.a |= 1;
                int iC = rectifaceOutput.c();
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                pbg pbgVar2 = (pbg) poyVarM.b;
                pbgVar2.a |= 2;
                pbgVar2.e = iC;
                int iF = rectifaceOutput.f();
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                pbg pbgVar3 = (pbg) poyVarM.b;
                pbgVar3.a |= 16;
                pbgVar3.g = iF;
                int iH = rectifaceOutput.h();
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                pbg pbgVar4 = (pbg) poyVarM.b;
                pbgVar4.a |= 8;
                pbgVar4.f = iH;
                int iG = rectifaceOutput.g();
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                pbg pbgVar5 = (pbg) poyVarM.b;
                pbgVar5.a |= 64;
                pbgVar5.h = iG;
                if (rectifaceOutput.e() > 0) {
                    for (int i3 = 0; i3 < rectifaceOutput.e(); i3++) {
                        poyVarM.y(rectifaceOutput.b(i3));
                    }
                }
                if (rectifaceOutput.d() > 0) {
                    float[] fArr = new float[rectifaceOutput.d()];
                    for (int i4 = 0; i4 < rectifaceOutput.d(); i4++) {
                        poyVarM.x(rectifaceOutput.a(i4));
                    }
                }
                ((iik) iijVar).q = (pbg) poyVarM.j();
            }
            rectifaceOutput.j();
        }
    }

    public final boolean i() {
        return this.b.k(ddy.c);
    }

    public final boolean j(ShotMetadata shotMetadata) {
        return !this.b.k(ddy.d) || (((Integer) this.b.a(ddy.a).c()).intValue() == 2 && shotMetadata.g().a() == 1);
    }

    public final boolean k() {
        return (i() && f() && ((Boolean) this.i.fA()).booleanValue()) ? false : true;
    }
}
