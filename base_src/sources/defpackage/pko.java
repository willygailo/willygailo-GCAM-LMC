package defpackage;

import android.util.Log;
import com.google.android.apps.camera.bottombar.R;
import com.google.googlex.gcam.BufferUtils;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.RawWriteView;
import com.google.googlex.gcam.YuvWriteView;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class pko {
    private static final String a = pko.class.getSimpleName();

    public final ojc a(mad madVar) {
        int i;
        int i2;
        int iA = madVar.a();
        List listG = madVar.g();
        if (iA != 257 && iA != 4098 && iA != 4099) {
            String str = a;
            StringBuilder sb = new StringBuilder(34);
            sb.append("Unsupported PD format: ");
            sb.append(iA);
            Log.e(str, sb.toString());
            return oih.a;
        }
        obr.aI(listG.size() == 1, "Should have a single PD plane, has: %s", listG.size());
        ByteBuffer buffer = ((mac) listG.get(0)).getBuffer();
        int iRemaining = buffer.remaining();
        int iC = 2016;
        if (iA == 257) {
            if (iRemaining % 8064 != 0) {
                String str2 = a;
                StringBuilder sb2 = new StringBuilder(96);
                sb2.append("The row stride in bytes (8064) should evenly divide the PD buffer capacity (");
                sb2.append(iRemaining);
                sb2.append(").");
                Log.e(str2, sb2.toString());
                return oih.a;
            }
            int i3 = iRemaining / 8064;
            if (i3 != 756 && i3 != 758) {
                String str3 = a;
                StringBuilder sb3 = new StringBuilder(R.styleable.AppCompatTheme_tooltipForegroundColor);
                sb3.append("The inferred PD data height for DEPTH_POINT_CLOUD formatted Images should be one of 756 or 758, but is ");
                sb3.append(i3);
                Log.e(str3, sb3.toString());
                return oih.a;
            }
            i = i3;
            i2 = 4032;
        } else {
            if (iA == 4099) {
                return ojc.i(b(madVar));
            }
            obr.aG(madVar.c() % 2 == 0, "Image width should be divisible by the number of channels.");
            int pixelStride = ((mac) listG.get(0)).getPixelStride();
            obr.aG(pixelStride == 2, "Pixel stride should be two bytes.");
            iC = madVar.c() / 2;
            int iB = madVar.b();
            int rowStride = ((mac) listG.get(0)).getRowStride();
            int i4 = rowStride / 2;
            int i5 = (iC + iC) * pixelStride;
            obr.aL(rowStride >= i5, "The row stride (%s bytes) should be greater than or equal to the width (%s bytes)", rowStride, i5);
            obr.aO(iRemaining == rowStride * iB, "The buffer capacity (%s) should be equal to the row stride in bytes (%s) multiplied by the height (%s).", Integer.valueOf(iRemaining), Integer.valueOf(rowStride), Integer.valueOf(iB));
            i = iB;
            i2 = i4;
        }
        return ojc.i(new RawWriteView(iC + iC, i, i2, 1, new pjk(BufferUtils.a(buffer))));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071  */
    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0089  */
    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    public final RawWriteView b(mad madVar) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        int i2;
        int i3;
        int iC = madVar.c();
        int iB = madVar.b();
        int iA = madVar.a();
        List listG = madVar.g();
        int pixelStride = ((mac) listG.get(0)).getPixelStride();
        int rowStride = ((mac) listG.get(0)).getRowStride();
        obr.aI(d(iA), "Unsupported raw format: %s. Should must be a compatible image format.", iA);
        obr.aL(iC % 2 == 0 && iB % 2 == 0, "Should have even dimensions, but was: %sx%s", iC, iB);
        obr.aI(listG.size() == 1, "Should have a single RAW_SENSOR plane, has: %s", listG.size());
        if (iA == 32) {
            obr.aI(pixelStride == 2, "Unexpected RAW_SENSOR pixel stride: %s", pixelStride);
        } else if (iA == 37) {
            if (iC % 4 == 0) {
                z = true;
            } else {
                z = false;
            }
            obr.aL(z, "RAW10 image width should be divisible by 4, but was: %sx%s", iC, iB);
            if (pixelStride == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            obr.aI(z2, "Unexpected RAW10 pixel stride: %s", pixelStride);
            i = (iC * 5) / 4;
            if (rowStride >= i) {
                z3 = true;
            } else {
                z3 = false;
            }
            obr.aL(z3, "RAW10 row stride %s should be at least %s", rowStride, i);
        } else if (iA == 4099) {
            iA = 4099;
            if (iC % 4 == 0) {
                z = true;
            } else {
                z = false;
            }
            obr.aL(z, "RAW10 image width should be divisible by 4, but was: %sx%s", iC, iB);
            if (pixelStride == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            obr.aI(z2, "Unexpected RAW10 pixel stride: %s", pixelStride);
            i = (iC * 5) / 4;
            if (rowStride >= i) {
                z3 = true;
            } else {
                z3 = false;
            }
            obr.aL(z3, "RAW10 row stride %s should be at least %s", rowStride, i);
        }
        pjk pjkVar = new pjk(BufferUtils.a(((mac) listG.get(0)).getBuffer()));
        if (iA == 37 || iA == 4099) {
            i2 = rowStride;
            i3 = 0;
        } else {
            i2 = rowStride / 2;
            i3 = 1;
        }
        return new RawWriteView(iC, iB, i2, i3, pjkVar);
    }

    public final YuvWriteView c(mad madVar) {
        int iC = madVar.c();
        int iB = madVar.b();
        int iC2 = madVar.c();
        int iB2 = madVar.b();
        obr.aG(iC2 % 2 == 0, "A YUV image must have even width.");
        obr.aG(iB2 % 2 == 0, "A YUV image must have even height.");
        obr.aG(madVar.a() == 35, "Format is not YUV_420_888");
        List listG = madVar.g();
        obr.aI(listG.size() == 3, "A YUV image must have %s planes.", 3);
        mac macVar = (mac) listG.get(0);
        mac macVar2 = (mac) listG.get(1);
        mac macVar3 = (mac) listG.get(2);
        long jA = BufferUtils.a(macVar.getBuffer());
        long jA2 = BufferUtils.a(macVar2.getBuffer());
        long jA3 = BufferUtils.a(macVar3.getBuffer());
        obr.aG(macVar.getPixelStride() == 1, "Y plane's pixel stride is not 1");
        obr.aG(macVar.getRowStride() >= madVar.c(), "Y plane's row stride smaller than image width");
        obr.aG(macVar2.getRowStride() >= madVar.c(), "U plane's row stride smaller than image width");
        obr.aG(macVar2.getRowStride() == macVar3.getRowStride(), "U and V planes have different row strides");
        obr.aG(jA != 0, "luma plane address cannot be 0 (NULL).");
        obr.aG(jA2 != 0, "chroma U plane address cannot be 0 (NULL).");
        obr.aG(jA3 != 0, "chroma V plane address cannot be 0 (NULL).");
        obr.aG(macVar2.getPixelStride() == 2 && macVar3.getPixelStride() == 2 && Math.abs(jA2 - jA3) == 1, "UV planes not tightly interleaved");
        int i = jA2 < jA3 ? 1 : 2;
        List listG2 = madVar.g();
        pjk pjkVar = new pjk(BufferUtils.a(((mac) listG2.get(0)).getBuffer()));
        int i2 = i == 1 ? 1 : 2;
        return new YuvWriteView(GcamModuleJNI.new_YuvWriteView__SWIG_3(iC, iB, ((mac) listG2.get(0)).getRowStride(), pjk.a(pjkVar), iC / 2, iB / 2, ((mac) listG2.get(i2)).getRowStride(), pjk.a(new pjk(BufferUtils.a(((mac) listG2.get(i2)).getBuffer()))), i));
    }

    public final boolean d(int i) {
        return i == 37 || i == 32 || i == 4099;
    }
}
