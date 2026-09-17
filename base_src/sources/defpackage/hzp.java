package defpackage;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.hardware.HardwareBuffer;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.YuvImage;

/* JADX INFO: loaded from: classes2.dex */
public final class hzp implements geo {
    final /* synthetic */ mad a;
    final /* synthetic */ iar b;

    public hzp(mad madVar, iar iarVar) {
        this.a = madVar;
        this.b = iarVar;
    }

    @Override // defpackage.geo
    public final void a(RuntimeException runtimeException) {
        ((oug) ((oug) ((oug) hzq.a.b()).h(runtimeException)).G((char) 2735)).o("HDR processing failed:");
        this.a.close();
        this.b.a(null);
    }

    @Override // defpackage.geo
    public final void b(HardwareBuffer hardwareBuffer, ShotMetadata shotMetadata) {
        Bitmap bitmapWrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
        if (bitmapWrapHardwareBuffer != null) {
            int iB = shotMetadata.b();
            Bitmap bitmapCopy = bitmapWrapHardwareBuffer.copy(Bitmap.Config.ARGB_8888, true);
            Matrix matrix = new Matrix();
            matrix.postRotate(iB);
            bitmapWrapHardwareBuffer = Bitmap.createBitmap(bitmapCopy, 0, 0, bitmapCopy.getWidth(), bitmapCopy.getHeight(), matrix, true);
        }
        hardwareBuffer.close();
        this.a.close();
        this.b.a(bitmapWrapHardwareBuffer);
    }

    @Override // defpackage.geo
    public final void c(YuvImage yuvImage, ShotMetadata shotMetadata) {
        ((oug) ((oug) hzq.a.b()).G((char) 2740)).o("Got unexpected YUV buffer.");
        this.a.close();
        this.b.a(null);
        throw new IllegalStateException("Got unexpected YUV buffer.");
    }

    @Override // defpackage.geo
    public final void d(HardwareBuffer hardwareBuffer, ShotMetadata shotMetadata) {
        hardwareBuffer.close();
        this.b.a(null);
        throw new IllegalStateException("Got unexpected YUV HardwareBuffer.");
    }
}
