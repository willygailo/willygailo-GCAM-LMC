package defpackage;

import com.google.android.apps.camera.dynamicdepth.DynamicDepthResult;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils;
import com.google.googlex.gcam.BufferUtils;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.GrayWriteViewU16;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.YuvWriteView;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class heg extends hdu {
    private final boolean e;
    private final brg f;
    private final lig g;
    private final hgm h;

    public heg(hgm hgmVar, dkq dkqVar, DynamicDepthUtils dynamicDepthUtils, hcg hcgVar, dzv dzvVar, Executor executor, hoh hohVar, brg brgVar, gsf gsfVar, hvj hvjVar, ljf ljfVar, nvb nvbVar, byte[] bArr, byte[] bArr2) {
        super(dkqVar, dynamicDepthUtils, hcgVar, dzvVar, brgVar, gsfVar, hvjVar, executor, ljfVar, nvbVar, null, null);
        this.e = hohVar.e(lwd.FRONT);
        this.f = brgVar;
        this.g = gsfVar.b;
        this.h = hgmVar;
    }

    @Override // defpackage.hdu
    protected final DynamicDepthResult j(hcf hcfVar, hdv hdvVar) throws Throwable {
        long jA;
        mad madVar;
        ljf ljfVar;
        mad madVarG = hcfVar.g();
        mad madVarC = hcfVar.c(hcfVar.b.f);
        hdvVar.d();
        if (madVarC == null || madVarG == null) {
            if (madVarC != null) {
                madVarC.close();
            }
            if (madVarG == 0) {
                return null;
            }
            madVarG.close();
            return null;
        }
        boolean zA = this.b.a();
        if (zA) {
            hgm hgmVar = this.h;
            if (hgmVar == null) {
                return null;
            }
            if (hgmVar.a() == 0) {
                this.h.b();
            }
            jA = this.h.a();
        } else {
            jA = 0;
        }
        hdvVar.b.b.h();
        this.b.c();
        try {
            ShotMetadata shotMetadata = (ShotMetadata) hdvVar.e.get();
            this.d.e("udepth#process");
            DynamicDepthResult dynamicDepthResult = new DynamicDepthResult(this.g, this.f.b().ordinal(), this.e, ((dzt) hdvVar.c).f, hcfVar.a.c());
            pko pkoVar = new pko();
            int iA = madVarC.a();
            List listG = madVarC.g();
            obr.aI(listG.size() == 1, "Should have a single depth plane, has: %s", listG.size());
            obr.aI(iA == 1144402265, "Unsupported format: %s", iA);
            ByteBuffer buffer = ((mac) listG.get(0)).getBuffer();
            int iRemaining = buffer.remaining();
            int pixelStride = ((mac) listG.get(0)).getPixelStride();
            obr.aG(pixelStride == 2, "Pixel stride should be two bytes.");
            int iC = madVarC.c();
            int iB = madVarC.b();
            int rowStride = ((mac) listG.get(0)).getRowStride();
            int i = rowStride / 2;
            int i2 = pixelStride * iC;
            obr.aL(rowStride >= i2, "The row stride (%s bytes) should be greater than or equal to the width (%s bytes)", rowStride, i2);
            obr.aO(iRemaining == rowStride * iB, "The buffer capacity (%s) should be equal to the row stride in bytes (%s) multiplied by the height (%s).", Integer.valueOf(iRemaining), Integer.valueOf(rowStride), Integer.valueOf(iB));
            GrayWriteViewU16 grayWriteViewU16 = (GrayWriteViewU16) ((ojj) ojc.i(new GrayWriteViewU16(GcamModuleJNI.new_GrayWriteViewU16__SWIG_1(iC, iB, 1, BufferUtils.a(buffer), i)))).a;
            madVar = madVarG;
            try {
                if (DynamicDepthUtils.createDynamicDepthFromUltradepthImpl(jA, grayWriteViewU16.a, YuvWriteView.e(pkoVar.c(madVarG)), ShotMetadata.c(shotMetadata), zA, dynamicDepthResult.a)) {
                    this.d.f();
                    madVarC.close();
                    madVar.close();
                    return dynamicDepthResult;
                }
                dynamicDepthResult.close();
                madVar.close();
                ljfVar = this.d;
            } catch (Exception e) {
                ljfVar = this.d;
            } catch (Throwable th) {
                th = th;
                this.d.f();
                madVarC.close();
                madVar.close();
                throw th;
            }
        } catch (Exception e2) {
            madVar = madVarG;
        } catch (Throwable th2) {
            th = th2;
            madVar = madVarG;
        }
        ljfVar.f();
        madVarC.close();
        madVar.close();
        return null;
    }
}
