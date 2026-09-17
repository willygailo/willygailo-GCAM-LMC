package defpackage;

import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import android.hardware.camera2.params.Face;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.JpgEncodeOptions;
import com.google.googlex.gcam.PixelRect;
import com.google.googlex.gcam.PixelRectVector;
import com.google.googlex.gcam.PortraitRequest;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.StringFrameMetadataMap;
import com.google.googlex.gcam.StringStaticMetadataMap;
import com.google.googlex.gcam.hdrplus.HdrPlusInterface;
import com.google.googlex.gcam.image.YuvUtils;
import com.google.googlex.gcam.imageio.JpgHelper;

/* JADX INFO: loaded from: classes.dex */
public final class eay {
    private static final ouj b = ouj.h("com/google/android/apps/camera/hdrplus/HdrPlusPostProcessingPipeline");
    public final ljf a;
    private final ecg c;
    private final ecb d;
    private final ely e;
    private final ely f;
    private final ely g;
    private final ddf h;
    private final dkq i;
    private final ecs j;
    private final ghx k;
    private final gxm l;

    public eay(ecg ecgVar, ecb ecbVar, ghx ghxVar, pyn pynVar, pyn pynVar2, pyn pynVar3, ddf ddfVar, gxm gxmVar, dkq dkqVar, ecs ecsVar, ljf ljfVar, byte[] bArr) {
        this.c = ecgVar;
        this.d = ecbVar;
        this.e = ely.a(pynVar);
        this.k = ghxVar;
        this.f = ely.a(pynVar2);
        this.g = ely.a(pynVar3);
        this.h = ddfVar;
        this.l = gxmVar;
        this.i = dkqVar;
        this.j = ecsVar;
        this.a = ljfVar;
    }

    private static eac c(ecq ecqVar) {
        if (ecqVar.b != null) {
            return eac.YUV;
        }
        if (ecqVar.a != null) {
            return eac.RGB;
        }
        if (ecqVar.c != null) {
            return eac.RGB_HW;
        }
        throw new IllegalArgumentException("Unknown image format in PostprocessingImage.");
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0425  */
    /* JADX WARN: Code duplicated, block: B:111:0x042b  */
    /* JADX WARN: Code duplicated, block: B:113:0x0432  */
    /* JADX WARN: Code duplicated, block: B:115:0x043c  */
    /* JADX WARN: Code duplicated, block: B:116:0x043e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0446  */
    /* JADX WARN: Code duplicated, block: B:133:0x0484  */
    /* JADX WARN: Code duplicated, block: B:135:0x048a  */
    /* JADX WARN: Code duplicated, block: B:137:0x0491  */
    /* JADX WARN: Code duplicated, block: B:139:0x049b  */
    /* JADX WARN: Code duplicated, block: B:142:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:144:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:146:0x04be  */
    /* JADX WARN: Code duplicated, block: B:148:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:150:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:152:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:153:0x0508  */
    /* JADX WARN: Code duplicated, block: B:156:0x0543  */
    /* JADX WARN: Code duplicated, block: B:158:0x054b  */
    /* JADX WARN: Code duplicated, block: B:50:0x00db A[PHI: r1
      0x00db: PHI (r1v1 java.lang.Object) = (r1v40 java.lang.Object), (r1v41 java.lang.Object), (r1v42 java.lang.Object) binds: [B:44:0x00c3, B:46:0x00cd, B:48:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
    public final ojc a(dzu dzuVar, ojc ojcVar, boolean z) {
        ojc ojcVarI;
        boolean z2;
        Object obj;
        eay eayVar;
        ecq ecqVarA;
        ojc ojcVarI2;
        ecq ecqVar;
        ecg ecgVar;
        lig ligVarB;
        ShotMetadata shotMetadata;
        int iImageRotationToDegrees;
        ecq ecqVarC;
        ecq ecqVarC2;
        boolean z3;
        dzt dztVar;
        eac eacVar;
        dzu dzuVar2 = dzuVar;
        if (ojcVar.g()) {
            ecq ecqVar2 = (ecq) ojcVar.c();
            if (this.e.c()) {
                ((gfj) this.e.b()).m(ecqVar2.k.b.h(), ecqVar2.g);
            }
        }
        if (this.d == ecb.MOTION_BLUR) {
            return !ojcVar.g() ? ojc.i(eac.MUTABLE_MERGED_RAW) : oih.a;
        }
        if (z) {
            return !ojcVar.g() ? ojc.i(eac.MERGED_RAW) : oih.a;
        }
        if (ojcVar.g()) {
            ecq ecqVar3 = (ecq) ojcVar.c();
            if (ecqVar3.b != null) {
                eacVar = eac.YUV;
            } else if (ecqVar3.a != null) {
                eacVar = eac.RGB;
            } else {
                if (ecqVar3.c == null) {
                    throw new IllegalArgumentException("Unknown image format in PostprocessingImage.");
                }
                eacVar = eac.RGB_HW;
            }
            ojcVarI = ojc.i(eacVar);
        } else {
            ojcVarI = oih.a;
        }
        int iIntValue = ((Integer) this.h.a(ddy.a).c()).intValue();
        int iIntValue2 = ((Integer) this.h.a(ddy.a).c()).intValue();
        lwd lwdVarK = this.k.k();
        lwd lwdVar = lwd.FRONT;
        boolean z4 = iIntValue2 == 2 || iIntValue == 1;
        Object obj2 = dzuVar2;
        if (this.k.k() == lwd.FRONT && this.h.k(dda.g)) {
            dztVar = (dzt) dzuVar2;
            if (dztVar.a.b()) {
                obj2 = dzuVar2;
                obj2 = dztVar;
                z2 = true;
                obj = dztVar;
            } else {
                obj2 = dzuVar2;
                obj2 = dztVar;
                obj2 = dzuVar2;
                z2 = false;
                obj = obj2;
            }
        } else {
            obj2 = dzuVar2;
            obj2 = dztVar;
            obj2 = dzuVar2;
            z2 = false;
            obj = obj2;
        }
        ddf ddfVar = this.h;
        ddi ddiVar = dda.a;
        ddfVar.d();
        ddf ddfVar2 = this.h;
        ddi ddiVar2 = ddl.a;
        ddfVar2.e();
        boolean zD = this.l.d();
        dzt dztVar2 = (dzt) obj;
        boolean z5 = dztVar2.e;
        if (!this.f.c() || !(this.f.b() instanceof ecn)) {
            if ((iIntValue == 1 || (iIntValue2 == 2 && lwdVarK == lwdVar)) && dztVar2.d) {
                eayVar = this;
                if (eayVar.g.c()) {
                    if (!ojcVar.g()) {
                        return ojc.i(eac.RGB_HW);
                    }
                    ecq ecqVar4 = (ecq) ojcVar.c();
                    if (ecqVar4.a != null) {
                        ecqVarA = eayVar.j.a(ecqVar4);
                    } else {
                        HardwareBuffer hardwareBuffer = ecqVar4.c;
                        hardwareBuffer.getClass();
                        ecs ecsVar = eayVar.j;
                        hardwareBuffer.getClass();
                        boolean z6 = ecsVar.f == ecb.LONG_EXPOSURE;
                        hli hliVar = (hli) ((ojc) ecsVar.d.get()).c();
                        hlr hlrVarA = hliVar.a();
                        ddf ddfVar3 = ecsVar.g;
                        int i = ddb.a;
                        ddfVar3.d();
                        ecr ecrVar = new ecr(ecqVar4);
                        hardwareBuffer.getClass();
                        hliVar.g(hardwareBuffer, ecqVar4.d, z6, ecqVar4.k.b.s(), hlrVarA, ecqVar4.k.b.k(), ecrVar);
                        ecp ecpVarC = ecqVar4.c();
                        ecpVarC.h = hlrVarA;
                        ecqVarA = ecpVarC.a();
                    }
                    ojcVarI2 = ojc.i(ecqVarA);
                    hlr hlrVar = ecqVarA.l;
                    hlrVar.getClass();
                    eayVar.i.d(((ecq) ((ojj) ojcVarI2).a).k.b.h(), hlrVar);
                }
                ddf ddfVar4 = eayVar.h;
                int i2 = ddb.a;
                ddfVar4.b();
                eayVar.h.d();
                eayVar.h.d();
                if (ojcVarI2.g() && ((ecq) ojcVarI2.c()).c != null) {
                    ecs ecsVar2 = eayVar.j;
                    ecq ecqVar5 = (ecq) ojcVarI2.c();
                    HardwareBuffer hardwareBuffer2 = ecqVar5.c;
                    hardwareBuffer2.getClass();
                    InterleavedImageU8 interleavedImageU8B = ((hli) ((ojc) ecsVar2.d.get()).c()).b(hardwareBuffer2);
                    ecp ecpVarC2 = ecqVar5.c();
                    ecpVarC2.b();
                    ecpVarC2.a = interleavedImageU8B;
                    ojcVarI2 = ojc.i(ecpVarC2.a());
                }
                if (z2) {
                    if (!ojcVarI2.g()) {
                        return ojc.i(eac.YUV);
                    }
                    ecqVarC2 = (ecq) ojcVarI2.c();
                    if (ecqVarC2.c == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    obr.aQ(z3);
                    if (ecqVarC2.a != null) {
                        ecqVarC2 = ecs.c(ecqVarC2);
                    }
                    eayVar.j.b(ecqVarC2);
                    ojcVarI2 = ojc.i(ecqVarC2);
                }
                if (ojcVarI2.g() && zD) {
                    return ojc.i(eac.YUV);
                }
                if (ojcVarI2.g() && dztVar2.h) {
                    ecs ecsVar3 = eayVar.j;
                    ecq ecqVar6 = (ecq) ojcVarI2.c();
                    ecsVar3.b.b("Swiss not present. Returning without swiss.");
                    ojcVarI2 = ojc.i(ecqVar6);
                }
                if (z5) {
                    if (!ojcVarI2.g()) {
                        return ojc.i(eac.YUV);
                    }
                    ecqVarC = (ecq) ojcVarI2.c();
                    if (ecqVarC.a != null) {
                        ecqVarC = ecs.c(ecqVarC);
                    }
                    eayVar.c.b(ecqVarC, ead.a((eac) ojcVarI.c()));
                    return oih.a;
                }
                if (!ojcVarI2.g()) {
                    return ojc.i(eac.JPEG);
                }
                ecqVar = (ecq) ojcVarI2.c();
                if (ecqVar.b == null) {
                    eayVar.c.b(ecqVar, ead.a((eac) ojcVarI.c()));
                    return oih.a;
                }
                if (ecqVar.a != null) {
                    throw new IllegalStateException("Requested JPEG and still got uncompressed callback.");
                }
                ecgVar = eayVar.c;
                JpgEncodeOptions jpgEncodeOptions = new JpgEncodeOptions();
                InterleavedImageU8 interleavedImageU8 = ecqVar.a;
                interleavedImageU8.getClass();
                ligVarB = ecqVar.b();
                shotMetadata = ecqVar.d;
                if (ecgVar.b.k(ddl.bf)) {
                    iImageRotationToDegrees = GcamModuleJNI.ImageRotationToDegrees(shotMetadata.b());
                    plk.E(shotMetadata);
                    ligVarB = ligVarB.i(lic.b(iImageRotationToDegrees));
                    ecp ecpVarC3 = ecqVar.c();
                    ecpVarC3.e(lic.CLOCKWISE_0);
                    ecpVarC3.a();
                } else {
                    iImageRotationToDegrees = 0;
                }
                ExifInterface exifInterfaceA = dzy.a(ligVarB.a, ligVarB.b, ecqVar.d, ecqVar.k.b.m());
                ojc ojcVarA = JpgHelper.a(interleavedImageU8.c(), jpgEncodeOptions, iImageRotationToDegrees);
                interleavedImageU8.e();
                gog gogVar = ecqVar.k;
                ecgVar.a(gogVar, gogVar.a.f, ligVarB.a, ligVarB.b, (byte[]) ojcVarA.c(), ojc.i(exifInterfaceA));
                return oih.a;
            }
            eayVar = this;
            if (!z4) {
                if (ojcVar.g()) {
                    eayVar.i.d(((ecq) ojcVar.c()).k.b.h(), null);
                }
                ojcVarI2 = ojcVar;
            } else {
                if (!ojcVar.g()) {
                    return ojc.i(eac.RGB);
                }
                ((ecq) ojcVar.c()).a.getClass();
                ecq ecqVarA2 = eayVar.j.a((ecq) ojcVar.c());
                ojcVarI2 = ojc.i(ecqVarA2);
                hlr hlrVar2 = ecqVarA2.l;
                hlrVar2.getClass();
                eayVar.i.d(((ecq) ((ojj) ojcVarI2).a).k.b.h(), hlrVar2);
            }
            ddf ddfVar5 = eayVar.h;
            int i3 = ddb.a;
            ddfVar5.b();
            eayVar.h.d();
            eayVar.h.d();
            if (ojcVarI2.g()) {
                ecs ecsVar4 = eayVar.j;
                ecq ecqVar7 = (ecq) ojcVarI2.c();
                HardwareBuffer hardwareBuffer3 = ecqVar7.c;
                hardwareBuffer3.getClass();
                InterleavedImageU8 interleavedImageU8B2 = ((hli) ((ojc) ecsVar4.d.get()).c()).b(hardwareBuffer3);
                ecp ecpVarC4 = ecqVar7.c();
                ecpVarC4.b();
                ecpVarC4.a = interleavedImageU8B2;
                ojcVarI2 = ojc.i(ecpVarC4.a());
            }
            if (z2) {
                if (!ojcVarI2.g()) {
                    return ojc.i(eac.YUV);
                }
                ecqVarC2 = (ecq) ojcVarI2.c();
                if (ecqVarC2.c == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                obr.aQ(z3);
                if (ecqVarC2.a != null) {
                    ecqVarC2 = ecs.c(ecqVarC2);
                }
                eayVar.j.b(ecqVarC2);
                ojcVarI2 = ojc.i(ecqVarC2);
            }
            if (ojcVarI2.g()) {
            }
            if (ojcVarI2.g()) {
                ecs ecsVar5 = eayVar.j;
                ecq ecqVar8 = (ecq) ojcVarI2.c();
                ecsVar5.b.b("Swiss not present. Returning without swiss.");
                ojcVarI2 = ojc.i(ecqVar8);
            }
            if (z5) {
                if (!ojcVarI2.g()) {
                    return ojc.i(eac.YUV);
                }
                ecqVarC = (ecq) ojcVarI2.c();
                if (ecqVarC.a != null) {
                    ecqVarC = ecs.c(ecqVarC);
                }
                eayVar.c.b(ecqVarC, ead.a((eac) ojcVarI.c()));
                return oih.a;
            }
            if (!ojcVarI2.g()) {
                return ojc.i(eac.JPEG);
            }
            ecqVar = (ecq) ojcVarI2.c();
            if (ecqVar.b == null) {
                eayVar.c.b(ecqVar, ead.a((eac) ojcVarI.c()));
                return oih.a;
            }
            if (ecqVar.a != null) {
                throw new IllegalStateException("Requested JPEG and still got uncompressed callback.");
            }
            ecgVar = eayVar.c;
            JpgEncodeOptions jpgEncodeOptions2 = new JpgEncodeOptions();
            InterleavedImageU8 interleavedImageU9 = ecqVar.a;
            interleavedImageU9.getClass();
            ligVarB = ecqVar.b();
            shotMetadata = ecqVar.d;
            if (ecgVar.b.k(ddl.bf)) {
                iImageRotationToDegrees = GcamModuleJNI.ImageRotationToDegrees(shotMetadata.b());
                plk.E(shotMetadata);
                ligVarB = ligVarB.i(lic.b(iImageRotationToDegrees));
                ecp ecpVarC5 = ecqVar.c();
                ecpVarC5.e(lic.CLOCKWISE_0);
                ecpVarC5.a();
            } else {
                iImageRotationToDegrees = 0;
            }
            ExifInterface exifInterfaceA2 = dzy.a(ligVarB.a, ligVarB.b, ecqVar.d, ecqVar.k.b.m());
            ojc ojcVarA2 = JpgHelper.a(interleavedImageU9.c(), jpgEncodeOptions2, iImageRotationToDegrees);
            interleavedImageU9.e();
            gog gogVar2 = ecqVar.k;
            ecgVar.a(gogVar2, gogVar2.a.f, ligVarB.a, ligVarB.b, (byte[]) ojcVarA2.c(), ojc.i(exifInterfaceA2));
            return oih.a;
        }
        if (!ojcVar.g()) {
            return ojc.i(eac.YUV);
        }
        ecq ecqVar9 = (ecq) ojcVar.c();
        ecqVar9.b.getClass();
        this.j.b(ecqVar9);
        ecs ecsVar6 = this.j;
        edo edoVar = ecqVar9.b;
        edoVar.getClass();
        InterleavedImageU8 interleavedImageU10 = new InterleavedImageU8(edoVar.c(), edoVar.b(), 3);
        YuvUtils.a(ecsVar6.e.c(edoVar), interleavedImageU10.d());
        ecp ecpVarC6 = ecqVar9.c();
        ecpVarC6.b();
        ecpVarC6.a = interleavedImageU10;
        ecq ecqVarA3 = ecpVarC6.a();
        ecs ecsVar7 = this.j;
        eco ecoVarC = ((ecm) ecsVar7.h.c()).b(ecqVarA3.k);
        InterleavedImageU8 interleavedImageU11 = ecqVarA3.a;
        if (interleavedImageU11 == null) {
            throw new IllegalStateException("RGB for portrait processing unavailable");
        }
        String str = eci.a;
        HdrPlusInterface hdrPlusInterface = new HdrPlusInterface();
        eck eckVar = ecqVarA3.i;
        eckVar.getClass();
        long j = eckVar.a.a;
        int iB = interleavedImageU11.b();
        int iA = interleavedImageU11.a();
        ShotMetadata shotMetadata2 = ecqVarA3.d;
        int i4 = ecqVarA3.e.e;
        boolean zK = ecsVar7.g.k(ddl.bf);
        eck eckVar2 = ecqVarA3.i;
        eckVar2.getClass();
        gnq gnqVar = eckVar2.b;
        lig ligVar = ecsVar7.i.b;
        boolean z7 = ((dzt) ecqVarA3.h).d;
        PortraitRequest portraitRequest = new PortraitRequest();
        GcamModuleJNI.PortraitRequest_image_rotation_set(portraitRequest.a, portraitRequest, GcamModuleJNI.DegreesToImageRotation((360 - i4) % 360));
        GcamModuleJNI.PortraitRequest_manually_rotate_xmp_jpg_set(portraitRequest.a, portraitRequest, zK);
        PixelRectVector pixelRectVector = new PixelRectVector();
        Rect rect = gnqVar.b;
        float f = iB;
        float fWidth = f / rect.width();
        float fHeight = iA / rect.height();
        Face[] faceArr = gnqVar.a;
        int i5 = 0;
        while (true) {
            InterleavedImageU8 interleavedImageU12 = interleavedImageU11;
            if (i5 >= faceArr.length) {
                eco ecoVar = ecoVarC;
                GcamModuleJNI.PortraitRequest_faces_set(portraitRequest.a, portraitRequest, pixelRectVector.a, pixelRectVector);
                int i6 = ligVar.a;
                int i7 = ligVar.b;
                GcamModuleJNI.PortraitRequest_output_width_set(portraitRequest.a, portraitRequest, i6);
                GcamModuleJNI.PortraitRequest_output_height_set(portraitRequest.a, portraitRequest, i7);
                StringFrameMetadataMap stringFrameMetadataMap = new StringFrameMetadataMap(GcamModuleJNI.new_StringFrameMetadataMap__SWIG_0(), true);
                stringFrameMetadataMap.b(eci.a, shotMetadata2.f());
                GcamModuleJNI.PortraitRequest_frame_metadata_set(portraitRequest.a, portraitRequest, stringFrameMetadataMap.a, stringFrameMetadataMap);
                StringStaticMetadataMap stringStaticMetadataMap = new StringStaticMetadataMap(GcamModuleJNI.new_StringStaticMetadataMap__SWIG_0(), true);
                stringStaticMetadataMap.b(eci.a, shotMetadata2.g());
                GcamModuleJNI.PortraitRequest_static_metadata_set(portraitRequest.a, portraitRequest, stringStaticMetadataMap.a, stringStaticMetadataMap);
                GcamModuleJNI.PortraitRequest_post_resample_sharpening_set(portraitRequest.a, portraitRequest, hdrPlusInterface.getPostZoomSharpenStrength(j, i6 / f));
                GcamModuleJNI.PortraitRequest_output_format_primary_set(portraitRequest.a, portraitRequest, 3);
                GcamModuleJNI.PortraitRequest_use_internal_rectiface_set(portraitRequest.a, portraitRequest, z7);
                ecoVar.c(interleavedImageU12, portraitRequest, ecqVarA3.d, ecqVarA3.j, ecqVarA3.k.a.f);
                ecoVar.close();
                return oih.a;
            }
            Rect bounds = faceArr[i5].getBounds();
            Face[] faceArr2 = faceArr;
            PixelRect pixelRect = new PixelRect();
            pixelRect.d((int) ((bounds.left - rect.left) * fWidth));
            pixelRect.f((int) ((bounds.top - rect.top) * fHeight));
            pixelRect.e((int) ((bounds.right - rect.left) * fWidth));
            pixelRect.g((int) ((bounds.bottom - rect.top) * fHeight));
            pixelRectVector.a(pixelRect);
            i5++;
            faceArr = faceArr2;
            interleavedImageU11 = interleavedImageU12;
            ecoVarC = ecoVarC;
            z7 = z7;
        }
    }

    public ojc b(dzu dzuVar, ojc ojcVar, boolean z, boolean z2, String str) {
        Object[] objArr = {this, dzuVar, ojcVar, Boolean.valueOf(z), Boolean.valueOf(z2), str};
        return ojcVar;
    }
}
